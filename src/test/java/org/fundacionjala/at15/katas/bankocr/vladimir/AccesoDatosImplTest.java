package org.fundacionjala.at15.katas.bankocr.vladimir;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.katas.bankocr.vladimir.datos.AccesoDatosImpl;
import org.fundacionjala.at15.katas.bankocr.vladimir.excepciones.LecturaDatosEx;
import org.junit.Test;

public class AccesoDatosImplTest {
    private static final int IND0 = 0;
    private static final int IND1 = 1;
    private static final int IND2 = 2;
    @Test
    public void itshouldSaveTheTxtLinePerLineTest() throws LecturaDatosEx {
        String lineOne = "    _  _  _  _  _  _     _ ";
        String lineTwo = "|_||_|| || ||_   |  |  ||_ ";
        String lineThree = "  | _||_||_||_|  |  |  | _|";
        AccesoDatosImpl accesoDatos = new AccesoDatosImpl();
        String[] txtReaded = accesoDatos.listar("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCR.txt");
        assertEquals(lineOne, txtReaded[IND0]);
        assertEquals(lineTwo, txtReaded[IND1]);
        assertEquals(lineThree, txtReaded[IND2]);
    }
}
