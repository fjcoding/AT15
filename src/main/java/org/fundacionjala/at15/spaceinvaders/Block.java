package org.fundacionjala.at15.spaceinvaders;

public class Block {
    private int lifeAsteroid;

    public Block(int life) {
        this.lifeAsteroid = life;
    }

    public int getLife() {
        return lifeAsteroid;
    }

    public void setLife(int parameter) {
        this.lifeAsteroid = parameter;
    }
}
