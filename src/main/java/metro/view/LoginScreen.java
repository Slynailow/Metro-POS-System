/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.metro;

import java.awt.Image;
import javax.swing.ImageIcon;

public class LoginScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoginScreen
     */
    public LoginScreen() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        LeftPanel = new javax.swing.JPanel();
        UserNameFd = new javax.swing.JTextField();
        PasswordFd = new javax.swing.JPasswordField();
        LoginBtn = new javax.swing.JButton();
        Sp1 = new javax.swing.JSeparator();
        Sp2 = new javax.swing.JSeparator();
        ComanyLb = new javax.swing.JLabel();
        UserNameLb = new javax.swing.JLabel();
        PasswordLb = new javax.swing.JLabel();
        WelcomeMessageLb = new javax.swing.JLabel();
        SloganLb = new javax.swing.JLabel();
        SystemNameLb = new javax.swing.JLabel();
        logoLb = new javax.swing.JLabel();
        UserTypeCb = new javax.swing.JComboBox<>();
        Sp3 = new javax.swing.JSeparator();
        UserTypeLb = new javax.swing.JLabel();
        MainVectorLb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Metro POS");
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setResizable(false);

        Background.setBackground(new java.awt.Color(245, 247, 242));
        Background.setPreferredSize(new java.awt.Dimension(1000, 700));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LeftPanel.setBackground(new java.awt.Color(1, 146, 213));
        LeftPanel.setPreferredSize(new java.awt.Dimension(550, 700));
        LeftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserNameFd.setBackground(new java.awt.Color(1, 146, 213));
        UserNameFd.setFont(new java.awt.Font("Century Gothic", 0, 22)); // NOI18N
        UserNameFd.setForeground(new java.awt.Color(255, 255, 255));
        UserNameFd.setText("Username");
        UserNameFd.setBorder(null);
        UserNameFd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameFdActionPerformed(evt);
            }
        });
        LeftPanel.add(UserNameFd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 410, 50));

        PasswordFd.setBackground(new java.awt.Color(1, 146, 213));
        PasswordFd.setFont(new java.awt.Font("Century Gothic", 0, 22)); // NOI18N
        PasswordFd.setForeground(new java.awt.Color(255, 255, 255));
        PasswordFd.setText("Password");
        PasswordFd.setBorder(null);
        PasswordFd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFdActionPerformed(evt);
            }
        });
        LeftPanel.add(PasswordFd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 410, 32));

        LoginBtn.setBackground(new java.awt.Color(255, 255, 255));
        LoginBtn.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(1, 146, 221));
        LoginBtn.setText("Login");
        LoginBtn.setToolTipText("Click to validate credentials");
        LoginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginBtn.setPreferredSize(new java.awt.Dimension(120, 40));
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        LeftPanel.add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, -1, -1));

        Sp1.setBackground(new java.awt.Color(255, 255, 255));
        Sp1.setForeground(new java.awt.Color(102, 255, 51));
        LeftPanel.add(Sp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 410, 10));

        Sp2.setForeground(new java.awt.Color(102, 255, 51));
        LeftPanel.add(Sp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 410, 20));

        ComanyLb.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        ComanyLb.setForeground(new java.awt.Color(255, 255, 255));
        ComanyLb.setText("© 2024 Slynailow. All rights reserved.");
        LeftPanel.add(ComanyLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 630, -1, -1));

        UserNameLb.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\user.png")); // NOI18N
        UserNameLb.setText("jLabel2");
        UserNameLb.setPreferredSize(new java.awt.Dimension(32, 32));
        LeftPanel.add(UserNameLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        PasswordLb.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\password.png")); // NOI18N
        PasswordLb.setText("jLabel1");
        PasswordLb.setPreferredSize(new java.awt.Dimension(32, 32));
        LeftPanel.add(PasswordLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        WelcomeMessageLb.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        WelcomeMessageLb.setForeground(new java.awt.Color(255, 255, 255));
        WelcomeMessageLb.setText("Welcome Back, Ready to Make Sales?");
        LeftPanel.add(WelcomeMessageLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        SloganLb.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        SloganLb.setForeground(new java.awt.Color(255, 255, 255));
        SloganLb.setText("Empowering Your Business, Every Day");
        LeftPanel.add(SloganLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        SystemNameLb.setFont(new java.awt.Font("Century Gothic", 1, 34)); // NOI18N
        SystemNameLb.setForeground(new java.awt.Color(255, 255, 255));
        SystemNameLb.setText("METRO Point Of Sale System");
        LeftPanel.add(SystemNameLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        logoLb.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\logo.png")); // NOI18N
        logoLb.setText("jLabel1");
        logoLb.setPreferredSize(new java.awt.Dimension(64, 64));
        LeftPanel.add(logoLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        UserTypeCb.setBackground(new java.awt.Color(1, 146, 213));
        UserTypeCb.setFont(new java.awt.Font("Century Gothic", 0, 22)); // NOI18N
        UserTypeCb.setForeground(new java.awt.Color(255, 255, 255));
        UserTypeCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Data Entry Operator", "Cashier" }));
        UserTypeCb.setBorder(null);
        UserTypeCb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UserTypeCb.setFocusable(false);
        LeftPanel.add(UserTypeCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 410, 50));

        Sp3.setForeground(new java.awt.Color(102, 255, 51));
        LeftPanel.add(Sp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 410, 20));

        UserTypeLb.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\userType.png")); // NOI18N
        UserTypeLb.setText("jLabel1");
        UserTypeLb.setPreferredSize(new java.awt.Dimension(32, 32));
        LeftPanel.add(UserTypeLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        Background.add(LeftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 700));

        MainVectorLb.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\loginPageMainVector.png")); // NOI18N
        Background.add(MainVectorLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UserNameFdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameFdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameFdActionPerformed

    private void PasswordFdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFdActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel ComanyLb;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JLabel MainVectorLb;
    private javax.swing.JPasswordField PasswordFd;
    private javax.swing.JLabel PasswordLb;
    private javax.swing.JLabel SloganLb;
    private javax.swing.JSeparator Sp1;
    private javax.swing.JSeparator Sp2;
    private javax.swing.JSeparator Sp3;
    private javax.swing.JLabel SystemNameLb;
    private javax.swing.JTextField UserNameFd;
    private javax.swing.JLabel UserNameLb;
    private javax.swing.JComboBox<String> UserTypeCb;
    private javax.swing.JLabel UserTypeLb;
    private javax.swing.JLabel WelcomeMessageLb;
    private javax.swing.JLabel logoLb;
    // End of variables declaration//GEN-END:variables
}
