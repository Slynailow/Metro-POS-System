package com.mycompany.metrosystem.model;

import com.mycompany.metrosystem.MySQL;
import java.sql.*;

public class LoginModel {

    private Connection conn;

    public LoginModel() throws SQLException, ClassNotFoundException {
        MySQL mysql = new MySQL("1n-kn.h.filess.io", "Metro_obtainare", "3307", "Metro_obtainare", "0b0cb3dbec8a6597b3406bae44ea54138e90cb69");
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

        return false; // Authentication failed
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
}
