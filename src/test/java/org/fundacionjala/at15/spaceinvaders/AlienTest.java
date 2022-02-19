package org.fundacionjala.at15.spaceinvaders;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlienTest {
    @Test
    public void itShouldHaveAPositionWidthAndHeight() {
        int posX = Commons.ALIEN_INIT_X;
        int posY = Commons.ALIEN_INIT_Y;
        int width = Commons.ALIEN_WIDTH;
        int height = Commons.ALIEN_HEIGHT;
        
        Alien theAlien = new Alien(posX, posY, width, height);

        assertEquals(Commons.ALIEN_INIT_X, theAlien.getPosX());
        assertEquals(Commons.ALIEN_INIT_Y, theAlien.getPosY());
        assertEquals(Commons.ALIEN_WIDTH, theAlien.getWidth());
        assertEquals(Commons.ALIEN_HEIGHT, theAlien.getHeight());
    }
}