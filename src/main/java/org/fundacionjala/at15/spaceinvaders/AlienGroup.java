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

    public AlienGroup(int alienRows, int alienColumns) {
        invasion = false;
        aliens = new ArrayList<>();
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

    public List<Alien> getAliens() {
        return this.aliens;
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


}
