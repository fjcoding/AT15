package org.fundacionjala.at15.spaceinvaders;
import static org.fundacionjala.at15.spaceinvaders.Constants.Player.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShipTest {
<<<<<<< HEAD
/*
    @Test
=======

    /*@Test
>>>>>>> dev/spaceinvaders
    public void itShouldHaveAPositionAndLife() {
        int life = 1;
        Ship theShip = new Ship(life);

        assertEquals(life, theShip.getLife());
<<<<<<< HEAD
        assertEquals(Commons.START_X, theShip.getPosX(), 0);
        assertEquals(Commons.START_Y, theShip.getPosY(), 0);
    }

    @Test
    public void itShouldSetAPositionAndLife() {
        float positionX = 20;
        float positionY = 20;
        int life = 1;
        Ship theShip = new Ship(life, positionX, positionY);
        theShip.setLife(7);
        int randomLifeValue = 7;
        theShip.setPosX(70);
        int randomPosXValue = 70;
        theShip.setPosY(80);
        int randomPosYValue = 80;

        assertEquals(randomLifeValue, theShip.getLife());
        assertEquals(randomPosXValue, theShip.getPosX(), 0);
        assertEquals(randomPosYValue, theShip.getPosY(), 0);
    }

    @Test
    public void itShouldReturnMaxAndMinValue() {
        float positionX = 20;
        float positionY = 20;
        int life = 1;
        Ship theShip = new Ship(life, positionX, positionY);
        float min = 0;
        float max = 1000;
        float value = 1001;
        assertEquals(max, theShip.moveUptoLimit(value, min, max), 0);
        value = -1;
        assertEquals(min, theShip.moveUptoLimit(value, min, max), 0);
        value = 500;
        assertEquals(500, theShip.moveUptoLimit(value, min, max), 0);
    }

    @Test
    public void itShouldMove() {
        float positionX = 100;
        float positionY = 100;
        int life = 1;
        long oldTime = System.nanoTime();
        long newTime = System.nanoTime();
        float deltaTime = (newTime - oldTime) / 1000000000f;
        Ship theShip = new Ship(life, positionX, positionY);

        theShip.movement(deltaTime);
        assertEquals(101, theShip.getPosX(), 1000000000f);

        theShip.setLeft(true);
        theShip.movement(deltaTime);
        assertEquals(100, theShip.getPosX(), 1000000000f);

        theShip.setRight(true);
        theShip.movement(deltaTime);
        assertEquals(101, theShip.getPosX(), 1000000000f);
=======
        assertEquals(START_X, theShip.getPosX(), 0);
        assertEquals(START_Y, theShip.getPosY(), 0);
>>>>>>> dev/spaceinvaders
    }*/
}
