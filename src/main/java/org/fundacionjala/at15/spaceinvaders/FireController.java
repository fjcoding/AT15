package org.fundacionjala.at15.spaceinvaders;

import java.util.List;
import java.util.Random;
import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Bullet.*;

public class FireController {
    private AlienGroup alienGroup;
    private int bulletsShooted;
    private int bulletsDestroyed;

    public FireController(AlienGroup alienGroup) {
        this.alienGroup = alienGroup;
        this.bulletsDestroyed = 0;
        this.bulletsShooted = 0;
    }

    public void aliensStartFire() {
        List<Alien> aliens = alienGroup.getAliens();
        Random generator = new Random();
        for (Alien alien : aliens) {
            int shot = generator.nextInt(ALIEN_RANGE_OF_PROBABILITY);
            Bomb bomb = alien.getBomb();

            if(shot == ALIEN_CHANCE) {
                startFire(alien, bomb);
            }
            bombForward(bomb);
        }
    }

    private void startFire(Alien alien, Bomb bomb) {
        if (!bomb.bombStatus()) {
            bomb.fire();
            bomb.setPosX(alien.getPosX());
            bomb.setPosY(alien.getPosY());
            bulletsShooted++;
        }
    }

    private void bombForward(Bomb bomb) {
        if (bomb.bombStatus()) {
            bomb.setPosY(bomb.getPosY() + ALIEN_BULLET_SPEED);
            if (bomb.getPosY() >= BOARD_HEIGHT - BULLET_HEIGHT) {
                bomb.destroyed();
                bulletsDestroyed++;
            }
        }
    }

    public int getBulletsDestroyed() {
        return bulletsDestroyed;
    }

    public int getBulletsShooted() {
        return bulletsShooted;
    }
}