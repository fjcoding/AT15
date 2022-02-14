package org.fundacionjala.at15.katas.bankocr.diana;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class MatrixTest {
    Display testNumber = new Display(123456789);

    @Test
    public void IsMatrixReturningZero() {
        String matrixNumber[][] = new String[4][3];
        String matrixExpected[][] = { { " ", "_", " " }, { "|", " ", "|" }, { "|", "_", "|" }, { " ", " ", " " } };
        assertArrayEquals(matrixExpected, testNumber.numberZero(matrixNumber));
    }

    @Test
    public void IsMatrixReturningOne() {
        String matrixNumber[][] = new String[4][3];
        String matrixExpected[][] = { { " ", " ", " " }, { " ", " ", "|" }, { " ", " ", "|" }, { " ", " ", " " } };
        assertArrayEquals(matrixExpected, testNumber.numberOne(matrixNumber));
    }

    @Test
    public void IsMatrixReturningTwo() {
        String matrixNumber[][] = new String[4][3];
        String matrixExpected[][] = { { " ", "_", " " }, { " ", "_", "|" }, { "|", "_", " " }, { " ", " ", " " } };
        assertArrayEquals(matrixExpected, testNumber.numberTwo(matrixNumber));
    }

    @Test
    public void IsMatrixReturningThree() {
        String matrixNumber[][] = new String[4][3];
        String matrixExpected[][] = { { " ", "_", " " }, { " ", "_", "|" }, { " ", "_", "|" }, { " ", " ", " " } };
        assertArrayEquals(matrixExpected, testNumber.numberThree(matrixNumber));
    }

    @Test
    public void IsMatrixReturningFour() {
        String matrixNumber[][] = new String[4][3];
        String matrixExpected[][] = { { " ", " ", " " }, { "|", "_", "|" }, { " ", " ", "|" }, { " ", " ", " " } };
        assertArrayEquals(matrixExpected, testNumber.numberFour(matrixNumber));
    }

    @Test
    public void IsMatrixReturningFve() {
        String matrixNumber[][] = new String[4][3];
        String matrixExpected[][] = { { " ", "_", " " }, { "|", "_", " " }, { " ", "_", "|" }, { " ", " ", " " } };
        assertArrayEquals(matrixExpected, testNumber.numberFive(matrixNumber));
    }

    @Test
    public void IsMatrixReturningSix() {
        String matrixNumber[][] = new String[4][3];
        String matrixExpected[][] = { { " ", "_", " " }, { "|", "_", " " }, { "|", "_", "|" }, { " ", " ", " " } };
        assertArrayEquals(matrixExpected, testNumber.numberSix(matrixNumber));
    }

    @Test
    public void IsMatrixReturningSeven() {
        String matrixNumber[][] = new String[4][3];
        String matrixExpected[][] = { { " ", "_", " " }, { " ", " ", "|" }, { " ", " ", "|" }, { " ", " ", " " } };
        assertArrayEquals(matrixExpected, testNumber.numberSeven(matrixNumber));
    }

    @Test
    public void IsMatrixReturningEight() {
        String matrixNumber[][] = new String[4][3];
        String matrixExpected[][] = { { " ", "_", " " }, { "|", "_", "|" }, { "|", "_", "|" }, { " ", " ", " " } };
        assertArrayEquals(matrixExpected, testNumber.numberEight(matrixNumber));
    }

    @Test
    public void IsMatrixReturningNine() {
        String matrixNumber[][] = new String[4][3];
        String matrixExpected[][] = { { " ", "_", " " }, { "|", "_", "|" }, { " ", "_", "|" }, { " ", " ", " " } };
        assertArrayEquals(matrixExpected, testNumber.numberNine(matrixNumber));
    }

}
