// Controller: LoginController.java
package com.mycompany.metrosystem.controller;

import com.mycompany.metrosystem.view.LoginScreen;
import com.mycompany.metrosystem.model.LoginModel;
import com.mycompany.metrosystem.view.DataEntryOperatorScreen;
import com.mycompany.metrosystem.view.UserFrameFactory;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginController {
    
    private LoginScreen loginScreen;
    private LoginModel loginModel;

    public LoginController(LoginScreen loginScreen) 
    {
        this.loginScreen = loginScreen;
        
        try {
            this.loginModel = new LoginModel();
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public void handleLogin()
    {
        String username = loginScreen.getUsername();
        String password = loginScreen.getPassword();
        String userType = loginScreen.getUserType();
        
        if (username.isEmpty() || password.isEmpty()) {
            loginScreen.displayMessage("Please enter both username and password");
            return;
        }

        boolean isAuthenticated = loginModel.authenticateUser(username, password, userType);
        
        if (isAuthenticated) 
        {
            loginScreen.displayMessage("Login successful");
            loginScreen.dispose();
            String branchCode = loginModel.getBranchCode(userType,username, password);
            if (branchCode == null) {
                loginScreen.displayMessage("Branch code could not be retrieved");
                return;
            }
            UserFrameFactory.getUserFrame(userType,username, branchCode).setVisible(true);
        } else {
            loginScreen.displayMessage("Invalid credentials");
        }
    }
}
