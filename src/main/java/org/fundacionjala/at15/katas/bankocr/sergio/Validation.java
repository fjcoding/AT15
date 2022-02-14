package org.fundacionjala.at15.katas.bankocr.sergio;

public class Validation {
    private ChangeToInt changedCode;
    private int[] changedCodeInt;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;
    private static final int SEVEN = 7;
    private static final int EIGHT = 8;
    private static final int NINE = 9;
    private static final int ELEVEN = 11;

    public Validation(ChangeToInt currentChangedCode) {
        this.changedCode = currentChangedCode;
        changedCode.theChange();
        this.changedCodeInt = changedCode.getSplitedCodeInt();

    }

    public String theValidation() {
        int result;
        String correctValidation = "Code correct";
        String incorrectValidation = "Code incorrect";

        result = (changedCodeInt[EIGHT] + changedCodeInt[SEVEN] * 2 + changedCodeInt[SIX] * THREE + changedCodeInt[FIVE] * FOUR
                + changedCodeInt[FOUR] * FIVE + changedCodeInt[THREE] * SIX + changedCodeInt[2] * SEVEN + changedCodeInt[1] * EIGHT
                + changedCodeInt[0] * NINE) % ELEVEN;

        if (result == 0) {
            return correctValidation;
        } else {
            return incorrectValidation;
        }

    }

}
