package org.fundacionjala.at15.spaceinvaders.alvaro;

public class Bullet {

    private static final int WIDTH = 1;
    private static final int HEIGHT = 5;
    private int posx = 0;
    private int posy = 0;
    private int speed = 15;
    private boolean fired = false;

    public Bullet(int posx, int posy, int speed, boolean fired) {
        this.posx = posx;
        this.posy = posy;
        this.speed = speed;
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
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int Speed) {
        this.speed = Speed;
    }
    public void fire(int Posx, int Posy) {
        this.fired = true;
        this.posx = Posx;
        this.posy = Posy;
    }
    public void destroyed() {
        this.fired = false;
    }
}
