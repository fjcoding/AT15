package org.fundacionjala.at15.spaceinvaders;
import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Player.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AlienGroupTest {
    @Test
    public void itShouldHaveAliens() {
        AlienGroup aliens = new AlienGroup(ALIEN_ROWS, ALIEN_COLUMNS);

        assertEquals(ALIEN_ROWS * ALIEN_COLUMNS, aliens.getAliens().size());
    }

    @Test
    public void itShouldMoveRight() {
        AlienGroup theAliens = new AlienGroup(ALIEN_ROWS, ALIEN_COLUMNS);
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
        AlienGroup theAliens = new AlienGroup(ALIEN_ROWS, ALIEN_COLUMNS);
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
        AlienGroup theAliens = new AlienGroup(ALIEN_ROWS, ALIEN_COLUMNS);
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
    public void itShouldMoveRightDown() {
        AlienGroup theAliens = new AlienGroup(ALIEN_ROWS, ALIEN_COLUMNS);
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

    @Test
    public void itShouldShoot() {
        AlienGroup theAliens = new AlienGroup(ALIEN_ROWS, ALIEN_COLUMNS);
        for (int index = 0; index < 1000; index++) {
            theAliens.aliensShoot();
        }

        assertTrue(theAliens.getBulletsShooted() > 0);
        assertTrue(theAliens.getBulletsDestroyed() > 0);
    }

    @Test
    public void itShouldGetInvasion() {
        AlienGroup theAliens = new AlienGroup(1, 1);
        theAliens.getAliens().get(0).setPosY(START_Y);
        theAliens.moveAliens();

        assertTrue(theAliens.getInvasion());
    }

    @Test
    public void itShouldHaveDeadAliensAndScore() {
        AlienGroup theAliens = new AlienGroup(1, 2);
        Ship ship = new Ship(START_X, START_Y);
        Gun gun = new Gun(ship);
        gun.getBullet().setPosX(ALIEN_INIT_X);
        gun.getBullet().setPosY(ALIEN_INIT_Y);
        gun.fire();
        theAliens.killAliens(gun);

        assertEquals(1, theAliens.getDeaths());
        assertEquals(10, theAliens.getScores());
    }

    @Test
    public void itShouldNotKillAnAlien() {
        AlienGroup theAliens = new AlienGroup(1, 2);
        Ship ship = new Ship(START_X, START_Y);
        Gun gun = new Gun(ship);
        gun.fire();
        theAliens.killAliens(gun);

        assertEquals(0, theAliens.getDeaths());
        assertEquals(0, theAliens.getScores());
    }

    @Test
    public void shouldKillShipAndDestroyBomb() {
        AlienGroup theAliens = new AlienGroup(1,1);
        Ship ship = new Ship(START_X, START_Y);
        Bomb bomb = new Bomb(START_X, START_Y, true);
        for (Alien alien : theAliens.getAliens()) {
            bomb.fire();
            alien.getBomb().setPosX(START_X);
            alien.getBomb().setPosY(START_Y);
        }
        theAliens.killShip(ship);
        assertTrue(ship.isDying());
    }
}
