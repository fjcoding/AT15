package org.fundacionjala.at15.katas.bankocr.adrian;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UserCasesTest {
    @Test
    public void testIll() {
        UserCases myMatrix = new UserCases(3, 27);
        String[][] matrix = myMatrix.getStrings();
        //Here below I fill the matrix with " " which will give pure '?'
        for (int i=0; i<3; i++) {
            for (int j=0; j<27; j++) {
                matrix[i][j] = " ";
            }
        }
        assertTrue("Ill function works", myMatrix.ill());
    }

    @Test
    public void testChecksum() {
        UserCases myMatrix = new UserCases(3, 27);
        String[][] matrix = myMatrix.getStrings();
        for (int i=0; i<3; i++) {
            for (int j=0; j<27; j++) {
                matrix[i][j] = " ";
            }
        }
        assertFalse("The number is ILL", myMatrix.checksum());

        //Here below I insert the number 000000051 which meets the checksum requirements
        matrix[0][1] = "_"; matrix[1][0] = "|"; matrix[1][1] = " "; matrix[1][2] = "|"; matrix[2][0] = "|"; matrix[2][1] = "_"; matrix[2][2] = "|";
        matrix[0][4] = "_"; matrix[1][3] = "|"; matrix[1][4] = " "; matrix[1][5] = "|"; matrix[2][3] = "|"; matrix[2][4] = "_"; matrix[2][5] = "|";
        matrix[0][7] = "_"; matrix[1][6] = "|"; matrix[1][7] = " "; matrix[1][8] = "|"; matrix[2][6] = "|"; matrix[2][7] = "_"; matrix[2][8] = "|";
        matrix[0][10] = "_"; matrix[1][9] = "|"; matrix[1][10] = " "; matrix[1][11] = "|"; matrix[2][9] = "|"; matrix[2][10] = "_"; matrix[2][11] = "|";
        matrix[0][13] = "_"; matrix[1][12] = "|"; matrix[1][13] = " "; matrix[1][14] = "|"; matrix[2][12] = "|"; matrix[2][13] = "_"; matrix[2][14] = "|";
        matrix[0][16] = "_"; matrix[1][15] = "|"; matrix[1][16] = " "; matrix[1][17] = "|"; matrix[2][15] = "|"; matrix[2][16] = "_"; matrix[2][17] = "|";
        matrix[0][19] = "_"; matrix[1][18] = "|"; matrix[1][19] = " "; matrix[1][20] = "|"; matrix[2][18] = "|"; matrix[2][19] = "_"; matrix[2][20] = "|";
        matrix[0][22] = "_"; matrix[1][21] = "|"; matrix[1][22] = "_"; matrix[1][23] = " "; matrix[2][21] = " "; matrix[2][22] = "_"; matrix[2][23] = "|";
        matrix[0][25] = " "; matrix[1][24] = " "; matrix[1][25] = " "; matrix[1][26] = "|"; matrix[2][24] = " "; matrix[2][25] = " "; matrix[2][26] = "|";
        assertTrue("The checksum function works", myMatrix.checksum());
    }

    @Test
    public void testReplaceAtPosition() {
        UserCases myMatrix = new UserCases(3, 27);
        String[][] matrix = myMatrix.getStrings();
        matrix[0][1] = "_";
        matrix[1][0] = "|";
        matrix[1][1] = "x";
        String expectedSpace = " ";
        String randomCharacter = "x";
        assertEquals(expectedSpace, myMatrix.replaceCharAtPosition(matrix[0][1]));
        assertEquals(expectedSpace, myMatrix.replaceCharAtPosition(matrix[1][0]));
        assertEquals(randomCharacter, myMatrix.replaceCharAtPosition(matrix[1][1]));
    }
}
