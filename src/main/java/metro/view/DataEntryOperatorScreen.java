package com.mycompany.metrosystem.view;

import java.awt.CardLayout;
import java.awt.Color;
import com.mycompany.metrosystem.controller.DataEntryOpController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class DataEntryOperatorScreen extends javax.swing.JFrame {
    DataEntryOpController dc;  
    String userName;
    public DataEntryOperatorScreen(String userName) 
    {
        this.userName=userName;
  
        initComponents();
        myinit();
        
         try {
            dc= new DataEntryOpController(this);
           
        } catch (SQLException ex) {
            Logger.getLogger(DataEntryOperatorScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataEntryOperatorScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void myinit()
    {
        SloganLb.setText("Lets Make this day Productive, " + userName+"!");
        SloganLb1.setText("Lets Make this day Productive, " + userName+"!");
        SloganLb2.setText("Lets Make the digital world Strong," + userName+"!");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VendorInfoDg = new javax.swing.JDialog();
        MainPanel = new javax.swing.JPanel();
        VendorEmailTf = new javax.swing.JTextField();
        VendorNameTf = new javax.swing.JTextField();
        VendorContactTf = new javax.swing.JTextField();
        VendorAddressTf = new javax.swing.JTextField();
        VendorContactLb = new javax.swing.JLabel();
        VendorNameLb = new javax.swing.JLabel();
        VendorAddressLb = new javax.swing.JLabel();
        VendorEmailLb = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        AddBtn = new javax.swing.JButton();
        SystemLabel = new javax.swing.JLabel();
        LeftPanel = new javax.swing.JPanel();
        OldVendorBtn = new javax.swing.JButton();
        NewVendorBtn = new javax.swing.JButton();
        ChangePasswordBtn = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        RightPanel = new javax.swing.JPanel();
        OldVendorPanel = new javax.swing.JPanel();
        SystemNameLb = new javax.swing.JLabel();
        SloganLb = new javax.swing.JLabel();
        OldVendorNavLb = new javax.swing.JLabel();
        AllVendors = new javax.swing.JScrollPane();
        VendorDetailsTb = new javax.swing.JTable();
        AddVendorBtn = new javax.swing.JButton();
        NewProductPanel = new javax.swing.JPanel();
        SystemNameLb1 = new javax.swing.JLabel();
        SloganLb1 = new javax.swing.JLabel();
        NewVendorNavLb = new javax.swing.JLabel();
        ProductIdTf = new javax.swing.JTextField();
        PricePerCatonTf = new javax.swing.JTextField();
        ProductCategoryTf = new javax.swing.JComboBox<>();
        ProductNameTf = new javax.swing.JTextField();
        OriginalPriceTf = new javax.swing.JTextField();
        SalePriceTf = new javax.swing.JTextField();
        PricePerUnitTf = new javax.swing.JTextField();
        VendorIdCb = new javax.swing.JComboBox<>();
        proIdLb = new javax.swing.JLabel();
        proNameLb = new javax.swing.JLabel();
        orginalPriceLb = new javax.swing.JLabel();
        salesPriceLb = new javax.swing.JLabel();
        pricePerUnitLb = new javax.swing.JLabel();
        pricePerCatonLb = new javax.swing.JLabel();
        proCategoryLb = new javax.swing.JLabel();
        proVendorIdLb = new javax.swing.JLabel();
        addProductBtn = new javax.swing.JButton();
        BackgroundImg = new javax.swing.JLabel();
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

        VendorInfoDg.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        VendorInfoDg.setTitle("Add Vendor Information");
        VendorInfoDg.setBackground(new java.awt.Color(255, 255, 255));
        VendorInfoDg.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        VendorInfoDg.setLocation(new java.awt.Point(0, 0));
        VendorInfoDg.setModal(true);
        VendorInfoDg.setPreferredSize(new java.awt.Dimension(750, 605));
        VendorInfoDg.setResizable(false);
        VendorInfoDg.setSize(new java.awt.Dimension(820, 605));

        MainPanel.setBackground(new java.awt.Color(241, 239, 231));
        MainPanel.setPreferredSize(new java.awt.Dimension(750, 605));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VendorEmailTf.setBackground(new java.awt.Color(241, 239, 231));
        VendorEmailTf.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        VendorEmailTf.setForeground(new java.awt.Color(51, 51, 51));
        VendorEmailTf.setBorder(null);
        VendorEmailTf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        VendorEmailTf.setPreferredSize(new java.awt.Dimension(400, 40));
        MainPanel.add(VendorEmailTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 343, -1, -1));

        VendorNameTf.setBackground(new java.awt.Color(241, 239, 231));
        VendorNameTf.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        VendorNameTf.setForeground(new java.awt.Color(51, 51, 51));
        VendorNameTf.setBorder(null);
        VendorNameTf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        VendorNameTf.setPreferredSize(new java.awt.Dimension(400, 40));
        VendorNameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendorNameTfActionPerformed(evt);
            }
        });
        MainPanel.add(VendorNameTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 164, -1, -1));

        VendorContactTf.setBackground(new java.awt.Color(241, 239, 231));
        VendorContactTf.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        VendorContactTf.setForeground(new java.awt.Color(51, 51, 51));
        VendorContactTf.setBorder(null);
        VendorContactTf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        VendorContactTf.setPreferredSize(new java.awt.Dimension(400, 40));
        VendorContactTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendorContactTfActionPerformed(evt);
            }
        });
        MainPanel.add(VendorContactTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 222, -1, -1));

        VendorAddressTf.setBackground(new java.awt.Color(241, 239, 231));
        VendorAddressTf.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        VendorAddressTf.setForeground(new java.awt.Color(51, 51, 51));
        VendorAddressTf.setBorder(null);
        VendorAddressTf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        VendorAddressTf.setPreferredSize(new java.awt.Dimension(400, 40));
        VendorAddressTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendorAddressTfActionPerformed(evt);
            }
        });
        MainPanel.add(VendorAddressTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 279, -1, -1));

        VendorContactLb.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        VendorContactLb.setForeground(new java.awt.Color(51, 51, 51));
        VendorContactLb.setText("Contact Number");
        MainPanel.add(VendorContactLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 231, -1, -1));

        VendorNameLb.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        VendorNameLb.setForeground(new java.awt.Color(51, 51, 51));
        VendorNameLb.setText("Vendor Name");
        MainPanel.add(VendorNameLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 173, -1, -1));

        VendorAddressLb.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        VendorAddressLb.setForeground(new java.awt.Color(51, 51, 51));
        VendorAddressLb.setText("Address");
        MainPanel.add(VendorAddressLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 283, -1, -1));

        VendorEmailLb.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        VendorEmailLb.setForeground(new java.awt.Color(51, 51, 51));
        VendorEmailLb.setText("Email");
        MainPanel.add(VendorEmailLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 347, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSeparator1.setPreferredSize(new java.awt.Dimension(400, 55));
        MainPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 207, 400, 12));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSeparator2.setPreferredSize(new java.awt.Dimension(400, 55));
        MainPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 410, 12));

        jSeparator4.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSeparator4.setPreferredSize(new java.awt.Dimension(400, 55));
        MainPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 410, 12));

        jSeparator6.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSeparator6.setPreferredSize(new java.awt.Dimension(400, 55));
        MainPanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 410, 12));

        AddBtn.setBackground(new java.awt.Color(51, 204, 255));
        AddBtn.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(0, 0, 0));
        AddBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\Assets\\user.png")); // NOI18N
        AddBtn.setText("Add");
        AddBtn.setPreferredSize(new java.awt.Dimension(139, 50));
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        MainPanel.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, -1, -1));

        SystemLabel.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        SystemLabel.setForeground(new java.awt.Color(0, 0, 0));
        SystemLabel.setText("Metro Point Of Sale System");
        MainPanel.add(SystemLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        javax.swing.GroupLayout VendorInfoDgLayout = new javax.swing.GroupLayout(VendorInfoDg.getContentPane());
        VendorInfoDg.getContentPane().setLayout(VendorInfoDgLayout);
        VendorInfoDgLayout.setHorizontalGroup(
            VendorInfoDgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VendorInfoDgLayout.setVerticalGroup(
            VendorInfoDgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        VendorInfoDg.getAccessibleContext().setAccessibleParent(RightPanel);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("METRO - Data Entry Operator Menu");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LeftPanel.setBackground(new java.awt.Color(1, 146, 213));
        LeftPanel.setPreferredSize(new java.awt.Dimension(300, 1024));

        OldVendorBtn.setBackground(new java.awt.Color(1, 146, 213));
        OldVendorBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        OldVendorBtn.setForeground(new java.awt.Color(255, 255, 255));
        OldVendorBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\Assets\\oldVendor.png")); // NOI18N
        OldVendorBtn.setText("View Old Vendors");
        OldVendorBtn.setBorder(null);
        OldVendorBtn.setBorderPainted(false);
        OldVendorBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OldVendorBtn.setFocusPainted(false);
        OldVendorBtn.setPreferredSize(new java.awt.Dimension(300, 90));
        OldVendorBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OldVendorBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OldVendorBtnMouseExited(evt);
            }
        });
        OldVendorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OldVendorBtnActionPerformed(evt);
            }
        });

        NewVendorBtn.setBackground(new java.awt.Color(1, 146, 213));
        NewVendorBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        NewVendorBtn.setForeground(new java.awt.Color(255, 255, 255));
        NewVendorBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\Assets\\newVendor.png")); // NOI18N
        NewVendorBtn.setText("Add New Product");
        NewVendorBtn.setBorderPainted(false);
        NewVendorBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewVendorBtn.setFocusPainted(false);
        NewVendorBtn.setPreferredSize(new java.awt.Dimension(300, 90));
        NewVendorBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NewVendorBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NewVendorBtnMouseExited(evt);
            }
        });
        NewVendorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewVendorBtnActionPerformed(evt);
            }
        });

        ChangePasswordBtn.setBackground(new java.awt.Color(1, 146, 213));
        ChangePasswordBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        ChangePasswordBtn.setForeground(new java.awt.Color(255, 255, 255));
        ChangePasswordBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\Assets\\password.png")); // NOI18N
        ChangePasswordBtn.setText("  Change Password");
        ChangePasswordBtn.setBorderPainted(false);
        ChangePasswordBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ChangePasswordBtn.setFocusPainted(false);
        ChangePasswordBtn.setPreferredSize(new java.awt.Dimension(300, 90));
        ChangePasswordBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ChangePasswordBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ChangePasswordBtnMouseExited(evt);
            }
        });
        ChangePasswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePasswordBtnActionPerformed(evt);
            }
        });

        LogOutBtn.setBackground(new java.awt.Color(1, 146, 213));
        LogOutBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        LogOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogOutBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\Assets\\logOut.png")); // NOI18N
        LogOutBtn.setText("  Log Out");
        LogOutBtn.setToolTipText("");
        LogOutBtn.setPreferredSize(new java.awt.Dimension(120, 45));
        LogOutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogOutBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogOutBtnMouseExited(evt);
            }
        });
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OldVendorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewVendorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ChangePasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(LogOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(OldVendorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NewVendorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(ChangePasswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 437, Short.MAX_VALUE)
                .addComponent(LogOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        getContentPane().add(LeftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        RightPanel.setBackground(new java.awt.Color(255, 255, 255));
        RightPanel.setPreferredSize(new java.awt.Dimension(980, 1024));
        RightPanel.setLayout(new java.awt.CardLayout());

        OldVendorPanel.setBackground(new java.awt.Color(255, 255, 255));

        SystemNameLb.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        SystemNameLb.setForeground(new java.awt.Color(51, 51, 51));
        SystemNameLb.setText("Metro Point of Sale System");

        SloganLb.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        SloganLb.setForeground(new java.awt.Color(51, 51, 51));

        OldVendorNavLb.setFont(new java.awt.Font("Century Schoolbook", 2, 20)); // NOI18N
        OldVendorNavLb.setForeground(new java.awt.Color(153, 153, 255));
        OldVendorNavLb.setText("Old Vendors Window");

        VendorDetailsTb.setBackground(new java.awt.Color(204, 204, 255));
        VendorDetailsTb.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        VendorDetailsTb.setForeground(new java.awt.Color(51, 51, 51));
        VendorDetailsTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Vendor ID", "Name", "Address", "Contact Number", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        VendorDetailsTb.setCellSelectionEnabled(true);
        VendorDetailsTb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VendorDetailsTb.setRowHeight(35);
        AllVendors.setViewportView(VendorDetailsTb);
        VendorDetailsTb.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (VendorDetailsTb.getColumnModel().getColumnCount() > 0) {
            VendorDetailsTb.getColumnModel().getColumn(0).setResizable(false);
            VendorDetailsTb.getColumnModel().getColumn(0).setPreferredWidth(50);
            VendorDetailsTb.getColumnModel().getColumn(1).setResizable(false);
            VendorDetailsTb.getColumnModel().getColumn(1).setPreferredWidth(70);
            VendorDetailsTb.getColumnModel().getColumn(2).setResizable(false);
            VendorDetailsTb.getColumnModel().getColumn(3).setResizable(false);
            VendorDetailsTb.getColumnModel().getColumn(3).setPreferredWidth(100);
            VendorDetailsTb.getColumnModel().getColumn(4).setResizable(false);
            VendorDetailsTb.getColumnModel().getColumn(4).setPreferredWidth(80);
        }

        AddVendorBtn.setBackground(new java.awt.Color(102, 102, 255));
        AddVendorBtn.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        AddVendorBtn.setText("Add Vendor");
        AddVendorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddVendorBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OldVendorPanelLayout = new javax.swing.GroupLayout(OldVendorPanel);
        OldVendorPanel.setLayout(OldVendorPanelLayout);
        OldVendorPanelLayout.setHorizontalGroup(
            OldVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OldVendorPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(OldVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OldVendorPanelLayout.createSequentialGroup()
                        .addComponent(SystemNameLb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                        .addComponent(OldVendorNavLb))
                    .addGroup(OldVendorPanelLayout.createSequentialGroup()
                        .addGroup(OldVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SloganLb)
                            .addGroup(OldVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(AllVendors, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AddVendorBtn)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        OldVendorPanelLayout.setVerticalGroup(
            OldVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OldVendorPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(OldVendorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SystemNameLb)
                    .addGroup(OldVendorPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(OldVendorNavLb)))
                .addGap(30, 30, 30)
                .addComponent(SloganLb)
                .addGap(35, 35, 35)
                .addComponent(AllVendors, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(AddVendorBtn)
                .addGap(69, 69, 69))
        );

        RightPanel.add(OldVendorPanel, "card2");

        NewProductPanel.setBackground(new java.awt.Color(255, 255, 255));
        NewProductPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SystemNameLb1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        SystemNameLb1.setForeground(new java.awt.Color(51, 51, 51));
        SystemNameLb1.setText("Metro Point of Sale System");
        NewProductPanel.add(SystemNameLb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 26, -1, -1));

        SloganLb1.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        SloganLb1.setForeground(new java.awt.Color(51, 51, 51));
        NewProductPanel.add(SloganLb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 99, -1, -1));

        NewVendorNavLb.setFont(new java.awt.Font("Century Schoolbook", 2, 20)); // NOI18N
        NewVendorNavLb.setForeground(new java.awt.Color(153, 153, 255));
        NewVendorNavLb.setText("Add Product Window");
        NewProductPanel.add(NewVendorNavLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 34, -1, -1));

        ProductIdTf.setBackground(new java.awt.Color(204, 204, 204));
        ProductIdTf.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        ProductIdTf.setForeground(new java.awt.Color(51, 51, 51));
        ProductIdTf.setPreferredSize(new java.awt.Dimension(300, 45));
        ProductIdTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductIdTfActionPerformed(evt);
            }
        });
        NewProductPanel.add(ProductIdTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        PricePerCatonTf.setBackground(new java.awt.Color(204, 204, 204));
        PricePerCatonTf.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        PricePerCatonTf.setForeground(new java.awt.Color(51, 51, 51));
        PricePerCatonTf.setPreferredSize(new java.awt.Dimension(300, 45));
        NewProductPanel.add(PricePerCatonTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 710, -1, -1));

        ProductCategoryTf.setBackground(new java.awt.Color(204, 204, 204));
        ProductCategoryTf.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        ProductCategoryTf.setForeground(new java.awt.Color(51, 51, 51));
        ProductCategoryTf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Health and Care", "Item 2", "Item 3", "Item 4" }));
        ProductCategoryTf.setPreferredSize(new java.awt.Dimension(300, 45));
        NewProductPanel.add(ProductCategoryTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 800, -1, -1));

        ProductNameTf.setBackground(new java.awt.Color(204, 204, 204));
        ProductNameTf.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        ProductNameTf.setForeground(new java.awt.Color(51, 51, 51));
        ProductNameTf.setPreferredSize(new java.awt.Dimension(300, 45));
        ProductNameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductNameTfActionPerformed(evt);
            }
        });
        NewProductPanel.add(ProductNameTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        OriginalPriceTf.setBackground(new java.awt.Color(204, 204, 204));
        OriginalPriceTf.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        OriginalPriceTf.setForeground(new java.awt.Color(51, 51, 51));
        OriginalPriceTf.setPreferredSize(new java.awt.Dimension(300, 45));
        NewProductPanel.add(OriginalPriceTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, -1, -1));

        SalePriceTf.setBackground(new java.awt.Color(204, 204, 204));
        SalePriceTf.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        SalePriceTf.setForeground(new java.awt.Color(51, 51, 51));
        SalePriceTf.setPreferredSize(new java.awt.Dimension(300, 45));
        SalePriceTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalePriceTfActionPerformed(evt);
            }
        });
        NewProductPanel.add(SalePriceTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, -1, -1));

        PricePerUnitTf.setBackground(new java.awt.Color(204, 204, 204));
        PricePerUnitTf.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        PricePerUnitTf.setForeground(new java.awt.Color(51, 51, 51));
        PricePerUnitTf.setPreferredSize(new java.awt.Dimension(300, 45));
        NewProductPanel.add(PricePerUnitTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 620, -1, -1));

        VendorIdCb.setBackground(new java.awt.Color(204, 204, 204));
        VendorIdCb.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        VendorIdCb.setForeground(new java.awt.Color(51, 51, 51));
        VendorIdCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "Item 2", "Item 3", "Item 4" }));
        VendorIdCb.setPreferredSize(new java.awt.Dimension(300, 45));
        NewProductPanel.add(VendorIdCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 870, -1, -1));

        proIdLb.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        proIdLb.setForeground(new java.awt.Color(51, 51, 51));
        proIdLb.setText("Product Id");
        NewProductPanel.add(proIdLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        proNameLb.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        proNameLb.setForeground(new java.awt.Color(51, 51, 51));
        proNameLb.setText("Product Name");
        NewProductPanel.add(proNameLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        orginalPriceLb.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        orginalPriceLb.setForeground(new java.awt.Color(51, 51, 51));
        orginalPriceLb.setText("Original Price");
        NewProductPanel.add(orginalPriceLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        salesPriceLb.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        salesPriceLb.setForeground(new java.awt.Color(51, 51, 51));
        salesPriceLb.setText("Sales Price");
        NewProductPanel.add(salesPriceLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, -1, -1));

        pricePerUnitLb.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        pricePerUnitLb.setForeground(new java.awt.Color(51, 51, 51));
        pricePerUnitLb.setText("Price Per Unit");
        NewProductPanel.add(pricePerUnitLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, -1, -1));

        pricePerCatonLb.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        pricePerCatonLb.setForeground(new java.awt.Color(51, 51, 51));
        pricePerCatonLb.setText("Price Per Caton");
        NewProductPanel.add(pricePerCatonLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 720, -1, -1));

        proCategoryLb.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        proCategoryLb.setForeground(new java.awt.Color(51, 51, 51));
        proCategoryLb.setText("Product Category");
        NewProductPanel.add(proCategoryLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 810, -1, -1));

        proVendorIdLb.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        proVendorIdLb.setForeground(new java.awt.Color(51, 51, 51));
        proVendorIdLb.setText("Vendor Id");
        NewProductPanel.add(proVendorIdLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 880, -1, -1));

        addProductBtn.setBackground(new java.awt.Color(204, 204, 255));
        addProductBtn.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        addProductBtn.setForeground(new java.awt.Color(51, 51, 51));
        addProductBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\Assets\\product.png")); // NOI18N
        addProductBtn.setText("Add Product");
        addProductBtn.setActionCommand("Add ");
        addProductBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addProductBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProductBtn.setMaximumSize(new java.awt.Dimension(200, 74));
        addProductBtn.setPreferredSize(new java.awt.Dimension(200, 40));
        addProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductBtnActionPerformed(evt);
            }
        });
        NewProductPanel.add(addProductBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 930, 240, 60));

        BackgroundImg.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\Assets\\AbstractIamge.png")); // NOI18N
        BackgroundImg.setText("jLabel1");
        NewProductPanel.add(BackgroundImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, -1));

        RightPanel.add(NewProductPanel, "card3");

        ChangePasswordPanel.setBackground(new java.awt.Color(255, 255, 255));

        SystemNameLb2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        SystemNameLb2.setForeground(new java.awt.Color(51, 51, 51));
        SystemNameLb2.setText("Metro Point of Sale System");

        SloganLb2.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        SloganLb2.setForeground(new java.awt.Color(51, 51, 51));

        ChangePasswordLbNav.setFont(new java.awt.Font("Century Schoolbook", 2, 20)); // NOI18N
        ChangePasswordLbNav.setForeground(new java.awt.Color(153, 153, 255));
        ChangePasswordLbNav.setText("Change Password Window");

        OldPasswordFd.setBackground(new java.awt.Color(255, 255, 255));
        OldPasswordFd.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
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
        NewPasswordFd.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        NewPasswordFd.setForeground(new java.awt.Color(1, 146, 213));
        NewPasswordFd.setText("jPasswordField1");
        NewPasswordFd.setBorder(null);
        NewPasswordFd.setPreferredSize(new java.awt.Dimension(160, 55));

        ConfirmPasswordFd.setBackground(new java.awt.Color(255, 255, 255));
        ConfirmPasswordFd.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        ConfirmPasswordFd.setForeground(new java.awt.Color(1, 146, 213));
        ConfirmPasswordFd.setText("jPasswordField1");
        ConfirmPasswordFd.setBorder(null);
        ConfirmPasswordFd.setPreferredSize(new java.awt.Dimension(160, 55));
        ConfirmPasswordFd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPasswordFdActionPerformed(evt);
            }
        });

        OldPasswordLb.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        OldPasswordLb.setForeground(new java.awt.Color(51, 51, 51));
        OldPasswordLb.setText("Old Password");

        NewPasswordLb.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        NewPasswordLb.setForeground(new java.awt.Color(51, 51, 51));
        NewPasswordLb.setText("New Password");

        ConfirmPassswordLb.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        ConfirmPassswordLb.setForeground(new java.awt.Color(51, 51, 51));
        ConfirmPassswordLb.setText("Confirm Password");

        SeparatorOne.setForeground(new java.awt.Color(51, 51, 255));

        SeparatorTwo.setForeground(new java.awt.Color(51, 51, 255));

        SeparatorThree.setForeground(new java.awt.Color(51, 51, 255));

        ChangeBtn.setBackground(new java.awt.Color(1, 146, 213));
        ChangeBtn.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
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
                .addGroup(ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                        .addComponent(SystemNameLb2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                        .addComponent(ChangePasswordLbNav)
                        .addGap(16, 16, 16))
                    .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                        .addComponent(SloganLb2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ChangeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                                .addComponent(OldPasswordLb)
                                .addGap(71, 71, 71)
                                .addComponent(OldPasswordFd, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                                .addComponent(NewPasswordLb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(SeparatorTwo))
                                    .addComponent(NewPasswordFd, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                                .addComponent(ConfirmPassswordLb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(SeparatorThree))
                                    .addComponent(ConfirmPasswordFd, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                            .addGap(230, 230, 230)
                            .addComponent(SeparatorOne, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ChangePasswordPanelLayout.setVerticalGroup(
            ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SystemNameLb2)
                    .addGroup(ChangePasswordPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(ChangePasswordLbNav)))
                .addGap(28, 28, 28)
                .addComponent(SloganLb2)
                .addGap(159, 159, 159)
                .addGroup(ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OldPasswordFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OldPasswordLb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparatorOne, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewPasswordFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewPasswordLb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparatorTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(ChangePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmPasswordFd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmPassswordLb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SeparatorThree, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(ChangeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(392, Short.MAX_VALUE))
        );

        RightPanel.add(ChangePasswordPanel, "card4");

        getContentPane().add(RightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     // Method to show OldVendorPanel
    private void showOldVendorPanel() {
        OldVendorPanel.setVisible(true);
        NewProductPanel.setVisible(false);
        ChangePasswordPanel.setVisible(false);
    }

    // Method to show NewVendorPanel
    private void showNewVendorPanel() {
        OldVendorPanel.setVisible(false);
        NewProductPanel.setVisible(true);
        ChangePasswordPanel.setVisible(false);
    }
    public String getUserName(){
        return userName;
    }

    // Method to show ChangePasswordPanel
    private void showChangePasswordPanel() {
        OldVendorPanel.setVisible(false);
        NewProductPanel.setVisible(false);
        ChangePasswordPanel.setVisible(true);
    }
    
    private void OldVendorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OldVendorBtnActionPerformed
      showOldVendorPanel();
    }//GEN-LAST:event_OldVendorBtnActionPerformed

    private void NewVendorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewVendorBtnActionPerformed
         showNewVendorPanel();
    }//GEN-LAST:event_NewVendorBtnActionPerformed

    private void ChangePasswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePasswordBtnActionPerformed
        showChangePasswordPanel();
    }//GEN-LAST:event_ChangePasswordBtnActionPerformed

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
        dispose();
    }//GEN-LAST:event_LogOutBtnActionPerformed

    private void OldVendorBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OldVendorBtnMouseEntered
         OldVendorBtn.setBackground(new Color(34, 103, 176));
    }//GEN-LAST:event_OldVendorBtnMouseEntered

    private void OldVendorBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OldVendorBtnMouseExited
         OldVendorBtn.setBackground(new Color(1, 146, 213));
    }//GEN-LAST:event_OldVendorBtnMouseExited

    private void NewVendorBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewVendorBtnMouseEntered
        NewVendorBtn.setBackground(new Color(34, 103, 176));
    }//GEN-LAST:event_NewVendorBtnMouseEntered

    private void NewVendorBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewVendorBtnMouseExited
        NewVendorBtn.setBackground(new Color(1, 146, 213));
    }//GEN-LAST:event_NewVendorBtnMouseExited

    private void ChangePasswordBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePasswordBtnMouseEntered
        ChangePasswordBtn.setBackground(new Color(34, 103, 176));
    }//GEN-LAST:event_ChangePasswordBtnMouseEntered

    private void ChangePasswordBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePasswordBtnMouseExited
     ChangePasswordBtn.setBackground(new Color(1, 146, 213));
    }//GEN-LAST:event_ChangePasswordBtnMouseExited

    private void LogOutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutBtnMouseEntered
        LogOutBtn.setBackground(new Color(255, 192, 192));
        LogOutBtn.setForeground(Color.BLACK);
    }//GEN-LAST:event_LogOutBtnMouseEntered

    private void LogOutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutBtnMouseExited
        LogOutBtn.setBackground(new Color(1, 146, 213));
    }//GEN-LAST:event_LogOutBtnMouseExited

    private void ConfirmPasswordFdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPasswordFdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmPasswordFdActionPerformed

    private void OldPasswordFdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OldPasswordFdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OldPasswordFdActionPerformed

    private void ChangeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeBtnMouseEntered
        ChangeBtn.setBackground(Color.red);
    }//GEN-LAST:event_ChangeBtnMouseEntered

    private void ChangeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeBtnMouseExited
        ChangeBtn.setBackground(new Color(1,146,213));
    }//GEN-LAST:event_ChangeBtnMouseExited

    private void ChangeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeBtnActionPerformed

            dc.changePassword();
    }//GEN-LAST:event_ChangeBtnActionPerformed

    private void AddVendorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddVendorBtnActionPerformed
       VendorInfoDg.setVisible(true);
    }//GEN-LAST:event_AddVendorBtnActionPerformed

    private void VendorNameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendorNameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VendorNameTfActionPerformed

    private void VendorContactTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendorContactTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VendorContactTfActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed

         if(dc.addVendor())
         {
             VendorNameTf.setText("");
             VendorAddressTf.setText("");
             VendorContactTf.setText("");
             VendorEmailTf.setText("");
         }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void ProductIdTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductIdTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductIdTfActionPerformed

    private void SalePriceTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalePriceTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalePriceTfActionPerformed

    private void addProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductBtnActionPerformed
         
            if(dc.addProduct())
            {
                ProductIdTf.setText("");
                ProductNameTf.setText("");
                PricePerCatonTf.setText("");
                PricePerUnitTf.setText("");
                OriginalPriceTf.setText("");
                SalePriceTf.setText("");   
            }
        
    }//GEN-LAST:event_addProductBtnActionPerformed

    public void showVendors(List<String[]> vendors)
     {
            DefaultTableModel tableModel = (DefaultTableModel) VendorDetailsTb.getModel();
            tableModel.setRowCount(0); // Clear the table before adding new rows

            for (String[] vendor : vendors) {
                tableModel.addRow(vendor); // Add each vendor's details as a row
            }
    }
        
    

    
    
    private void VendorAddressTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendorAddressTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VendorAddressTfActionPerformed

    private void ProductNameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductNameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductNameTfActionPerformed

    
    
        // Getters for JTextField components
        public String getVendorName() {
            return VendorNameTf.getText();
        }

        public String getVendorContact() {
            return VendorContactTf.getText();
        }

        public String getVendorAddress() {
            return VendorAddressTf.getText();
        }

        public String getVendorEmail() {
            return VendorEmailTf.getText();
        }

        // Getters for JComboBox components
        public String getSelectedVendorId() {
            return (String) VendorIdCb.getSelectedItem();
        }
        
        // Populate VendorIdCb with vendor IDs
        public void populateVendorComboBox(List<String> vendorIds) {
    VendorIdCb.removeAllItems(); // Clear existing items
    for (String id : vendorIds) {
        VendorIdCb.addItem(id); // Add each vendor ID
    }
}

        
            

        public String getSelectedProductCategory() {
            return (String) ProductCategoryTf.getSelectedItem();
        }

        // Getters for JPasswordField components
        public String getOldPassword() {
            return new String(OldPasswordFd.getPassword());
        }

        public String getNewPassword() {
            return new String(NewPasswordFd.getPassword());
        }

        public String getConfirmPassword() {
            return new String(ConfirmPasswordFd.getPassword());
        }

        public String getProductId() {
            return ProductIdTf.getText();
        }

        public String getProductName() {
            return ProductNameTf.getText();
        }

        public String getOriginalPrice() {
            return OriginalPriceTf.getText();
        }

        public String getSalePrice() {
            return SalePriceTf.getText();
        }

        public String getPricePerUnit() {
            return PricePerUnitTf.getText();
        }
        
        public String getPricePerCaton() {
            return PricePerCatonTf.getText();
        }


    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(DataEntryOperatorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataEntryOperatorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataEntryOperatorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataEntryOperatorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new DataEntryOperatorScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton AddVendorBtn;
    private javax.swing.JScrollPane AllVendors;
    private javax.swing.JLabel BackgroundImg;
    private javax.swing.JButton ChangeBtn;
    private javax.swing.JButton ChangePasswordBtn;
    private javax.swing.JLabel ChangePasswordLbNav;
    private javax.swing.JPanel ChangePasswordPanel;
    private javax.swing.JLabel ConfirmPassswordLb;
    private javax.swing.JPasswordField ConfirmPasswordFd;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPasswordField NewPasswordFd;
    private javax.swing.JLabel NewPasswordLb;
    private javax.swing.JPanel NewProductPanel;
    private javax.swing.JButton NewVendorBtn;
    private javax.swing.JLabel NewVendorNavLb;
    private javax.swing.JPasswordField OldPasswordFd;
    private javax.swing.JLabel OldPasswordLb;
    private javax.swing.JButton OldVendorBtn;
    private javax.swing.JLabel OldVendorNavLb;
    private javax.swing.JPanel OldVendorPanel;
    private javax.swing.JTextField OriginalPriceTf;
    private javax.swing.JTextField PricePerCatonTf;
    private javax.swing.JTextField PricePerUnitTf;
    private javax.swing.JComboBox<String> ProductCategoryTf;
    private javax.swing.JTextField ProductIdTf;
    private javax.swing.JTextField ProductNameTf;
    private javax.swing.JPanel RightPanel;
    private javax.swing.JTextField SalePriceTf;
    private javax.swing.JSeparator SeparatorOne;
    private javax.swing.JSeparator SeparatorThree;
    private javax.swing.JSeparator SeparatorTwo;
    private javax.swing.JLabel SloganLb;
    private javax.swing.JLabel SloganLb1;
    private javax.swing.JLabel SloganLb2;
    private javax.swing.JLabel SystemLabel;
    private javax.swing.JLabel SystemNameLb;
    private javax.swing.JLabel SystemNameLb1;
    private javax.swing.JLabel SystemNameLb2;
    private javax.swing.JLabel VendorAddressLb;
    private javax.swing.JTextField VendorAddressTf;
    private javax.swing.JLabel VendorContactLb;
    private javax.swing.JTextField VendorContactTf;
    private javax.swing.JTable VendorDetailsTb;
    private javax.swing.JLabel VendorEmailLb;
    private javax.swing.JTextField VendorEmailTf;
    private javax.swing.JComboBox<String> VendorIdCb;
    private javax.swing.JDialog VendorInfoDg;
    private javax.swing.JLabel VendorNameLb;
    private javax.swing.JTextField VendorNameTf;
    private javax.swing.JButton addProductBtn;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel orginalPriceLb;
    private javax.swing.JLabel pricePerCatonLb;
    private javax.swing.JLabel pricePerUnitLb;
    private javax.swing.JLabel proCategoryLb;
    private javax.swing.JLabel proIdLb;
    private javax.swing.JLabel proNameLb;
    private javax.swing.JLabel proVendorIdLb;
    private javax.swing.JLabel salesPriceLb;
    // End of variables declaration//GEN-END:variables
}
