package org.fundacionjala.at15.katas.calculator;

public class SumOperation extends Operation {

    public int run(int[] operands) {
        int result = 0;
        for (int operand : operands) {
            result += operand;
        }
        return result;
    }
}
