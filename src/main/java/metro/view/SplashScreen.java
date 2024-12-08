package com.mycompany.metrosystem.view;

import javax.swing.SwingUtilities;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class SplashScreen extends javax.swing.JFrame {

    public SplashScreen() {
        initComponents();
    }

    public void startLoading() {
        try {

            for (int i = 0; i <= 100; i++) {
                Thread.sleep(70);
                LoadingValue.setText(i + " %");

                if (i == 10) {
                    LoadingLabel.setText("Loading reports and statistics");
                } else if (i == 30) {
                    LoadingLabel.setText("Loading products and stocks");
                } else if (i == 70) {
                    LoadingLabel.setText("Loading several Modules");
                } else if (i == 100) {
                    LoadingLabel.setText("Loading Complete! Thanks for your Patience!");
                }
                LoadingBar.setValue(i);
            }
            dispose();
            LoginScreen lc = new LoginScreen();
            lc.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        Background = new javax.swing.JPanel();
        LoadingBar = new javax.swing.JProgressBar();
        ProjectName = new javax.swing.JLabel();
        LoadingLabel = new javax.swing.JLabel();
        LoadingValue = new javax.swing.JLabel();
        HeroImage = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(0, 255, 255));
        Background.setPreferredSize(new java.awt.Dimension(900, 500));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoadingBar.setForeground(new java.awt.Color(255, 153, 153));
        Background.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 900, 20));

        ProjectName.setFont(new java.awt.Font("Century Gothic", 1, 36));
        ProjectName.setForeground(new java.awt.Color(0, 51, 51));
        ProjectName.setText("Metro Point of Sale System");
        ProjectName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Background.add(ProjectName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, 40));

        LoadingLabel.setFont(new java.awt.Font("Century Gothic", 0, 20));
        LoadingLabel.setForeground(new java.awt.Color(0, 51, 51));
        LoadingLabel.setText("Loading......");
        Background.add(LoadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        LoadingValue.setFont(new java.awt.Font("Century Gothic", 0, 20));
        LoadingValue.setForeground(new java.awt.Color(0, 51, 51));
        LoadingValue.setText("0 %");
        Background.add(LoadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 450, -1, -1));

        HeroImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\Assets\\MainVectorSc.png"));
        Background.add(HeroImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, -50, -1, -1));

        BackgroundImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\it\\Downloads\\Assets\\BackgroundImage.png"));
        BackgroundImage.setText("jLabel2");
        Background.add(BackgroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -90, 980, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        // SplashScreen sc = new SplashScreen();
        // sc.setVisible(true);
        // sc.startLoading();

    }

    private javax.swing.JPanel Background;
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JLabel HeroImage;
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel LoadingLabel;
    private javax.swing.JLabel LoadingValue;
    private javax.swing.JLabel ProjectName;
}
