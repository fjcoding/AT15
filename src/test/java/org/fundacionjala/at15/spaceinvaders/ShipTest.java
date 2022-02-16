package org.fundacionjala.at15.spaceinvaders;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShipTest {

    @Test
    public void itShouldHaveAPositionAndLife() {
        float positionX = 20;
        float positionY = 20;
        int life = 1;
        Ship theShip = new Ship(life, positionX, positionY);

        assertEquals(life, theShip.getLife());
        assertEquals(positionX, theShip.getPosX(), 0);
        assertEquals(positionY, theShip.getPosY(), 0);
    }
}
