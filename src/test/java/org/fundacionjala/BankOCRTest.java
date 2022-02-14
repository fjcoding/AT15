package org.fundacionjala;


import org.fundacionjala.at15.katas.bankocr.sergio.Splitter;
import org.fundacionjala.at15.katas.bankocr.sergio.CompleteNumber;
import org.fundacionjala.at15.katas.bankocr.sergio.MatrixArch;
import org.fundacionjala.at15.katas.bankocr.sergio.NumberDef;
import org.fundacionjala.at15.katas.bankocr.sergio.SplitCompleteNumber;
import org.fundacionjala.at15.katas.bankocr.sergio.ChangeToInt;
import org.fundacionjala.at15.katas.bankocr.sergio.Validation;

import static org.junit.Assert.*;
import org.junit.Test;

public class BankOCRTest {

    String line1 = "    _  _     _  _  _  _  _ ";
    String line2 = "  | _| _||_||_ |_   ||_||_|";
    String line3 = "  ||_  _|  | _||_|  ||_| _|";

    String lineOneArray[] = {" ", " ", " ", " ", "_", " ", " ", "_", " ", " ", " ", " ", " ", "_", " ", " ", "_", " ", " ", "_", " ", " ", "_", " ", " ", "_", " "};
    String lineTwoArray[] = {" ", " ", "|", " ", "_", "|", " ", "_", "|", "|", "_", "|", "|", "_", " ", "|", "_", " ", " ", " ", "|", "|", "_", "|", "|", "_", "|"};
    String lineThreeArray[] = {" ", " ", "|", "|", "_", " ", " ", "_", "|", " ", " ", "|", " ", "_", "|", "|", "_", "|", " ", " ", "|", "|", "_", "|", " ", "_", "|"};

    String matrix1[][] = {{" ", " ", " "},{" ", " ", "|"},{" ", " ", "|"}};
    String matrix2[][] = {{" ", "_", " "},{" ", "_", "|"},{"|", "_", " "}};
    String matrix3[][] = {{" ", "_", " "},{" ", "_", "|"},{" ", "_", "|"}};
    String matrix4[][] = {{" ", " ", " "},{"|", "_", "|"},{" ", " ", "|"}};
    String matrix5[][] = {{" ", "_", " "},{"|", "_", " "},{" ", "_", "|"}};
    String matrix6[][] = {{" ", "_", " "},{"|", "_", " "},{"|", "_", "|"}};
    String matrix7[][] = {{" ", "_", " "},{" ", " ", "|"},{" ", " ", "|"}};
    String matrix8[][] = {{" ", "_", " "},{"|", "_", "|"},{"|", "_", "|"}};
    String matrix9[][] = {{" ", "_", " "},{"|", "_", "|"},{" ", "_", "|"}};

    String digit1 = "1", digit2 = "2", digit3 = "3", digit4 = "4", digit5 = "5", digit6 = "6", digit7 = "7", digit8 = "8", digit9 = "9";

    int start1 = 0, start2 = 3, start3 = 6, start4 = 9, start5 = 12, start6 = 15, start7 = 18, start8 = 21, start9 =24;

    String completNumberToCompare = "123456789";

    String completCodeSplited[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

    int changedCodeToCompare[] = {1,2,3,4,5,6,7,8,9};

    String answerTrue = "Code correct";

    @Test
    public void itShouldSplitStringOfCharachtersOneByOne() {


        Splitter theSpliter = new Splitter(line1,line2,line3);
        theSpliter.theSplit();

        assertArrayEquals(lineOneArray, theSpliter.getLineOneArray());
        assertArrayEquals(lineTwoArray, theSpliter.getLineTwoArray());
        assertArrayEquals(lineThreeArray, theSpliter.getLineThreeArray());
    }

    @Test
    public void itShouldCreateMatrix3x3FromArrays(){

        Splitter theSpliter = new Splitter(line1,line2,line3);
        MatrixArch matrix = new MatrixArch(theSpliter);

        assertArrayEquals(matrix1, matrix.matrixDigit(start1));
        assertArrayEquals(matrix2, matrix.matrixDigit(start2));
        assertArrayEquals(matrix3, matrix.matrixDigit(start3));
        assertArrayEquals(matrix4, matrix.matrixDigit(start4));
        assertArrayEquals(matrix5, matrix.matrixDigit(start5));
        assertArrayEquals(matrix6, matrix.matrixDigit(start6));
        assertArrayEquals(matrix7, matrix.matrixDigit(start7));
        assertArrayEquals(matrix8, matrix.matrixDigit(start8));
        assertArrayEquals(matrix9, matrix.matrixDigit(start9));
    }

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
    public void itShouldReturnTheCompleteNumber(){
        Splitter theSpliter = new Splitter(line1,line2,line3);
        MatrixArch matrix = new MatrixArch(theSpliter);
        NumberDef number = new NumberDef(matrix);
        CompleteNumber completeCode = new CompleteNumber(number);

        assertEquals(completNumberToCompare,completeCode.completeDigit());

    }
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

    @Test
    public void itShouldChangeToInt(){
        Splitter theSpliter = new Splitter(line1,line2,line3);
        MatrixArch matrix = new MatrixArch(theSpliter);
        NumberDef number = new NumberDef(matrix);
        CompleteNumber completeCode = new CompleteNumber(number);
        SplitCompleteNumber completeCodeSplit = new SplitCompleteNumber(completeCode);
        ChangeToInt changedCode = new ChangeToInt(completeCodeSplit);
        changedCode.theChange();

        assertArrayEquals(changedCodeToCompare, changedCode.getSplitedCodeInt());
    }

    @Test
    public void itShouldValidateCode(){
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
}