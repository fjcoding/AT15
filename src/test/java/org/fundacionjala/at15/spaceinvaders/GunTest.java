package org.fundacionjala.at15.spaceinvaders;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class GunTest {
    @Test
    public void itShouldShooted() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_SPACE);

        Ship ship = new Ship();
        Gun gun = new Gun(ship);


        //assertEquals(true,gun.shooted());


    }
}
