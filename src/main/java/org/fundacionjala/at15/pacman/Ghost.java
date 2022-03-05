package org.fundacionjala.at15.pacman;

public class Ghost extends Sprite {
    private int direction;
    private final int randomLimit = 5;

    public Ghost(int newPosX, int newPosY) {
        this.posX = newPosX;
        this.posY = newPosY;
        this.direction = (int) Math.floor(Math.random() * (randomLimit - 1) + 1);
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int newDirection) {
        this.direction = newDirection;
    }

}
