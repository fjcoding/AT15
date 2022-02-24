package org.fundacionjala.at15.spaceinvaders;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.awt.event.KeyEvent;
import static org.fundacionjala.at15.spaceinvaders.Constants.Player.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Bullet.*;

public class GunTest {

    @Test
    public void itShouldShooted() {
        Ship ship = new Ship(START_X,START_Y);
        Gun gun = new Gun(ship);
        assertEquals(false,gun.shooted());
    }
    @Test
    public void itShouldMoveTheBullet() {
        Ship ship = new Ship(START_X,START_Y);
        Gun gun = new Gun(ship);
        gun.fire();
        gun.move();
        assertEquals(START_Y - SPEED, gun.getPosYBullet());
    }
    @Test
    public void itShouldshooted() {

        Ship ship = new Ship(START_X,START_Y);
        Gun gun = new Gun(ship);
        Board board = new Board();
        KeyEvent key = new KeyEvent(board, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_SPACE,' ');
        board.getKeyListeners()[0].keyPressed(key);
        gun.keyPressed(key);
        assertEquals(true,gun.shooted());
    }
    @Test
    public void itShouldReturnPosXAndPosYOfBullet() {
        Ship ship = new Ship(START_X,START_Y);
        Gun gun = new Gun(ship);

        assertEquals(START_Y,gun.getPosYBullet());
        assertEquals(START_X,gun.getPosXBullet());
    }
    @Test
    public void itShouldNotshootedWithAnotherKey() {

        Ship ship = new Ship(START_X,START_Y);
        Gun gun = new Gun(ship);
        Board board = new Board();
        KeyEvent key = new KeyEvent(board, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_0,' ');
        board.getKeyListeners()[0].keyPressed(key);
        gun.keyPressed(key);
        assertEquals(false,gun.shooted());
    }
    @Test
    public void itShouldNotShootedIfTheBulletExist() {

        Ship ship = new Ship(START_X,START_Y);
        Gun gun = new Gun(ship);
        Board board = new Board();
        KeyEvent key = new KeyEvent(board, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_SPACE,' ');
        board.getKeyListeners()[0].keyPressed(key);
        gun.fire();
        gun.keyPressed(key);
        assertEquals(true,gun.shooted());
    }
    @Test
    public void itShoulDestroyBullet() {
        Ship ship = new Ship(START_X,START_Y);
        Gun gun = new Gun(ship);
        gun.destroy();
        assertEquals(false,gun.shooted());
    }
}
