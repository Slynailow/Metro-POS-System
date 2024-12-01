/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metrosystem.controller;

import com.mycompany.metrosystem.model.DataEntryOpModel;
import com.mycompany.metrosystem.view.DataEntryOperatorScreen;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class DataEntryOpController {

    private DataEntryOperatorScreen view;
    private DataEntryOpModel model;

    public DataEntryOpController(DataEntryOperatorScreen view) throws SQLException, ClassNotFoundException {
        this.view = view;
        this.model = new DataEntryOpModel();
        displayVendors();
        loadVendorIdsToComboBox();
    }

    // Method to handle the Add Vendor action
    public boolean addVendor() {
        String vendorName = view.getVendorName();
        String vendorContact = view.getVendorContact();
        String vendorAddress = view.getVendorAddress();
        String vendorEmail = view.getVendorEmail();
        

        // Check if any field is empty
        if (vendorName.isEmpty() || vendorContact.isEmpty() || vendorAddress.isEmpty() || vendorEmail.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Please fill all the fields.");
            return false;
        }

        try {
            if (model.addVendor(vendorName, vendorContact, vendorAddress, vendorEmail)) {
                JOptionPane.showMessageDialog(view, "Vendor added successfully.");
                displayVendors();
                loadVendorIdsToComboBox();
                return true;
            } else {
                JOptionPane.showMessageDialog(view, "Vendor already exists.");
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(view, "Error adding vendor: " + e.getMessage());
        }
        return false;
    }

    // Method to handle the Add Product action
   public boolean addProduct()
   {
    String productId = view.getProductId();
    String productName = view.getProductName();
    String productCategory = view.getSelectedProductCategory();
    String salePriceStr = view.getSalePrice();
    String vendorId = view.getSelectedVendorId();
    String pricePerCatonStr = view.getPricePerCaton();
    String pricePerUnitStr = view.getPricePerUnit();
    String originalPriceStr = view.getOriginalPrice();

    // Check if any field is empty or null
    if (productId.isEmpty() || productName.isEmpty() || productCategory.isEmpty() ||
        salePriceStr.isEmpty() || vendorId == null || pricePerCatonStr.isEmpty() || 
        pricePerUnitStr.isEmpty() || originalPriceStr.isEmpty()) {
        JOptionPane.showMessageDialog(view, "Please fill all the fields.");
        return false;
    }

    try {
        // Parsing numeric fields
        double salePrice = Double.parseDouble(salePriceStr);
        double pricePerCaton = Double.parseDouble(pricePerCatonStr);
        double pricePerUnit = Double.parseDouble(pricePerUnitStr);
        double originalPrice = Double.parseDouble(originalPriceStr);

        // Call the model's addProduct method with all parameters
        if (model.addProduct(productId, productName, productCategory, salePrice, 
                             pricePerCaton, pricePerUnit, originalPrice, vendorId)) {
            JOptionPane.showMessageDialog(view, "Product added successfully.");
            return true;
        } else {
            JOptionPane.showMessageDialog(view, "Make sure the vendor Id exists and Product Id is unique");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(view, "Invalid number format in one or more fields.");
        
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(view, "Error adding product: " + e.getMessage());
        
    }
    return false;
}


    // Method to handle the Change Password action
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
    
    // Method to fetch and display all vendors
    public void displayVendors() {
        try {
            List<String[]> vendors = model.getAllVendors();
            if (vendors.isEmpty()) {
                JOptionPane.showMessageDialog(view, "No vendors found.");
            } else {
                System.out.println("Fetching things out!");
                view.showVendors(vendors);
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(view, "Error fetching vendors: " + e.getMessage());
        }
    }
    
    public void loadVendorIdsToComboBox() {
    try {
        List<String> vendorIds = model.getVendorIds(); // Fetch vendor IDs from model
        if (vendorIds.isEmpty()) {
            JOptionPane.showMessageDialog(view, "No vendors found.");
        } else {
            view.populateVendorComboBox(vendorIds); // Populate combo box in view
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(view, "Error loading vendor IDs: " + e.getMessage());
    }
    }

}
