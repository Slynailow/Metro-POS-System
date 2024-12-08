package com.mycompany.metrosystem.view;

import com.mycompany.metrosystem.controller.CashierController;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class CashierScreen extends javax.swing.JFrame {

    String userName, branchCode;
    public List<String[]> allProducts = new ArrayList<>();
    public List<String[]> purchasedProducts = new ArrayList<>();

    CashierController controller;

    public CashierScreen(String userName, String branchCode) {
        this.userName = userName;
        this.branchCode = branchCode;
        initComponents();
        myinit();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        LeftPanel = new javax.swing.JPanel();
        metroLb = new javax.swing.JLabel();
        cashierPanelBtn = new javax.swing.JButton();
        changePasswordBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        RightPanel = new javax.swing.JPanel();
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
        BillPanel = new javax.swing.JPanel();
        totalLb = new javax.swing.JLabel();
        generateBillBtn = new javax.swing.JButton();
        pointsBtn = new javax.swing.JButton();
        invoiceMetroLb = new javax.swing.JLabel();
        cashierNameLb = new javax.swing.JLabel();
        branchNameLb = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        invoiceDetailsLb = new javax.swing.JLabel();
        doneBtn = new javax.swing.JButton();
        customerNameTf = new javax.swing.JTextField();
        customerNameLb = new javax.swing.JLabel();
        ChangePasswordPanel = new javax.swing.JPanel();
        SystemNameLb2 = new javax.swing.JLabel();
        SloganLb2 = new javax.swing.JLabel();
        ChangePasswordLbNav = new javax.swing.JLabel();
        OldPasswordFd = new javax.swing.JPasswordField();
        NewPasswordFd = new javax.swing.JPasswordField();
        ConfirmPasswordFd = new javax.swing.JPasswordField();
        OldPasswordLb = new javax.swing.JLabel();
        NewPasswordLb = new javax.swing.JLabel();
        ConfirmPassswordLb = new javax.swing.JLabel();
        SeparatorOne = new javax.swing.JSeparator();
        SeparatorTwo = new javax.swing.JSeparator();
        SeparatorThree = new javax.swing.JSeparator();
        ChangeBtn = new javax.swing.JButton();

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
        metroLb.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\Assets\\metroLogo.png"));
        metroLb.setFocusable(false);

        cashierPanelBtn.setBackground(new java.awt.Color(153, 153, 255));
        cashierPanelBtn.setFont(new java.awt.Font("Century Gothic", 0, 22));
        cashierPanelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cashierPanelBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\Assets\\cashier-machine.png"));
        cashierPanelBtn.setText("Cashier Panel");
        cashierPanelBtn.setPreferredSize(new java.awt.Dimension(320, 90));
        cashierPanelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashierPanelBtnActionPerformed(evt);
            }
        });

        changePasswordBtn.setBackground(new java.awt.Color(153, 153, 255));
        changePasswordBtn.setFont(new java.awt.Font("Century Gothic", 0, 22));
        changePasswordBtn.setForeground(new java.awt.Color(255, 255, 255));
        changePasswordBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\Assets\\changePassword.png"));
        changePasswordBtn.setText("Change Password");
        changePasswordBtn.setPreferredSize(new java.awt.Dimension(320, 90));
        changePasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordBtnActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(255, 102, 102));
        logoutBtn.setFont(new java.awt.Font("Century Gothic", 0, 21));
        logoutBtn.setForeground(new java.awt.Color(51, 51, 51));
        logoutBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\Assets\\logOut.png"));
        logoutBtn.setText("Log out");
        logoutBtn.setPreferredSize(new java.awt.Dimension(180, 55));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
                LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LeftPanelLayout.createSequentialGroup()
                                .addGroup(LeftPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(metroLb, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(changePasswordBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cashierPanelBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(LeftPanelLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        LeftPanelLayout.setVerticalGroup(
                LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LeftPanelLayout.createSequentialGroup()
                                .addComponent(metroLb)
                                .addGap(126, 126, 126)
                                .addComponent(changePasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(cashierPanelBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 416,
                                        Short.MAX_VALUE)
                                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111)));

        MainPanel.add(LeftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        LeftPanel.getAccessibleContext().setAccessibleName("");

        RightPanel.setBackground(new java.awt.Color(255, 255, 255));
        RightPanel.setPreferredSize(new java.awt.Dimension(1600, 1080));
        RightPanel.setLayout(new java.awt.CardLayout());

        SalesPanel.setBackground(new java.awt.Color(255, 255, 255));
        SalesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchBarTf.setBackground(new java.awt.Color(1, 65, 113));
        searchBarTf.setFont(new java.awt.Font("Century Gothic", 0, 24));
        searchBarTf.setForeground(new java.awt.Color(249, 252, 16));
        searchBarTf.setToolTipText("BarCode or Keyboard Input");
        searchBarTf.setPreferredSize(new java.awt.Dimension(500, 50));
        SalesPanel.add(searchBarTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        ProductTableSp.setBackground(new java.awt.Color(1, 65, 113));
        ProductTableSp.setForeground(new java.awt.Color(51, 51, 51));
        ProductTableSp.setPreferredSize(new java.awt.Dimension(900, 320));

        productTb.setBackground(new java.awt.Color(1, 65, 113));
        productTb.setFont(new java.awt.Font("Century Gothic", 0, 20));
        productTb.setForeground(new java.awt.Color(255, 255, 255));
        productTb.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null },
                        { null, null, null, null, null },
                        { null, null, null, null, null },
                        { null, null, null, null, null }
                },
                new String[] {
                        "ID", "Name", "Sales Price", "Quantity In Store", "Add Item"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        productTb.setRowHeight(30);
        productTb.setRowMargin(2);
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
        cartTb.setFont(new java.awt.Font("Century Gothic", 0, 20));
        cartTb.setForeground(new java.awt.Color(255, 255, 255));
        cartTb.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "ID", "Name", "Price", "Quantity Required", "Remove Btn"
                }));
        cartTb.setRowHeight(30);
        cartTb.setRowMargin(2);
        CartTableSp.setViewportView(cartTb);

        SalesPanel.add(CartTableSp, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 504, -1, -1));

        searchBarLb.setFont(new java.awt.Font("Century Gothic", 0, 24));
        searchBarLb.setForeground(new java.awt.Color(1, 65, 113));
        searchBarLb.setText("Search ");
        SalesPanel.add(searchBarLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        productLb.setFont(new java.awt.Font("Century Gothic", 0, 24));
        productLb.setForeground(new java.awt.Color(1, 65, 113));
        productLb.setText("Products");
        SalesPanel.add(productLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 108, -1, -1));

        cartLb.setFont(new java.awt.Font("Century Gothic", 0, 24));
        cartLb.setForeground(new java.awt.Color(1, 65, 113));
        cartLb.setText("Cart");
        SalesPanel.add(cartLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, -1));

        metroCardTf.setBackground(new java.awt.Color(1, 65, 113));
        metroCardTf.setFont(new java.awt.Font("Century Gothic", 0, 24));
        metroCardTf.setForeground(new java.awt.Color(249, 252, 16));
        metroCardTf.setToolTipText("BarCode or Keyboard Input");
        metroCardTf.setPreferredSize(new java.awt.Dimension(150, 45));
        metroCardTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metroCardTfActionPerformed(evt);
            }
        });
        SalesPanel.add(metroCardTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 920, 410, -1));

        metroCardLb.setFont(new java.awt.Font("Century Gothic", 0, 24));
        metroCardLb.setForeground(new java.awt.Color(1, 65, 113));
        metroCardLb.setText("Metro Card Number");
        SalesPanel.add(metroCardLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 890, -1, -1));

        BillPanel.setBackground(new java.awt.Color(1, 94, 164));

        totalLb.setFont(new java.awt.Font("Century Gothic", 1, 48));
        totalLb.setForeground(new java.awt.Color(255, 255, 255));
        totalLb.setText("Total:");

        generateBillBtn.setBackground(new java.awt.Color(153, 153, 255));
        generateBillBtn.setFont(new java.awt.Font("Century Gothic", 0, 24));
        generateBillBtn.setForeground(new java.awt.Color(255, 255, 255));
        generateBillBtn.setText("Generate Bill");
        generateBillBtn.setPreferredSize(new java.awt.Dimension(150, 150));
        generateBillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateBillBtnActionPerformed(evt);
            }
        });

        pointsBtn.setBackground(new java.awt.Color(153, 153, 255));
        pointsBtn.setFont(new java.awt.Font("Century Gothic", 0, 22));
        pointsBtn.setForeground(new java.awt.Color(153, 255, 51));
        pointsBtn.setText("Points Gained");
        pointsBtn.setFocusable(false);
        pointsBtn.setPreferredSize(new java.awt.Dimension(150, 150));
        pointsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointsBtnActionPerformed(evt);
            }
        });

        invoiceMetroLb.setFont(new java.awt.Font("Century Gothic", 1, 24));
        invoiceMetroLb.setForeground(new java.awt.Color(255, 255, 255));
        invoiceMetroLb.setText("Metro Point of Sale System");

        cashierNameLb.setFont(new java.awt.Font("Century Gothic", 0, 30));
        cashierNameLb.setForeground(new java.awt.Color(255, 255, 255));
        cashierNameLb.setText("UserDetails");

        branchNameLb.setFont(new java.awt.Font("Century Gothic", 0, 20));
        branchNameLb.setForeground(new java.awt.Color(255, 255, 255));
        branchNameLb.setText("branchDetails");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOpaque(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 30));

        invoiceDetailsLb.setFont(new java.awt.Font("Century Gothic", 0, 20));

        doneBtn.setBackground(new java.awt.Color(0, 255, 51));
        doneBtn.setFont(new java.awt.Font("Century Gothic", 3, 24));
        doneBtn.setForeground(new java.awt.Color(255, 255, 255));
        doneBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\Assets\\checkmark.png"));
        doneBtn.setText("Done!");
        doneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BillPanelLayout = new javax.swing.GroupLayout(BillPanel);
        BillPanel.setLayout(BillPanelLayout);
        BillPanelLayout.setHorizontalGroup(
                BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(invoiceMetroLb)
                                .addGap(69, 69, 69))
                        .addGroup(BillPanelLayout.createSequentialGroup()
                                .addGroup(BillPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(BillPanelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(BillPanelLayout.createSequentialGroup()
                                                        .addGap(24, 24, 24)
                                                        .addComponent(cashierNameLb))
                                                .addGroup(BillPanelLayout.createSequentialGroup()
                                                        .addGap(12, 12, 12)
                                                        .addGroup(BillPanelLayout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(BillPanelLayout.createSequentialGroup()
                                                                        .addGap(6, 6, 6)
                                                                        .addComponent(generateBillBtn,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                208,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(pointsBtn,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                220,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(branchNameLb,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 434,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(BillPanelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(doneBtn, javax.swing.GroupLayout.Alignment.TRAILING,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(totalLb)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 434,
                                                        Short.MAX_VALUE)
                                                .addComponent(invoiceDetailsLb, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap(22, Short.MAX_VALUE)));
        BillPanelLayout.setVerticalGroup(
                BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillPanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(cashierNameLb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(branchNameLb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(
                                        BillPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(generateBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(pointsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 198,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(invoiceMetroLb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(invoiceDetailsLb, javax.swing.GroupLayout.PREFERRED_SIZE, 379,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(totalLb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(doneBtn)
                                .addContainerGap(20, Short.MAX_VALUE)));

        SalesPanel.add(BillPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1065, 56, 480, 920));

        customerNameTf.setBackground(new java.awt.Color(1, 65, 113));
        customerNameTf.setFont(new java.awt.Font("Century Gothic", 0, 24));
        customerNameTf.setForeground(new java.awt.Color(249, 252, 16));
        customerNameTf.setPreferredSize(new java.awt.Dimension(150, 45));
        customerNameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameTfActionPerformed(evt);
            }
        });
        SalesPanel.add(customerNameTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 920, 450, -1));

        customerNameLb.setFont(new java.awt.Font("Century Gothic", 0, 24));
        customerNameLb.setForeground(new java.awt.Color(51, 51, 51));
        customerNameLb.setText("Customer Name");
        SalesPanel.add(customerNameLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 890, -1, -1));

        RightPanel.add(SalesPanel, "card2");

        ChangePasswordPanel.setBackground(new java.awt.Color(255, 255, 255));

        SystemNameLb2.setFont(new java.awt.Font("Century Gothic", 1, 36));
        SystemNameLb2.setForeground(new java.awt.Color(51, 51, 51));
        SystemNameLb2.setText("Metro Point of Sale System");

        SloganLb2.setFont(new java.awt.Font("Century Gothic", 2, 24));
        SloganLb2.setForeground(new java.awt.Color(51, 51, 51));

        ChangePasswordLbNav.setFont(new java.awt.Font("Century Schoolbook", 2, 20));
        ChangePasswordLbNav.setForeground(new java.awt.Color(153, 153, 255));
        ChangePasswordLbNav.setText("Change Password Window");

        OldPasswordFd.setBackground(new java.awt.Color(255, 255, 255));
        OldPasswordFd.setFont(new java.awt.Font("Century Gothic", 0, 24));
        OldPasswordFd.setForeground(new java.awt.Color(1, 146, 213));
        OldPasswordFd.setText("jPasswordField1");
        OldPasswordFd.setBorder(null);
        OldPasswordFd.setPreferredSize(new java.awt.Dimension(160, 55));
        OldPasswordFd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OldPasswordFdActionPerformed(evt);
            }
        });

        NewPasswordFd.setBackground(new java.awt.Color(255, 255, 255));
        NewPasswordFd.setFont(new java.awt.Font("Century Gothic", 0, 24));
        NewPasswordFd.setForeground(new java.awt.Color(1, 146, 213));
        NewPasswordFd.setText("jPasswordField1");
        NewPasswordFd.setBorder(null);
        NewPasswordFd.setPreferredSize(new java.awt.Dimension(160, 55));

        ConfirmPasswordFd.setBackground(new java.awt.Color(255, 255, 255));
        ConfirmPasswordFd.setFont(new java.awt.Font("Century Gothic", 0, 24));
        ConfirmPasswordFd.setForeground(new java.awt.Color(1, 146, 213));
        ConfirmPasswordFd.setText("jPasswordField1");
        ConfirmPasswordFd.setBorder(null);
        ConfirmPasswordFd.setPreferredSize(new java.awt.Dimension(160, 55));
        ConfirmPasswordFd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPasswordFdActionPerformed(evt);
            }
        });

        OldPasswordLb.setFont(new java.awt.Font("Century Gothic", 0, 24));
        OldPasswordLb.setForeground(new java.awt.Color(51, 51, 51));
        OldPasswordLb.setText("Old Password");

        NewPasswordLb.setFont(new java.awt.Font("Century Gothic", 0, 24));
        NewPasswordLb.setForeground(new java.awt.Color(51, 51, 51));
        NewPasswordLb.setText("New Password");

        ConfirmPassswordLb.setFont(new java.awt.Font("Century Gothic", 0, 24));
        ConfirmPassswordLb.setForeground(new java.awt.Color(51, 51, 51));
        ConfirmPassswordLb.setText("Confirm Password");

        SeparatorOne.setForeground(new java.awt.Color(51, 51, 255));

        SeparatorTwo.setForeground(new java.awt.Color(51, 51, 255));

        SeparatorThree.setForeground(new java.awt.Color(51, 51, 255));

        ChangeBtn.setBackground(new java.awt.Color(1, 146, 213));
        ChangeBtn.setFont(new java.awt.Font("Century Gothic", 0, 24));
        ChangeBtn.setForeground(new java.awt.Color(255, 255, 255));
        ChangeBtn.setText("Change");
        ChangeBtn.setPreferredSize(new java.awt.Dimension(150, 50));
        ChangeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ChangeBtnMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                ChangeBtnMouseExited(evt);
            }
        });
        ChangeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChangePasswordPanelLayout = new javax.swing.GroupLayout(ChangePasswordPanel);
        ChangePasswordPanel.setLayout(ChangePasswordPanelLayout);
        ChangePasswordPanelLayout.setHorizontalGroup(
                ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(ChangePasswordPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                                                .addComponent(SystemNameLb2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        216, Short.MAX_VALUE)
                                                .addComponent(ChangePasswordLbNav)
                                                .addGap(16, 16, 16))
                                        .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                                                .addComponent(SloganLb2)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE))))
                        .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(ChangePasswordPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ChangeBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(ChangePasswordPanelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(ChangePasswordPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                                                                .addComponent(OldPasswordLb)
                                                                .addGap(71, 71, 71)
                                                                .addComponent(OldPasswordFd,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 412,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                                                                .addComponent(NewPasswordLb)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addGroup(ChangePasswordPanelLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addGroup(ChangePasswordPanelLayout
                                                                                .createSequentialGroup()
                                                                                .addGap(6, 6, 6)
                                                                                .addComponent(SeparatorTwo))
                                                                        .addComponent(NewPasswordFd,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                412,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                                                                .addComponent(ConfirmPassswordLb)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addGroup(ChangePasswordPanelLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addGroup(ChangePasswordPanelLayout
                                                                                .createSequentialGroup()
                                                                                .addGap(6, 6, 6)
                                                                                .addComponent(SeparatorThree))
                                                                        .addComponent(ConfirmPasswordFd,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                412,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                                                        .addGap(230, 230, 230)
                                                        .addComponent(SeparatorOne,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 412,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)));
        ChangePasswordPanelLayout.setVerticalGroup(
                ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(ChangePasswordPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SystemNameLb2)
                                        .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(ChangePasswordLbNav)))
                                .addGap(28, 28, 28)
                                .addComponent(SloganLb2)
                                .addGap(159, 159, 159)
                                .addGroup(ChangePasswordPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(OldPasswordFd, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(OldPasswordLb))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SeparatorOne, javax.swing.GroupLayout.PREFERRED_SIZE, 19,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addGroup(ChangePasswordPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(NewPasswordFd, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NewPasswordLb))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SeparatorTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addGroup(ChangePasswordPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ConfirmPasswordFd, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ConfirmPassswordLb))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SeparatorThree, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(ChangeBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(392, Short.MAX_VALUE)));

        RightPanel.add(ChangePasswordPanel, "card4");

        MainPanel.add(RightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }

    private void myinit() {
        SalesPanel.setVisible(false);
        ChangePasswordPanel.setVisible(true);
        setCashierDetails();
        controller = new CashierController(this);
        controller.loadProducts(branchCode);

        searchBarTf.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filterTable();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filterTable();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filterTable();
            }
        });

        productTb.getColumnModel().getColumn(4).setCellEditor(
                new ButtonEditor(new JCheckBox(), productTb, this));
        productTb.getColumnModel().getColumn(4).setCellRenderer(
                new ButtonRenderer());

        cartTb.getColumnModel().getColumn(4).setCellEditor(
                new ButtonEditor(new JCheckBox(), cartTb, this));
        cartTb.getColumnModel().getColumn(4).setCellRenderer(
                new ButtonRenderer());
    }

    public void setCashierDetails() {
        cashierNameLb.setText("Welcome " + userName + "!");
        branchNameLb.setText("Lets make huge sales today! Branch :" + branchCode);
    }

    public void updateProducts(List<String[]> products) {
        this.allProducts = products; // Preserve actual product quantities
        DefaultTableModel tableModel = (DefaultTableModel) productTb.getModel();
        tableModel.setRowCount(0);

        for (String[] product : products) {
            String[] productWithButton = new String[product.length + 1];
            System.arraycopy(product, 0, productWithButton, 0, product.length);
            productWithButton[product.length] = "Add";
            tableModel.addRow(productWithButton);
        }
    }

    public void filterTable() {
        String searchText = searchBarTf.getText().toLowerCase();
        List<String[]> filteredProducts = new ArrayList<>();

        for (String[] product : allProducts) {
            if (product[0].toLowerCase().contains(searchText) || product[1].toLowerCase().contains(searchText)) {
                String[] productWithButton = new String[product.length + 1];
                System.arraycopy(product, 0, productWithButton, 0, product.length);
                productWithButton[product.length] = "Add";
                filteredProducts.add(productWithButton);
            }
        }
        showSearchedItem(filteredProducts);

    }

    public void showSearchedItem(List<String[]> products) {
        DefaultTableModel tableModel = (DefaultTableModel) productTb.getModel();
        tableModel.setRowCount(0);

        for (String[] product : products) {
            tableModel.addRow(product);
        }
    }

    public void handleAddToCart(String productId) {

        DefaultTableModel cartModel = (DefaultTableModel) cartTb.getModel();
        DefaultTableModel productModel = (DefaultTableModel) productTb.getModel();

        // First check if already in cart, increment quantity if in cart
        for (int i = 0; i < cartModel.getRowCount(); i++) {
            if (cartModel.getValueAt(i, 0).equals(productId)) {
                // Increment the quantity only if there is enough stock
                for (int j = 0; j < productModel.getRowCount(); j++) {
                    if (productModel.getValueAt(j, 0).equals(productId)) {
                        int availableQuantity = Integer.parseInt(productModel.getValueAt(j, 3).toString());
                        if (availableQuantity > 0) {
                            int currentQuantity = Integer.parseInt(cartModel.getValueAt(i, 3).toString());
                            cartModel.setValueAt(String.valueOf(currentQuantity + 1), i, 3);
                            productModel.setValueAt(String.valueOf(availableQuantity - 1), j, 3);
                            updateProductQuantityInAllProducts(productId, -1);
                        } else {
                            JOptionPane.showMessageDialog(null, "No more stock available!");
                        }
                        return;
                    }
                }
            }
        }

        // Otherwise, if not already in cart, check stock and then add
        for (int i = 0; i < productModel.getRowCount(); i++) {
            if (productModel.getValueAt(i, 0).equals(productId)) {
                int availableQuantity = Integer.parseInt(productModel.getValueAt(i, 3).toString());
                if (availableQuantity > 0) {
                    String[] cartRow = {

                            productModel.getValueAt(i, 0).toString(),
                            productModel.getValueAt(i, 1).toString(),
                            productModel.getValueAt(i, 2).toString(),
                            "1",
                            "Remove"
                    };
                    cartModel.addRow(cartRow);
                    productModel.setValueAt(String.valueOf(availableQuantity - 1), i, 3);
                    updateProductQuantityInAllProducts(productId, -1);
                } else {
                    JOptionPane.showMessageDialog(null, "No stock available to add!");
                }
                break;
            }
        }
    }

    private void updateProductQuantityInAllProducts(String productId, int change) {
        for (String[] product : allProducts) {
            if (product[0].equals(productId)) {
                int currentQuantity = Integer.parseInt(product[3]);
                product[3] = String.valueOf(currentQuantity + change);
                break;
            }
        }
    }

    public void handleGenerateBill() {

        purchasedProducts.clear();

        DefaultTableModel cartModel = (DefaultTableModel) cartTb.getModel();
        for (int i = 0; i < cartModel.getRowCount(); i++) {
            String[] rowData = new String[cartModel.getColumnCount() - 1];
            for (int j = 0; j < rowData.length; j++) {
                rowData[j] = cartModel.getValueAt(i, j).toString();
            }
            purchasedProducts.add(rowData);
        }

        cartModel.setRowCount(0);

        if (purchasedProducts.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cart is empty. Please add items to generate a bill.", "Empty Cart",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        controller.processBillGeneration(purchasedProducts, branchCode, getCustomerName(), getMetroCardNumber());
    }

    public String getCustomerName() {
        return customerNameTf.getText();
    }

    public String getMetroCardNumber() {
        return metroCardTf.getText();
    }

    public void setTotalBillPrice(String total) {
        totalLb.setText("Total: " + total);
    }

    public void setInvoiceDetails(String details) {
        invoiceDetailsLb.setText(details);
    }

    public void pointsEarned(int points) {
        pointsBtn.setText("Points Earned: " + points);

    }

    public void handleRemoveFromCart(String productId) {
        DefaultTableModel cartModel = (DefaultTableModel) cartTb.getModel();
        DefaultTableModel productModel = (DefaultTableModel) productTb.getModel();

        for (int i = 0; i < cartModel.getRowCount(); i++) {
            if (cartModel.getValueAt(i, 0).equals(productId)) {
                int quantityInCart = Integer.parseInt(cartModel.getValueAt(i, 3).toString());

                if (quantityInCart > 1) {
                    // Decrease quantity by 1
                    cartModel.setValueAt(String.valueOf(quantityInCart - 1), i, 3);

                    // Increase the main product's quantity by 1 and update allProducts
                    for (int j = 0; j < productModel.getRowCount(); j++) {
                        if (productModel.getValueAt(j, 0).equals(productId)) {
                            int availableQuantity = Integer.parseInt(productModel.getValueAt(j, 3).toString());
                            productModel.setValueAt(String.valueOf(availableQuantity + 1), j, 3);
                            updateProductQuantityInAllProducts(productId, 1);
                            break;
                        }
                    }
                } else if (quantityInCart == 1) {
                    // Remove the row if only 1 unit left
                    cartModel.removeRow(i);

                    // Restore product's available quantity by 1 and update allProducts
                    for (int j = 0; j < productModel.getRowCount(); j++) {
                        if (productModel.getValueAt(j, 0).equals(productId)) {
                            int availableQuantity = Integer.parseInt(productModel.getValueAt(j, 3).toString());
                            productModel.setValueAt(String.valueOf(availableQuantity + 1), j, 3);
                            updateProductQuantityInAllProducts(productId, 1);
                            break;
                        }
                    }
                }
                break;
            }
        }
    }

    public static void main(String[] args) {
        CashierScreen cs = new CashierScreen("WASEE", "123");
        cs.setVisible(true);
    }

    private void doneBtnActionPerformed(java.awt.event.ActionEvent evt) {
        invoiceDetailsLb.setText("");
        pointsBtn.setText("Points Earned");
        metroCardTf.setText("");
        customerNameTf.setText("");
        totalLb.setText("");
    }

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void changePasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {
        SalesPanel.setVisible(false);
    }

    private void cashierPanelBtnActionPerformed(java.awt.event.ActionEvent evt) {
        SalesPanel.setVisible(true);

    }

    private void ChangeBtnMouseEntered(java.awt.event.MouseEvent evt) {
        ChangeBtn.setBackground(Color.red);
    }

    private void ChangeBtnMouseExited(java.awt.event.MouseEvent evt) {
        ChangeBtn.setBackground(new Color(1, 146, 213));
    }

    public String getOldPassword() {
        return new String(OldPasswordFd.getPassword());
    }

    public String getNewPassword() {
        return new String(NewPasswordFd.getPassword());
    }

    public String getConfirmPassword() {
        return new String(ConfirmPasswordFd.getPassword());
    }

    public String getUserName() {
        return userName;
    }

    private void ChangeBtnActionPerformed(java.awt.event.ActionEvent evt) {

        controller.changePassword();
    }

    private javax.swing.JPanel BillPanel;
    private javax.swing.JScrollPane CartTableSp;
    private javax.swing.JButton ChangeBtn;
    private javax.swing.JLabel ChangePasswordLbNav;
    private javax.swing.JPanel ChangePasswordPanel;
    private javax.swing.JLabel ConfirmPassswordLb;
    private javax.swing.JPasswordField ConfirmPasswordFd;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPasswordField NewPasswordFd;
    private javax.swing.JLabel NewPasswordLb;
    private javax.swing.JPasswordField OldPasswordFd;
    private javax.swing.JLabel OldPasswordLb;
    private javax.swing.JScrollPane ProductTableSp;
    private javax.swing.JPanel RightPanel;
    private javax.swing.JPanel SalesPanel;
    private javax.swing.JSeparator SeparatorOne;
    private javax.swing.JSeparator SeparatorThree;
    private javax.swing.JSeparator SeparatorTwo;
    private javax.swing.JLabel SloganLb2;
    private javax.swing.JLabel SystemNameLb2;
    private javax.swing.JLabel branchNameLb;
    private javax.swing.JLabel cartLb;
    private javax.swing.JTable cartTb;
    private javax.swing.JLabel cashierNameLb;
    private javax.swing.JButton cashierPanelBtn;
    private javax.swing.JButton changePasswordBtn;
    private javax.swing.JLabel customerNameLb;
    private javax.swing.JTextField customerNameTf;
    private javax.swing.JButton doneBtn;
    private javax.swing.JButton generateBillBtn;
    private javax.swing.JLabel invoiceDetailsLb;
    private javax.swing.JLabel invoiceMetroLb;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel metroCardLb;
    private javax.swing.JTextField metroCardTf;
    private javax.swing.JLabel metroLb;
    private javax.swing.JButton pointsBtn;
    private javax.swing.JLabel productLb;
    private javax.swing.JTable productTb;
    private javax.swing.JLabel searchBarLb;
    private javax.swing.JTextField searchBarTf;
    private javax.swing.JLabel totalLb;
}
