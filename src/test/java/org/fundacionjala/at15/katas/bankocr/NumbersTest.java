package org.fundacionjala.at15.katas.bankocr;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.katas.bankocr.agustin.Numbers;
import org.junit.Test;

public class NumbersTest {
    @Test
    public void  itShouldBeEqualZero() {
        String digit = " _ \n" + "| |\n" + "|_|\n" + "   \n";
        Numbers numbToDecode = new Numbers(digit);
        assertEquals("0", numbToDecode.getNumber());
    }

    @Test
    public void  itShouldBeEqualOne() {
        String digit = "   \n" + "  |\n" + "  |\n" + "   \n";
        Numbers numbToDecode = new Numbers(digit);
        assertEquals("1", numbToDecode.getNumber());
    }

    @Test
    public void  itShouldBeEqualTwo() {
        String digit = " _ \n" + " _|\n" + "|_ \n" + "   \n";
        Numbers numbToDecode = new Numbers(digit);
        assertEquals("2", numbToDecode.getNumber());
    }

    @Test
    public void  itShouldBeEqualThree() {
        String digit = " _ \n" + " _|\n" + " _|\n" + "   \n";
        Numbers numbToDecode = new Numbers(digit);
        assertEquals("3", numbToDecode.getNumber());
    }

    @Test
    public void  itShouldBeEqualFour() {
        String digit = "   \n" + "|_|\n" + "  |\n" + "   \n";
        Numbers numbToDecode = new Numbers(digit);
        assertEquals("4", numbToDecode.getNumber());
    }

    @Test
    public void  itShouldBeEqualFive() {
        String digit = " _ \n" + "|_ \n" + " _|\n" + "   \n";
        Numbers numbToDecode = new Numbers(digit);
        assertEquals("5", numbToDecode.getNumber());
    }

    @Test
    public void  itShouldBeEqualSix() {
        String digit = " _ \n" + "|_ \n" + "|_|\n" + "   \n";
        Numbers numbToDecode = new Numbers(digit);
        assertEquals("6", numbToDecode.getNumber());
    }

    @Test
    public void  itShouldBeEqualSeven() {
        String digit = " _ \n" + "  |\n" + "  |\n" + "   \n";
        Numbers numbToDecode = new Numbers(digit);
        assertEquals("7", numbToDecode.getNumber());
    }

    @Test
    public void  itShouldBeEqualEight() {
        String digit = " _ \n" + "|_|\n" + "|_|\n" + "   \n";
        Numbers numbToDecode = new Numbers(digit);
        assertEquals("8", numbToDecode.getNumber());
    }

    @Test
    public void  itShouldBeEqualNine() {
        String digit = " _ \n" + "|_|\n" + " _|\n" + "   \n";
        Numbers numbToDecode = new Numbers(digit);
        assertEquals("9", numbToDecode.getNumber());
    }
}
