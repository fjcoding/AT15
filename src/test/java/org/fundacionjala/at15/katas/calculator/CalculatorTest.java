package org.fundacionjala.at15.katas.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void itShouldSumIntegers() {
        Calculator calculator = new Calculator();
        int[] listExample = { 10, 5, 3, 2 };
        int result = calculator.doOperation(new SumOperation(), listExample);
        assertEquals(20, result);
    }

    @Test
    public void itShouldSubstractIntegers() {
        Calculator calculator = new Calculator();
        int[] listExample = { 10, 5, 3, 2 };
        int result = calculator.doOperation(new SubstractOperation(), listExample);
        assertEquals(0, result);
    }
}
