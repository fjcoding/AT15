package org.fundacionjala.at15.katas.calculator;

public class Calculator {

    public int doSimpleOperation(Operation operation, int leftOperand, int rightOperand) {
        return operation.run(leftOperand, rightOperand);
    }

    public int doMoreOperation(Operation operation, int leftOperand1, int rightOperand1, Operation operation2,
            int number1,
            int number2, Operation operation3, int number3, int number4) {
        int result1 = operation.run(leftOperand1, rightOperand1);
        int result2 = operation2.run(number1, number2);
        int result3 = operation3.run(number3, number4);
        return result1 + result2 + result3;
    }

}
