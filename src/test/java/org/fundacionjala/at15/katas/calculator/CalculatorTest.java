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
        int result = calculator.doOperation(new SubstractOperation(), 5, 2);
        assertEquals(3, result);
    }

    @Test
    public void itShouldCalculateSeveralSumOperations() {
        Calculator calculator = new Calculator();
        int result = calculator.doOperation(new SumOperation(), 2, 3, 5, 5);
        assertEquals(15, result);
    }
}
