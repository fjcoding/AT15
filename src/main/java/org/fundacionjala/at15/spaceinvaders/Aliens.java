package org.fundacionjala.at15.spaceinvaders;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.awt.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Bullet.*;

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

    public void aliensShoot() {
        Random generator = new Random();
        for (Alien alien : aliens) {
            int shot = generator.nextInt(ALIEN_RANGE_OF_PROBABILITY);
            Alien.Bomb bomb = alien.getBomb();

            if (shot == ALIEN_CHANCE && !bomb.bombStatus()) {
                bomb.fire();
                bomb.setPosX(alien.getPosX());
                bomb.setPosY(alien.getPosY());
            }

            if (bomb.bombStatus()) {
                bomb.setPosY(bomb.getPosY() + ALIEN_BULLET_SPEED);
                if (bomb.getPosY() >= BOARD_HEIGHT - BULLET_HEIGHT) {
                    bomb.destroyed();
                }
            }
        }
    }

    public void paint(Graphics graphic) {
        graphic.setColor(Color.CYAN);

        for (Alien alien : aliens) {
            Alien.Bomb bomb = alien.getBomb();

            if (bomb.bombStatus()) {
                graphic.fillRect(bomb.getPosX(), bomb.getPosY(), BULLET_WIDTH, BULLET_HEIGHT);
            }
        }
    }
}
