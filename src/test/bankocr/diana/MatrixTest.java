package org.fundacionjala.at15.katas.bankocr.diana;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class MatrixTest {
    Display testNumber = Display(123456789);

    @Test
    public void IsMatrixReturningZero() {
        String matrixNumber[][] = new String[4][3];
        String matrixExpected[][] = { { " ", "_", " " }, { "|", " ", "|" }, { "|", "_", "|" }, { " ", " ", " " } };
        assertEquals(matrixExpected[0][1], matrixNumber.numberZero()[0][1]);
        // assertArrayEquals(matrixExpected, matrixNumber.numberZero());
    }
}
