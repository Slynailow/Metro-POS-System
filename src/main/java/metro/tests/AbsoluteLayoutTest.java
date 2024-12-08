package Tests;

import static org.junit.Assert.*;
import org.junit.Test;

import utils.AbsoluteConstraints;
import utils.AbsoluteLayout;

import java.awt.*;
import javax.swing.*;

public class AbsoluteLayoutTest {

    @Test
    public void testAddLayoutComponentWithValidConstraints() {
        AbsoluteLayout layout = new AbsoluteLayout();
        JButton button = new JButton("Test Button");
        AbsoluteConstraints constraints = new AbsoluteConstraints(10, 20, 100, 50);

        layout.addLayoutComponent(button, constraints);

        assertTrue("Component should be added to layout", layout.constraints.containsKey(button));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddLayoutComponentWithInvalidConstraints() {
        AbsoluteLayout layout = new AbsoluteLayout();
        JButton button = new JButton("Test Button");

        layout.addLayoutComponent(button, new Object()); // Invalid constraint type
    }

    @Test
    public void testRemoveLayoutComponent() {
        AbsoluteLayout layout = new AbsoluteLayout();
        JButton button = new JButton("Test Button");
        AbsoluteConstraints constraints = new AbsoluteConstraints(10, 20, 100, 50);

        layout.addLayoutComponent(button, constraints);
        layout.removeLayoutComponent(button);

        assertFalse("Component should be removed from layout", layout.constraints.containsKey(button));
    }

    @Test
    public void testPreferredLayoutSize() {
        AbsoluteLayout layout = new AbsoluteLayout();
        JPanel container = new JPanel(layout);
        JButton button1 = new JButton("Button 1");
        AbsoluteConstraints constraints1 = new AbsoluteConstraints(10, 20, 100, 50);
        JButton button2 = new JButton("Button 2");
        AbsoluteConstraints constraints2 = new AbsoluteConstraints(200, 300, 150, 75);

        layout.addLayoutComponent(button1, constraints1);
        layout.addLayoutComponent(button2, constraints2);

        Dimension preferredSize = layout.preferredLayoutSize(container);

        assertEquals(350, preferredSize.width); // maxWidth = 200 + 150
        assertEquals(375, preferredSize.height); // maxHeight = 300 + 75
    }

    @Test
    public void testMinimumLayoutSize() {
        AbsoluteLayout layout = new AbsoluteLayout();
        JPanel container = new JPanel(layout);
        JButton button1 = new JButton("Button 1");
        AbsoluteConstraints constraints1 = new AbsoluteConstraints(10, 20, -1, -1); // minimum size
        JButton button2 = new JButton("Button 2");
        AbsoluteConstraints constraints2 = new AbsoluteConstraints(200, 300, 150, 75);

        layout.addLayoutComponent(button1, constraints1);
        layout.addLayoutComponent(button2, constraints2);

        Dimension minimumSize = layout.minimumLayoutSize(container);

        // The minimum size of a container should be the sum of its components' minimum
        // bounds
        assertTrue(minimumSize.width > 0);
        assertTrue(minimumSize.height > 0);
    }

    @Test
    public void testLayoutContainer() {
        AbsoluteLayout layout = new AbsoluteLayout();
        JPanel container = new JPanel(layout);
        JButton button1 = new JButton("Button 1");
        AbsoluteConstraints constraints1 = new AbsoluteConstraints(10, 20, 100, 50);
        JButton button2 = new JButton("Button 2");
        AbsoluteConstraints constraints2 = new AbsoluteConstraints(200, 300, 150, 75);

        layout.addLayoutComponent(button1, constraints1);
        layout.addLayoutComponent(button2, constraints2);

        layout.layoutContainer(container);

        assertEquals(10, button1.getX());
        assertEquals(20, button1.getY());
        assertEquals(100, button1.getWidth());
        assertEquals(50, button1.getHeight());

        assertEquals(200, button2.getX());
        assertEquals(300, button2.getY());
        assertEquals(150, button2.getWidth());
        assertEquals(75, button2.getHeight());
    }

    @Test
    public void testMaximumLayoutSize() {
        AbsoluteLayout layout = new AbsoluteLayout();
        JPanel container = new JPanel(layout);

        Dimension maximumSize = layout.maximumLayoutSize(container);

        assertEquals(Integer.MAX_VALUE, maximumSize.width);
        assertEquals(Integer.MAX_VALUE, maximumSize.height);
    }

    @Test
    public void testLayoutAlignmentX() {
        AbsoluteLayout layout = new AbsoluteLayout();
        JPanel container = new JPanel(layout);

        float alignmentX = layout.getLayoutAlignmentX(container);

        assertEquals(0, alignmentX, 0.0);
    }

    @Test
    public void testLayoutAlignmentY() {
        AbsoluteLayout layout = new AbsoluteLayout();
        JPanel container = new JPanel(layout);

        float alignmentY = layout.getLayoutAlignmentY(container);

        assertEquals(0, alignmentY, 0.0);
    }

    @Test
    public void testInvalidateLayout() {
        AbsoluteLayout layout = new AbsoluteLayout();
        JPanel container = new JPanel(layout);

        // No specific behavior to verify as the method is void and has no
        // implementation.
        layout.invalidateLayout(container);
        // Ensure no exceptions are thrown
        assertTrue(true);
    }
}
