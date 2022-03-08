package org.fundacionjala.at15.katas.calculator;

public class SumOperation extends Operation {

    public int run(int[] operands) {
        int acum = 0;
        for (int i = 0; i<operands.length;i++){
            acum += operands[i];
        }
        return acum;
    }
}
