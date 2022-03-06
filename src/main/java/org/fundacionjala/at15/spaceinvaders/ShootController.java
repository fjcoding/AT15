package org.fundacionjala.at15.spaceinvaders;

import java.util.Random;
import static org.fundacionjala.at15.spaceinvaders.Constants.Bullet.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;

public class ShootController {
    private Aliens aliens;

    public ShootController(Aliens aliens) {
        this.aliens = aliens;
    }


    public void aliensShoot() {
        Random generator = new Random();
        for (Alien alien : aliens.getAliens()) {
            int shot = generator.nextInt(ALIEN_RANGE_OF_PROBABILITY);
            Bomb bomb = alien.getBomb();

            if (shot == ALIEN_CHANCE && !bomb.bombStatus()) {
                bomb.fire();
                bomb.setPosX(alien.getPosX());
                bomb.setPosY(alien.getPosY());
                aliens.setBulletShooted(aliens.getBulletsShooted() + 1);
            }

            if (bomb.bombStatus()) {
                bomb.setPosY(bomb.getPosY() + ALIEN_BULLET_SPEED);
                if (bomb.getPosY() >= BOARD_HEIGHT - BULLET_HEIGHT) {
                    bomb.destroyed();
                    aliens.setBulletsDestroyed(aliens.getBulletsDestroyed() + 1);
                }
            }
        }
    }

}
