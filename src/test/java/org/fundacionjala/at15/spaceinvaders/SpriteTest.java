package org.fundacionjala.at15.spaceinvaders;
import org.junit.Test;

import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;
import static org.junit.Assert.assertTrue;

public class SpriteTest {
    @Test
    public void itShouldBeVisible() {
        Alien theAlien = new Alien(ALIEN_INIT_X, ALIEN_INIT_Y, ALIEN_WIDTH, ALIEN_HEIGHT);

        assertTrue(theAlien.isVisible());
    }
}
