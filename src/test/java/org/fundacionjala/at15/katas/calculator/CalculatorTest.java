package org.fundacionjala.at15.katas.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void itShouldSumTwoIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.doSimpleOperation(new SumOperation(), 2, 3);
        assertEquals(5, result);
    }

    @Test
    public void itShouldSubstractTwoIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.doSimpleOperation(new SubstractOperation(), 5, 1);
        assertEquals(4, result);
    }

    @Test
    public void itShouldDivideTwoIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.doSimpleOperation(new DividerOperation(), 4, 2);
        assertEquals(2, result);
    }

    @Test
    public void itShouldMultiplytTwoIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.doSimpleOperation(new MultiplierOperation(), 5, 1);
        assertEquals(5, result);
    }

    @Test
    public void itShouldDoTwoDifferentOperations() {
        Calculator calculator = new Calculator();
        int result = calculator.doMoreOperation(new DividerOperation(), 4, 2,new MultiplierOperation(), 3, 4);
        assertEquals(14, result);
    }
}
