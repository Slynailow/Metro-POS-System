package com.mycompany.metrosystem.view;

import javax.swing.JFrame;

public class UserFrameFactory {

    public static JFrame getUserFrame(String userType,String userName) {
        switch (userType) {
            case "Admin":
                return new AdminScreen();
            case "Data Entry Operator":
                return new DataEntryOperatorScreen(userName);
            case "Cashier":
                return new CashierScreen();
            case "Branch Manager":
                return new BranchManagerScreen();
                
            default:
                return null; 
        }
    }
}
