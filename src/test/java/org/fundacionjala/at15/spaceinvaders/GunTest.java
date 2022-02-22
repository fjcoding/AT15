package org.fundacionjala.at15.spaceinvaders;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
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
}
