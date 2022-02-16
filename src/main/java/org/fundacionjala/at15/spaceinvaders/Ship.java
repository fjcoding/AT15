package org.fundacionjala.at15.spaceinvaders;

public class Ship {
    private int life;
    private int posX;
    private int posY;

    public Ship(int life, int posX, int posY) {
        this.life = life;
        this.posX = posX;
        this.posY = posY;
    }

    public int getLife() {
        return life;
    }
    public void setLife(int parameter) {
        this.life = parameter;
    }
    public int getPosX() {
        return posX;
    }
    public void setPosX(int parameter) {
        this.posX = parameter;
    }
    public int getPosY() {
        return posY;
    }
    public void setPosY(int parameter) {
        this.posY = parameter;
    }
}
