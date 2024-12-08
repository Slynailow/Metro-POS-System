package com.mycompany.metrosystem.controller;

import com.mycompany.metrosystem.model.CashierModel;
import com.mycompany.metrosystem.view.CashierScreen;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class CashierController {
    private CashierModel model;
    private CashierScreen view;

    // Constructor
    public CashierController(CashierScreen view) {
        this.view = view;
        this.model = new CashierModel();
    }

    // Method to get products from the model and pass them to the view
    public void loadProducts(String branchCode) {
        List<String[]> products = model.fetchProductsByBranch(branchCode);
        view.updateProducts(products);  // Update the view with the fetched products
    }


    public void processBillGeneration(List<String[]> purchasedProducts, String branchID, String customerName, String metroCardNumber) {
    // Call the model's logic to compute the bill
    CashierModel.BillResult result = model.generateBill(purchasedProducts, branchID, customerName, metroCardNumber);

    // Fetch details from the result
    double totalSale = result.getTotalSale();
    double discount = result.getDiscountFromExistingPoints();
    int pointsEarned = result.getPointsEarned();

    // Current date for the invoice
    String date = java.time.LocalDate.now().toString();

    // Generate invoice string with HTML formatting
    StringBuilder invoice = new StringBuilder();
    invoice.append("<html>");
    invoice.append("<div style='font-family: Garamond,Helvetica, Arial, sans-serif; font-size: 21px; color: white;'>");
    invoice.append("<p><b>Customer Name:</b> ").append(customerName).append("</p>");
    invoice.append("<p><b>Branch ID:</b> ").append(branchID).append("</p>");
    invoice.append("<p><b>Date:</b> ").append(date).append("</p>");
    invoice.append("<p><b>Purchased Products:</b></p>");
    invoice.append("<p><b>Discount Applied:</b> ").append(String.format("%.2f", discount)).append(" PKR</p>");
    invoice.append("<p><b>Total Sale:</b> ").append(String.format("%.2f", totalSale)).append(" PKR</p>");
    invoice.append("<p><b>Metro Points Earned:</b> ").append(pointsEarned).append("</p>");
    invoice.append("</div>");
    invoice.append("</html>");

    // Set the formatted invoice to the label
    view.setInvoiceDetails(invoice.toString()); // Assuming `setInvoiceDetails` accepts HTML
    view.setTotalBillPrice(String.valueOf(totalSale));
    view.pointsEarned(pointsEarned);
}

    public void changePassword() 
    {
        String oldPassword = view.getOldPassword();
        String newPassword = view.getNewPassword();
        String confirmPassword = view.getConfirmPassword();
        String userName= view.getUserName();

        if (oldPassword.isEmpty() || newPassword.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Please fill all the fields.");
            return;
        }

        // Check if new password and confirm password match
        if (!newPassword.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(view, "New password and confirm password do not match.");
            return;
        }

        try {
            if (model.changePassword(userName,oldPassword, newPassword)) {
                JOptionPane.showMessageDialog(view, "Password changed successfully.");
            } else {
                JOptionPane.showMessageDialog(view, "Error changing password.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(view, "Error changing password: " + e.getMessage());
        }
    }
   
    
    
}

