package org.fundacionjala.at15.spaceinvaders;

import static org.fundacionjala.at15.spaceinvaders.Constants.Block.*;
import java.awt.Graphics;
import java.awt.Color;

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

    public void paint(Graphics graph) {
        graph.setColor(Color.PINK);
        graph.fillRoundRect(ASTEROIDS_POSX_FIRST, ASTEROIDS_POSY, ASTEROIDS_WIDTH, ASTEROIDS_HEIGHT,
                ASTEROIDS_ARCWIDTH, ASTEROIDS_ARCHEIGHT);
        graph.fillRoundRect(ASTEROIDS_POSX_SECOND, ASTEROIDS_POSY, ASTEROIDS_WIDTH, ASTEROIDS_HEIGHT,
                ASTEROIDS_ARCWIDTH, ASTEROIDS_ARCHEIGHT);
        graph.fillRoundRect(ASTEROIDS_POSX_THIRD, ASTEROIDS_POSY, ASTEROIDS_WIDTH, ASTEROIDS_HEIGHT,
                ASTEROIDS_ARCWIDTH, ASTEROIDS_ARCHEIGHT);
    }
}
