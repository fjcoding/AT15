package org.fundacionjala.at15.katas.bankocr.adhemar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DigitTest {
    @Test
    public void itShouldHaveContent() {
        Digit theDigit = new Digit(Digit.PATTERN_0);

        assertEquals(Digit.PATTERN_0, theDigit.getContent());
    }
}
