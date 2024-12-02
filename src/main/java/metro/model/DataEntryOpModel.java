/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metrosystem.model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mycompany.metrosystem.MySQL;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DataEntryOpModel 
{
    private Connection conn;

    public DataEntryOpModel() throws SQLException, ClassNotFoundException {
         MySQL mysql = new MySQL("1n-kn.h.filess.io", "Metro_obtainare", "3307", "Metro_obtainare", "0b0cb3dbec8a6597b3406bae44ea54138e90cb69");
      this.conn = mysql.connect();
    }

    // Method to generate Vendor ID automatically
    private int generateVendorId() throws SQLException {
        String query = "SELECT MAX(id) FROM Vendor";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) + 1; // Increment the max ID to generate the new Vendor ID
            }
        }
        return 1; // Default to 1 if no vendors exist
    }

    // Method to check if a vendor already exists by vendor name, contact, or email
    public boolean isVendorExists(String vendorName, String contact, String email) throws SQLException 
    {
        String query = "SELECT COUNT(*) FROM Vendor WHERE name = ? OR contactNumber = ? OR email = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, vendorName);
            stmt.setString(2, contact);
            stmt.setString(3, email);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0; // Returns true if vendor exists
            }
        }
        return false; // Vendor does not exist
    }

    // Method to add a new vendor
    public boolean addVendor(String vendorName, String contact, String address, String email) throws SQLException {
        if (isVendorExists(vendorName, contact, email)) {
            return false; // Vendor already exists
        }

        // Generate Vendor ID
        int vendorId = generateVendorId();

        String query = "INSERT INTO Vendor (id,name,contactNumber,address,email) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, vendorId); 
            stmt.setString(2, vendorName);
            stmt.setString(4, contact);
            stmt.setString(3, address);
            stmt.setString(5, email);
            int result = stmt.executeUpdate();
            return result > 0; // Returns true if vendor was successfully added
        }
    }

    public boolean addProduct(String productId, String productName, String category, double salePrice, 
                           double pricePerCaton, double pricePerUnit, double originalPrice, String vendorId, 
                           int quantity, String branchCode) throws SQLException {

    // First, check if the vendorId exists in the Vendor table
    String vendorCheckQuery = "SELECT COUNT(*) FROM Vendor WHERE id = ?";
    try (PreparedStatement checkStmt = conn.prepareStatement(vendorCheckQuery)) {
        checkStmt.setString(1, vendorId);
        try (ResultSet rs = checkStmt.executeQuery()) {
            if (rs.next() && rs.getInt(1) == 0) {
                return false; // Vendor doesn't exist
            }
        }
    }

    // Check if the product already exists for the given productId and branchCode
    String productCheckQuery = "SELECT quantity, salePrice, pricePerUnit, pricePerCarton, originalPrice FROM Product WHERE id = ? AND branchCode = ?";
    
    try (PreparedStatement checkStmt = conn.prepareStatement(productCheckQuery)) {
        checkStmt.setString(1, productId);
        checkStmt.setString(2, branchCode);
        
        try (ResultSet rs = checkStmt.executeQuery()) {
            if (rs.next()) {
                // If product exists, update the quantity and overwrite the prices
                int existingQuantity = rs.getInt("quantity");
                double existingSalePrice = rs.getDouble("salePrice");
                double existingPricePerUnit = rs.getDouble("pricePerUnit");
                double existingPricePerCarton = rs.getDouble("pricePerCarton");
                double existingOriginalPrice = rs.getDouble("originalPrice");

                // Update the quantity (add the new quantity to the existing quantity)
                int updatedQuantity = existingQuantity + quantity;

                // Overwrite the prices with the new values
                double updatedSalePrice = salePrice != existingSalePrice ? salePrice : existingSalePrice;
                double updatedPricePerUnit = pricePerUnit != existingPricePerUnit ? pricePerUnit : existingPricePerUnit;
                double updatedPricePerCarton = pricePerCaton != existingPricePerCarton ? pricePerCaton : existingPricePerCarton;
                double updatedOriginalPrice = originalPrice != existingOriginalPrice ? originalPrice : existingOriginalPrice;

                // Update the quantity and prices for the existing product
                String updateQuery = "UPDATE Product SET quantity = ?, salePrice = ?, pricePerUnit = ?, pricePerCarton = ?, originalPrice = ? WHERE id = ? AND branchCode = ?";
                try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
                    updateStmt.setInt(1, updatedQuantity); // Update quantity
                    updateStmt.setDouble(2, updatedSalePrice); // Overwrite sale price
                    updateStmt.setDouble(3, updatedPricePerUnit); // Overwrite price per unit
                    updateStmt.setDouble(4, updatedPricePerCarton); // Overwrite price per carton
                    updateStmt.setDouble(5, updatedOriginalPrice); // Overwrite original price
                    updateStmt.setString(6, productId);
                    updateStmt.setString(7, branchCode);
                    updateStmt.executeUpdate();
                    return true; // Return true if the update was successful
                }
            }
        }
    }

    // If product doesn't exist, insert a new product into the Product table
    String insertQuery = "INSERT INTO Product (id, name, category, salePrice, pricePerCarton, pricePerUnit, originalPrice, vendorId, quantity, branchCode) " +
                         "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    try (PreparedStatement stmt = conn.prepareStatement(insertQuery)) {
        stmt.setString(1, productId);
        stmt.setString(2, productName);
        stmt.setString(3, category);
        stmt.setDouble(4, salePrice); // Set sale price for the new product
        stmt.setDouble(5, pricePerCaton); // Set price per carton for the new product
        stmt.setDouble(6, pricePerUnit); // Set price per unit for the new product
        stmt.setDouble(7, originalPrice); // Set original price for the new product
        stmt.setString(8, vendorId);
        stmt.setInt(9, quantity); // The computed quantity in units
        stmt.setString(10, branchCode); // Branch code to associate with this product
        
        int result = stmt.executeUpdate();
        return result > 0; // Return true if the insert was successful
    }
}

    // Method to change password with proper authentication
    public boolean changePassword(String userName, String oldPassword, String newPassword) throws SQLException {
    // First, verify that the username and old password match
    String authQuery = "SELECT COUNT(*) FROM DataEntryOperator WHERE name = ? AND password = ?";
    
    try (PreparedStatement authStmt = conn.prepareStatement(authQuery)) {
        authStmt.setString(1, userName);
        authStmt.setString(2, oldPassword);
        
        try (ResultSet rs = authStmt.executeQuery()) {
            if (rs.next() && rs.getInt(1) == 0) {
                // If no matching user is found, return false
                return false;
            }
        }
    }

    // If authentication is successful, proceed to update the password
    String updateQuery = "UPDATE DataEntryOperator SET password = ? WHERE name = ?";
    
    try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
        updateStmt.setString(1, newPassword);
        updateStmt.setString(2, userName);
        
        int result = updateStmt.executeUpdate();
        return result > 0; // Return true if the password was successfully updated
    }
}
    
    // Method to fetch all vendor details
    public List<String[]> getAllVendors() throws SQLException {
        List<String[]> vendorList = new ArrayList<>();
        String query = "SELECT id, name, address, contactNumber, email FROM Vendor";

        try (PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                // Store each vendor's details as an array of strings
                String[] vendor = {
                    String.valueOf(rs.getInt("id")),
                    rs.getString("name"),
                    rs.getString("address"),
                    rs.getString("contactNumber"),
                    rs.getString("email")
                };
                vendorList.add(vendor);
            }
        }
        return vendorList; // Return list of vendors
    }

    public List<String> getVendorIds() throws SQLException {
    List<String> vendorIds = new ArrayList<>();
    String query = "SELECT id FROM Vendor"; // Replace with your actual table name

    try (Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {
         
        while (rs.next()) {
            vendorIds.add(rs.getString("id")); // Adjust column name if necessary
        }
    }
    return vendorIds;
}




}
