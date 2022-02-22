package org.fundacionjala.at15.spaceinvaders;
import static org.fundacionjala.at15.spaceinvaders.Constants.Player.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;
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
        int max = 800;
        assertEquals(100, theShip.moveUptoLimit(100, min, max));
        assertEquals(0, theShip.moveUptoLimit(-1, min, max));
        assertEquals(800, theShip.moveUptoLimit(801, min, max));
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
}