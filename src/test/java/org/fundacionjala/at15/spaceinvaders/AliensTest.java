package org.fundacionjala.at15.spaceinvaders;
import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;
import static org.junit.Assert.assertEquals;

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
            newPosX[index] = theAliens.getAliens().get(index).getPosX();
        }
        theAliens.moveAliens();
        for (int index = 0; index < ALIEN_ROWS * ALIEN_COLUMNS; index++) {
            assertEquals(newPosX[index] + ALIEN_DELTA_X, theAliens.getAliens().get(index).getPosX());
        }
    }

    @Test
    public void itShouldMoveLeft() {
        Aliens theAliens = new Aliens(ALIEN_ROWS, ALIEN_COLUMNS);
        int[] newPosX = new int[ALIEN_ROWS * ALIEN_COLUMNS];
        for (int index = 0; index < ALIEN_ROWS * ALIEN_COLUMNS; index++) {
            newPosX[index] = theAliens.getAliens().get(index).getPosX();
        }
        theAliens.setAlienDeltaX(-ALIEN_DELTA_X);
        theAliens.moveAliens();
        for (int index = 0; index < ALIEN_ROWS * ALIEN_COLUMNS; index++) {
            assertEquals(newPosX[index] - ALIEN_DELTA_X, theAliens.getAliens().get(index).getPosX());
        }
    }

    @Test
    public void itShouldMoveLeftDown() {
        Aliens theAliens = new Aliens(ALIEN_ROWS, ALIEN_COLUMNS);
        int[] newPosY = new int[ALIEN_ROWS * ALIEN_COLUMNS];
        for (Alien alien : theAliens.getAliens()) {
            alien.setPosX(alien.getPosX() - ALIEN_INIT_X);
        }
        for (int index = 0; index < ALIEN_ROWS * ALIEN_COLUMNS; index++) {
            newPosY[index] = theAliens.getAliens().get(index).getPosY();
        }
        theAliens.setAlienDeltaX(-ALIEN_DELTA_X);
        theAliens.moveAliens();
        for (int index = 0; index < ALIEN_ROWS * ALIEN_COLUMNS; index++) {
            assertEquals(newPosY[index] + ALIEN_SEPARATION, theAliens.getAliens().get(index).getPosY());
        }
    }

    @Test
    public void itShouldMoveRighttDown() {
        Aliens theAliens = new Aliens(ALIEN_ROWS, ALIEN_COLUMNS);
        int[] newPosY = new int[ALIEN_ROWS * ALIEN_COLUMNS];
        for (Alien alien : theAliens.getAliens()) {
            alien.setPosX(alien.getPosX() + BOARD_WIDTH);
        }
        for (int index = 0; index < ALIEN_ROWS * ALIEN_COLUMNS; index++) {
            newPosY[index] = theAliens.getAliens().get(index).getPosY();
        }
        theAliens.setAlienDeltaX(ALIEN_DELTA_X);
        theAliens.moveAliens();
        for (int index = 0; index < ALIEN_ROWS * ALIEN_COLUMNS; index++) {
            assertEquals(newPosY[index] + ALIEN_SEPARATION, theAliens.getAliens().get(index).getPosY());
        }
    }
}
