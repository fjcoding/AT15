package org.fundacionjala.at15.katas.calculator;

public class Calculator {

    public int doOperation(Operation operation, int[] amountOfOperands) {
        return operation.run(amountOfOperands);
    }
}
