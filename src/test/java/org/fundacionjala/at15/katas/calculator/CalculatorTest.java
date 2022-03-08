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
    public void itShouldSumMultipleNumbers() {
        Calculator calculator = new Calculator();
        int[] array = {2, 4, 8, 7, 5, 3};
        int result = calculator.doOperation(new SumOperation(), array);
        assertEquals(29, result);
    }

    @Test
    public void itShouldSubstractMultipleNumbers() {
        Calculator calculator = new Calculator();
        int[] array = {5, 2, 8, 7, 5, 3};
        int result = calculator.doOperation(new SubstractOperation(), array);
        assertEquals(-30, result);
    }
}
