package org.fundacionjala.at15.katas.bankocr.sergio;

public class SplitCompleteNumber {
    private CompleteNumber completeNumber;
    private String[] completeNumberSplited;

    public SplitCompleteNumber(CompleteNumber currentCompleteNumber){
        this.completeNumber = currentCompleteNumber;
    }

    public String[] getCompleteNumberSplited(){
        return this.completeNumberSplited;
    }

    public void theSplitCode(){
        this.completeNumberSplited = this.completeNumber.completeDigit().split("(?!^)");
    }

}
