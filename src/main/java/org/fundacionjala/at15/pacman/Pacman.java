package org.fundacionjala.at15.pacman;

public class Pacman extends CommonFeatures {

    private int posX;
    private int posY;
    private int lives;
    private int score;
    private boolean isDead;

    public Pacman(int x, int y) {
        this.posX = x;
        this.posY = y;
        this.lives = MAX_LIVES;
        this.score = 0;
        this.isDead = false;
    }

    public void setIsDead(boolean newState) {
        this.isDead = true;
    }

    public boolean isDead() {
        return this.isDead;
    }

    public void setLives(int currentLife) {
        this.lives = currentLife;
    }

    public int getLives() {
        return this.lives;
    }

    public int getScore() {
        return this.score;
    }

    public int getX() {
        return this.posX;
    }

    public int getY() {
        return this.posY;
    }

    public void setX(int newPosX) {
        this.posX = newPosX;
    }

    public void setY(int newPosY) {
        this.posY = newPosY;
    }
}