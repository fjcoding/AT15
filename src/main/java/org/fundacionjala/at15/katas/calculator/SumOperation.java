package org.fundacionjala.at15.katas.calculator;

public class SumOperation extends Operation {

    public int run(int[] amountOfOperands) {
        int result = 0;
        for (int index = 0; index < amountOfOperands.length; index++) {
            result = result + amountOfOperands[index];
        }
        return result;
    }

}
