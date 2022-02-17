package org.fundacionjala.at15.spaceinvaders;

public class Invader {
    private float posX;
    private float posY;

    public Invader(float posX, float posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public float getPosX() {
        return this.posX;
    }

    public float getPosY() {
        return this.posY;
    }
}
