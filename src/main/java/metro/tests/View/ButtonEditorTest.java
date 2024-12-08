package Tests.View;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import View.ButtonEditor;
import View.CashierScreen;

import javax.swing.*;

public class ButtonEditorTest {

    private ButtonEditor buttonEditor;
    private JButton button;

    @Before
    public void setUp() {
        buttonEditor = new ButtonEditor(new JCheckBox(), new JTable(), new CashierScreen("WASEE", "123456"));
        button = (JButton) buttonEditor.getTableCellEditorComponent(null, "Add", false, 0, 0);
    }

    @Test
    public void testGetTableCellEditorComponent_AddButton() {
        buttonEditor.getTableCellEditorComponent(null, "Add", false, 0, 0);
        assertEquals("Add", button.getText());
    }

    @Test
    public void testGetCellEditorValue_AddButton() {
        buttonEditor.getTableCellEditorComponent(null, "Add", false, 0, 0);
        Object value = buttonEditor.getCellEditorValue();
        assertEquals("Add", value);
    }

    @Test
    public void testGetCellEditorValue_RemoveButton() {
        buttonEditor.getTableCellEditorComponent(null, "Remove", false, 0, 0);
        Object value = buttonEditor.getCellEditorValue();
        assertEquals("Remove", value);
    }
}
