package com.mycompany.metrosystem.model;

import com.mycompany.metrosystem.MySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BranchManagerModel 
{

    Connection conn;

    public BranchManagerModel() throws SQLException, ClassNotFoundException {
        MySQL mysql = new MySQL("1n-kn.h.filess.io", "Metro_obtainare", "3307", "Metro_obtainare", "0b0cb3dbec8a6597b3406bae44ea54138e90cb69");
        this.conn = mysql.connect();
    }

    public boolean changePassword(String userName, String oldPassword, String newPassword) throws SQLException {
        String authQuery = "SELECT COUNT(*) FROM BranchManager WHERE name = ? AND password = ?";
        try (PreparedStatement authStmt = conn.prepareStatement(authQuery)) {
            authStmt.setString(1, userName);
            authStmt.setString(2, oldPassword);
            try (ResultSet rs = authStmt.executeQuery()) {
                if (rs.next() && rs.getInt(1) == 0) {
                    return false;
                }
            }
        }

        String updateQuery = "UPDATE BranchManager SET password = ? WHERE name = ?";
        try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
            updateStmt.setString(1, newPassword);
            updateStmt.setString(2, userName);
            int result = updateStmt.executeUpdate();
            return result > 0;
        }
    }

    public boolean addCashier(String cashierName, String email, String password, String branchCode, String salary) throws SQLException {
        String insertQuery = "INSERT INTO Cashier (name, email, password, branchCode, salary) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {
            insertStmt.setString(1, cashierName);
            insertStmt.setString(2, email);
            insertStmt.setString(3, password);
            insertStmt.setString(4, branchCode);
            insertStmt.setBigDecimal(5, new java.math.BigDecimal(salary));
            int result = insertStmt.executeUpdate();
            return result > 0;
        }
    }

    public boolean addDataOperator(String operatorName, String email, String password, String branchCode, String salary) throws SQLException {
        String insertQuery = "INSERT INTO DataEntryOperator (name, email, password, branchCode, salary) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {
            insertStmt.setString(1, operatorName);
            insertStmt.setString(2, email);
            insertStmt.setString(3, password);
            insertStmt.setString(4, branchCode);
            insertStmt.setBigDecimal(5, new java.math.BigDecimal(salary));
            int result = insertStmt.executeUpdate();
            return result > 0;
        }
    }

    public ArrayList<Integer> getAllBranchIds() throws SQLException {
        ArrayList<Integer> branches = new ArrayList<>();
        String selectQuery = "SELECT branch_id FROM branches";
        try (PreparedStatement selectStmt = conn.prepareStatement(selectQuery);
             ResultSet rs = selectStmt.executeQuery()) {
            while (rs.next()) {
                branches.add(rs.getInt("branch_id"));
            }
        }
        return branches;
    }
}
