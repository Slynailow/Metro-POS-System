package Tests;

import static org.junit.Assert.*;
import org.junit.Test;

import utils.AbsoluteConstraints;

import java.awt.Dimension;
import java.awt.Point;

public class AbsoluteConstraintsTest {

    @Test
    public void testConstructorWithPoint() {
        Point point = new Point(10, 20);
        AbsoluteConstraints constraints = new AbsoluteConstraints(point);
        assertEquals(10, constraints.getX());
        assertEquals(20, constraints.getY());
        assertEquals(-1, constraints.getWidth());
        assertEquals(-1, constraints.getHeight());
    }

    @Test
    public void testConstructorWithXAndY() {
        AbsoluteConstraints constraints = new AbsoluteConstraints(30, 40);
        assertEquals(30, constraints.getX());
        assertEquals(40, constraints.getY());
        assertEquals(-1, constraints.getWidth());
        assertEquals(-1, constraints.getHeight());
    }

    @Test
    public void testConstructorWithPointAndDimension() {
        Point point = new Point(50, 60);
        Dimension size = new Dimension(100, 200);
        AbsoluteConstraints constraints = new AbsoluteConstraints(point, size);
        assertEquals(50, constraints.getX());
        assertEquals(60, constraints.getY());
        assertEquals(100, constraints.getWidth());
        assertEquals(200, constraints.getHeight());
    }

    @Test
    public void testConstructorWithXAndYAndDimensions() {
        AbsoluteConstraints constraints = new AbsoluteConstraints(70, 80, 300, 400);
        assertEquals(70, constraints.getX());
        assertEquals(80, constraints.getY());
        assertEquals(300, constraints.getWidth());
        assertEquals(400, constraints.getHeight());
    }

    @Test
    public void testGetters() {
        AbsoluteConstraints constraints = new AbsoluteConstraints(10, 20, 30, 40);
        assertEquals(10, constraints.getX());
        assertEquals(20, constraints.getY());
        assertEquals(30, constraints.getWidth());
        assertEquals(40, constraints.getHeight());
    }

    @Test
    public void testToString() {
        AbsoluteConstraints constraints = new AbsoluteConstraints(10, 20, 30, 40);
        String expected = "utils.AbsoluteConstraints [x=10, y=20, width=30, height=40]";
        assertEquals(expected, constraints.toString());
    }

    @Test
    public void testConstructorWithNullDimension() {
        Point point = new Point(5, 15);
        AbsoluteConstraints constraints = new AbsoluteConstraints(point, null);
        assertEquals(5, constraints.getX());
        assertEquals(15, constraints.getY());
        assertEquals(-1, constraints.getWidth());
        assertEquals(-1, constraints.getHeight());
    }

    // Testing for edge cases and extreme values

    @Test
    public void testConstructorWithNegativeValues() {
        AbsoluteConstraints constraints = new AbsoluteConstraints(-100, -200, -300, -400);
        assertEquals(-100, constraints.getX());
        assertEquals(-200, constraints.getY());
        assertEquals(-300, constraints.getWidth());
        assertEquals(-400, constraints.getHeight());
    }

    @Test
    public void testConstructorWithZeroValues() {
        AbsoluteConstraints constraints = new AbsoluteConstraints(0, 0, 0, 0);
        assertEquals(0, constraints.getX());
        assertEquals(0, constraints.getY());
        assertEquals(0, constraints.getWidth());
        assertEquals(0, constraints.getHeight());
    }

    @Test
    public void testToStringWithNegativeValues() {
        AbsoluteConstraints constraints = new AbsoluteConstraints(-10, -20, -30, -40);
        String expected = "utils.AbsoluteConstraints [x=-10, y=-20, width=-30, height=-40]";
        assertEquals(expected, constraints.toString());
    }

    @Test
    public void testToStringWithZeroValues() {
        AbsoluteConstraints constraints = new AbsoluteConstraints(0, 0, 0, 0);
        String expected = "utils.AbsoluteConstraints [x=0, y=0, width=0, height=0]";
        assertEquals(expected, constraints.toString());
    }

    @Test
    public void testConstructorWithLargeValues() {
        AbsoluteConstraints constraints = new AbsoluteConstraints(Integer.MAX_VALUE, Integer.MAX_VALUE,
                Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, constraints.getX());
        assertEquals(Integer.MAX_VALUE, constraints.getY());
        assertEquals(Integer.MAX_VALUE, constraints.getWidth());
        assertEquals(Integer.MAX_VALUE, constraints.getHeight());
    }

    @Test
    public void testConstructorWithNegativeWidthAndHeight() {
        AbsoluteConstraints constraints = new AbsoluteConstraints(10, 20, -100, -200);
        assertEquals(10, constraints.getX());
        assertEquals(20, constraints.getY());
        assertEquals(-100, constraints.getWidth());
        assertEquals(-200, constraints.getHeight());
    }

    @Test
    public void testConstructorWithLargeWidthAndHeight() {
        AbsoluteConstraints constraints = new AbsoluteConstraints(10, 20, Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertEquals(10, constraints.getX());
        assertEquals(20, constraints.getY());
        assertEquals(Integer.MAX_VALUE, constraints.getWidth());
        assertEquals(Integer.MAX_VALUE, constraints.getHeight());
    }

    @Test
    public void testToStringWithLargeValues() {
        AbsoluteConstraints constraints = new AbsoluteConstraints(Integer.MAX_VALUE, Integer.MAX_VALUE,
                Integer.MAX_VALUE, Integer.MAX_VALUE);
        String expected = "utils.AbsoluteConstraints [x=" + Integer.MAX_VALUE + ", y=" + Integer.MAX_VALUE + ", width="
                + Integer.MAX_VALUE + ", height=" + Integer.MAX_VALUE + "]";
        assertEquals(expected, constraints.toString());
    }

    @Test
    public void testToStringWithNullPointAndNullDimension() {
        AbsoluteConstraints constraints = new AbsoluteConstraints((Point) null, (Dimension) null);
        assertEquals("utils.AbsoluteConstraints [x=0, y=0, width=-1, height=-1]", constraints.toString());
    }

    @Test
    public void testEqualityWithSameValues() {
        AbsoluteConstraints constraints1 = new AbsoluteConstraints(10, 20, 30, 40);
        AbsoluteConstraints constraints2 = new AbsoluteConstraints(10, 20, 30, 40);
        assertEquals(constraints1, constraints2);
    }

    @Test
    public void testInequalityWithDifferentValues() {
        AbsoluteConstraints constraints1 = new AbsoluteConstraints(10, 20, 30, 40);
        AbsoluteConstraints constraints2 = new AbsoluteConstraints(20, 30, 40, 50);
        assertNotEquals(constraints1, constraints2);
    }
}
