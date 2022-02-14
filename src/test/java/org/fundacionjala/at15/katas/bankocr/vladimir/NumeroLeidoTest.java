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

        assertArrayEquals(cero, NumeroLeido.getCero());
        assertArrayEquals(uno, NumeroLeido.getUno());
        assertArrayEquals(dos, NumeroLeido.getDos());
        assertArrayEquals(tres, NumeroLeido.getTres());
        assertArrayEquals(cuatro, NumeroLeido.getCuatro());
        assertArrayEquals(cinco, NumeroLeido.getCinco());
        assertArrayEquals(seis, NumeroLeido.getSeis());
        assertArrayEquals(siete, NumeroLeido.getSiete());
        assertArrayEquals(ocho, NumeroLeido.getOcho());
        assertArrayEquals(nueve, NumeroLeido.getNueve());
    }
}
