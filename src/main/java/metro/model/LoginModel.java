package com.mycompany.metrosystem.model;

import com.mycompany.metrosystem.MySQL;
import java.sql.*;

public class LoginModel {

    private Connection conn;

    public LoginModel() throws SQLException, ClassNotFoundException {
        MySQL mysql = new MySQL("1n-kn.h.filess.io", "Metro_obtainare", "3307", "Metro_obtainare",
                "0b0cb3dbec8a6597b3406bae44ea54138e90cb69");
        this.conn = mysql.connect(); // Reuse the connection
    }

    public boolean authenticateUser(String username, String password, String userType) {
        String tableName = getTableName(userType);
        if (tableName == null) {
            return false; // Invalid user type
        }

        try {
            String query = "SELECT * FROM " + tableName + " WHERE name = ? AND password = ?";
            try (PreparedStatement ps = conn.prepareStatement(query)) {
                ps.setString(1, username);
                ps.setString(2, password);

                ResultSet rs = ps.executeQuery();
                if (rs.next()) {

                    return true; // User found
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    // Helper method to get the table name based on user type
    private String getTableName(String userType) {
        switch (userType) {
            case "Admin":
                return "SuperAdmin";
            case "Branch Manager":
                return "BranchManager";
            case "Data Entry Operator":
                return "DataEntryOperator";
            case "Cashier":
                return "Cashier";
            default:
                return null;
        }
    }

    public String getBranchCode(String userType, String username, String password) {
        String tableName = getTableName(userType);

        try {
            String query = "SELECT branchCode FROM " + tableName + " WHERE name = ? AND password = ?";
            try (PreparedStatement ps = conn.prepareStatement(query)) {
                ps.setString(1, username);
                ps.setString(2, password); // Ensure you're setting the password correctly

                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        // Debugging: Print the value of branchCode for testing
                        String branchCode = rs.getString("branchCode");
                        System.out.println("BranchCode found: " + branchCode); // This will print the branchCode
                        return branchCode; // Return the branchCode as a String
                    } else {
                        // Debugging: If no result found, print a message
                        System.out.println("No record found for username: " + username);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
