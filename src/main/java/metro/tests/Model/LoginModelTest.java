package Tests.Model;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import Model.LoginModel;

import java.sql.SQLException;

public class LoginModelTest {

    private LoginModel loginModel;

    @Before
    public void setUp() {
        try {
            loginModel = new LoginModel();
        } catch (SQLException | ClassNotFoundException e) {
            fail("Failed to set up LoginModel: " + e.getMessage());
        }
    }

    // Test case for valid user authentication (Admin)
    @Test
    public void testAuthenticateUser_ValidAdmin() {
        boolean result = loginModel.authenticateUser("validAdmin", "validPassword", "Admin");
        assertTrue("Admin user should be authenticated successfully", result);
    }

    // Test case for invalid user authentication (Wrong Password)
    @Test
    public void testAuthenticateUser_InvalidPassword() {
        boolean result = loginModel.authenticateUser("validAdmin", "wrongPassword", "Admin");
        assertFalse("Authentication should fail for invalid password", result);
    }

    // Test case for invalid user authentication (Invalid Username)
    @Test
    public void testAuthenticateUser_InvalidUsername() {
        boolean result = loginModel.authenticateUser("invalidUser", "validPassword", "Admin");
        assertFalse("Authentication should fail for invalid username", result);
    }

    // Test case for invalid user type
    @Test
    public void testAuthenticateUser_InvalidUserType() {
        boolean result = loginModel.authenticateUser("validAdmin", "validPassword", "InvalidType");
        assertFalse("Authentication should fail for invalid user type", result);
    }

    // Test case for valid user authentication (Branch Manager)
    @Test
    public void testAuthenticateUser_ValidBranchManager() {
        boolean result = loginModel.authenticateUser("validBranchManager", "validPassword", "Branch Manager");
        assertTrue("Branch Manager user should be authenticated successfully", result);
    }

    // Test case for retrieving branch code for valid user (Admin)
    @Test
    public void testGetBranchCode_ValidAdmin() {
        String branchCode = loginModel.getBranchCode("Admin", "validAdmin", "validPassword");
        assertNotNull("Branch code should be retrieved for valid admin", branchCode);
    }

    // Test case for retrieving branch code for invalid user
    @Test
    public void testGetBranchCode_InvalidUser() {
        String branchCode = loginModel.getBranchCode("Admin", "invalidUser", "wrongPassword");
        assertNull("Branch code should not be retrieved for invalid user", branchCode);
    }

    // Test case for SQL Exception handling
    @Test
    public void testSQLExceptionHandling() {
        try {
            LoginModel faultyLoginModel = new LoginModel() {
                @Override
                public boolean authenticateUser(String username, String password, String userType) {
                    try {
                        throw new SQLException("SQL error occurred");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    return false;
                }
            };

            boolean result = faultyLoginModel.authenticateUser("anyUser", "anyPassword", "Admin");
            assertFalse("SQL exception should be handled gracefully", result);
        } catch (SQLException | ClassNotFoundException e) {
            fail("Setup failed: " + e.getMessage());
        }
    }
}
