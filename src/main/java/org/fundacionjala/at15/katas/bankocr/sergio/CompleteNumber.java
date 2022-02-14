package org.fundacionjala.at15.katas.bankocr.sergio;

public class CompleteNumber {
    private static final int LAST_DIGIT = 24;
    private static final int JUMP = 3;
    private NumberDef numberDefF;

    public CompleteNumber(NumberDef finNumberDef) {
        this.numberDefF = finNumberDef;
    }


    public String completeDigit() {
        String number = "";
        for (int ind = 0; ind <= LAST_DIGIT; ind = ind + JUMP) {
            number = number + numberDefF.loneDigit(ind);
        }
        return number;
    }
}
