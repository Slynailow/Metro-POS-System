package com.mycompany.metrosystem.view;

import java.awt.Color;
import com.mycompany.metrosystem.controller.BranchManagerController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BranchManagerScreen extends javax.swing.JFrame {

    String userName, branchCode;
    BranchManagerController controller;

    public BranchManagerScreen(String userName, String branchCode) {
        initComponents();

        this.userName = userName;
        this.branchCode = branchCode;
        try {
            controller = new BranchManagerController(this);
        } catch (SQLException ex) {
            Logger.getLogger(BranchManagerScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BranchManagerScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        myinit();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        LeftPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addOperatorBtn = new javax.swing.JButton();
        changePasswordBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        addCashierBtn = new javax.swing.JButton();
        RightPanel = new javax.swing.JPanel();
        ChangePasswordPanel = new javax.swing.JPanel();
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
        headerPanel3 = new javax.swing.JPanel();
        operatorDetailLb3 = new javax.swing.JLabel();
        operatorDetailLb4 = new javax.swing.JLabel();
        userDetailsLb = new javax.swing.JLabel();
        AddCashierPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        cashierDetailsLb1 = new javax.swing.JLabel();
        cashierDetailsLb2 = new javax.swing.JLabel();
        passwordLb = new javax.swing.JLabel();
        nameLb = new javax.swing.JLabel();
        emailLb = new javax.swing.JLabel();
        salaryLb = new javax.swing.JLabel();
        cashierNameTf = new javax.swing.JTextField();
        cashierEmailTf = new javax.swing.JTextField();
        cashierPasswordTf = new javax.swing.JTextField();
        cashierSalaryTf = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        branchCodeLb = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cashierBranchCodeIdTf = new javax.swing.JComboBox<>();
        submitCashierBtn = new javax.swing.JButton();
        AddDataOperatorPanel = new javax.swing.JPanel();
        headerPanel2 = new javax.swing.JPanel();
        operatorDetailLb1 = new javax.swing.JLabel();
        operatorDetailLb2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        operatorBranchCodeIdCb = new javax.swing.JComboBox<>();
        submitOperatorBtn = new javax.swing.JButton();
        operatorNameLb = new javax.swing.JLabel();
        operatorEmailLb = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        operatorSalaryLb = new javax.swing.JLabel();
        operatorPasswordLb = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        operatorNameTf = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        operatorEmailTf = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        operatorPasswordTf = new javax.swing.JTextField();
        operatorBranchCodeLb = new javax.swing.JLabel();
        operatorSalaryTf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Branch Manger - Metro");
        setPreferredSize(new java.awt.Dimension(1280, 1024));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainPanel.setPreferredSize(new java.awt.Dimension(1280, 1024));

        LeftPanel.setBackground(new java.awt.Color(1, 65, 113));
        LeftPanel.setPreferredSize(new java.awt.Dimension(320, 1024));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\Assets\\metroLogo.png"));
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(320, 160));

        addOperatorBtn.setBackground(new java.awt.Color(153, 153, 255));
        addOperatorBtn.setFont(new java.awt.Font("Century Gothic", 0, 22));
        addOperatorBtn.setForeground(new java.awt.Color(255, 255, 255));
        addOperatorBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\Assets\\file.png"));
        addOperatorBtn.setText("Add D.E.0");
        addOperatorBtn.setPreferredSize(new java.awt.Dimension(320, 80));
        addOperatorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOperatorBtnActionPerformed(evt);
            }
        });

        changePasswordBtn.setBackground(new java.awt.Color(153, 153, 255));
        changePasswordBtn.setFont(new java.awt.Font("Century Gothic", 0, 22));
        changePasswordBtn.setForeground(new java.awt.Color(255, 255, 255));
        changePasswordBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\Assets\\changePassword.png"));
        changePasswordBtn.setText("Change Password");
        changePasswordBtn.setPreferredSize(new java.awt.Dimension(320, 80));
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

        addCashierBtn.setBackground(new java.awt.Color(153, 153, 255));
        addCashierBtn.setFont(new java.awt.Font("Century Gothic", 0, 22));
        addCashierBtn.setForeground(new java.awt.Color(255, 255, 255));
        addCashierBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\Assets\\cashier.png"));
        addCashierBtn.setText("Add Cashier");
        addCashierBtn.setPreferredSize(new java.awt.Dimension(320, 80));
        addCashierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCashierBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
                LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LeftPanelLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(LeftPanelLayout.createSequentialGroup()
                                .addGroup(
                                        LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(addCashierBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(changePasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(addOperatorBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)));
        LeftPanelLayout.setVerticalGroup(
                LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LeftPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(157, 157, 157)
                                .addComponent(changePasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addOperatorBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(addCashierBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(281, 281, 281)
                                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)));

        RightPanel.setPreferredSize(new java.awt.Dimension(980, 1024));
        RightPanel.setLayout(new java.awt.CardLayout());

        ChangePasswordPanel.setBackground(new java.awt.Color(255, 255, 255));
        ChangePasswordPanel.setPreferredSize(new java.awt.Dimension(980, 1024));

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

        headerPanel3.setBackground(new java.awt.Color(47, 64, 78));
        headerPanel3.setPreferredSize(new java.awt.Dimension(980, 160));

        operatorDetailLb3.setFont(new java.awt.Font("Century Gothic", 1, 48));
        operatorDetailLb3.setForeground(new java.awt.Color(255, 255, 255));
        operatorDetailLb3.setText("Change Password");

        operatorDetailLb4.setFont(new java.awt.Font("Century Gothic", 0, 24));
        operatorDetailLb4.setForeground(new java.awt.Color(255, 255, 255));
        operatorDetailLb4.setText("Lets make this digital world strong!");

        javax.swing.GroupLayout headerPanel3Layout = new javax.swing.GroupLayout(headerPanel3);
        headerPanel3.setLayout(headerPanel3Layout);
        headerPanel3Layout.setHorizontalGroup(
                headerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerPanel3Layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addGroup(headerPanel3Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(operatorDetailLb3)
                                        .addComponent(operatorDetailLb4))
                                .addContainerGap(331, Short.MAX_VALUE)));
        headerPanel3Layout.setVerticalGroup(
                headerPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(operatorDetailLb3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(operatorDetailLb4)
                                .addContainerGap(35, Short.MAX_VALUE)));

        userDetailsLb.setFont(new java.awt.Font("Century Gothic", 0, 24));
        userDetailsLb.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout ChangePasswordPanelLayout = new javax.swing.GroupLayout(ChangePasswordPanel);
        ChangePasswordPanel.setLayout(ChangePasswordPanelLayout);
        ChangePasswordPanelLayout.setHorizontalGroup(
                ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                                .addGap(129, 129, 129)
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
                                                                        .addComponent(ConfirmPasswordFd,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                412,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(ChangePasswordPanelLayout
                                                                                .createSequentialGroup()
                                                                                .addGap(6, 6, 6)
                                                                                .addComponent(SeparatorThree,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        406,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                                                        .addGap(230, 230, 230)
                                                        .addComponent(SeparatorOne,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 412,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(headerPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 986,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(userDetailsLb)));
        ChangePasswordPanelLayout.setVerticalGroup(
                ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                                .addComponent(headerPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(userDetailsLb)
                                .addGap(72, 72, 72)
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
                                .addContainerGap(352, Short.MAX_VALUE)));

        RightPanel.add(ChangePasswordPanel, "card4");

        AddCashierPanel.setBackground(new java.awt.Color(255, 255, 255));
        AddCashierPanel.setForeground(new java.awt.Color(51, 51, 51));

        headerPanel.setBackground(new java.awt.Color(47, 64, 78));
        headerPanel.setPreferredSize(new java.awt.Dimension(980, 160));

        cashierDetailsLb1.setFont(new java.awt.Font("Century Gothic", 1, 48));
        cashierDetailsLb1.setForeground(new java.awt.Color(255, 255, 255));
        cashierDetailsLb1.setText("Cashier Details");

        cashierDetailsLb2.setFont(new java.awt.Font("Century Gothic", 0, 24));
        cashierDetailsLb2.setForeground(new java.awt.Color(255, 255, 255));
        cashierDetailsLb2.setText("Enter the details of all incoming cashiers");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
                headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerPanelLayout.createSequentialGroup()
                                .addGroup(
                                        headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(headerPanelLayout.createSequentialGroup()
                                                        .addGap(288, 288, 288)
                                                        .addComponent(cashierDetailsLb1))
                                                .addGroup(headerPanelLayout.createSequentialGroup()
                                                        .addGap(235, 235, 235)
                                                        .addComponent(cashierDetailsLb2)))
                                .addContainerGap(265, Short.MAX_VALUE)));
        headerPanelLayout.setVerticalGroup(
                headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(cashierDetailsLb1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cashierDetailsLb2)
                                .addContainerGap(35, Short.MAX_VALUE)));

        passwordLb.setFont(new java.awt.Font("Century Gothic", 0, 26));
        passwordLb.setForeground(new java.awt.Color(51, 51, 51));
        passwordLb.setText("Password");

        nameLb.setFont(new java.awt.Font("Century Gothic", 0, 26));
        nameLb.setForeground(new java.awt.Color(51, 51, 51));
        nameLb.setText("Cashier Name");

        emailLb.setFont(new java.awt.Font("Century Gothic", 0, 26));
        emailLb.setForeground(new java.awt.Color(51, 51, 51));
        emailLb.setText("Email");

        salaryLb.setFont(new java.awt.Font("Century Gothic", 0, 26));
        salaryLb.setForeground(new java.awt.Color(51, 51, 51));
        salaryLb.setText("Salary");

        cashierNameTf.setBackground(new java.awt.Color(255, 255, 255));
        cashierNameTf.setFont(new java.awt.Font("Century Gothic", 0, 26));
        cashierNameTf.setForeground(new java.awt.Color(51, 51, 51));
        cashierNameTf.setBorder(null);

        cashierEmailTf.setBackground(new java.awt.Color(255, 255, 255));
        cashierEmailTf.setFont(new java.awt.Font("Century Gothic", 0, 26));
        cashierEmailTf.setForeground(new java.awt.Color(51, 51, 51));
        cashierEmailTf.setBorder(null);
        cashierEmailTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashierEmailTfActionPerformed(evt);
            }
        });

        cashierPasswordTf.setEditable(false);
        cashierPasswordTf.setBackground(new java.awt.Color(255, 255, 255));
        cashierPasswordTf.setFont(new java.awt.Font("Century Gothic", 0, 26));
        cashierPasswordTf.setForeground(new java.awt.Color(51, 51, 51));
        cashierPasswordTf.setText("123");
        cashierPasswordTf.setBorder(null);
        cashierPasswordTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashierPasswordTfActionPerformed(evt);
            }
        });

        cashierSalaryTf.setBackground(new java.awt.Color(255, 255, 255));
        cashierSalaryTf.setFont(new java.awt.Font("Century Gothic", 0, 26));
        cashierSalaryTf.setForeground(new java.awt.Color(51, 51, 51));
        cashierSalaryTf.setBorder(null);
        cashierSalaryTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashierSalaryTfActionPerformed(evt);
            }
        });

        jSeparator3.setOpaque(true);

        jSeparator5.setOpaque(true);

        jSeparator6.setOpaque(true);

        jSeparator7.setOpaque(true);

        branchCodeLb.setFont(new java.awt.Font("Century Gothic", 0, 26));
        branchCodeLb.setForeground(new java.awt.Color(51, 51, 51));
        branchCodeLb.setText("Branch ID");

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setOpaque(true);

        cashierBranchCodeIdTf.setBackground(new java.awt.Color(255, 255, 255));
        cashierBranchCodeIdTf.setFont(new java.awt.Font("Century Gothic", 0, 24));
        cashierBranchCodeIdTf.setForeground(new java.awt.Color(51, 51, 51));
        cashierBranchCodeIdTf.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cashierBranchCodeIdTf.setBorder(null);

        submitCashierBtn.setBackground(new java.awt.Color(33, 163, 86));
        submitCashierBtn.setFont(new java.awt.Font("Century Gothic", 0, 24));
        submitCashierBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitCashierBtn.setText("Submit");
        submitCashierBtn.setPreferredSize(new java.awt.Dimension(140, 50));
        submitCashierBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitCashierBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddCashierPanelLayout = new javax.swing.GroupLayout(AddCashierPanel);
        AddCashierPanel.setLayout(AddCashierPanelLayout);
        AddCashierPanelLayout.setHorizontalGroup(
                AddCashierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AddCashierPanelLayout.createSequentialGroup()
                                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(AddCashierPanelLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(AddCashierPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(AddCashierPanelLayout.createSequentialGroup()
                                                .addComponent(branchCodeLb)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(AddCashierPanelLayout.createSequentialGroup()
                                                .addGroup(AddCashierPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                AddCashierPanelLayout.createSequentialGroup()
                                                                        .addGroup(AddCashierPanelLayout
                                                                                .createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(passwordLb)
                                                                                .addComponent(salaryLb))
                                                                        .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addGroup(AddCashierPanelLayout
                                                                                .createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(cashierPasswordTf,
                                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        500,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(
                                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                        AddCashierPanelLayout
                                                                                                .createParallelGroup(
                                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(
                                                                                                        jSeparator3,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        480,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(
                                                                                                        jSeparator5,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        480,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGroup(
                                                                                                        AddCashierPanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(
                                                                                                                        submitCashierBtn,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(
                                                                                                                        AddCashierPanelLayout
                                                                                                                                .createParallelGroup(
                                                                                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                        false)
                                                                                                                                .addComponent(
                                                                                                                                        jSeparator1,
                                                                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(
                                                                                                                                        cashierBranchCodeIdTf,
                                                                                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                        486,
                                                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addComponent(
                                                                                                        cashierSalaryTf,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        500,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                AddCashierPanelLayout.createSequentialGroup()
                                                                        .addComponent(nameLb)
                                                                        .addGroup(AddCashierPanelLayout
                                                                                .createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(AddCashierPanelLayout
                                                                                        .createSequentialGroup()
                                                                                        .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                        .addComponent(jSeparator7,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                480,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(20, 20, 20))
                                                                                .addGroup(AddCashierPanelLayout
                                                                                        .createSequentialGroup()
                                                                                        .addGap(111, 111, 111)
                                                                                        .addComponent(cashierNameTf,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                500,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(0, 0,
                                                                                                Short.MAX_VALUE)))))
                                                .addGap(111, 111, 111))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddCashierPanelLayout
                                                .createSequentialGroup()
                                                .addComponent(emailLb)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(AddCashierPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(AddCashierPanelLayout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(jSeparator6,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 480,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(cashierEmailTf,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 500,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(117, 117, 117)))));
        AddCashierPanelLayout.setVerticalGroup(
                AddCashierPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AddCashierPanelLayout.createSequentialGroup()
                                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(165, 165, 165)
                                .addGroup(AddCashierPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameLb)
                                        .addComponent(cashierNameTf, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 3,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(AddCashierPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(emailLb)
                                        .addComponent(cashierEmailTf, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 3,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addGroup(AddCashierPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cashierPasswordTf, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordLb))
                                .addGap(18, 18, 18)
                                .addGroup(AddCashierPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(AddCashierPanelLayout.createSequentialGroup()
                                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(53, 53, 53))
                                        .addGroup(AddCashierPanelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(salaryLb)
                                                .addComponent(cashierSalaryTf, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 3,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addGroup(AddCashierPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(branchCodeLb)
                                        .addComponent(cashierBranchCodeIdTf, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(submitCashierBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 286, Short.MAX_VALUE)));

        submitCashierBtn.getAccessibleContext().setAccessibleDescription("");

        RightPanel.add(AddCashierPanel, "card2");

        AddDataOperatorPanel.setBackground(new java.awt.Color(255, 255, 255));
        AddDataOperatorPanel.setPreferredSize(new java.awt.Dimension(980, 1024));
        AddDataOperatorPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel2.setBackground(new java.awt.Color(47, 64, 78));
        headerPanel2.setForeground(new java.awt.Color(255, 255, 255));
        headerPanel2.setPreferredSize(new java.awt.Dimension(980, 160));

        operatorDetailLb1.setFont(new java.awt.Font("Century Gothic", 1, 48));
        operatorDetailLb1.setForeground(new java.awt.Color(255, 255, 255));
        operatorDetailLb1.setText("Data Entry Operator Details");

        operatorDetailLb2.setFont(new java.awt.Font("Century Gothic", 0, 24));
        operatorDetailLb2.setForeground(new java.awt.Color(255, 255, 255));
        operatorDetailLb2.setText("Enter the details of all incoming D.E.Os");

        javax.swing.GroupLayout headerPanel2Layout = new javax.swing.GroupLayout(headerPanel2);
        headerPanel2.setLayout(headerPanel2Layout);
        headerPanel2Layout.setHorizontalGroup(
                headerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerPanel2Layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(operatorDetailLb2)
                                .addContainerGap(285, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(operatorDetailLb1)
                                .addGap(172, 172, 172)));
        headerPanel2Layout.setVerticalGroup(
                headerPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(operatorDetailLb1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(operatorDetailLb2)
                                .addContainerGap(35, Short.MAX_VALUE)));

        AddDataOperatorPanel.add(headerPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setOpaque(true);
        AddDataOperatorPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 660, 486, -1));

        operatorBranchCodeIdCb.setBackground(new java.awt.Color(255, 255, 255));
        operatorBranchCodeIdCb.setFont(new java.awt.Font("Century Gothic", 0, 24));
        operatorBranchCodeIdCb.setForeground(new java.awt.Color(51, 51, 51));
        operatorBranchCodeIdCb.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        operatorBranchCodeIdCb.setBorder(null);
        AddDataOperatorPanel.add(operatorBranchCodeIdCb,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, 486, -1));

        submitOperatorBtn.setBackground(new java.awt.Color(33, 163, 86));
        submitOperatorBtn.setFont(new java.awt.Font("Century Gothic", 0, 24));
        submitOperatorBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitOperatorBtn.setText("Submit");
        submitOperatorBtn.setPreferredSize(new java.awt.Dimension(140, 50));
        submitOperatorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitOperatorBtnActionPerformed(evt);
            }
        });
        AddDataOperatorPanel.add(submitOperatorBtn,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 690, -1, -1));

        operatorNameLb.setFont(new java.awt.Font("Century Gothic", 0, 26));
        operatorNameLb.setForeground(new java.awt.Color(51, 51, 51));
        operatorNameLb.setText("Operator Name");
        AddDataOperatorPanel.add(operatorNameLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        operatorEmailLb.setFont(new java.awt.Font("Century Gothic", 0, 26));
        operatorEmailLb.setForeground(new java.awt.Color(51, 51, 51));
        operatorEmailLb.setText("Email");
        AddDataOperatorPanel.add(operatorEmailLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        jSeparator4.setOpaque(true);
        AddDataOperatorPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, 480, -1));

        operatorSalaryLb.setFont(new java.awt.Font("Century Gothic", 0, 26));
        operatorSalaryLb.setForeground(new java.awt.Color(51, 51, 51));
        operatorSalaryLb.setText("Salary");
        AddDataOperatorPanel.add(operatorSalaryLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, -1, -1));

        operatorPasswordLb.setFont(new java.awt.Font("Century Gothic", 0, 26));
        operatorPasswordLb.setForeground(new java.awt.Color(51, 51, 51));
        operatorPasswordLb.setText("Password");
        AddDataOperatorPanel.add(operatorPasswordLb,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        jSeparator8.setOpaque(true);
        AddDataOperatorPanel.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 480, -1));

        operatorNameTf.setBackground(new java.awt.Color(255, 255, 255));
        operatorNameTf.setFont(new java.awt.Font("Century Gothic", 0, 26));
        operatorNameTf.setForeground(new java.awt.Color(51, 51, 51));
        operatorNameTf.setBorder(null);
        AddDataOperatorPanel.add(operatorNameTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 500, -1));

        jSeparator9.setOpaque(true);
        AddDataOperatorPanel.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 480, -1));

        operatorEmailTf.setBackground(new java.awt.Color(255, 255, 255));
        operatorEmailTf.setFont(new java.awt.Font("Century Gothic", 0, 26));
        operatorEmailTf.setForeground(new java.awt.Color(51, 51, 51));
        operatorEmailTf.setBorder(null);
        operatorEmailTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operatorEmailTfActionPerformed(evt);
            }
        });
        AddDataOperatorPanel.add(operatorEmailTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 500, -1));

        jSeparator10.setOpaque(true);
        AddDataOperatorPanel.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 480, -1));

        operatorPasswordTf.setEditable(false);
        operatorPasswordTf.setBackground(new java.awt.Color(255, 255, 255));
        operatorPasswordTf.setFont(new java.awt.Font("Century Gothic", 0, 26));
        operatorPasswordTf.setForeground(new java.awt.Color(51, 51, 51));
        operatorPasswordTf.setText("123");
        operatorPasswordTf.setBorder(null);
        operatorPasswordTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operatorPasswordTfActionPerformed(evt);
            }
        });
        AddDataOperatorPanel.add(operatorPasswordTf,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 500, -1));

        operatorBranchCodeLb.setFont(new java.awt.Font("Century Gothic", 0, 26));
        operatorBranchCodeLb.setForeground(new java.awt.Color(51, 51, 51));
        operatorBranchCodeLb.setText("Branch ID");
        AddDataOperatorPanel.add(operatorBranchCodeLb,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, -1, -1));

        operatorSalaryTf.setBackground(new java.awt.Color(255, 255, 255));
        operatorSalaryTf.setFont(new java.awt.Font("Century Gothic", 0, 26));
        operatorSalaryTf.setForeground(new java.awt.Color(51, 51, 51));
        operatorSalaryTf.setBorder(null);
        operatorSalaryTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operatorSalaryTfActionPerformed(evt);
            }
        });
        AddDataOperatorPanel.add(operatorSalaryTf,
                new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 500, -1));

        RightPanel.add(AddDataOperatorPanel, "card3");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
                MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RightPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        MainPanelLayout.setVerticalGroup(
                MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RightPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getAccessibleContext().setAccessibleName("Branch Manager - Metro");

        pack();
        setLocationRelativeTo(null);
    }

    private void myinit() {
        ChangePasswordPanel.setVisible(true);
        AddDataOperatorPanel.setVisible(false);
        AddCashierPanel.setVisible(false);
        userDetailsLb.setText("Greetings " + userName + " Branch ID : " + branchCode);
    }

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void changePasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {
        ChangePasswordPanel.setVisible(true);
        AddDataOperatorPanel.setVisible(false);
        AddCashierPanel.setVisible(false);
    }

    private void ChangeBtnMouseEntered(java.awt.event.MouseEvent evt) {
        ChangeBtn.setBackground(Color.red);
    }

    private void ChangeBtnMouseExited(java.awt.event.MouseEvent evt) {
        ChangeBtn.setBackground(new Color(1, 146, 213));
    }

    private void ChangeBtnActionPerformed(java.awt.event.ActionEvent evt) {
        controller.handleChangePassword(userName);
    }

    private void addOperatorBtnActionPerformed(java.awt.event.ActionEvent evt) {
        AddDataOperatorPanel.setVisible(true);
        AddCashierPanel.setVisible(false);
        ChangePasswordPanel.setVisible(false);
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

    // Getters for text fields
    public String getCashierName() {
        return cashierNameTf.getText();
    }

    public String getCashierEmail() {
        return cashierEmailTf.getText();
    }

    public String getCashierPassword() {
        return cashierPasswordTf.getText();
    }

    public String getCashierSalary() {
        return cashierSalaryTf.getText();
    }

    public String getOperatorName() {
        return operatorNameTf.getText();
    }

    public String getOperatorEmail() {
        return operatorEmailTf.getText();
    }

    public String getOperatorPassword() {
        return operatorPasswordTf.getText();
    }

    public String getOperatorSalary() {
        return operatorSalaryTf.getText();
    }

    // Setters for combo boxes
    public void setCashierBranchCodeOptions(String[] options) {
        cashierBranchCodeIdTf.setModel(new javax.swing.DefaultComboBoxModel<>(options));
    }

    public void setOperatorBranchCodeOptions(String[] options) {
        operatorBranchCodeIdCb.setModel(new javax.swing.DefaultComboBoxModel<>(options));
    }

    public void setSelectedCashierBranchCode(String branchCode) {
        cashierBranchCodeIdTf.setSelectedItem(branchCode);
    }

    public void setSelectedOperatorBranchCode(String branchCode) {
        operatorBranchCodeIdCb.setSelectedItem(branchCode);
    }

    public String getSelectedCashierBranchCode() {
        return (String) cashierBranchCodeIdTf.getSelectedItem();
    }

    public String getSelectedOperatorBranchCode() {
        return (String) operatorBranchCodeIdCb.getSelectedItem();
    }

    private void addCashierBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addCashierBtnActionPerformed
        AddCashierPanel.setVisible(true);
        AddDataOperatorPanel.setVisible(false);
        ChangePasswordPanel.setVisible(false);
    }// GEN-LAST:event_addCashierBtnActionPerformed

    private void submitOperatorBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_submitOperatorBtnActionPerformed
        controller.handleAddDataOperator();
    }// GEN-LAST:event_submitOperatorBtnActionPerformed

    private void submitCashierBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_submitCashierBtnActionPerformed
        controller.handleAddCashier();
    }// GEN-LAST:event_submitCashierBtnActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BranchManagerScreen.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BranchManagerScreen.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BranchManagerScreen.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BranchManagerScreen.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new BranchManagerScreen().setVisible(true);
            }
        });
    }

    private javax.swing.JPanel AddCashierPanel;
    private javax.swing.JPanel AddDataOperatorPanel;
    private javax.swing.JButton ChangeBtn;
    private javax.swing.JPanel ChangePasswordPanel;
    private javax.swing.JLabel ConfirmPassswordLb;
    private javax.swing.JPasswordField ConfirmPasswordFd;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPasswordField NewPasswordFd;
    private javax.swing.JLabel NewPasswordLb;
    private javax.swing.JPasswordField OldPasswordFd;
    private javax.swing.JLabel OldPasswordLb;
    private javax.swing.JPanel RightPanel;
    private javax.swing.JSeparator SeparatorOne;
    private javax.swing.JSeparator SeparatorThree;
    private javax.swing.JSeparator SeparatorTwo;
    private javax.swing.JButton addCashierBtn;
    private javax.swing.JButton addOperatorBtn;
    private javax.swing.JLabel branchCodeLb;
    private javax.swing.JComboBox<String> cashierBranchCodeIdTf;
    private javax.swing.JLabel cashierDetailsLb1;
    private javax.swing.JLabel cashierDetailsLb2;
    private javax.swing.JTextField cashierEmailTf;
    private javax.swing.JTextField cashierNameTf;
    private javax.swing.JTextField cashierPasswordTf;
    private javax.swing.JTextField cashierSalaryTf;
    private javax.swing.JButton changePasswordBtn;
    private javax.swing.JLabel emailLb;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel headerPanel2;
    private javax.swing.JPanel headerPanel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel nameLb;
    private javax.swing.JComboBox<String> operatorBranchCodeIdCb;
    private javax.swing.JLabel operatorBranchCodeLb;
    private javax.swing.JLabel operatorDetailLb1;
    private javax.swing.JLabel operatorDetailLb2;
    private javax.swing.JLabel operatorDetailLb3;
    private javax.swing.JLabel operatorDetailLb4;
    private javax.swing.JLabel operatorEmailLb;
    private javax.swing.JTextField operatorEmailTf;
    private javax.swing.JLabel operatorNameLb;
    private javax.swing.JTextField operatorNameTf;
    private javax.swing.JLabel operatorPasswordLb;
    private javax.swing.JTextField operatorPasswordTf;
    private javax.swing.JLabel operatorSalaryLb;
    private javax.swing.JTextField operatorSalaryTf;
    private javax.swing.JLabel passwordLb;
    private javax.swing.JLabel salaryLb;
    private javax.swing.JButton submitCashierBtn;
    private javax.swing.JButton submitOperatorBtn;
    private javax.swing.JLabel userDetailsLb;

}
