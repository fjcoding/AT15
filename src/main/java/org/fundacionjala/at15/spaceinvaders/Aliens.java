package org.fundacionjala.at15.spaceinvaders;

import java.util.List;
import java.util.ArrayList;
import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;

public class Aliens {
    private List<Alien> aliens;
    private int alienDeltaX = ALIEN_DELTA_X;

    public Aliens(int alienRows, int alienColumns) {
        aliens = new ArrayList<>();
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
            if (posX == 0 && this.alienDeltaX == -ALIEN_DELTA_X) {
                this.alienDeltaX = ALIEN_DELTA_X;
                List<Alien> aliens2 = aliens;
                for (Alien alien2 : aliens2) {
                    alien2.setPosY(alien2.getPosY() + ALIEN_SEPARATION);
                }
            }
            if (posX == BOARD_WIDTH - ALIEN_WIDTH && this.alienDeltaX == ALIEN_DELTA_X) {
                this.alienDeltaX = -ALIEN_DELTA_X;
                List<Alien> aliens2 = aliens;
                for (Alien alien2 : aliens2) {
                    alien2.setPosY(alien2.getPosY() + ALIEN_SEPARATION);
                }
            }
            alien.moveX(this.alienDeltaX);
        }
    }
}
