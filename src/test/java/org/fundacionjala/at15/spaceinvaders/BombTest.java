package org.fundacionjala.at15.spaceinvaders;

import static org.fundacionjala.at15.spaceinvaders.Constants.Bullet.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class BombTest {

    @Test
    public void itShouldHavePositionXAndPosY() {
        int posX = 10;
        int posY = 10;
        boolean fired = false;
        Bomb bomb = new Bomb(posX, posY, fired);
        assertEquals(posX, bomb.getPosX());
        assertEquals(posY, bomb.getPosY());
    }

    @Test
    public void bombShouldExist() {
        Bomb bomb = new Bomb(10, 10, true);
        assertTrue(bomb.bombStatus());
    }

    @Test
    public void itShouldChangePosition() {
        int posX = 10;
        int posY = 10;
        boolean fired = true;
        Bomb bomb = new Bomb(posX, posY, fired);
        bomb.setPosX(posX * 2);
        bomb.setPosY(posX * 2);
        assertEquals(posX * 2, bomb.getPosX());
        assertEquals(posY * 2, bomb.getPosY());
    }

    @Test
    public void itShouldDestroyTheBomb() {
        Bomb bomb = new Bomb(10, 10, true);
        bomb.destroyed();
        assertFalse(bomb.bombStatus());
    }

    @Test
    public void itShouldSetTheStateOfTheBombToFalse() {
        Bomb bomb = new Bomb(10, 10, false);
        bomb.move();
        assertFalse(bomb.bombStatus());
    }

    @Test
    public void itShouldMoveTheBomb() {
        Bomb bomb = new Bomb(10, 500, true);
        bomb.move();
        assertEquals(505 - SPEED, bomb.getPosY());


    }
    @Test
    public void itShouldSetTheStateOfTheBulletToFalse() {
        Bomb bomb = new Bomb(10, 500, false);

        bomb.move();
        assertEquals(false, bomb.bombStatus());
    }
    @Test
    public void itShouldMoveTheBullet() {
        int posX = 10;
        int posY = 500;
        boolean fired = true;
        Bullet bullet = new Bullet(posX, posY, fired);
        bullet.move();
        assertEquals(posY - SPEED, bullet.getPosY());
    }
    @Test
    public void itShouldDestroyTheBombWhenArriveToEndOfTheBoard() {
        Bomb bomb = new Bomb(10, 0, true);
        bomb.move();
        assertEquals(false, bomb.bombStatus());


    }
}