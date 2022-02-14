package org.fundacionjala.at15.katas.bankocr.adhemar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DigitTest {
    @Test
    public void itShouldHaveContent() {
        Digit theDigit = new Digit(Digit.PATTERN_0);

        assertEquals(Digit.PATTERN_0, theDigit.getContent());
    }

    @Test
    public void itShouldBeZero() {
        String content =
        " _ \n" +
        "| |\n" +
        "|_|\n" +
        "   \n";
        Digit thegDigit = new Digit(content);

        assertEquals("0", thegDigit.getNumber());
    }

    @Test
    public void itShouldBeOne() {
        String content =
        "   \n" +
        "  |\n" +
        "  |\n" +
        "   \n";
        Digit thegDigit = new Digit(content);

        assertEquals("1", thegDigit.getNumber());
    }

    @Test
    public void itShouldBeTwo() {
        String content =
        " _ \n" +
        " _|\n" +
        "|_ \n" +
        "   \n";
        Digit thegDigit = new Digit(content);

        assertEquals("2", thegDigit.getNumber());
    }

    @Test
    public void itShouldBeThree() {
        String content =
        " _ \n" +
        " _|\n" +
        " _|\n" +
        "   \n";
        Digit thegDigit = new Digit(content);

        assertEquals("3", thegDigit.getNumber());
    }

    @Test
    public void itShouldBeFour() {
        String content =
        "   \n" +
        "|_|\n" +
        "  |\n" +
        "   \n";
        Digit thegDigit = new Digit(content);

        assertEquals("4", thegDigit.getNumber());
    }

    @Test
    public void itShouldBeFive() {
        String content =
        " _ \n" +
        "|_ \n" +
        " _|\n" +
        "   \n";
        Digit thegDigit = new Digit(content);

        assertEquals("5", thegDigit.getNumber());
    }

    @Test
    public void itShouldBeSix() {
        String content =
        " _ \n" +
        "|_ \n" +
        "|_|\n" +
        "   \n";
        Digit thegDigit = new Digit(content);

        assertEquals("6", thegDigit.getNumber());
    }

    @Test
    public void itShouldBeSeven() {
        String content =
        " _ \n" +
        "  |\n" +
        "  |\n" +
        "   \n";
        Digit thegDigit = new Digit(content);

        assertEquals("7", thegDigit.getNumber());
    }

    @Test
    public void itShouldBeEight() {
        String content =
        " _ \n" +
        "|_|\n" +
        "|_|\n" +
        "   \n";
        Digit thegDigit = new Digit(content);

        assertEquals("8", thegDigit.getNumber());
    }

    @Test
    public void itShouldBeNine() {
        String content =
        " _ \n" +
        "|_|\n" +
        " _|\n" +
        "   \n";
        Digit thegDigit = new Digit(content);

        assertEquals("9", thegDigit.getNumber());
    }

    @Test
    public void itShouldNotBeAnyNumber() {
        String content =
        " _ \n" +
        "|||\n" +
        "|||\n" +
        "   \n";
        Digit thegDigit = new Digit(content);

        assertEquals("?", thegDigit.getNumber());
    }
}
