package org.fundacionjala.at15.katas.calculator;

public class SubstractOperation extends Operation {

    public int run(int... operands) {
        int result = operands[0];
        for (int index = 1; index < operands.length; index++) {
            result = result - operands[index];
        }
        return result;
    }
}
