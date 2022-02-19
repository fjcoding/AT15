package org.fundacionjala.at15.spaceinvaders;
import static org.junit.Assert.assertEquals;
import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;

import org.junit.Test;

public class AlienTest {
    @Test
    public void itShouldHaveAPositionWidthAndHeight() {
        int posX = ALIEN_INIT_X;
        int posY = ALIEN_INIT_Y;
        int width = ALIEN_WIDTH;
        int height = ALIEN_HEIGHT;
        
        Alien theAlien = new Alien(posX, posY, width, height);

        assertEquals(ALIEN_INIT_X, theAlien.getPosX());
        assertEquals(ALIEN_INIT_Y, theAlien.getPosY());
        assertEquals(ALIEN_WIDTH, theAlien.getWidth());
        assertEquals(ALIEN_HEIGHT, theAlien.getHeight());
    }
}