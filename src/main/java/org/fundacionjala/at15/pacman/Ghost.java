package org.fundacionjala.at15.pacman;

public class Ghost {
    private int posX;
    private int posY;

    public Ghost(int newPosX, int newPosY) {
        this.posX = newPosX;
        this.posY = newPosY;
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
