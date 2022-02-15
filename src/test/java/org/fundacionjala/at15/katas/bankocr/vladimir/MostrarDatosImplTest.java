package org.fundacionjala.at15.katas.bankocr.vladimir;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MostrarDatosImplTest {
    @Test
    public void itshouldSaveTheTxtLinePerLineInAnArrayTest() throws AccesoDatosEx {
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
    public void itShouldVerificateIfItIsAnErrAccount() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        String numberChecked = mostrarDatos.esCta();
        String numberShouldBe = "490067715" + " ERR";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerificateIfItIsAnIllAccount() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCRwithInterrogation.txt");
        String numberChecked = mostrarDatos.esCta();
        String numberShouldBe = "?23456789" + " ILL";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerificateIfItIsAnAccount() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCRisAnAccount.txt");
        String numberChecked = mostrarDatos.esCta();
        String numberShouldBe = "123456789" + " Es Cta";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerificateMod11WithOneEntranceItShowsAStringWiththeNumber() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCRisAnAccount.txt");
        String numberChecked = mostrarDatos.verifMod(mostrarDatos.convesion());
        String numberShouldBe = "123456789 ";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerificateMod11WithOneEntranceItShowsAnEmptyString() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCR.txt");
        String numberChecked = mostrarDatos.verifMod(mostrarDatos.convesion());
        String numberShouldBe = "";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerificateMod11WithTwoEntranceItShowsTheFirstStringWithTheNumber() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCRisAnAccount.txt");
        MostrarDatosImpl mostrarDatos1 = new MostrarDatosImpl();
        mostrarDatos1.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCR.txt");
        String numberChecked = mostrarDatos.verifModForTwo(mostrarDatos.convesion(), mostrarDatos1.convesion());
        String numberShouldBe = "123456789 ";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerificateMod11WithTwoEntranceItShowsTheSecondStringWithTheNumber() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCR.txt");
        MostrarDatosImpl mostrarDatos1 = new MostrarDatosImpl();
        mostrarDatos1.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCRisAnAccount.txt");
        String numberChecked = mostrarDatos.verifModForTwo(mostrarDatos.convesion(), mostrarDatos1.convesion());
        String numberShouldBe = "123456789 ";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerificateMod11WithTwoEntranceItShowsAnEmptyString() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCR.txt");
        MostrarDatosImpl mostrarDatos1 = new MostrarDatosImpl();
        mostrarDatos1.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCR.txt");
        String numberChecked = mostrarDatos.verifModForTwo(mostrarDatos.convesion(), mostrarDatos1.convesion());
        String numberShouldBe = "";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerificateMod11WithThreeEntranceItShowsTheFirstStringWithTheNumber() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCRisAnAccount.txt");
        MostrarDatosImpl mostrarDatos1 = new MostrarDatosImpl();
        mostrarDatos1.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCR.txt");
        MostrarDatosImpl mostrarDatos2 = new MostrarDatosImpl();
        mostrarDatos2.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCR.txt");
        String numberChecked = mostrarDatos.verifModForThree(mostrarDatos.convesion(), mostrarDatos1.convesion(), mostrarDatos2.convesion());
        String numberShouldBe = "123456789 ";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerificateMod11WithThreeEntranceItShowsTheSecondStringWithTheNumber() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCR.txt");
        MostrarDatosImpl mostrarDatos1 = new MostrarDatosImpl();
        mostrarDatos1.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCRisAnAccount.txt");
        MostrarDatosImpl mostrarDatos2 = new MostrarDatosImpl();
        mostrarDatos2.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCR.txt");
        String numberChecked = mostrarDatos.verifModForThree(mostrarDatos.convesion(), mostrarDatos1.convesion(), mostrarDatos2.convesion());
        String numberShouldBe = "123456789 ";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerificateMod11WithThreeEntranceItShowsTheThirdStringWithTheNumber() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCR.txt");
        MostrarDatosImpl mostrarDatos1 = new MostrarDatosImpl();
        mostrarDatos1.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCR.txt");
        MostrarDatosImpl mostrarDatos2 = new MostrarDatosImpl();
        mostrarDatos2.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCRisAnAccount.txt");
        String numberChecked = mostrarDatos.verifModForThree(mostrarDatos.convesion(), mostrarDatos1.convesion(), mostrarDatos2.convesion());
        String numberShouldBe = "123456789 ";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerificateMod11WithThreeEntranceItShowsAnEmptyString() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCR.txt");
        MostrarDatosImpl mostrarDatos1 = new MostrarDatosImpl();
        mostrarDatos1.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCR.txt");
        MostrarDatosImpl mostrarDatos2 = new MostrarDatosImpl();
        mostrarDatos2.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/OCR.txt");
        String numberChecked = mostrarDatos.verifModForThree(mostrarDatos.convesion(), mostrarDatos1.convesion(), mostrarDatos2.convesion());
        String numberShouldBe = "";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerifyIfItFixesTheErrTest1() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/txtPruebas/P1.txt");
        String numberChecked = mostrarDatos.err();
        String numberShouldBe = "000000021 ERR => 800000021 000000027 ";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerifyIfItFixesTheErrTest2() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/txtPruebas/P2.txt");
        String numberChecked = mostrarDatos.err();
        String numberShouldBe = "111111111 ERR => 711111111 ";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerifyIfItFixesTheErrTest3() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/txtPruebas/P3.txt");
        String numberChecked = mostrarDatos.err();
        String numberShouldBe = "777777777 ERR => 777777177 ";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerifyIfItFixesTheErrTest4() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/txtPruebas/P4.txt");
        String numberChecked = mostrarDatos.err();
        String numberShouldBe = "333333333 ERR => 333393333 ";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerifyIfItFixesTheErrTest5() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/txtPruebas/P5.txt");
        String numberChecked = mostrarDatos.err();
        String numberShouldBe = "888888888 ERR => 888886888 888888988 888888880 ";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerifyIfItFixesTheErrTest6() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/txtPruebas/P6.txt");
        String numberChecked = mostrarDatos.err();
        String numberShouldBe = "555555555 ERR => 559555555 555655555 ";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerifyIfItFixesTheErrTest7() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/txtPruebas/P7.txt");
        String numberChecked = mostrarDatos.err();
        String numberShouldBe = "666666666 ERR => 686666666 666566666 ";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerifyIfItFixesTheErrTest8() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/txtPruebas/P8.txt");
        String numberChecked = mostrarDatos.err();
        String numberShouldBe = "999999999 ERR => 899999999 993999999 999959999 ";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerifyIfItFixesTheErrTest9() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/txtPruebas/P9.txt");
        String numberChecked = mostrarDatos.err();
        String numberShouldBe = "002000000 ERR => 002000008 ";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerifyIfItFixesTheIllTest1() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/txtPruebas/PILL1.txt");
        String numberChecked = mostrarDatos.ill();
        String numberShouldBe = "?23456789 ILL => 123456789 ";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerifyIfItFixesTheIllTest2() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/txtPruebas/PILL2.txt");
        String numberChecked = mostrarDatos.ill();
        String numberShouldBe = "0?0000051 ILL => 000000051 ";
        assertEquals(numberShouldBe, numberChecked);
    }

    @Test
    public void itShouldVerifyIfItFixesTheIllTest3() {
        MostrarDatosImpl mostrarDatos = new MostrarDatosImpl();
        mostrarDatos.setNombreRecurso("src/main/java/org/fundacionjala/at15/katas/bankocr/vladimir/txtPruebas/PILL3.txt");
        String numberChecked = mostrarDatos.ill();
        String numberShouldBe = "49086771? ILL => 490867715 ";
        assertEquals(numberShouldBe, numberChecked);
    }
}
