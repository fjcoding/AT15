package org.fundacionjala.sergio;

import org.fundacionjala.at15.katas.bankocr.sergio.Splitter;
import org.fundacionjala.at15.katas.bankocr.sergio.MatrixArch;
import org.fundacionjala.at15.katas.bankocr.sergio.NumberDef;
import org.fundacionjala.at15.katas.bankocr.sergio.CompleteNumber;
import org.fundacionjala.at15.katas.bankocr.sergio.SplitCompleteNumber;

import static org.junit.Assert.*;
import org.junit.Test;

public class SplitCompleteNumberTest {

    String line1 = "    _  _     _  _  _  _  _ ";
    String line2 = "  | _| _||_||_ |_   ||_||_|";
    String line3 = "  ||_  _|  | _||_|  ||_| _|";

    String completCodeSplited[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

    @Test
    public void itShouldSplitCompleteNumber(){
        Splitter theSpliter = new Splitter(line1,line2,line3);
        MatrixArch matrix = new MatrixArch(theSpliter);
        NumberDef number = new NumberDef(matrix);
        CompleteNumber completeCode = new CompleteNumber(number);
        SplitCompleteNumber completeCodeSplit = new SplitCompleteNumber(completeCode);
        completeCodeSplit.theSplitCode();

        assertArrayEquals(completCodeSplited, completeCodeSplit.getCompleteNumberSplited());
    }

}
