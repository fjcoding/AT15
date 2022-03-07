package org.fundacionjala.at15.spaceinvaders;

import java.util.List;
import java.util.ArrayList;
import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Player.*;

public class AlienGroup {
    private List<Alien> aliens;
    private int alienDeltaX = ALIEN_DELTA_X;
    private boolean invasion;
    private int deaths;
    private int scores;

    public AlienGroup(int alienRows, int alienColumns) {
        invasion = false;
        aliens = new ArrayList<>();
        deaths = 0;
        scores = 0;
        initializeAliens(alienRows, alienColumns);
    }

    private void initializeAliens(int alienRows, int alienColumns) {
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
            moveLeft(alien);
            moveRight(alien);

            if (alien.getPosY() >= START_Y) {
                invasion = true;
            }
            alien.moveX(this.alienDeltaX);
        }
    }

    private void moveLeft(Alien alien) {
        int posX = alien.getPosX();
        if (posX >= BOARD_WIDTH - ALIEN_WIDTH - ALIEN_WIDTH && this.alienDeltaX == ALIEN_DELTA_X) {
            this.alienDeltaX = -ALIEN_DELTA_X;
            List<Alien> aliens2 = aliens;
            for (Alien alien2 : aliens2) {
                alien2.setPosY(alien2.getPosY() + ALIEN_SEPARATION);
            }
        }
    }

    private void moveRight(Alien alien) {
        int posX = alien.getPosX();
        if (posX <= 0 && this.alienDeltaX == -ALIEN_DELTA_X) {
            this.alienDeltaX = ALIEN_DELTA_X;
            List<Alien> aliens2 = aliens;
            for (Alien alien2 : aliens2) {
                alien2.setPosY(alien2.getPosY() + ALIEN_SEPARATION);
            }
        }
    }

    public void killAliens(Gun gun) {
        for (int index = 0; index < aliens.size(); index++) {
            int shotY = gun.getPosYBullet();
            int shotX = gun.getPosXBullet();
            int alienX = aliens.get(index).getPosX();
            int alienY = aliens.get(index).getPosY();
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
    }

    public void killShip(Ship ship) {
        for (Alien alien : this.aliens) {
            int bombX = alien.getBomb().getPosX();
            int bombY = alien.getBomb().getPosY();
            int playerX = ship.getPosX();
            int playerY = ship.getPosY();

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
    }

    public void setAlienDeltaX(int param) {
        this.alienDeltaX = param;
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
