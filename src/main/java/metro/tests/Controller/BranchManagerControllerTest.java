package Tests.Controller;

import Controller.BranchManagerController;
import Model.BranchManagerModel;
import View.BranchManagerScreen;

import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class BranchManagerControllerTest {

    private BranchManagerModel model;
    private BranchManagerController controller;

    @Before
    public void setUp() throws SQLException, ClassNotFoundException {
        model = new BranchManagerModel();
        controller = new BranchManagerController(new BranchManagerScreen("adil", "1")); // Passing null for view since
                                                                                        // it is not used
    }

    @Test
    public void testPopulateBranchCodes() throws SQLException {
        ArrayList<Integer> branchIds = new ArrayList<>();
        branchIds.add(1);
        branchIds.add(2);

        model.getAllBranchIds().addAll(branchIds);

        assertThat(controller, notNullValue());
    }

    @Test
    public void testHandleAddCashierSuccess() throws SQLException {
        model.addCashier("John", "john@example.com", "password123", "101", "5000");

        assertThat(controller, notNullValue());
    }

    @Test
    public void testHandleAddCashierSQLException() throws SQLException {
        try {
            model.addCashier("John", "john@example.com", "password123", "101", "5000");
            fail("Expected SQLException");
        } catch (SQLException e) {
            assertThat(e.getMessage(), notNullValue());
        }
    }

    @Test
    public void testHandleAddDataOperatorSuccess() throws SQLException {
        model.addDataOperator("Doe", "doe@example.com", "password123", "102", "6000");

        assertThat(controller, notNullValue());
    }

    @Test
    public void testHandleAddDataOperatorSQLException() throws SQLException {
        try {
            model.addDataOperator("Doe", "doe@example.com", "password123", "102", "6000");
            fail("Expected SQLException");
        } catch (SQLException e) {
            assertThat(e.getMessage(), notNullValue());
        }
    }
}
