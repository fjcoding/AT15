package org.fundacionjala.at15.spaceinvaders;
import static org.junit.Assert.assertEquals;
import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;

import org.junit.Test;

public class AlienTest {
    @Test
    public void itShouldHaveAPositionWidthHeightAndDeltaX() {
        Alien theAlien = new Alien(ALIEN_INIT_X, ALIEN_INIT_Y, ALIEN_WIDTH, ALIEN_HEIGHT);

        assertEquals(ALIEN_INIT_X, theAlien.getPosX());
        assertEquals(ALIEN_INIT_Y, theAlien.getPosY());
        assertEquals(ALIEN_WIDTH, theAlien.getWidth());
        assertEquals(ALIEN_HEIGHT, theAlien.getHeight());
        assertEquals(ALIEN_DELTA_X, theAlien.getDeltaX());

        theAlien.setDeltaX(10000);

        assertEquals(10000, theAlien.getDeltaX());
    }

    @Test
    public void itShouldMove() {
        Alien theAlien = new Alien(ALIEN_INIT_X, ALIEN_INIT_Y, ALIEN_WIDTH, ALIEN_HEIGHT);
        theAlien.moveX();

        assertEquals(ALIEN_INIT_X + ALIEN_DELTA_X, theAlien.getPosX());
    }
}