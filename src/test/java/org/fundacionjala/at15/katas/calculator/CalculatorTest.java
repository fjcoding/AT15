package org.fundacionjala.at15.katas.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void itShouldSumTwoIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.doOperation(new SumOperation(), 2, 3);
        assertEquals(5, result);
    }

    @Test
    public void itShouldSubstractTwoIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.doOperation(new SubstractOperation(), 5, 1);
        assertEquals(4, result);
    }

    @Test
    public void itShouldDivideTwoIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.doOperation(new DividerOperation(), 4, 2);
        assertEquals(2, result);
    }

    @Test
    public void itShouldMultiplytTwoIntegers() {
        Calculator calculator = new Calculator();
        int result = calculator.doOperation(new MultiplierOperation(), 5, 1);
        assertEquals(5, result);
    }
}
