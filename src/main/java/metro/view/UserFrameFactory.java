package com.mycompany.metrosystem.view;

import javax.swing.JFrame;

public class UserFrameFactory {

    public static JFrame getUserFrame(String userType,String userName, String branchCode) {
        switch (userType) {
            case "Admin":
                return new AdminScreen();
            case "Data Entry Operator":
                return new DataEntryOperatorScreen(userName,branchCode);
            case "Cashier":
                return new CashierScreen(userName,branchCode);
            case "Branch Manager":
                return new BranchManagerScreen();
                
            default:
                return null; 
        }
    }
}
