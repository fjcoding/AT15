package org.fundacionjala.at15.katas.calculator;


public class Calculator {

    public int doOperation(Operation operation, int leftOperand, int rightOperand) {
        return operation.run(leftOperand, rightOperand);
    }
    public int doOperation(Operation operation, int[] numbers) {
        return operation.run(numbers);

    }
}
