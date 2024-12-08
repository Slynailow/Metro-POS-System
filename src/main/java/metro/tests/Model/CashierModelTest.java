package com.example;

import org.h2.jdbcx.JdbcDataSource;
import org.junit.Before;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CashierModelTest {

    private CashierModel cashierModel;
    private Connection conn;

    @Before
    public void setUp() throws SQLException {

        DataSource dataSource = new JdbcDataSource();
        ((JdbcDataSource) dataSource).setURL("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1");
        conn = dataSource.getConnection();

        // Set up initial test data in the database
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(
                    "CREATE TABLE Product (id VARCHAR(255), name VARCHAR(255), salePrice DOUBLE, quantity INT, branchCode VARCHAR(255))");
            stmt.execute(
                    "INSERT INTO Product (id, name, salePrice, quantity, branchCode) VALUES ('1', 'Product1', 100.0, 10, '001')");
            stmt.execute(
                    "INSERT INTO Product (id, name, salePrice, quantity, branchCode) VALUES ('2', 'Product2', 150.0, 5, '001')");
            stmt.execute("CREATE TABLE MetroPoints (cardNumber VARCHAR(255), points INT)");
            stmt.execute("INSERT INTO MetroPoints (cardNumber, points) VALUES ('12345', 100)");
            stmt.execute(
                    "CREATE TABLE Sales (salesID VARCHAR(255), branchId VARCHAR(255), salesDate DATE, totalSale DOUBLE, Profit DOUBLE)");
            stmt.execute(
                    "CREATE TABLE Transaction (branchId VARCHAR(255), transactionId VARCHAR(255), customerName VARCHAR(255), transactionDate DATE, totalAmountPayed DOUBLE)");
            stmt.execute("CREATE TABLE Cashier (name VARCHAR(255), password VARCHAR(255))");
            stmt.execute("INSERT INTO Cashier (name, password) VALUES ('john', 'oldpass')");
        }

        cashierModel = new CashierModel() {
            @Override
            public Connection connect() {
                return conn; // Use in-memory DB connection
            }
        };
    }

    @Test
    public void testFetchProductsByBranch() {
        // Act
        List<String[]> products = cashierModel.fetchProductsByBranch("001");

        // Assert
        assertNotNull(products);
        assertEquals(2, products.size());
        assertEquals("Product1", products.get(0)[1]);
        assertEquals("Product2", products.get(1)[1]);
    }

    @Test
    public void testGenerateBill() {
        // Arrange
        List<String[]> purchasedProducts = new ArrayList<>();
        purchasedProducts.add(new String[] { "1", "Product1", "100", "2" }); // Product 1
        purchasedProducts.add(new String[] { "2", "Product2", "150", "3" }); // Product 2
        String branchID = "001";
        String customerName = "John Doe";
        String metroCardNumber = "12345";

        // Act
        CashierModel.BillResult result = cashierModel.generateBill(purchasedProducts, branchID, customerName,
                metroCardNumber);

        // Assert
        assertNotNull(result);
        assertTrue(result.getTotalSale() > 0);
        assertTrue(result.getPointsEarned() >= 0);
        assertTrue(result.getDiscountFromExistingPoints() >= 0);
    }

    @Test
    public void testChangePassword_Success() throws Exception {

        String userName = "john";
        String oldPassword = "oldpass";
        String newPassword = "newpass";

        // Act
        boolean result = cashierModel.changePassword(userName, oldPassword, newPassword);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testChangePassword_Failure() throws Exception {

        String userName = "john";
        String oldPassword = "wrongpass";
        String newPassword = "newpass";

        // Act
        boolean result = cashierModel.changePassword(userName, oldPassword, newPassword);

        // Assert
        assertFalse(result);
    }
}
