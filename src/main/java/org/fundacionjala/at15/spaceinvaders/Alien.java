package org.fundacionjala.at15.spaceinvaders;

public class Alien {
    private int posX;
    private int posY;

    public Alien(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return this.posX;
    }

    public int getPosY() {
        return this.posY;
    }
}
