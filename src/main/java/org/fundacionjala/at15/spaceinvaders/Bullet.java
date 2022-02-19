package org.fundacionjala.at15.spaceinvaders;
import static org.fundacionjala.at15.spaceinvaders.Constants.Bullet.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Player.*;
public class Bullet {

    private int posx = 0;
    private int posy = 0;
    private boolean fired = false;

    public Bullet(int posx, int posy, boolean fired) {
        this.posx = posx;
        this.posy = posy;
        this.fired = fired;
    }
    public int getPosx() {
        return posx;
    }
    public void setPosx(int posX) {
        this.posx = posX;
    }
    public int getPosy() {
        return posy;
    }
    public void setPosy(int posY) {
        this.posy = posY;
    }
    public void fire() {
        this.fired = true;

    }

    public void destroyed() {
        this.fired = false;
    }
    public void move() {
        if (fired) {
            if (getPosy() == 0) {
                setPosy(START_Y);
                destroyed();
            } else {
                posy = posy - SPEED;
            }
        }
    }
    public boolean devolverstatusbala() {
        return fired;
    }
}
