package com.mycompany.metrosystem.view;

import  com.mycompany.metrosystem.controller.CashierController;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
        
public class CashierScreen extends javax.swing.JFrame {
    
    
    String userName,branchCode;
    private List<String[]> allProducts = new ArrayList<>();
    
    public CashierScreen(String userName, String branchCode) {
        this.userName=userName;
        this.branchCode=branchCode;
        initComponents();
        myinit();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        LeftPanel = new javax.swing.JPanel();
        metroLb = new javax.swing.JLabel();
        RighPanel = new javax.swing.JPanel();
        SalesPanel = new javax.swing.JPanel();
        searchBarTf = new javax.swing.JTextField();
        ProductTableSp = new javax.swing.JScrollPane();
        productTb = new javax.swing.JTable();
        CartTableSp = new javax.swing.JScrollPane();
        cartTb = new javax.swing.JTable();
        searchBarLb = new javax.swing.JLabel();
        productLb = new javax.swing.JLabel();
        cartLb = new javax.swing.JLabel();
        metroCardTf = new javax.swing.JTextField();
        metroCardLb = new javax.swing.JLabel();
        searchCardInfoBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        BillPanel = new javax.swing.JPanel();
        totalLb = new javax.swing.JLabel();
        generateBillBtn = new javax.swing.JButton();
        pointsBtn = new javax.swing.JButton();
        customerNameLb = new javax.swing.JLabel();
        customerNameTf = new javax.swing.JTextField();
        invoiceDetailLb = new javax.swing.JLabel();
        cashierNameLb = new javax.swing.JLabel();
        branchNameLb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("METRO - Cashier Window");
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setPreferredSize(new java.awt.Dimension(1920, 1080));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LeftPanel.setBackground(new java.awt.Color(1, 65, 113));
        LeftPanel.setPreferredSize(new java.awt.Dimension(320, 1080));

        metroLb.setBackground(new java.awt.Color(1, 65, 30));
        metroLb.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\Assets\\metroLogo.png")); // NOI18N
        metroLb.setFocusable(false);
        metroLb.setPreferredSize(new java.awt.Dimension(320, 160));

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftPanelLayout.createSequentialGroup()
                .addComponent(metroLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addComponent(metroLb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 920, Short.MAX_VALUE))
        );

        MainPanel.add(LeftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        LeftPanel.getAccessibleContext().setAccessibleName("");

        RighPanel.setBackground(new java.awt.Color(255, 255, 255));
        RighPanel.setPreferredSize(new java.awt.Dimension(1600, 1080));
        RighPanel.setLayout(new java.awt.CardLayout());

        SalesPanel.setBackground(new java.awt.Color(255, 255, 255));
        SalesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchBarTf.setBackground(new java.awt.Color(1, 65, 113));
        searchBarTf.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        searchBarTf.setForeground(new java.awt.Color(249, 252, 16));
        searchBarTf.setToolTipText("BarCode or Keyboard Input");
        searchBarTf.setPreferredSize(new java.awt.Dimension(500, 50));
        SalesPanel.add(searchBarTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        ProductTableSp.setBackground(new java.awt.Color(1, 65, 113));
        ProductTableSp.setForeground(new java.awt.Color(51, 51, 51));
        ProductTableSp.setPreferredSize(new java.awt.Dimension(900, 320));

        productTb.setBackground(new java.awt.Color(1, 65, 113));
        productTb.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        productTb.setForeground(new java.awt.Color(255, 255, 255));
        productTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Sales Price", "Quantity In Store"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProductTableSp.setViewportView(productTb);
        if (productTb.getColumnModel().getColumnCount() > 0) {
            productTb.getColumnModel().getColumn(0).setResizable(false);
            productTb.getColumnModel().getColumn(1).setResizable(false);
            productTb.getColumnModel().getColumn(2).setResizable(false);
            productTb.getColumnModel().getColumn(3).setResizable(false);
        }

        SalesPanel.add(ProductTableSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 141, -1, -1));

        CartTableSp.setBackground(new java.awt.Color(1, 65, 113));
        CartTableSp.setPreferredSize(new java.awt.Dimension(900, 380));

        cartTb.setBackground(new java.awt.Color(1, 65, 113));
        cartTb.setForeground(new java.awt.Color(255, 255, 255));
        cartTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Price", "Quantity Required", "Remove Btn"
            }
        ));
        CartTableSp.setViewportView(cartTb);

        SalesPanel.add(CartTableSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 504, -1, -1));

        searchBarLb.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        searchBarLb.setForeground(new java.awt.Color(1, 65, 113));
        searchBarLb.setText("Search ");
        SalesPanel.add(searchBarLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 15, -1, -1));

        productLb.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        productLb.setForeground(new java.awt.Color(1, 65, 113));
        productLb.setText("Products");
        SalesPanel.add(productLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 108, -1, -1));

        cartLb.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        cartLb.setForeground(new java.awt.Color(1, 65, 113));
        cartLb.setText("Cart");
        SalesPanel.add(cartLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, -1));

        metroCardTf.setBackground(new java.awt.Color(1, 65, 113));
        metroCardTf.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        metroCardTf.setForeground(new java.awt.Color(249, 252, 16));
        metroCardTf.setToolTipText("BarCode or Keyboard Input");
        metroCardTf.setPreferredSize(new java.awt.Dimension(500, 50));
        metroCardTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metroCardTfActionPerformed(evt);
            }
        });
        SalesPanel.add(metroCardTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 920, -1, -1));

        metroCardLb.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        metroCardLb.setForeground(new java.awt.Color(1, 65, 113));
        metroCardLb.setText("Metro Card Number");
        SalesPanel.add(metroCardLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 890, -1, -1));

        searchCardInfoBtn.setBackground(new java.awt.Color(1, 65, 113));
        searchCardInfoBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        searchCardInfoBtn.setForeground(new java.awt.Color(249, 252, 16));
        searchCardInfoBtn.setText("Search Number");
        searchCardInfoBtn.setPreferredSize(new java.awt.Dimension(190, 50));
        SalesPanel.add(searchCardInfoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 920, -1, -1));

        jButton1.setBackground(new java.awt.Color(1, 65, 113));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 19)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 204));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\Assets\\empty-cart.png")); // NOI18N
        jButton1.setText("Empty Cart");
        jButton1.setPreferredSize(new java.awt.Dimension(175, 50));
        SalesPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 920, -1, -1));

        BillPanel.setBackground(new java.awt.Color(1, 94, 164));

        totalLb.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        totalLb.setForeground(new java.awt.Color(255, 255, 255));
        totalLb.setText("Total:");

        generateBillBtn.setBackground(new java.awt.Color(153, 153, 255));
        generateBillBtn.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        generateBillBtn.setForeground(new java.awt.Color(255, 255, 255));
        generateBillBtn.setText("Generate Bill");
        generateBillBtn.setPreferredSize(new java.awt.Dimension(150, 150));

        pointsBtn.setBackground(new java.awt.Color(153, 153, 255));
        pointsBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        pointsBtn.setForeground(new java.awt.Color(255, 255, 255));
        pointsBtn.setText("Points Gained");
        pointsBtn.setFocusable(false);
        pointsBtn.setPreferredSize(new java.awt.Dimension(150, 150));
        pointsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointsBtnActionPerformed(evt);
            }
        });

        customerNameLb.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        customerNameLb.setForeground(new java.awt.Color(255, 255, 255));
        customerNameLb.setText("Customer Name");

        customerNameTf.setBackground(new java.awt.Color(1, 65, 113));
        customerNameTf.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        customerNameTf.setForeground(new java.awt.Color(249, 252, 16));

        invoiceDetailLb.setForeground(new java.awt.Color(255, 255, 255));
        invoiceDetailLb.setText("Invoice Details including tax");

        cashierNameLb.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        cashierNameLb.setForeground(new java.awt.Color(255, 255, 255));
        cashierNameLb.setText("UserDetails");

        branchNameLb.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        branchNameLb.setForeground(new java.awt.Color(255, 255, 255));
        branchNameLb.setText("branchDetails");

        javax.swing.GroupLayout BillPanelLayout = new javax.swing.GroupLayout(BillPanel);
        BillPanel.setLayout(BillPanelLayout);
        BillPanelLayout.setHorizontalGroup(
            BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillPanelLayout.createSequentialGroup()
                .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BillPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(branchNameLb, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BillPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cashierNameLb)
                            .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(customerNameLb)
                                .addComponent(totalLb)
                                .addGroup(BillPanelLayout.createSequentialGroup()
                                    .addComponent(generateBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(pointsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(customerNameTf)
                                .addComponent(invoiceDetailLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        BillPanelLayout.setVerticalGroup(
            BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(cashierNameLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(branchNameLb)
                .addGap(40, 40, 40)
                .addGroup(BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pointsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(customerNameLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerNameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invoiceDetailLb, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totalLb)
                .addGap(29, 29, 29))
        );

        SalesPanel.add(BillPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1065, 56, -1, 920));

        RighPanel.add(SalesPanel, "card2");

        MainPanel.add(RighPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void myinit()
    {
        setCashierDetails();
        CashierController controller = new CashierController(this);
        controller.loadProducts(branchCode);
       searchBarTf.getDocument().addDocumentListener(new DocumentListener() {
    @Override
    public void insertUpdate(DocumentEvent e) {
        handleSearchTextChange();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        handleSearchTextChange();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        handleSearchTextChange();
    }

    private void handleSearchTextChange() {
        // Check if the search bar is empty
        if (searchBarTf.getText().isEmpty()) {
            updateProducts(allProducts); // Call updateAllProducts when the search bar is empty
        } else {
            filterTable(); // Otherwise, filter the table based on the search query
        }
    }

    });
                
                
    }
    
    public void setCashierDetails()
    {
        cashierNameLb.setText("Welcome "+ userName + "!");
        branchNameLb.setText("Lets make huge sales today! Branch :"+ branchCode);
    }
     
    public void updateProducts(List<String[]> products)
     {
            allProducts = products; // Update the master list
            DefaultTableModel tableModel = (DefaultTableModel) productTb.getModel();
            tableModel.setRowCount(0); 

            for (String[] product : products) {
                System.out.println(product);
                tableModel.addRow(product); 
            }
    }
    
    private void filterTable() {
    String searchText = searchBarTf.getText().toLowerCase(); // Get the text from the search bar
    List<String[]> filteredProducts = new ArrayList<>();

    if (searchText.isEmpty()) {
        updateProducts(allProducts);
    } else {
        for (String[] product : allProducts) {
            if (product[0].toLowerCase().contains(searchText) || 
                product[1].toLowerCase().contains(searchText)) {
                filteredProducts.add(product);
            }
        }
    }
    showSearchedItem(filteredProducts);
}
      public void showSearchedItem(List<String[]> products)
     {
            
            DefaultTableModel tableModel = (DefaultTableModel) productTb.getModel();
            tableModel.setRowCount(0); 

            for (String[] product : products) {
                System.out.println(product);
                tableModel.addRow(product); 
            }
    }





    
    private void metroCardTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metroCardTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_metroCardTfActionPerformed

    private void pointsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pointsBtnActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CashierScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CashierScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BillPanel;
    private javax.swing.JScrollPane CartTableSp;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JScrollPane ProductTableSp;
    private javax.swing.JPanel RighPanel;
    private javax.swing.JPanel SalesPanel;
    private javax.swing.JLabel branchNameLb;
    private javax.swing.JLabel cartLb;
    private javax.swing.JTable cartTb;
    private javax.swing.JLabel cashierNameLb;
    private javax.swing.JLabel customerNameLb;
    private javax.swing.JTextField customerNameTf;
    private javax.swing.JButton generateBillBtn;
    private javax.swing.JLabel invoiceDetailLb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel metroCardLb;
    private javax.swing.JTextField metroCardTf;
    private javax.swing.JLabel metroLb;
    private javax.swing.JButton pointsBtn;
    private javax.swing.JLabel productLb;
    private javax.swing.JTable productTb;
    private javax.swing.JLabel searchBarLb;
    private javax.swing.JTextField searchBarTf;
    private javax.swing.JButton searchCardInfoBtn;
    private javax.swing.JLabel totalLb;
    // End of variables declaration//GEN-END:variables
}
