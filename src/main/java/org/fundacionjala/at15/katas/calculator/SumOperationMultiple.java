package org.fundacionjala.at15.katas.calculator;

public class SumOperationMultiple extends Operation {

    public int run(int[] numbers) {
        int result = 0;
        for (int ind = 0; ind < numbers.length; ind++) {
            result = result + numbers[ind];
        }
        return result;
    }

    public int run(int leftOperand, int rightOperand) {
        return 0;
    }
}
