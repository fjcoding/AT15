package org.fundacionjala.at15.spaceinvaders;
import static org.fundacionjala.at15.spaceinvaders.Constants.Player.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import java.awt.event.KeyEvent;
import org.junit.Test;

public class ShipTest {
    @Test
    public void itShouldHaveAndSetAPosition() {
        Ship theShip = new Ship(START_X, START_Y);
        assertEquals(START_X, theShip.getPosX());
        assertEquals(START_Y, theShip.getPosY());
        theShip.setPosX(50);
        theShip.setPosY(70);
        assertEquals(50, theShip.getPosX());
        assertEquals(70, theShip.getPosY());
    }

    @Test
    public void itShouldMoveUpToLimit() {
        Ship theShip = new Ship(START_X, START_Y);
        int min = 0;
        int max = BOARD_WIDTH;
        assertEquals(100, theShip.moveUptoLimit(100, min, max));
        assertEquals(0, theShip.moveUptoLimit(-1, min, max));
        assertEquals(BOARD_WIDTH, theShip.moveUptoLimit(801, min, max));
    }

    @Test
    public void itShouldMove() {
        Ship theShip = new Ship(START_X, START_Y);
        theShip.setPosX(1);
        theShip.move();
        assertEquals(2, theShip.getPosX());
        theShip.setPosX(771);
        theShip.move();
        assertEquals(BOARD_WIDTH - 2 * DIAMETER, theShip.getPosX());

    }
    @Test
    public void itShouldMovedWhenYouPressAKeyLeft() {

        Ship ship = new Ship(START_X,START_Y);
        Board board = new Board();
        KeyEvent key = new KeyEvent(board, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_LEFT,' ');
        board.getKeyListeners()[0].keyPressed(key);
        ship.keyPressed(key);
        assertEquals(-VELOCITY_X,ship.getVelX());
    }
    @Test
    public void itShouldMovedWhenYouPressAKeyRight() {

        Ship ship = new Ship(START_X,START_Y);
        Board board = new Board();
        KeyEvent key = new KeyEvent(board, KeyEvent.KEY_PRESSED, System.currentTimeMillis(), 0,  KeyEvent.VK_RIGHT,' ');
        board.getKeyListeners()[0].keyPressed(key);
        ship.keyPressed(key);
        assertEquals(+VELOCITY_X,ship.getVelX());
    }
    @Test
    public void itShouldStopWhenYouReleaseTheKey() {

        Ship ship = new Ship(START_X,START_Y);
        Board board = new Board();
        KeyEvent key = new KeyEvent(board, KeyEvent.KEY_RELEASED, System.currentTimeMillis(), 0,  KeyEvent.VK_RIGHT,' ');
        board.getKeyListeners()[0].keyPressed(key);
        ship.keyReleased(key);
        assertEquals(0,ship.getVelX());
        KeyEvent key2 = new KeyEvent(board, KeyEvent.KEY_RELEASED, System.currentTimeMillis(), 0,  KeyEvent.VK_LEFT,' ');
        board.getKeyListeners()[0].keyPressed(key2);
        ship.keyReleased(key2);
        assertEquals(0,ship.getVelX());
    }
}