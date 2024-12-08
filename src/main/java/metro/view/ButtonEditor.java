package com.mycompany.metrosystem.view;

import javax.swing.*;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEditor extends DefaultCellEditor {
    private JButton button;
    private String label;
    private boolean isPushed;
    private JTable table; // To access the table
    private CashierScreen view;

    public ButtonEditor(JCheckBox checkBox, JTable table, CashierScreen view) {
        super(checkBox);
        this.table = table;
        this.view = view;

        button = new JButton();
        button.setOpaque(true);

        button.addActionListener(e -> {
            fireEditingStopped();
        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, 
                                                 boolean isSelected, int row, int column) {
        label = (value == null) ? "" : value.toString();
        button.setText(label);
        isPushed = true;
        return button;
    }

    @Override
    public Object getCellEditorValue() {
        if (isPushed) {
            if ("Add".equals(label)) {
                view.handleAddToCart(table.getValueAt(table.getSelectedRow(), 0).toString());
            } else if ("Remove".equals(label)) {
                view.handleRemoveFromCart(table.getValueAt(table.getSelectedRow(), 0).toString());
            }
        }
        isPushed = false;
        return label;
    }
}
