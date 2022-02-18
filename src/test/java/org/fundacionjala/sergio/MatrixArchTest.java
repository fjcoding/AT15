package org.fundacionjala.sergio;

import org.fundacionjala.at15.katas.bankocr.sergio.Splitter;
import org.fundacionjala.at15.katas.bankocr.sergio.MatrixArch;

import static org.junit.Assert.*;
import org.junit.Test;

public class MatrixArchTest {

    String line1 = "    _  _     _  _  _  _  _ ";
    String line2 = "  | _| _||_||_ |_   ||_||_|";
    String line3 = "  ||_  _|  | _||_|  ||_| _|";

    int start1 = 0, start2 = 3, start3 = 6, start4 = 9, start5 = 12, start6 = 15, start7 = 18, start8 = 21, start9 =24;

    String matrix1[][] = {{" ", " ", " "},{" ", " ", "|"},{" ", " ", "|"}};
    String matrix2[][] = {{" ", "_", " "},{" ", "_", "|"},{"|", "_", " "}};
    String matrix3[][] = {{" ", "_", " "},{" ", "_", "|"},{" ", "_", "|"}};
    String matrix4[][] = {{" ", " ", " "},{"|", "_", "|"},{" ", " ", "|"}};
    String matrix5[][] = {{" ", "_", " "},{"|", "_", " "},{" ", "_", "|"}};
    String matrix6[][] = {{" ", "_", " "},{"|", "_", " "},{"|", "_", "|"}};
    String matrix7[][] = {{" ", "_", " "},{" ", " ", "|"},{" ", " ", "|"}};
    String matrix8[][] = {{" ", "_", " "},{"|", "_", "|"},{"|", "_", "|"}};
    String matrix9[][] = {{" ", "_", " "},{"|", "_", "|"},{" ", "_", "|"}};

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

}
