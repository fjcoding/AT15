package org.fundacionjala.at15.pacman;

public class Ghost {
    private int posX;
    private int posY;

    public Ghost() {
        posX = 13;
        posY = 13;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

}
