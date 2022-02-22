package org.fundacionjala.at15.spaceinvaders;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BulletTest {
    @Test
    public void itShouldHavePosXPosY() {
        int posX = 10;
        int posY = 10;
        boolean fired = false;
        Bullet bullet = new Bullet(posX, posY, fired);
        //assertEquals(posX, bullet.getPosx());
        assertEquals(posY, bullet.getPosY());
    }
    @Test
    public void itShouldExistBullet() {
        int posX = 10;
        int posY = 10;
        boolean fired = true;
        Bullet bullet = new Bullet(posX, posY, fired);
        assertEquals(true, bullet.bulletStatus());
    }
    @Test
    public void itShouldChangePositionOfBullet() {
        int posX = 10;
        int posY = 10;
        int newPosx = 20;
        int newPosy = 20;
        boolean fired = true;
        Bullet bullet = new Bullet(posX, posY, fired);
        bullet.setPosX(newPosx);
        bullet.setPosY(newPosy);
        assertEquals(20, bullet.getPosX());
        assertEquals(20, bullet.getPosY());
    }
    @Test
    public void itShouldShoot() {
        int posX = 10;
        int posY = 10;
        boolean fired = false;
        Bullet bullet = new Bullet(posX, posY, fired);
        bullet.fire();
        assertEquals(true, bullet.bulletStatus());
    }
    @Test
    public void itShouldDestroyTheBullet() {
        int posX = 10;
        int posY = 10;
        boolean fired = true;
        Bullet bullet = new Bullet(posX, posY, fired);
        bullet.destroyed();
        assertEquals(false, bullet.bulletStatus());
    }
    @Test
    public void itShouldMoveTheBullet() {
        int posX = 10;
        int posY = 500;
        boolean fired = true;
        Bullet bullet = new Bullet(posX, posY, fired);
        bullet.move();
        assertEquals(490, bullet.getPosY());

    }
    @Test
    public void itShouldDestroyTheBulletWhenArrivedToEndOfTheBoard() {
        int posX = 10;
        int posY = 0;
        boolean fired = true;
        Bullet bullet = new Bullet(posX, posY, fired);
        bullet.move();
        assertEquals(false, bullet.bulletStatus());
    }
}
