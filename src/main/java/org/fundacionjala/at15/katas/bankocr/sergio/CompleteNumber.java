package org.fundacionjala.at15.katas.bankocr.sergio;

public class CompleteNumber {
    NumberDef numberDefF;

    public CompleteNumber(NumberDef finNumberDef){
        this.numberDefF = finNumberDef;
    }


     public String completeDigit(){
        String number = "";
        for (int i=0;i<=24;i=i+3){
            number = number + numberDefF.loneDigit(i);
        }
        return number;
    }
}
