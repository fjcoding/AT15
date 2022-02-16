package org.fundacionjala.at15.spaceinvaders;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.spaceinvaders.alvaro.Bullet;
import org.junit.Test;

public class BulletTest {
    @Test
    public void itshouldhavePosXPosYSpeed() {
        int posX = 10;
        int posY = 10;
        int speed = 5;
        boolean fired = false;
        Bullet bullet = new Bullet(posX, posY, speed, fired);
        assertEquals(posX, bullet.getPosx());
        assertEquals(posY, bullet.getPosy());
        assertEquals(speed, bullet.getSpeed());
        assertEquals(expected, actual);

    }
}
