
package Tests.Model;

import Model.BranchManagerModel;
import org.junit.Before;
import org.junit.Test;
import java.sql.SQLException;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class BranchManagerModelTests {

    private BranchManagerModel model;

    @Before
    public void setUp() throws SQLException, ClassNotFoundException {
        model = new BranchManagerModel();
    }

    @Test
    public void testChangePassword() throws SQLException {
        boolean result = model.changePassword("adil", "123456789", "newPassword");
        assertTrue(result);
    }

    @Test
    public void testChangePasswordWithInvalidOldPassword() throws SQLException {
        boolean result = model.changePassword("adil", "wrongPassword", "newPassword");
        assertFalse(result);
    }

    @Test
    public void testChangePasswordWithEmptyNewPassword() throws SQLException {
        boolean result = model.changePassword("adil", "123456789", "");
        assertFalse(result);
    }

    @Test
    public void testChangePasswordWithNullNewPassword() throws SQLException {
        boolean result = model.changePassword("adil", "123456789", null);
        assertFalse(result);
    }

    @Test
    public void testChangePasswordWithEmptyOldPassword() throws SQLException {
        boolean result = model.changePassword("adil", "", "newPassword");
        assertFalse(result);
    }

    @Test
    public void testChangePasswordWithNullOldPassword() throws SQLException {
        boolean result = model.changePassword("adil", null, "newPassword");
        assertFalse(result);
    }

    @Test
    public void testChangePasswordWithEmptyUsername() throws SQLException {
        boolean result = model.changePassword("", "123456789", "newPassword");
        assertFalse(result);
    }

    @Test
    public void testChangePasswordWithNullUsername() throws SQLException {
        boolean result = model.changePassword(null, "123456789", "newPassword");
        assertFalse(result);
    }
}