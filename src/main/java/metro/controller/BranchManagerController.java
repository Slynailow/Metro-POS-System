package com.mycompany.metrosystem.controller;

import com.mycompany.metrosystem.model.BranchManagerModel;
import com.mycompany.metrosystem.view.BranchManagerScreen;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BranchManagerController {

    private final BranchManagerModel model;
    private final BranchManagerScreen view;

    public BranchManagerController(BranchManagerScreen view) throws SQLException, ClassNotFoundException {
        this.model = new BranchManagerModel();
        this.view = view;
        populateBranchCodes();
    }

    public void handleChangePassword(String userName)
    {
        try {
            String oldPassword = new String(view.getOldPassword());
            String newPassword = new String(view.getNewPassword());
            String confirmPassword = new String(view.getConfirmPassword());

            if (!newPassword.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(view, "New passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            boolean success = model.changePassword(userName, oldPassword, newPassword);

            if (success) {
                JOptionPane.showMessageDialog(view, "Password changed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(view, "Old password is incorrect!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
 
    private void populateBranchCodes() {
        try {
            ArrayList<Integer> branchIds = model.getAllBranchIds();

            // Convert Integer list to String array for the combo boxes
            String[] branchCodeOptions = branchIds.stream()
                .map(String::valueOf)
                .toArray(String[]::new);

            // Set options in the combo boxes
            view.setCashierBranchCodeOptions(branchCodeOptions);
            view.setOperatorBranchCodeOptions(branchCodeOptions);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "Failed to load branch codes: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     
    public void handleAddCashier() 
    {
        try {
            String cashierName = view.getCashierName();
            String email = view.getCashierEmail();
            String password = view.getCashierPassword();
            String branchCode = view.getSelectedCashierBranchCode();
            String salary = view.getCashierSalary();

            boolean success = model.addCashier(cashierName, email, password, branchCode, salary);

            if (success) {
                JOptionPane.showMessageDialog(view, "Cashier added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(view, "Failed to add cashier.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void handleAddDataOperator() {
        try {
            String operatorName = view.getOperatorName();
            String email = view.getOperatorEmail();
            String password = view.getOperatorPassword();
            String branchCode = view.getSelectedOperatorBranchCode();
            String salary = view.getOperatorSalary();

            boolean success = model.addDataOperator(operatorName, email, password, branchCode, salary);

            if (success) {
                JOptionPane.showMessageDialog(view, "Data Entry Operator added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(view, "Failed to add Data Entry Operator.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
