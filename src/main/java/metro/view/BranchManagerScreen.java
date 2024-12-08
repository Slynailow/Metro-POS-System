package metro.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BranchManagerScreen {

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Branch Manager Portal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        JTabbedPane tabbedPane = new JTabbedPane();

        // Add Cashier Tab
        JPanel cashierPanel = createAddEmployeePanel("Cashier");
        tabbedPane.addTab("Add Cashier", cashierPanel);

        // Add Data Entry Operator Tab
        JPanel deoPanel = createAddEmployeePanel("Data Entry Operator");
        tabbedPane.addTab("Add Data Entry Operator", deoPanel);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }

    private static JPanel createAddEmployeePanel(String role) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(Color.WHITE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        // Fields for Employee Details
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password:");
        JTextField passwordField = new JTextField("Password_123", 20);
        passwordField.setEditable(false);
        passwordField.setBackground(new Color(173, 216, 230));
        passwordField.setForeground(Color.WHITE);

        JLabel branchCodeLabel = new JLabel("Branch Code:");
        JTextField branchCodeField = new JTextField(20);

        JLabel salaryLabel = new JLabel("Salary:");
        JTextField salaryField = new JTextField(20);

        // Add components to panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(nameLabel, gbc);
        gbc.gridx = 1;
        panel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(emailLabel, gbc);
        gbc.gridx = 1;
        panel.add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(passwordLabel, gbc);
        gbc.gridx = 1;
        panel.add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(branchCodeLabel, gbc);
        gbc.gridx = 1;
        panel.add(branchCodeField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(salaryLabel, gbc);
        gbc.gridx = 1;
        panel.add(salaryField, gbc);

        JButton submitButton = new JButton("Add " + role);
        submitButton.setBackground(new Color(70, 130, 180));
        submitButton.setForeground(Color.WHITE);

        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(submitButton, gbc);

        // Action Listener for Button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                String email = emailField.getText().trim();
                String password = passwordField.getText().trim();
                String branchCode = branchCodeField.getText().trim();
                String salary = salaryField.getText().trim();

                if (name.isEmpty() || email.isEmpty() || branchCode.isEmpty() || salary.isEmpty()) {
                    JOptionPane.showMessageDialog(panel, "All fields are required!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (!email.contains("@")) {
                    JOptionPane.showMessageDialog(panel, "Invalid email address!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (Double.parseDouble(salary) < 1) {
                    JOptionPane.showMessageDialog(panel, "Salary must be greater than 0!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try {
                    double salaryValue = Double.parseDouble(salary);
                    if (addEmployeeToDatabase(role, name, email, password, branchCode, salaryValue) == true) {
                        JOptionPane.showMessageDialog(panel, role + " added successfully!", "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        clearFields(nameField, emailField, branchCodeField, salaryField);
                    } else {
                        JOptionPane.showMessageDialog(panel, "Error adding " + role + "!", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(panel, "Salary must be a valid number!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        return panel;
    }

    public static boolean checkIfValidBranchID(int branchID) {
        Boolean isValid = false;
        try (Connection conn = new MySQL().connect()) {
            String sql = "SELECT * FROM branches WHERE branch_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, branchID);
            ResultSet rs = pstmt.executeQuery();
            isValid = rs.next();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error checking branch ID: " + ex.getMessage(), "Database Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        return isValid;
    }

    private static boolean emailAlreadyExists(String email) {
        boolean emailExists = false;
        try (Connection conn = new MySQL().connect()) {
            String sql = "SELECT email, 'BranchManager' AS source_table FROM BranchManager WHERE email = ? "
                    + "UNION SELECT email, 'Cashier' AS source_table FROM Cashier WHERE email = ? "
                    + "UNION SELECT email, 'DataEntryOperator' AS source_table FROM DataEntryOperator WHERE email = ? "
                    + "UNION SELECT email, 'Vendor' AS source_table FROM Vendor WHERE email = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, email);
            pstmt.setString(2, email);
            pstmt.setString(3, email);
            pstmt.setString(4, email);
            ResultSet rs = pstmt.executeQuery();
            emailExists = rs.next();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error checking email: " + ex.getMessage(), "Database Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        return emailExists;
    }

    private static boolean addEmployeeToDatabase(String role, String name, String email, String password,
            String branchCode, double salary) {
        boolean emailExists = emailAlreadyExists(email);
        if (emailExists) {
            JOptionPane.showMessageDialog(null, "Email already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        boolean isValidBranch = checkIfValidBranchID(Integer.parseInt(branchCode));
        if (!isValidBranch) {
            JOptionPane.showMessageDialog(null, "Branch Code does not exist!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        String tableName = role.equals("Cashier") ? "Cashier" : "DataEntryOperator";

        String sql = "INSERT INTO " + tableName + " (name, branchCode, email, password, salary) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = new MySQL().connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setString(2, branchCode);
            pstmt.setString(3, email);
            pstmt.setString(4, password);
            pstmt.setDouble(5, salary);

            pstmt.executeUpdate();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error adding to database: " + ex.getMessage(), "Database Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private static boolean clearFields(JTextField... fields) {
        for (JTextField field : fields) {
            field.setText("");
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BranchManagerScreen::createAndShowGUI);
    }
}
