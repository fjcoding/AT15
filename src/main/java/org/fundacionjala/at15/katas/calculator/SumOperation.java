package org.fundacionjala.at15.katas.calculator;

public class SumOperation extends Operation {

    public int run(int[] list) {
        int accumulator = 0;
        for (int index = 0; index < list.length; index++) {
            accumulator += list[index];
        }
        return accumulator;
    }
}
