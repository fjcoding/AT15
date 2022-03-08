package org.fundacionjala.at15.katas.calculator;

public class Calculator {

    public int doSimpleOperation(Operation operation, int leftOperand, int rightOperand) {
        return operation.run(leftOperand, rightOperand);
    }

    public int doMoreOperation(Operation operation1, int leftOperand1, int rightOperand1, Operation operation2,
            int number1,
            int number2) {
        int result1 = operation1.run(leftOperand1, rightOperand1);
        int result2 = operation2.run(number1, number2);
        return result1 + result2;
    }

}
