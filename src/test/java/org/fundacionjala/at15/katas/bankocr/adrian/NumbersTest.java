package org.fundacionjala.at15.katas.bankocr.adrian;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class NumbersTest {
    @Test
    public void matrixCreation() {
        Numbers matrix = new Numbers(3, 27);
        String[][] myMatrix = new String[3][27];
        assertEquals(myMatrix, matrix.getStrings());
    }

    @Test
    public void numberCreation() {
        Numbers myMatrix = new Numbers(3, 27);
        String[][] matrix = myMatrix.getStrings();
        String randomNumber = "1";
        matrix[0][1] = " ";
        matrix[1][0] = " ";
        matrix[1][1] = " ";
        matrix[1][2] = "|";
        matrix[2][0] = " ";
        matrix[2][1] = " ";
        matrix[2][2] = "|";
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
