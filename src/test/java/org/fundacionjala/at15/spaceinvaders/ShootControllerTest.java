package org.fundacionjala.at15.spaceinvaders;
import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ShootControllerTest {
    @Test
    public void itShouldShoot() {
        Aliens theAliens = new Aliens(ALIEN_ROWS, ALIEN_COLUMNS);
        ShootController theControl = new ShootController(theAliens);
        for (int index = 0; index < 1000; index++) {
            theControl.aliensShoot();
        }

        assertTrue(theAliens.getBulletsShooted() > 0);
        assertTrue(theAliens.getBulletsDestroyed() > 0);
    }

}
