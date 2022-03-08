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
    public void itShouldSumNIntegers() {
        Calculator calculator = new Calculator();
        int[] numbers = {1,2,3,4};
        int result = calculator.doOperation(new SumOperationMultiple(),numbers);
        assertEquals(10, result);

    }
}
