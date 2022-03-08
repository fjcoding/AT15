package org.fundacionjala.at15.katas.calculator;

public class Calculator {

    public int doOperation(Operation operation, int leftOperand, int rightOperand) {
        return operation.run(leftOperand, rightOperand);
    }

    public int doOperation(Operation operation, int numA, int numB, int numC) {
        return operation.run(numA, numB, numC);
    }

    public int doOperation(Operation operation, int numA, int numB, int numC, int numD) {
        return operation.run(numA, numB, numC, numD);
    }

    public int doOperation(Operation operation, int numA, int numB, int numC, int numD, int numE) {
        return operation.run(numA, numB, numC, numD, numE);
    }

    public int doOperation(Operation operation, int numA, int numB, int numC, int numD, int numE, int numF) {
        return operation.run(numA, numB, numC, numD, numE, numF);
    }

    public int doOperation(Operation operation, int numA, int numB, int numC, int numD, int numE, int numF, int numG) {
        return operation.run(numA, numB, numC, numD, numE, numF, numG);
    }

    public int doOperation(Operation operation, int numA, int numB, int numC, int numD, int numE, int numF, int numG, int numH) {
        return operation.run(numA, numB, numC, numD, numE, numF, numG, numH);
    }
}
