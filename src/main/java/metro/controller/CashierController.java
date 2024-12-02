package com.mycompany.metrosystem.controller;

import com.mycompany.metrosystem.model.CashierModel;
import com.mycompany.metrosystem.view.CashierScreen;
import java.util.List;

public class CashierController {
    private CashierModel model;
    private CashierScreen view;

    // Constructor
    public CashierController(CashierScreen view) {
        this.view = view;
        this.model = new CashierModel();
    }

    // Method to get products from the model and pass them to the view
    public void loadProducts(String branchCode) {
        List<String[]> products = model.fetchProductsByBranch(branchCode);
        view.updateProducts(products);  // Update the view with the fetched products
    }
}
