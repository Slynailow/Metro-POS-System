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


public class DataEntryOpModel {
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

    // Method to add a new product
public boolean addProduct(String productId, String productName, String category, double salePrice, 
                           double pricePerCaton, double pricePerUnit, double originalPrice, String vendorId) 
                           throws SQLException {
    // First, check if the vendorId exists in the Vendor table
    String vendorCheckQuery = "SELECT COUNT(*) FROM Vendor WHERE id = ?";
    
    try (PreparedStatement checkStmt = conn.prepareStatement(vendorCheckQuery)) {
        checkStmt.setString(1, vendorId);
        
        try (ResultSet rs = checkStmt.executeQuery()) {
            // If no vendor exists with the given id, return false
            if (rs.next() && rs.getInt(1) == 0) {
                return false; // Vendor doesn't exist
            }
        }
    }
    String productCheckQuery = "SELECT COUNT(*) FROM Product WHERE id = ?";
    
    try (PreparedStatement checkStmt = conn.prepareStatement(productCheckQuery)) {
        checkStmt.setString(1, productId);
        
        try (ResultSet rs = checkStmt.executeQuery()) {
            // If a product already exists with the same productId, return false
            if (rs.next() && rs.getInt(1) > 0) {
                return false; // Product ID already exists
            }
        }
    }

    // If vendor exists, proceed with adding the product
    String query = "INSERT INTO Product (id, name, category, salePrice, pricePerCarton, pricePerUnit, originalPrice, vendorId) " +
                   "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    
    try (PreparedStatement stmt = conn.prepareStatement(query)) {
        // Set parameters for the prepared statement
        stmt.setString(1, productId);
        stmt.setString(2, productName);
        stmt.setString(3, category);
        stmt.setDouble(4, salePrice);
        stmt.setDouble(5, pricePerCaton);
        stmt.setDouble(6, pricePerUnit);
        stmt.setDouble(7, originalPrice);
        stmt.setString(8, vendorId);
        
        // Execute the query and check if a record was inserted
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
