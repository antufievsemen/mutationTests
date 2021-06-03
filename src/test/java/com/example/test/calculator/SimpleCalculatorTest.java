package com.example.test.calculator;

import com.example.calculator.SimpleCalculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleCalculatorTest {
    private SimpleCalculator simpleCalculator;


    @Before
    public void setUp() {
        this.simpleCalculator = new SimpleCalculator();
    }

    @Test
    public void testIsPositive() {
        Integer a = 2;
        Assert.assertTrue(simpleCalculator.isPositive(a));
    }

    @Test
    public void testIsNegative() {
        Integer a = -2;
        Assert.assertTrue(simpleCalculator.isNegative(a));
    }

    @Test
    public void testSubtraction() {
        Integer a = 3;
        Assert.assertEquals(a, simpleCalculator.subtraction(5, 2));
    }

    @Test
    public void testAddition() {
        Integer a = 6;
        Assert.assertEquals(a, simpleCalculator.addition(2, 4));
    }

    @Test
    public void testGetLargeNum() {
        Integer min = 5;
        Integer max = 10;
        Assert.assertEquals(max, simpleCalculator.getLargeNum(min, max));
    }

    @Test
    public void testDivision() {
        Double a = 10.0;
        Double b = 2.0;
        Assert.assertEquals(5.0, simpleCalculator.division(a, b), 0.0001);
    }

    @Test
    public void testMultiply() {
        Integer a = 2;
        Integer b = 4;
        Assert.assertEquals(Integer.valueOf(8), simpleCalculator.multiply(a, b));
    }

    @Test
    public void testSetAndGetSaveNum() {
        Integer a = 2;
        simpleCalculator.setSaveNum(a);
        Assert.assertEquals(a, simpleCalculator.getSaveNum());
    }
}