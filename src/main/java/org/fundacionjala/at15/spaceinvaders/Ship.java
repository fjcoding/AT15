package org.fundacionjala.at15.spaceinvaders;

public class Ship {
    private int life;
    private float posX;
    private float posY;

    public Ship(int life, float posX, float posY) {
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
    public float getPosX() {
        return posX;
    }
    public void setPosX(float parameter) {
        this.posX = parameter;
    }
    public float getPosY() {
        return posY;
    }
    public void setPosY(float parameter) {
        this.posY = parameter;
    }
}
