package org.fundacionjala.at15.katas.calculator;

public class SumOperation extends Operation {

    public int run(int... operands) {
        int result = 0;
        for (int index = 0; index < operands.length; index++) {
            result = result + operands[index];
        }
        return result;
    }
}
