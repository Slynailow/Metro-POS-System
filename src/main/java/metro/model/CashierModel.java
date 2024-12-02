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
}
