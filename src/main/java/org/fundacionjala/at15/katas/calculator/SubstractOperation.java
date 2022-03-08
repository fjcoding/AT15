package org.fundacionjala.at15.katas.calculator;

public class SubstractOperation extends Operation {

    public int run(int[] operands) {
        int aux = operands[0];
        for (int ind = 1; ind < operands.length; ind++) {
            aux -= operands[ind];
        }
        return aux;
    }
}
