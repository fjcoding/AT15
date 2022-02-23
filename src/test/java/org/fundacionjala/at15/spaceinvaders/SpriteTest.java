package org.fundacionjala.at15.spaceinvaders;
import org.junit.Test;

import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Player.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.swing.*;

public class SpriteTest {
    @Test
    public void itShouldBeVisible() {
        Alien theAlien = new Alien(ALIEN_INIT_X, ALIEN_INIT_Y, ALIEN_WIDTH, ALIEN_HEIGHT);
        assertTrue(theAlien.isVisible());
        theAlien.setVisible(false);
        assertFalse(theAlien.isVisible());
    }

    @Test
    public void dieTest() {
        Ship ship = new Ship(START_X, START_Y);
        ship.setDying(true);
        assertTrue(ship.isDying());
        ship.die();
        assertFalse(ship.isVisible());
    }

    @Test
    public void imageTest() {
        Ship ship = new Ship(START_X, START_Y);
        String shipImage = "src/main/resources/spaceinvaders/player.png";
        ImageIcon imageIcon = new ImageIcon(shipImage);
        ship.setImage(imageIcon.getImage());
        assertEquals(imageIcon.getImage(), ship.getImage());
    }
}
