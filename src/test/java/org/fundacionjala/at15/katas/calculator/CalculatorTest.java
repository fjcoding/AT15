package org.fundacionjala.at15.katas.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void itShouldSumTwoIntegers() {
        Calculator calculator = new Calculator();
        int[] operands = {2, 3};
        int result = calculator.doOperation(new SumOperation(), operands);
        assertEquals(5, result);
    }

    @Test
    public void itShouldSubstractTwoIntegers() {
        Calculator calculator = new Calculator();
        int[] operands = {5, 1};
        int result = calculator.doOperation(new SubstractOperation(), operands);
        assertEquals(-6, result);
    }
    
    @Test
    public void itShouldSumAndSubstractManyArguments() {
        Calculator calculator = new Calculator();
        int[] operands = {2, -3, 5, 1, -2};
        int result = calculator.doOperation(new SumOperation(), operands);
        assertEquals(3, result);
    }
}
