package org.fundacionjala.at15.katas.calculator;

public class SumOperation extends Operation {

    public int run(int[] operands) {
        int acum = 0;
        for (int ind = 0; ind < operands.length; ind++) {
            acum += operands[ind];
        }
        return acum;
    }
}
