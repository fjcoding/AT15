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
    public void itShouldDoThreeOperations() {
        Calculator calculator = new Calculator();
        int result = calculator.doMoreOperation(new SumOperation(), 1, 2,new SumOperation(), 3, 4,new SumOperation(), 5,6);
        assertEquals(21, result);
    }
}
