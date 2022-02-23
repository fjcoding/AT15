package org.fundacionjala.at15.spaceinvaders;
import static org.junit.Assert.assertEquals;
import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;

import org.junit.Test;

public class AlienTest {
    @Test
    public void itShouldHaveAPositionWidthAndHeight() {
        Alien theAlien = new Alien(ALIEN_INIT_X, ALIEN_INIT_Y, ALIEN_WIDTH, ALIEN_HEIGHT);

        assertEquals(ALIEN_INIT_X, theAlien.getPosX());
        assertEquals(ALIEN_INIT_Y, theAlien.getPosY());
        assertEquals(ALIEN_WIDTH, theAlien.getWidth());
        assertEquals(ALIEN_HEIGHT, theAlien.getHeight());
    }

    @Test
    public void itShouldMove() {
        Alien theAlien = new Alien(ALIEN_INIT_X, ALIEN_INIT_Y, ALIEN_WIDTH, ALIEN_HEIGHT);
        theAlien.moveX(ALIEN_DELTA_X);

        assertEquals(ALIEN_INIT_X + ALIEN_DELTA_X, theAlien.getPosX());
    }

    @Test
    public void itShouldHaveABullet() {
        Alien theAlien = new Alien(ALIEN_INIT_X, ALIEN_INIT_Y, ALIEN_WIDTH, ALIEN_HEIGHT);

        assertEquals(ALIEN_INIT_X, theAlien.getBullet().getPosX());
        assertEquals(ALIEN_INIT_Y, theAlien.getBullet().getPosY());

        Bullet bullet = new Bullet(0, 0, false);
        theAlien.setBullet(bullet);

        assertEquals(0, theAlien.getBullet().getPosX());
        assertEquals(0, theAlien.getBullet().getPosY());
    }
}