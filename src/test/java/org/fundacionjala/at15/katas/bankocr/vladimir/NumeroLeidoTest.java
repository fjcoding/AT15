package org.fundacionjala.at15.katas.bankocr.vladimir;
import static org.junit.Assert.*;

import org.fundacionjala.at15.katas.bankocr.vladimir.objeto.NumeroLeido;
import org.junit.Test;

public class NumeroLeidoTest {
    @Test
    public void itShouldShowArrayNumbers() {
        final String[] cero = new String[] {
            " _ ",
            "| |",
            "|_|"
        };

        final String[] uno = new String[] {
            "   ",
            "  |",
            "  |"
        };

        final String[] dos = new String[] {
            " _ ",
            " _|",
            "|_ "
        };

        final String[] tres = new String[] {
            " _ ",
            " _|",
            " _|"
        };

        final String[] cuatro = new String[] {
            "   ",
            "|_|",
            "  |"
        };

        final String[] cinco = new String[] {
            " _ ",
            "|_ ",
            " _|"
        };

        final String[] seis = new String[] {
            " _ ",
            "|_ ",
            "|_|"
        };

        final String[] siete = new String[] {
            " _ ",
            "  |",
            "  |"
        };

        final String[] ocho = new String[] {
            " _ ",
            "|_|",
            "|_|"
        };

        final String[] nueve = new String[] {
            " _ ",
            "|_|",
            " _|"
        };

        assertEquals(cero, NumeroLeido.getCero());
        assertEquals(uno, NumeroLeido.getUno());
        assertEquals(dos, NumeroLeido.getDos());
        assertEquals(tres, NumeroLeido.getTres());
        assertEquals(cuatro, NumeroLeido.getCuatro());
        assertEquals(cinco, NumeroLeido.getCinco());
        assertEquals(seis, NumeroLeido.getSeis());
        assertEquals(siete, NumeroLeido.getSiete());
        assertEquals(ocho, NumeroLeido.getOcho());
        assertEquals(nueve, NumeroLeido.getNueve());
    }
}
