package org.fundacionjala.at15.katas.bankocr.sergio;

public class ChangeToInt {
    private SplitCompleteNumber splitCompleteNumber;
    private String[] splitedCode;
    private static final int ARRAY_SIZE = 9;
    private int[] splitedCodeInt = new int[ARRAY_SIZE];

    public ChangeToInt(SplitCompleteNumber currentSplitCompleteNumber) {
        this.splitCompleteNumber = currentSplitCompleteNumber;
        splitCompleteNumber.theSplitCode();
        this.splitedCode = splitCompleteNumber.getCompleteNumberSplited();
    }

    public int[] getSplitedCodeInt() {
        return this.splitedCodeInt;
    }

    public void theChange() {
        for (int ind = 0; ind < ARRAY_SIZE; ind++) {
            this.splitedCodeInt[ind] = Integer.parseInt(splitedCode[ind]);
        }
    }
}
