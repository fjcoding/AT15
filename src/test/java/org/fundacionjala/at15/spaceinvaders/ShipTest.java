package org.fundacionjala.at15.spaceinvaders;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShipTest {

    @Test
    public void itShouldHaveAPositionAndLife() {
        int positionX = 20;
        int positionY = 20;
        int life = 1;
        Ship theShip = new Ship(life, positionX, positionY);

        assertEquals(life, theShip.getLife());
        assertEquals(positionX, theShip.getPosX());
        assertEquals(positionY, theShip.getPosY());
    }
}
