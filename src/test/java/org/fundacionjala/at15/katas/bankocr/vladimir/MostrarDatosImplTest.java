package org.fundacionjala.at15.katas.bankocr.vladimir;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.katas.bankocr.vladimir.datos.AccesoDatosImpl;
import org.fundacionjala.at15.katas.bankocr.vladimir.excepciones.LecturaDatosEx;
import org.fundacionjala.at15.katas.bankocr.vladimir.manejo.MostrarDatosImpl;
import org.junit.Test;

public class MostrarDatosImplTest {
    @Test
    public void itshouldSaveTheTxtLinePerLineInAnArrayTest() throws LecturaDatosEx {
        AccesoDatosImpl accesoDatos = new AccesoDatosImpl();
        String[] txtReadedAd = accesoDatos.listar("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCR.txt");
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        String[] txtReadedMd = mostrarDatos.listarNumeros();
        assertArrayEquals(txtReadedAd, txtReadedMd);
    }

    @Test
    public void itShouldShowTheFirstPositionOcrNumber() {
        final int posNumber = 1;
        final String[] cinco = new String[] {
            " _ ",
            "|_ ",
            " _|"
        };
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        String[] firstNumber = mostrarDatos.convertirOcr(posNumber);
        assertArrayEquals(cinco, firstNumber);
    }

    @Test
    public void itShouldShowTheLastPositionOcrNumber() {
        final int posNumber = 9;
        final String[] cuatro = new String[] {
            "   ",
            "|_|",
            "  |"
        };
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        String[] firstNumber = mostrarDatos.convertirOcr(posNumber);
        assertArrayEquals(cuatro, firstNumber);
    }

    @Test
    public void itShouldConvertTheOcrNumberToStringNumber() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        String numberConverted = mostrarDatos.convesion();
        final String numberShouldBe = "490067715";
        assertEquals(numberShouldBe, numberConverted);
    }

    @Test
    public void itShouldObtainTheChecksumInt() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        int numberConverted = mostrarDatos.checkSum(mostrarDatos.convesion());
        int numberShouldBe = 194;
        assertEquals(numberShouldBe, numberConverted);
    }

    @Test
    public void itShouldVerificateIfItIsAnAccount() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        String numberChecked = mostrarDatos.esCta();
        String numberShouldBe = "490067715" + " ERR";
        assertEquals(numberShouldBe, numberChecked);
    }
}
