package org.fundacionjala.at15.spaceinvaders;
import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;
import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class AliensTest {
    @Test
    public void itShouldHaveAliens() {
        Aliens aliens = new Aliens(ALIEN_ROWS, ALIEN_COLUMNS);

        assertEquals(ALIEN_ROWS * ALIEN_COLUMNS, aliens.getAliens().size());
    }

    @Test
    public void itShouldMoveRight() {
        Aliens theAliens = new Aliens(ALIEN_ROWS, ALIEN_COLUMNS);
        int[] newPosX = new int[ALIEN_ROWS * ALIEN_COLUMNS];
        for (int index = 0; index < ALIEN_ROWS * ALIEN_COLUMNS; index++) {
            newPosX[index] = theAliens.getAliens().get(0).getPosX();
        }
        theAliens.moveAliens();
        for (int index = 0; index < ALIEN_ROWS * ALIEN_COLUMNS; index++) {
            assertEquals(newPosX[index] + ALIEN_DELTA_X, theAliens.getAliens().get(0).getPosX());
        }
    }

    @Test
    public void itShouldMoveLeft() {
        Aliens theAliens = new Aliens(ALIEN_ROWS, ALIEN_COLUMNS);
        int[] newPosX = new int[ALIEN_ROWS * ALIEN_COLUMNS];
        for (int index = 0; index < ALIEN_ROWS * ALIEN_COLUMNS; index++) {
            newPosX[index] = theAliens.getAliens().get(0).getPosX();
        }
        theAliens.setAlienDeltaX(-ALIEN_DELTA_X);
        theAliens.moveAliens();
        for (int index = 0; index < ALIEN_ROWS * ALIEN_COLUMNS; index++) {
            assertEquals(newPosX[index] - ALIEN_DELTA_X, theAliens.getAliens().get(0).getPosX());
        }
    }
}
