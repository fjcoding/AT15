package org.fundacionjala.at15.katas.calculator;

public class Calculator {
    int[] list = { 10, 5, 3, 2 };
    int accumulator = 0;

    public int doOperation(Operation operation, int[] list, int accumulator) {

        return operation.run(list, accumulator);
    }
}
