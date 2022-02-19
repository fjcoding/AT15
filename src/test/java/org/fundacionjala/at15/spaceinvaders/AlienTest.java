package org.fundacionjala.at15.spaceinvaders;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlienTest {
    @Test
    public void itShouldHaveAPosition() {
        int posX = Commons.ALIEN_INIT_X;
        int posY = Commons.ALIEN_INIT_Y;
        
        Alien theAlien = new Alien(posX, posY);

        assertEquals(Commons.ALIEN_INIT_X, theAlien.getPosX());
        assertEquals(Commons.ALIEN_INIT_Y, theAlien.getPosY());
    }
}