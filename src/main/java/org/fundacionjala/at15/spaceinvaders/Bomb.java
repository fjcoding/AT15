package org.fundacionjala.at15.spaceinvaders;

import static org.fundacionjala.at15.spaceinvaders.Constants.Player.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;

public class Bomb extends Sprite {
    private boolean fired = false;

    public Bomb(int posX, int posY, boolean fired) {
        this.posX = posX;
        this.posY = posY;
        this.fired = fired;
    }

    public void fire() {
        this.fired = true;
    }

    public void destroyed() {
        this.fired = false;
    }

    public void move() {
        if (fired) {
            if (getPosY() <= 0) {
                setPosY(START_Y);
                destroyed();
            } else {
                posY -= ALIEN_BULLET_SPEED;
            }
        } else {
            fired = false;
        }
    }

    public boolean bombStatus() {
        return fired;
    }
}
