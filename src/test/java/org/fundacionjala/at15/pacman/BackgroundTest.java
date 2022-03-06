package org.fundacionjala.at15.pacman;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BackgroundTest {
    @Test
    public void itShouldHaveABackground() {
        Background theBackground = new Background("src/main/java/org/fundacionjala/at15/pacman/images/menuImage.jpg");

        assertTrue(theBackground.isVisible());
    }
}
