package org.fundacionjala.at15.spaceinvaders;
import static org.fundacionjala.at15.spaceinvaders.Constants.Bullet.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Player.*;

public class Bullet extends Sprite {
    private boolean fired = false;

    public Bullet(int posx, int posy, boolean fired) {
        this.posX = posx;
        this.posY = posy;
        this.fired = fired;
    }

    public void fire() {
        this.fired = true;
    }

    public void destroyed() {
        this.posY = START_Y;
        this.fired = false;
    }

    public void move() {
        if (fired) {
            if (getPosY() <= 0) {
                setPosY(START_Y);
                destroyed();
            } else {
                posY -= SPEED;

            }
        } else {
            fired = false;
        }
    }

    public boolean bulletStatus() {
        return fired;
    }
}
