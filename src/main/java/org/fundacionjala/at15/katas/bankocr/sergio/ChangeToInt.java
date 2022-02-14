package org.fundacionjala.at15.katas.bankocr.sergio;

public class ChangeToInt {
    private SplitCompleteNumber splitCompleteNumber;
    private String[] splitedCode;
    private int[] splitedCodeInt = new int[9];

    public ChangeToInt(SplitCompleteNumber currentSplitCompleteNumber){
        this.splitCompleteNumber = currentSplitCompleteNumber;
        splitCompleteNumber.theSplitCode();
        this.splitedCode = splitCompleteNumber.getCompleteNumberSplited();
    }

    public int[] getSplitedCodeInt(){
        return this.splitedCodeInt;
    }

    public void theChange(){
        for(int i=0;i<9;i++){
            this.splitedCodeInt[i] = Integer.parseInt(splitedCode[i]);
        }
    }
}
