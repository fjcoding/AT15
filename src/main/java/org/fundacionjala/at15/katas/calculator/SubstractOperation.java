package org.fundacionjala.at15.katas.calculator;

public class SubstractOperation extends Operation {

    public int run(int[] list) {
        int accumulator = list[0];
        for (int index = 1; index < list.length; index++) {
            accumulator -= list[index];
        }
        return accumulator;
    }
}
