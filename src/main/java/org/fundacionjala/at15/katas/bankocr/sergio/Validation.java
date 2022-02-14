package org.fundacionjala.at15.katas.bankocr.sergio;

public class Validation {
    private ChangeToInt changedCode;
    private int[] changedCodeInt;

    public Validation(ChangeToInt currentChangedCode){
        this.changedCode = currentChangedCode;
        changedCode.theChange();
        this.changedCodeInt = changedCode.getSplitedCodeInt();

    }

    public String theValidation(){
        int result;
        String correctValidation = "Code correct";
        String incorrectValidation = "Code incorrect";

        result = (changedCodeInt[8] + changedCodeInt[7]*2 + changedCodeInt[6]*3 + changedCodeInt[5]*4 + changedCodeInt[4]*5
        + changedCodeInt[3]*6 + changedCodeInt[2]*7 + changedCodeInt[1]*8 + changedCodeInt[0]*9) % 11;

        if(result == 0){
            return correctValidation;
        } else {
            return incorrectValidation;
        }

    }

}
