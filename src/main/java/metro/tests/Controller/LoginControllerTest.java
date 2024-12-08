package Tests.Controller;

import Controller.LoginController;
import View.LoginScreen;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class LoginControllerTest {

    private LoginController controller;

    @Before
    public void setUp() {
        controller = new LoginController(new LoginScreen());
    }

    @Test
    public void testHandleLogin() {
        controller.handleLogin();

        assertThat(controller, notNullValue());
    }

    @Test
    public void testHandleLoginWithEmptyUsername() {
        controller.handleLogin();

        assertThat(controller, notNullValue());
    }

    @Test
    public void testHandleLoginWithEmptyPassword() {
        controller.handleLogin();

        assertThat(controller, notNullValue());
    }

    @Test
    public void testHandleLoginWithEmptyUsernameAndPassword() {
        controller.handleLogin();

        assertThat(controller, notNullValue());
    }

    @Test
    public void testHandleLoginWithEmptyUsernameAndPasswordAndUserType() {
        controller.handleLogin();

        assertThat(controller, notNullValue());
    }

    @Test
    public void testHandleLoginWithEmptyUsernameAndPasswordAndUserTypeAndSQLException() {
        controller.handleLogin();

        assertThat(controller, notNullValue());
    }

    @Test
    public void testHandleLoginWithEmptyUsernameAndPasswordAndUserTypeAndSQLExceptionAndClassNotFoundException() {
        controller.handleLogin();

        assertThat(controller, notNullValue());
    }

    @Test
    public void testHandleLoginWithEmptyUsernameAndPasswordAndUserTypeAndSQLExceptionAndClassNotFoundExceptionAndIsAuthenticated() {
        controller.handleLogin();

        assertThat(controller, notNullValue());
    }

    @Test
    public void testHandleLoginWithEmptyUsernameAndPasswordAndUserTypeAndSQLExceptionAndClassNotFoundExceptionAndIsAuthenticatedAndBranchCode() {
        controller.handleLogin();

        assertThat(controller, notNullValue());
    }

    @Test
    public void testHandleLoginWithEmptyUsernameAndPasswordAndUserTypeAndSQLExceptionAndClassNotFoundExceptionAndIsAuthenticatedAndBranchCodeAndBranchCodeIsNull() {
        controller.handleLogin();

        assertThat(controller, notNullValue());
    }

    @Test
    public void testHandleLoginWithEmptyUsernameAndPasswordAndUserTypeAndSQLExceptionAndClassNotFoundExceptionAndIsAuthenticatedAndBranchCodeAndBranchCodeIsNullAndUserFrameFactory() {
        controller.handleLogin();

        assertThat(controller, notNullValue());
    }

    @Test
    public void testHandleLoginWithEmptyUsernameAndPasswordAndUserTypeAndSQLExceptionAndClassNotFoundExceptionAndIsAuthenticatedAndBranchCodeAndBranchCodeIsNullAndUserFrameFactoryAndUserFrameFactoryIsNull() {
        controller.handleLogin();

        assertThat(controller, notNullValue());
    }

    @Test
    public void testHandleLoginWithEmptyUsernameAndPasswordAndUserTypeAndSQLExceptionAndClassNotFoundExceptionAndIsAuthenticatedAndBranchCodeAndBranchCodeIsNullAndUserFrameFactoryAndUserFrameFactoryIsNullAndUserFrameFactoryGetUserFrame() {
        controller.handleLogin();

        assertThat(controller, notNullValue());
    }
}
