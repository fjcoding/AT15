package org.fundacionjala.at15.spaceinvaders;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Bullet.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Player.*;

public class Aliens {
    private List<Alien> aliens;
    private int alienDeltaX = ALIEN_DELTA_X;
    private int bulletsShooted;
    private int bulletsDestroyed;
    private boolean invasion;
    private int deaths;
    private int scores;

    public Aliens(int alienRows, int alienColumns) {
        invasion = false;
        aliens = new ArrayList<>();
        bulletsShooted = 0;
        bulletsDestroyed = 0;
        deaths = 0;
        scores = 0;
        for (int yIndex = 0; yIndex < alienRows; yIndex++) {
            for (int xIndex = 0; xIndex < alienColumns; xIndex++) {
                Alien alien = new Alien(
                        ALIEN_INIT_X + ALIEN_SEPARATION * xIndex,
                        ALIEN_INIT_Y + ALIEN_SEPARATION * yIndex, ALIEN_WIDTH, ALIEN_HEIGHT);
                this.aliens.add(alien);
            }
        }
    }

    public List<Alien> getAliens() {
        return this.aliens;
    }

    public void moveAliens() {
        for (Alien alien : this.aliens) {
            int posX = alien.getPosX();
            if (posX <= 0 && this.alienDeltaX == -ALIEN_DELTA_X) {
                this.alienDeltaX = ALIEN_DELTA_X;
                List<Alien> aliens2 = aliens;
                for (Alien alien2 : aliens2) {
                    alien2.setPosY(alien2.getPosY() + ALIEN_SEPARATION);
                }
            }
            if (posX >= BOARD_WIDTH - ALIEN_WIDTH - ALIEN_WIDTH && this.alienDeltaX == ALIEN_DELTA_X) {
                this.alienDeltaX = -ALIEN_DELTA_X;
                List<Alien> aliens2 = aliens;
                for (Alien alien2 : aliens2) {
                    alien2.setPosY(alien2.getPosY() + ALIEN_SEPARATION);
                }
            }
            if (alien.getPosY() >= START_Y) {
                invasion = true;
            }
            alien.moveX(this.alienDeltaX);
        }
    }

    public void aliensShoot() {
        Random generator = new Random();
        for (Alien alien : aliens) {
            int shot = generator.nextInt(ALIEN_RANGE_OF_PROBABILITY);
            Bomb bomb = alien.getBomb();
            bombStatus(shot, bomb, alien);

        }
    }

    public void bombStatus(int shot, Bomb bomb, Alien alien) {
        if (shot == ALIEN_CHANCE && !bomb.bombStatus()) {
            bomb.fire();
            bomb.setPosX(alien.getPosX());
            bomb.setPosY(alien.getPosY());
            bulletsShooted++;
        }

        if (bomb.bombStatus()) {
            bomb.setPosY(bomb.getPosY() + ALIEN_BULLET_SPEED);
            if (bomb.getPosY() >= BOARD_HEIGHT - BULLET_HEIGHT) {
                bomb.destroyed();
                bulletsDestroyed++;
            }
        }
    }

    public void killAliens(Gun gun) {
        for (int index = 0; index < aliens.size(); index++) {
            int shotY = gun.getPosYBullet();
            int shotX = gun.getPosXBullet();
            int alienX = aliens.get(index).getPosX();
            int alienY = aliens.get(index).getPosY();
            alienDead(shotY, shotX, alienX, alienY, index, gun);
        }
    }

    public void alienDead(int shotY, int shotX, int alienX, int alienY, int index, Gun gun) {
        if (!aliens.get(index).isDying() && gun.shooted()) {
            if (shotX >= (alienX)
                    && shotX <= (alienX + ALIEN_WIDTH)
                    && shotY >= (alienY)
                    && shotY <= (alienY + ALIEN_HEIGHT)) {
                aliens.get(index).setDying(true);
                aliens.remove(index);
                gun.destroy();
                deaths++;
                scores = TEN * deaths;
            }
        }
    }

    public void killShip(Ship ship) {
        for (Alien alien : this.aliens) {
            int bombX = alien.getBomb().getPosX();
            int bombY = alien.getBomb().getPosY();
            int playerX = ship.getPosX();
            int playerY = ship.getPosY();

            shipIsVisible(bombX, bombY, playerX, playerY, ship, alien);
        }
    }

    public void shipIsVisible(int bombX, int bombY, int playerX, int playerY, Ship ship, Alien alien) {
        if (ship.isVisible()) {
            if (bombX >= (playerX)
                    && bombX <= (playerX + PLAYER_WIDTH)
                    && bombY >= (playerY)
                    && bombY <= (playerY + PLAYER_HEIGHT)) {
                ship.setDying(true);
                alien.getBomb().destroyed();
            }
        }
    }

    public void setAlienDeltaX(int param) {
        this.alienDeltaX = param;
    }

    public int getBulletsShooted() {
        return this.bulletsShooted;
    }

    public int getBulletsDestroyed() {
        return this.bulletsDestroyed;
    }

    public boolean getInvasion() {
        return this.invasion;
    }

    public void setInvasion(boolean param) {
        this.invasion = param;
    }

    public int getDeaths() {
        return this.deaths;
    }

    public void setDeaths(int param) {
        this.deaths = param;
    }

    public int getScores() {
        return this.scores;
    }
}
