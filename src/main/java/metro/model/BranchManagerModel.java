package com.mycompany.metrosystem.model;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BranchManagerModel {

    public static boolean checkIfValidBranchID(int branchID) {
        boolean isValid = false;
        try (Connection conn = new MySQL().connect()) {
            String sql = "SELECT * FROM branches WHERE branch_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, branchID);
            ResultSet rs = pstmt.executeQuery();
            isValid = rs.next();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error checking branch ID: " + ex.getMessage(), "Database Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        return isValid;
    }

    public static boolean emailAlreadyExists(String email) {
        boolean emailExists = false;
        try (Connection conn = new MySQL().connect()) {
            String sql = "SELECT email, 'BranchManager' AS source_table FROM BranchManager WHERE email = ? "
                    + "UNION SELECT email, 'Cashier' AS source_table FROM Cashier WHERE email = ? "
                    + "UNION SELECT email, 'DataEntryOperator' AS source_table FROM DataEntryOperator WHERE email = ? "
                    + "UNION SELECT email, 'Vendor' AS source_table FROM Vendor WHERE email = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, email);
            pstmt.setString(2, email);
            pstmt.setString(3, email);
            pstmt.setString(4, email);
            ResultSet rs = pstmt.executeQuery();
            emailExists = rs.next();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error checking email: " + ex.getMessage(), "Database Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        return emailExists;
    }

    public static boolean addEmployeeToDatabase(String role, String name, String email, String password,
                                                 String branchCode, double salary) {
        if (emailAlreadyExists(email)) {
            JOptionPane.showMessageDialog(null, "Email already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!checkIfValidBranchID(Integer.parseInt(branchCode))) {
            JOptionPane.showMessageDialog(null, "Branch Code does not exist!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        String tableName = role.equals("Cashier") ? "Cashier" : "DataEntryOperator";
        String sql = "INSERT INTO " + tableName + " (name, branchCode, email, password, salary) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = new MySQL().connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setString(2, branchCode);
            pstmt.setString(3, email);
            pstmt.setString(4, password);
            pstmt.setDouble(5, salary);

            pstmt.executeUpdate();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error adding to database: " + ex.getMessage(), "Database Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
