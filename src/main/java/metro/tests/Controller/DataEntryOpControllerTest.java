import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import static org.junit.jupiter.api.Assertions.*;

public class DataEntryOpControllerTest {

    private DataEntryOperatorScreen view;
    private DataEntryOpModel model;
    private DataEntryOpController controller;

    @BeforeEach
    void setUp() throws SQLException, ClassNotFoundException {
        view = new DataEntryOperatorScreen() {

            public String getVendorName() {
                return "Vendor A";
            }

            public String getVendorContact() {
                return "123";
            }

            public String getVendorAddress() {
                return "Some Address";
            }

            public String getVendorEmail() {
                return "email@example.com";
            }

            public String getProductId() {
                return "P001";
            }

            public String getProductName() {
                return "Product A";
            }

            public String getSalePrice() {
                return "100.0";
            }

            public String getPricePerCaton() {
                return "50.0";
            }

            public String getPricePerUnit() {
                return "10.0";
            }

            public String getOriginalPrice() {
                return "80.0";
            }

            public String getActualQuantity() {
                return "100";
            }

            public String getBranchCode() {
                return "B001";
            }

            public String getSelectedProductCategory() {
                return "Category A";
            }

            public String getSelectedVendorId() {
                return "V001";
            }

            public String getSelectedQuantityType() {
                return "Unit";
            }

            public String getOldPassword() {
                return "oldpassword";
            }

            public String getNewPassword() {
                return "newpassword";
            }

            public String getConfirmPassword() {
                return "newpassword";
            }

            public String getUserName() {
                return "user1";
            }

            public void showMessageDialog(String message) {
                System.out.println(message);
            }

            public void showVendors(java.util.List<String[]> vendors) {

                vendors.forEach(vendor -> System.out.println(vendor[1]));
            }

            public void populateVendorComboBox(java.util.List<String> vendorIds) {

                vendorIds.forEach(id -> System.out.println("Vendor ID: " + id));
            }
        };

        model = new DataEntryOpModel() {

            public boolean addVendor(String name, String contact, String address, String email) {
                return true; // Simulate successful vendor addition
            }

            public boolean addProduct(String id, String name, String category, double salePrice,
                    double pricePerCaton, double pricePerUnit, double originalPrice,
                    String vendorId, int quantity, String branchCode) {
                return true; // Simulate successful product addition
            }

            public boolean changePassword(String userName, String oldPassword, String newPassword) {
                return true; // Simulate successful password change
            }

            public java.util.List<String[]> getAllVendors() {
                // Return a list of vendors
                java.util.List<String[]> vendors = new java.util.ArrayList<>();
                vendors.add(new String[] { "1", "Vendor A" });
                return vendors;
            }

            public java.util.List<String> getVendorIds() {
                // Return a list of vendor IDs
                java.util.List<String> vendorIds = new java.util.ArrayList<>();
                vendorIds.add("V001");
                return vendorIds;
            }
        };

        controller = new DataEntryOpController(view);
    }

    @Test
    void testAddVendor_EmptyFields() {
        // Simulate empty vendor name
        view = new DataEntryOperatorScreen() {
            public String getVendorName() {
                return ""; // Empty name
            }

            public String getVendorContact() {
                return "123";
            }

            public String getVendorAddress() {
                return "Some Address";
            }

            public String getVendorEmail() {
                return "email@example.com";
            }

            public void showMessageDialog(String message) {
                assertEquals("Please fill all the fields.", message); // Check the message
            }
        };

        controller = new DataEntryOpController(view);
        boolean result = controller.addVendor();
        assertFalse(result);
    }

    @Test
    void testAddVendor_Success() throws SQLException {
        boolean result = controller.addVendor();
        assertTrue(result);
    }

    @Test
    void testAddProduct_EmptyFields() {
        // Simulate empty product ID
        view = new DataEntryOperatorScreen() {
            public String getProductId() {
                return ""; // Empty product ID
            }

            public String getProductName() {
                return "Product A";
            }

            public String getSalePrice() {
                return "100.0";
            }

            public String getPricePerCaton() {
                return "50.0";
            }

            public String getPricePerUnit() {
                return "10.0";
            }

            public String getOriginalPrice() {
                return "80.0";
            }

            public String getActualQuantity() {
                return "100";
            }

            public String getBranchCode() {
                return "B001";
            }

            public String getSelectedProductCategory() {
                return "Category A";
            }

            public String getSelectedVendorId() {
                return "V001";
            }

            public void showMessageDialog(String message) {
                assertEquals("Please fill all the fields.", message); // Check the message
            }
        };

        controller = new DataEntryOpController(view);
        boolean result = controller.addProduct();
        assertFalse(result);
    }

    @Test
    void testAddProduct_Success() throws SQLException {
        boolean result = controller.addProduct();
        assertTrue(result);
    }

    @Test
    void testChangePassword_Success() throws SQLException {
        controller.changePassword();

    }

    @Test
    void testDisplayVendors_Success() throws SQLException {
        controller.displayVendors();
    }

    @Test
    void testLoadVendorIdsToComboBox_Success() throws SQLException {
        controller.loadVendorIdsToComboBox();
    }
}
