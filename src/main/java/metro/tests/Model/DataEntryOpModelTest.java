package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.SQLException;
import java.util.List;

class DataEntryOpModelTest {
    private DataEntryOpModel dataEntryOpModel;

    @BeforeEach
    void setUp() throws SQLException, ClassNotFoundException {
        dataEntryOpModel = new DataEntryOpModel();
    }

    @Test
    void testIsVendorExists_VendorExists() throws SQLException {
        assertTrue(dataEntryOpModel.isVendorExists("Vendor Name", "123456789", "vendor@example.com"));
    }

    @Test
    void testIsVendorExists_VendorDoesNotExist() throws SQLException {
        assertFalse(dataEntryOpModel.isVendorExists("Nonexistent Vendor", "987654321", "nonexistent@example.com"));
    }

    @Test
    void testAddVendor_Success() throws SQLException {
        boolean result = dataEntryOpModel.addVendor("New Vendor", "123456789", "New Address", "newvendor@example.com");
        assertTrue(result);
    }

    @Test
    void testAddVendor_VendorAlreadyExists() throws SQLException {
        boolean result = dataEntryOpModel.addVendor("Vendor Name", "123456789", "Vendor Address", "vendor@example.com");
        assertFalse(result);
    }

    @Test
    void testAddProduct_Success() throws SQLException {
        boolean result = dataEntryOpModel.addProduct("P123", "Product Name", "Category A", 100.0, 10.0, 5.0, 50.0,
                "V123", 10, "B1");
        assertTrue(result);
    }

    @Test
    void testAddProduct_VendorDoesNotExist() throws SQLException {
        boolean result = dataEntryOpModel.addProduct("P123", "Product Name", "Category A", 100.0, 10.0, 5.0, 50.0,
                "NonexistentVendor", 10, "B1");
        assertFalse(result);
    }

    @Test
    void testAddProduct_ExistingProductUpdate() throws SQLException {
        // Assuming the product with P123 and branch B1 already exists in the database
        boolean result = dataEntryOpModel.addProduct("P123", "Updated Product", "Category A", 120.0, 12.0, 6.0, 60.0,
                "V123", 5, "B1");
        assertTrue(result);
    }

    @Test
    void testChangePassword_Success() throws SQLException {
        boolean result = dataEntryOpModel.changePassword("admin", "oldPassword", "newPassword");
        assertTrue(result);
    }

    @Test
    void testChangePassword_Failure() throws SQLException {
        boolean result = dataEntryOpModel.changePassword("admin", "incorrectOldPassword", "newPassword");
        assertFalse(result);
    }

    @Test
    void testGetAllVendors() throws SQLException {
        List<String[]> vendors = dataEntryOpModel.getAllVendors();
        assertNotNull(vendors);
        assertTrue(vendors.size() > 0);
    }

    @Test
    void testGetVendorIds() throws SQLException {
        List<String> vendorIds = dataEntryOpModel.getVendorIds();
        assertNotNull(vendorIds);
        assertTrue(vendorIds.size() > 0);
    }
}
