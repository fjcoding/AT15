package org.fundacionjala.at15.spaceinvaders;

import java.util.List;
import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Player.*;

public class DeadController {
    private AlienGroup alienGroup;
    private int deaths;
    private int scores;

    public DeadController(AlienGroup alienGroup) {
        this.alienGroup = alienGroup;
        deaths = 0;
        scores = 0;
    }

    public void killAliens(Gun gun) {
        List<Alien> aliens = alienGroup.getAliens();
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
        List<Alien> aliens = alienGroup.getAliens();
        for (Alien alien : aliens) {
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

    public int getDeaths() {
        return this.deaths;
    }

    public void setDeaths(int param) {
        this.deaths = param;
    }

    public int getScores() {
        return scores;
    }
}
