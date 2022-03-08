package org.fundacionjala.at15.katas.calculator;

public class Calculator {

    public int doOperation(Operation operation, int leftOperand, int rightOperand) {
        leftOperand = operation.run(leftOperand, rightOperand);
        return doOperation(operation, leftOperand, rightOperand);
    }
}
