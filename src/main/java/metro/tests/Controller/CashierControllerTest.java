package com.example;

import org.junit.Before;
import org.junit.Test;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CashierControllerTest {

    private CashierController cashierController;
    private CashierModel model;
    private CashierScreen view;

    @Before
    public void setUp() {
        model = new CashierModel();
        view = new CashierScreen();
        cashierController = new CashierController(view);
    }

    @Test
    public void testLoadProducts() {
        List<String[]> products = new ArrayList<>();
        products.add(new String[] { "Product1", "100" });
        products.add(new String[] { "Product2", "200" });

        model.addMockedProducts(products);

        // Act
        cashierController.loadProducts("001");

        // Assert
        List<String[]> loadedProducts = view.getProducts(); // Assuming view can return the loaded products
        assertEquals("Product1", loadedProducts.get(0)[0]);
        assertEquals("100", loadedProducts.get(0)[1]);
        assertEquals("Product2", loadedProducts.get(1)[0]);
        assertEquals("200", loadedProducts.get(1)[1]);
    }

    @Test
    public void testProcessBillGeneration() {
        // Arrange
        List<String[]> purchasedProducts = new ArrayList<>();
        purchasedProducts.add(new String[] { "Product1", "100" });
        purchasedProducts.add(new String[] { "Product2", "200" });

        // Simulate a bill result manually
        double totalSale = 300.0;
        double discount = 10.0;
        int pointsEarned = 30;

        // Manually simulate the behavior of the model's generateBill method
        model.setMockedBillResult(new CashierModel.BillResult(totalSale, discount, pointsEarned));

        // Act
        cashierController.processBillGeneration(purchasedProducts, "001", "John Doe", "123456");

        // Assert
        String expectedInvoice = "<html><div style='font-family: Garamond,Helvetica, Arial, sans-serif; font-size: 21px; color: white;'>"
                + "<p><b>Customer Name:</b> John Doe</p>"
                + "<p><b>Branch ID:</b> 001</p>"
                + "<p><b>Date:</b> " + java.time.LocalDate.now().toString() + "</p>"
                + "<p><b>Purchased Products:</b></p>"
                + "<p><b>Discount Applied:</b> 10.00 PKR</p>"
                + "<p><b>Total Sale:</b> 300.00 PKR</p>"
                + "<p><b>Metro Points Earned:</b> 30</p>"
                + "</div></html>";

        assertEquals(expectedInvoice, view.getInvoiceDetails());
        assertEquals("300.00", view.getTotalBillPrice());
        assertEquals(30, view.getPointsEarned());
    }

    @Test
    public void testChangePassword_Success() {
        // Arrange
        view.setOldPassword("oldPass");
        view.setNewPassword("newPass");
        view.setConfirmPassword("newPass");
        view.setUserName("username");

        model.setMockedChangePasswordResult(true);

        // Act
        cashierController.changePassword();

        // Assert
        assertTrue(view.getMessages().contains("Password changed successfully."));
    }

    @Test
    public void testChangePassword_Failure() {
        // Arrange
        view.setOldPassword("oldPass");
        view.setNewPassword("newPass");
        view.setConfirmPassword("differentNewPass");
        view.setUserName("username");

        // Act
        cashierController.changePassword();

        // Assert
        assertTrue(view.getMessages().contains("New password and confirm password do not match."));
    }

    @Test
    public void testChangePassword_Exception() {
        // Arrange
        view.setOldPassword("oldPass");
        view.setNewPassword("newPass");
        view.setConfirmPassword("newPass");
        view.setUserName("username");

        model.setMockedChangePasswordResult(false);

        // Act
        cashierController.changePassword();

        // Assert
        assertTrue(view.getMessages().contains("Error changing password."));
    }
}
