package org.fundacionjala.sergio;

import org.fundacionjala.at15.katas.bankocr.sergio.Splitter;
import org.fundacionjala.at15.katas.bankocr.sergio.MatrixArch;
import org.fundacionjala.at15.katas.bankocr.sergio.NumberDef;
import org.fundacionjala.at15.katas.bankocr.sergio.CompleteNumber;

import static org.junit.Assert.*;
import org.junit.Test;

public class CompleteNumberTest {

    String line1 = "    _  _     _  _  _  _  _ ";
    String line2 = "  | _| _||_||_ |_   ||_||_|";
    String line3 = "  ||_  _|  | _||_|  ||_| _|";

    String completNumberToCompare = "123456789";


    @Test
    public void itShouldReturnTheCompleteNumber(){
        Splitter theSpliter = new Splitter(line1,line2,line3);
        MatrixArch matrix = new MatrixArch(theSpliter);
        NumberDef number = new NumberDef(matrix);
        CompleteNumber completeCode = new CompleteNumber(number);

        assertEquals(completNumberToCompare,completeCode.completeDigit());

    }

}
