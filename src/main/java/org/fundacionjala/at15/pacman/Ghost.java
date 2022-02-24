package org.fundacionjala.at15.pacman;

public class Ghost {
    private int posX;
    private int posY;
    private int direction;
    private final int randomLimit = 5;

    public Ghost(int newPosX, int newPosY) {
        this.posX = newPosX;
        this.posY = newPosY;
        this.direction = (int) Math.floor(Math.random() * (randomLimit - 1) + 1);
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getDirection() {
        return direction;
    }

    public void setPosX(int newPosX) {
        this.posX = newPosX;
    }

    public void setPosY(int newPosY) {
        this.posY = newPosY;
    }

    public void setDirection(int newDirection) {
        this.direction = newDirection;
    }

}
