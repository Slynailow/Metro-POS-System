package com.mycompany.metrosystem.controller;

import com.mycompany.metrosystem.model.BranchManagerModel;

import javax.swing.*;

public class BranchManagerController {

    public static boolean addEmployee(String role, String name, String email, String password, String branchCode,
            String salary,
            JPanel panel, JTextField... fields) {
        if (name.isEmpty() || email.isEmpty() || branchCode.isEmpty() || salary.isEmpty()) {
            JOptionPane.showMessageDialog(panel, "All fields are required!", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (!email.contains("@")) {
            JOptionPane.showMessageDialog(panel, "Invalid email address!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        try {
            double salaryValue = Double.parseDouble(salary);
            if (salaryValue < 1) {
                JOptionPane.showMessageDialog(panel, "Salary must be greater than 0!", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return false;
            }

            if (BranchManagerModel.addEmployeeToDatabase(role, name, email, password, branchCode, salaryValue)) {
                JOptionPane.showMessageDialog(panel, role + " added successfully!", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
                clearFields(fields);
                return true;
            } else {
                JOptionPane.showMessageDialog(panel, "Error adding " + role + "!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(panel, "Salary must be a valid number!", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        return false;
    }

    private static void clearFields(JTextField... fields) {
        for (JTextField field : fields) {
            field.setText("");
        }
    }
}
