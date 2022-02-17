package org.fundacionjala.sergio;

import org.fundacionjala.at15.katas.bankocr.sergio.Splitter;
import org.fundacionjala.at15.katas.bankocr.sergio.MatrixArch;
import org.fundacionjala.at15.katas.bankocr.sergio.NumberDef;
import org.fundacionjala.at15.katas.bankocr.sergio.CompleteNumber;
import org.fundacionjala.at15.katas.bankocr.sergio.SplitCompleteNumber;
import org.fundacionjala.at15.katas.bankocr.sergio.ChangeToInt;
import org.fundacionjala.at15.katas.bankocr.sergio.Validation;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidationTest {

    String line1 = "    _  _     _  _  _  _  _ ";
    String line2 = "  | _| _||_||_ |_   ||_||_|";
    String line3 = "  ||_  _|  | _||_|  ||_| _|";

    String line4 = "    _  _     _  _  _  _  _ ";
    String line5 = "  ||_| _||_||_ |_   ||_||_|";
    String line6 = "  ||_| _|  | _||_|  ||_| _|";

    String answerTrue = "Code correct";
    String answerFalse = "Code incorrect";

    @Test
    public void itShouldValidateCodePositive(){
        Splitter theSpliter = new Splitter(line1,line2,line3);
        MatrixArch matrix = new MatrixArch(theSpliter);
        NumberDef number = new NumberDef(matrix);
        CompleteNumber completeCode = new CompleteNumber(number);
        SplitCompleteNumber completeCodeSplit = new SplitCompleteNumber(completeCode);
        ChangeToInt changedCode = new ChangeToInt(completeCodeSplit);
        changedCode.theChange();
        Validation validation = new Validation(changedCode);

        assertEquals(answerTrue,validation.theValidation());
    }

    @Test
    public void itShouldValidateCodeNegative(){
        Splitter theSpliter = new Splitter(line4,line5,line6);
        MatrixArch matrix = new MatrixArch(theSpliter);
        NumberDef number = new NumberDef(matrix);
        CompleteNumber completeCode = new CompleteNumber(number);
        SplitCompleteNumber completeCodeSplit = new SplitCompleteNumber(completeCode);
        ChangeToInt changedCode = new ChangeToInt(completeCodeSplit);
        changedCode.theChange();
        Validation validation = new Validation(changedCode);

        assertEquals(answerFalse,validation.theValidation());
    }



}
