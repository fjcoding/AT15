package org.fundacionjala.at15.katas.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void itShouldSumTwoOrMoreIntegers() {
        int[] numbers = {1,2,3,4};
        Calculator calculator = new Calculator();
        int result = calculator.doOperation(new SumOperation(),numbers);
        assertEquals(10, result);
    }

    @Test
    public void itShouldSubstractTwoOrMoreIntegers() {
        int[] numbers = {10,3,3};
        Calculator calculator = new Calculator();
        int result = calculator.doOperation(new SubstractOperation(),numbers);
        assertEquals(4, result);
    }
}
