package org.fundacionjala.at15.pacman;

public class Ghost extends CommonFeatures {
    private int posX;
    private int posY;

    public Ghost(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    public void setX(int newX) {
        this.posX = newX;
    }

    public void setY(int newY) {
        this.posY = newY;
    }

    public int getX() {
        return posX;
    }

    public int getY() {
        return posY;
    }
}
