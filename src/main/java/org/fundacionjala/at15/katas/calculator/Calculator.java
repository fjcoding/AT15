package org.fundacionjala.at15.katas.calculator;

public class Calculator {

    public int doOperation(Operation operation, int leftOperand, int rightOperand) {
        return operation.run(leftOperand, rightOperand);
    }

    public int doOperation(Operation operation, int[] operant) {
        int total = 0;
        for (int ind = 0; ind < operant.length; ind++) {
            total = operation.run(total, operant[ind]);
        }
        return total;
    }
}
