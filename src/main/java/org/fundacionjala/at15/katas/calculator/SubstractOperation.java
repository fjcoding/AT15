package org.fundacionjala.at15.katas.calculator;

public class SubstractOperation extends Operation {

    public int run(int[] amountOfOperands) {
        int result = amountOfOperands[0];
        for (int index = 1; index < amountOfOperands.length; index++) {
            result = result - amountOfOperands[index];
        }
        return result;
    }
}
