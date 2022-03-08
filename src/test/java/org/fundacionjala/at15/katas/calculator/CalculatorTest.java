package org.fundacionjala.at15.katas.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void itShouldSum() {
        Calculator calculator = new Calculator();
        int[] amountOfOperands = {10, 7, 3, 17};
        int result = calculator.doOperation(new SumOperation(), amountOfOperands);
        //the operation should be 10+7+3+17
        assertEquals(37, result);
    }

    @Test
    public void itShouldSubstract() {
        Calculator calculator = new Calculator();
        int[] amountOfOperands = {10, 9, 1, 10, 7};
        int result = calculator.doOperation(new SubstractOperation(), amountOfOperands);
        //the operation should be 10-9-1-10-7
        assertEquals(-17, result);
    }
}
