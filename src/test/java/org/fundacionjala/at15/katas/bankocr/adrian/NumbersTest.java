package org.fundacionjala.at15.katas.bankocr.adrian;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumbersTest {
    @Test
    public void matrixCreation() {
        Numbers myMatrix = new Numbers(3, 27);
        String[][] matrix = myMatrix.getStrings();
        for (int i=0; i<3; i++) {
            for (int j=0; j<27; j++) {
                matrix[i][j] = " ";
            }
        }
        String[][] matrix2 = new String[3][27];
        for (int i=0; i<3; i++) {
            for (int j=0; j<27; j++) {
                matrix2[i][j] = " ";
            }
        }
        assertEquals(matrix2, myMatrix.getStrings());
    }

    @Test
    public void numberOneCreation() {
        Numbers myMatrix = new Numbers(3, 27);
        String[][] matrix = myMatrix.getStrings();
        matrix[0][1] = " ";
        matrix[1][0] = " ";
        matrix[1][1] = " ";
        matrix[1][2] = "|";
        matrix[2][0] = " ";
        matrix[2][1] = " ";
        matrix[2][2] = "|";

        String randomNumber = "1";
        assertEquals(randomNumber, myMatrix.whatNumber(matrix[0][1], matrix[1][0], matrix[1][1], matrix[1][2], matrix[2][0], matrix[2][1], matrix[2][2]));
    }
    @Test
    public void numberTwoCreation() {
        Numbers myMatrix = new Numbers(3, 27);
        String[][] matrix = myMatrix.getStrings();
        matrix[0][1] = "_";
        matrix[1][0] = " ";
        matrix[1][1] = "_";
        matrix[1][2] = "|";
        matrix[2][0] = "|";
        matrix[2][1] = "_";
        matrix[2][2] = " ";

        String randomNumber = "2";
        assertEquals(randomNumber, myMatrix.whatNumber(matrix[0][1], matrix[1][0], matrix[1][1], matrix[1][2], matrix[2][0], matrix[2][1], matrix[2][2]));
    }
    @Test
    public void numberThreeCreation() {
        Numbers myMatrix = new Numbers(3, 27);
        String[][] matrix = myMatrix.getStrings();
        matrix[0][1] = "_";
        matrix[1][0] = " ";
        matrix[1][1] = "_";
        matrix[1][2] = "|";
        matrix[2][0] = " ";
        matrix[2][1] = "_";
        matrix[2][2] = "|";

        String randomNumber = "3";
        assertEquals(randomNumber, myMatrix.whatNumber(matrix[0][1], matrix[1][0], matrix[1][1], matrix[1][2], matrix[2][0], matrix[2][1], matrix[2][2]));
    }
    @Test
    public void numberFourCreation() {
        Numbers myMatrix = new Numbers(3, 27);
        String[][] matrix = myMatrix.getStrings();
        matrix[0][1] = " ";
        matrix[1][0] = "|";
        matrix[1][1] = "_";
        matrix[1][2] = "|";
        matrix[2][0] = " ";
        matrix[2][1] = " ";
        matrix[2][2] = "|";

        String randomNumber = "4";
        assertEquals(randomNumber, myMatrix.whatNumber(matrix[0][1], matrix[1][0], matrix[1][1], matrix[1][2], matrix[2][0], matrix[2][1], matrix[2][2]));
    }
    @Test
    public void numberFiveCreation() {
        Numbers myMatrix = new Numbers(3, 27);
        String[][] matrix = myMatrix.getStrings();
        matrix[0][1] = "_";
        matrix[1][0] = "|";
        matrix[1][1] = "_";
        matrix[1][2] = " ";
        matrix[2][0] = " ";
        matrix[2][1] = "_";
        matrix[2][2] = "|";

        String randomNumber = "5";
        assertEquals(randomNumber, myMatrix.whatNumber(matrix[0][1], matrix[1][0], matrix[1][1], matrix[1][2], matrix[2][0], matrix[2][1], matrix[2][2]));
    }
    public void numberSixCreation() {
        Numbers myMatrix = new Numbers(3, 27);
        String[][] matrix = myMatrix.getStrings();
        matrix[0][1] = "_";
        matrix[1][0] = "|";
        matrix[1][1] = "_";
        matrix[1][2] = " ";
        matrix[2][0] = "|";
        matrix[2][1] = "_";
        matrix[2][2] = "|";

        String randomNumber = "6";
        assertEquals(randomNumber, myMatrix.whatNumber(matrix[0][1], matrix[1][0], matrix[1][1], matrix[1][2], matrix[2][0], matrix[2][1], matrix[2][2]));
    }
    public void numberSevenCreation() {
        Numbers myMatrix = new Numbers(3, 27);
        String[][] matrix = myMatrix.getStrings();
        matrix[0][1] = "_";
        matrix[1][0] = " ";
        matrix[1][1] = " ";
        matrix[1][2] = "|";
        matrix[2][0] = " ";
        matrix[2][1] = " ";
        matrix[2][2] = "|";

        String randomNumber = "7";
        assertEquals(randomNumber, myMatrix.whatNumber(matrix[0][1], matrix[1][0], matrix[1][1], matrix[1][2], matrix[2][0], matrix[2][1], matrix[2][2]));
    }
    public void numberEightCreation() {
        Numbers myMatrix = new Numbers(3, 27);
        String[][] matrix = myMatrix.getStrings();
        matrix[0][1] = "_";
        matrix[1][0] = "|";
        matrix[1][1] = "_";
        matrix[1][2] = "|";
        matrix[2][0] = "|";
        matrix[2][1] = "_";
        matrix[2][2] = "|";

        String randomNumber = "8";
        assertEquals(randomNumber, myMatrix.whatNumber(matrix[0][1], matrix[1][0], matrix[1][1], matrix[1][2], matrix[2][0], matrix[2][1], matrix[2][2]));
    }
    public void numberNineCreation() {
        Numbers myMatrix = new Numbers(3, 27);
        String[][] matrix = myMatrix.getStrings();
        matrix[0][1] = "_";
        matrix[1][0] = "|";
        matrix[1][1] = "_";
        matrix[1][2] = "|";
        matrix[2][0] = " ";
        matrix[2][1] = "_";
        matrix[2][2] = "|";

        String randomNumber = "9";
        assertEquals(randomNumber, myMatrix.whatNumber(matrix[0][1], matrix[1][0], matrix[1][1], matrix[1][2], matrix[2][0], matrix[2][1], matrix[2][2]));
    }
    public void numberIllCreation() {
        Numbers myMatrix = new Numbers(3, 27);
        String[][] matrix = myMatrix.getStrings();
        matrix[0][1] = " ";
        matrix[1][0] = " ";
        matrix[1][1] = " ";
        matrix[1][2] = " ";
        matrix[2][0] = " ";
        matrix[2][1] = " ";
        matrix[2][2] = "|";

        String randomNumber = "?";
        assertEquals(randomNumber, myMatrix.whatNumber(matrix[0][1], matrix[1][0], matrix[1][1], matrix[1][2], matrix[2][0], matrix[2][1], matrix[2][2]));
    }

    @Test
    public void numberStringCreation() {
        Numbers myMatrix = new Numbers(3, 27);
        String[][] matrix = myMatrix.getStrings();
        for (int i=0; i<3; i++) {
            for (int j=0; j<27; j++) {
                matrix[i][j] = " ";
            }
        }
        matrix[0][1] = "_";
        matrix[1][0] = " ";
        matrix[1][1] = " ";
        matrix[1][2] = "|";
        matrix[2][0] = " ";
        matrix[2][1] = " ";
        matrix[2][2] = "|";

        String[] randomString = new String[9];
        randomString[0] = "7";
        assertEquals(randomString.length, myMatrix.number().length);
        assertEquals(randomString[0], myMatrix.number()[0]);
    }
}
