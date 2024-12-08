package com.mycompany.metrosystem.model;

import com.mycompany.metrosystem.MySQL;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CashierModel {
    
    private Connection conn;
    
    // Constructor: Initializes the connection using the existing MySQL class
    public CashierModel() {
        try {
            MySQL mysql = new MySQL("1n-kn.h.filess.io", "Metro_obtainare", "3307", "Metro_obtainare", "0b0cb3dbec8a6597b3406bae44ea54138e90cb69");  
            this.conn = mysql.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CashierModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CashierModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public List<String[]> fetchProductsByBranch(String branchCode) 
    {
        List<String[]> products = new ArrayList<>();
        
        // SQL query to fetch the relevant products from the Product table
        String sql = "SELECT id, name, salePrice, quantity FROM Product WHERE branchCode = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, branchCode);

            // Execute the query
            try (ResultSet rs = stmt.executeQuery()) 
            {
                
                while (rs.next()) {
                    String[] product = new String[4];
                    product[0] = rs.getString("id");  // Product ID
                    product[1] = rs.getString("name");  // Product Name
                    product[2] = String.format("%.2f", rs.getDouble("salePrice"));  // Product Sale Price
                    product[3] = String.valueOf(rs.getInt("quantity"));  // Product Quantity
                    
                    products.add(product);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle exceptions (e.g., log the error)
        }
        
        return products;
    }
    
     public class BillResult {
    private double totalSale;
    private int pointsEarned;
    private double discountFromExistingPoints;

    public BillResult(double totalSale, int pointsEarned, double discountFromExistingPoints) {
        this.totalSale = totalSale;
        this.pointsEarned = pointsEarned;
        this.discountFromExistingPoints = discountFromExistingPoints;
    }

    // Getters and setters
    public double getTotalSale() {
        return totalSale;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }

    public double getDiscountFromExistingPoints() {
        return discountFromExistingPoints;
    }
}

     
     public BillResult generateBill(List<String[]> allProducts, String branchID, String customerName, String metroCardNumber) {
    try {
        conn.setAutoCommit(false); // Start transaction
        double totalSale = 0.0;
        double profit = 0.0;
        double discountFromExistingPoints = 0.0;

        for (String[] product : allProducts) {
            String productId = product[0];
            int quantity = Integer.parseInt(product[3]);
            double salePrice = Double.parseDouble(product[2]);

            // Fetch the original price from database
            double originalPrice = fetchOriginalPrice(productId);

            profit += (salePrice - originalPrice) * quantity;
            totalSale += salePrice * quantity;

            // Update the database quantities
            updateProductQuantity(productId, quantity);
        }

        if (metroCardNumber != null && !metroCardNumber.isEmpty()) {
            // Check existing points and convert to PKR
            int existingPoints = getExistingMetroPoints(metroCardNumber);
            discountFromExistingPoints = existingPoints * 0.01; // Convert points to PKR (1 point = 0.01 PKR)

            // Deduct discount from total sale
            totalSale -= discountFromExistingPoints;

            // Update metro points after applying discount
            int pointsEarned = updateMetroPoints(metroCardNumber, totalSale);

            insertSale(branchID, totalSale, profit);
            insertTransaction(branchID, customerName, metroCardNumber, totalSale);

            conn.commit(); // Commit transaction
            return new BillResult(totalSale, pointsEarned, discountFromExistingPoints);
        }

        insertSale(branchID, totalSale, profit);
        insertTransaction(branchID, customerName, metroCardNumber, totalSale);

        conn.commit(); // Commit transaction
        return new BillResult(totalSale, 0, discountFromExistingPoints);
    } catch (SQLException ex) {
        try {
            conn.rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ex.printStackTrace();
    } finally {
        try {
            conn.setAutoCommit(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return new BillResult(0, 0, 0);
}

     private int getExistingMetroPoints(String metroCardNumber) throws SQLException {
    String query = "SELECT points FROM MetroPoints WHERE cardNumber = ?";
    try (PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setString(1, metroCardNumber);
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("points");
            }
        }
    }
    return 0; // Default to 0 if no points exist
}


   

    private double fetchOriginalPrice(String productId) throws SQLException {
        String query = "SELECT originalPrice FROM Product WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, productId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getDouble("originalPrice");
                }
            }
        }
        return 0.0;
    }

    private void updateProductQuantity(String productId, int soldQuantity) throws SQLException {
        String query = "UPDATE Product SET quantity = quantity - ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, soldQuantity);
            stmt.setString(2, productId);
            stmt.executeUpdate();
        }
    }

    private void insertSale(String branchID, double totalSale, double profit) throws SQLException {
        String query = "INSERT INTO Sales (salesID, branchId, salesDate, totalSale, Profit) VALUES (?, ?, NOW(), ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, generateRandomSaleID());
            stmt.setString(2, branchID);
            stmt.setDouble(3, totalSale);
            stmt.setDouble(4, profit);
            stmt.executeUpdate();
        }
    }

    private String generateRandomSaleID() {
        return String.valueOf(System.currentTimeMillis());
    }

    private void insertTransaction(String branchID, String customerName, String metroCardNumber, double totalAmount) throws SQLException {
        String query = "INSERT INTO Transaction (branchId, transactionId, customerName, transactionDate, totalAmountPayed) VALUES (?, ?, ?, NOW(), ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, branchID);
            stmt.setString(2, generateRandomTransactionID());
            stmt.setString(3, customerName);
            stmt.setDouble(4, totalAmount);
            stmt.executeUpdate();
        }
    }

    private String generateRandomTransactionID() {
        return String.valueOf(System.nanoTime());
    }
    
    private int updateMetroPoints(String metroCardNumber, double totalAmount) throws SQLException {
    
    int pointsEarned = (int) Math.floor(totalAmount * 0.01); // Calculate points (1 point = 0.01 PKR)
    String query =  "UPDATE MetroPoints SET Points= ? where cardNumber= ? ";

    try (PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setString(2, metroCardNumber);
        stmt.setInt(1, pointsEarned);
        stmt.executeUpdate();
    }
    return pointsEarned;
}

    public boolean changePassword(String userName, String oldPassword, String newPassword) throws SQLException {
    // Verify that the username and old password match
    String authQuery = "SELECT COUNT(*) FROM Cashier WHERE name = ? AND password = ?";
    try (PreparedStatement authStmt = conn.prepareStatement(authQuery)) {
        authStmt.setString(1, userName);
        authStmt.setString(2, oldPassword);
        System.out.println("Executing authentication query...");

        try (ResultSet rs = authStmt.executeQuery()) {
            if (rs.next() && rs.getInt(1) == 0) {
                System.out.println("Authentication failed: Username or password is incorrect.");
                return false;
            } else {
                System.out.println("Authentication successful.");
            }
        }
    }

    // Update the password
    String updateQuery = "UPDATE Cashier SET password = ? WHERE name = ?";
    try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
        updateStmt.setString(1, newPassword);
        updateStmt.setString(2, userName);
        System.out.println("Executing password update query...");

        int result = updateStmt.executeUpdate();
        if (result > 0) {
            System.out.println("Password updated successfully.");
        } else {
            System.out.println("Password update failed.");
        }
        return result > 0;
    }
}

    
    
    
}