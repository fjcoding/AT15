package org.fundacionjala.at15.spaceinvaders;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import static org.fundacionjala.at15.spaceinvaders.Constants.Player.*;
public class GunTest {

    @Test
    public void itShouldShooted() throws AWTException {
        //Robot robot = new Robot();
        //robot.keyPress(KeyEvent.VK_SPACE);
        //Bullet bullet = new Bullet(START_X, START_Y, true);
        Ship ship = new Ship();
        Gun gun = new Gun(ship);

        assertEquals(false,gun.shooted());

        gun.fire();
        gun.move();

        assertEquals(535, gun.getPosYBullet());

    }

}
