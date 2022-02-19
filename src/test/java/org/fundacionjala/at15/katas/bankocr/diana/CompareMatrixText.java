package org.fundacionjala.at15.katas.bankocr.diana;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class CompareMatrixText {
    Parse testNumber = new Parse();

    @Test
    public void IsMatrixGeneratingAZero() {
        String[][] matrixToCheck = { { " ", "_", " " }, { "|", " ", "|" }, { "|", "_", "|" }, { " ", " ", " " } };

        assertTrue(testNumber.determinateIfMatrixIsZero(matrixToCheck));
    }

    @Test
    public void IsMatrixGeneratingAOne() {
        String[][] matrixToCheck = { { " ", " ", " " }, { " ", " ", "|" }, { " ", " ", "|" }, { " ", " ", " " } };

        assertTrue(testNumber.determinateIfMatrixIsOne(matrixToCheck));
    }

    @Test
    public void IsMatrixGeneratingATwo() {
        String[][] matrixToCheck = { { " ", "_", " " }, { " ", "_", "|" }, { "|", "_", " " }, { " ", " ", " " } };

        assertTrue(testNumber.determinateIfMatrixIsTwo(matrixToCheck));
    }

    @Test
    public void IsMatrixGeneratingAThree() {
        String[][] matrixToCheck = { { " ", "_", " " }, { " ", "_", "|" }, { " ", "_", "|" }, { " ", " ", " " } };

        assertTrue(testNumber.determinateIfMatrixIsThree(matrixToCheck));
    }

    @Test
    public void IsMatrixGeneratingAFour() {
        String[][] matrixToCheck = { { " ", " ", " " }, { "|", "_", "|" }, { " ", " ", "|" }, { " ", " ", " " } };

        assertTrue(testNumber.determinateIfMatrixIsFour(matrixToCheck));
    }

    @Test
    public void IsMatrixGeneratingAFive() {
        String[][] matrixToCheck = { { " ", "_", " " }, { "|", "_", " " }, { " ", "_", "|" }, { " ", " ", " " } };

        assertTrue(testNumber.determinateIfMatrixIsFive(matrixToCheck));
    }

    @Test
    public void IsMatrixGeneratingASix() {
        String[][] matrixToCheck = { { " ", "_", " " }, { "|", "_", " " }, { "|", "_", "|" }, { " ", " ", " " } };

        assertTrue(testNumber.determinateIfMatrixIsSix(matrixToCheck));
    }

    @Test
    public void IsMatrixGeneratingASeven() {
        String[][] matrixToCheck = { { " ", "_", " " }, { " ", " ", "|" }, { " ", " ", "|" }, { " ", " ", " " } };

        assertTrue(testNumber.determinateIfMatrixIsSeven(matrixToCheck));
    }

    @Test
    public void IsMatrixGeneratingAEight() {
        String[][] matrixToCheck = { { " ", "_", " " }, { "|", "_", "|" }, { "|", "_", "|" }, { " ", " ", " " } };

        assertTrue(testNumber.determinateIfMatrixIsEight(matrixToCheck));
    }

    public void test() {
        int ZERO = 0;
        String[][] matrixToCheck = { { " ", "_", " " }, { "|", " ", "|" }, { "|", "_", "|" }, { " ", " ", " " } };
        int resultado = testNumber.getNumber(matrixToCheck);

        assertEquals(ZERO, resultado);
    }
}
