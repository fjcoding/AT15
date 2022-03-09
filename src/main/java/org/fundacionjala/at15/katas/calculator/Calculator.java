package org.fundacionjala.at15.katas.calculator;

public class Calculator {

    public int doOperation(Operation operation, int leftOperand, int rightOperand) {
        return operation.run(leftOperand, rightOperand);
    }

    public int doOperationChain(int leftOperand, Object[] arr, Operation operation) {
        for (Object o : arr) {
            int rightOperand = (Integer) o;
            leftOperand = operation.run(leftOperand, rightOperand);
        }

        return leftOperand;
    }
}
