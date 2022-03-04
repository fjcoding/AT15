package org.fundacionjala.at15.katas.langtonant;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.katas.bankocr.saul.DigitNumber;
import org.junit.Test;

public class DigitNumberTest {
    @Test
    public void itShouldHaveANumber() {
        DigitNumber theDigit = new DigitNumber(0);

        assertEquals(0, theDigit.getNumber());
    }

    @Test
    public void itShouldHaveANumberStartingSegments() {
        String digitScanned = " _ \n| |\n|_|";
        DigitNumber theDigit = new DigitNumber(digitScanned);

        assertEquals(0, theDigit.getNumber());
    }
}
