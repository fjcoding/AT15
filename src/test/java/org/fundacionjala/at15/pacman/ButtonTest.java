package org.fundacionjala.at15.pacman;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ButtonTest {
    @Test
    public void itShouldHaveAButton() {
        Button theButton = new Button("Test", 1);

        assertTrue(theButton.isVisible());
    }
}
