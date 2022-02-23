package org.fundacionjala.at15.pacman;

public class Pacman {
    private int posX;
    private int posY;

    public Pacman() {
        posX = 1;
        posY = 1;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosX(int newPosX) {
        this.posX = newPosX;
    }

    public void setPosY(int newPosY) {
        this.posY = newPosY;
    }

}
