package org.fundacionjala.sergio;

import org.fundacionjala.at15.katas.bankocr.sergio.Splitter;
import org.fundacionjala.at15.katas.bankocr.sergio.MatrixArch;
import org.fundacionjala.at15.katas.bankocr.sergio.NumberDef;

import static org.junit.Assert.*;
import org.junit.Test;

public class NumberDefTest {

    String line1 = "    _  _     _  _  _  _  _ ";
    String line2 = "  | _| _||_||_ |_   ||_||_|";
    String line3 = "  ||_  _|  | _||_|  ||_| _|";

    int start1 = 0, start2 = 3, start3 = 6, start4 = 9, start5 = 12, start6 = 15, start7 = 18, start8 = 21, start9 =24;

    String digit1 = "1", digit2 = "2", digit3 = "3", digit4 = "4", digit5 = "5", digit6 = "6",
           digit7 = "7", digit8 = "8", digit9 = "9", digit0 = "0", digitUnknown = "?";

    @Test
    public void itShouldSetStringNumberFromMatrix(){

        Splitter theSpliter = new Splitter(line1,line2,line3);
        MatrixArch matrix = new MatrixArch(theSpliter);
        NumberDef number = new NumberDef(matrix);

        assertEquals(digit1, number.loneDigit(start1));
        assertEquals(digit2, number.loneDigit(start2));
        assertEquals(digit3, number.loneDigit(start3));
        assertEquals(digit4, number.loneDigit(start4));
        assertEquals(digit5, number.loneDigit(start5));
        assertEquals(digit6, number.loneDigit(start6));
        assertEquals(digit7, number.loneDigit(start7));
        assertEquals(digit8, number.loneDigit(start8));
        assertEquals(digit9, number.loneDigit(start9));
    }

    @Test
    public void itShouldSetStringNumberFromMatrixZeroUnknown() {

        String line4 = " _  _  _     _  _  _  _  _ ";
        String line5 = "| | _| _||_||_ |_   ||_||_|";
        String line6 = "|_||_| _|  | _||_|  ||_| _|";

        Splitter theSpliter = new Splitter(line4,line5,line6);
        MatrixArch matrix = new MatrixArch(theSpliter);
        NumberDef number = new NumberDef(matrix);

        assertEquals(digit0, number.loneDigit(start1));
        assertEquals(digitUnknown, number.loneDigit(start2));

    }

}
