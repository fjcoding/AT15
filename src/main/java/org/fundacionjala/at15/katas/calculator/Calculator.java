package org.fundacionjala.at15.katas.calculator;

public class Calculator {
    int[] list = { 10, 5, 3, 2 };

    public int doOperation(Operation operation, int[] list) {

        return operation.run(list);
    }
}
