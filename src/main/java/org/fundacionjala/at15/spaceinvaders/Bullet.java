package org.fundacionjala.at15.spaceinvaders;
import static org.fundacionjala.at15.spaceinvaders.Constants.Bullet.*;

public class Bullet {

    private int posx = 0;
    private int posy = 0;
    private static final int SPEED = 15;
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
    public void fire(int posX, int posY) {
        this.fired = true;
        this.posx = posX;
        this.posy = posY;
    }
    public void destroyed() {
        this.fired = false;
    }
}
