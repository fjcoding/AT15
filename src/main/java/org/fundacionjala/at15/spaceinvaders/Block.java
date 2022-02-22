package org.fundacionjala.at15.spaceinvaders;

import static org.fundacionjala.at15.spaceinvaders.Constants.Block.*;
import java.awt.Graphics;
import java.awt.Color;

public class Block extends Sprite {
    public Graphics blockGraph;
    private int asteroidLife;

    public Block(int life) {
        this.asteroidLife = life;
    }

    public int getLife() {
        return asteroidLife;
    }

    public void setLife(int parameter) {
        this.asteroidLife = parameter;
    }

    public void paint(Graphics graph) {
        graph.setColor(Color.DARK_GRAY);
        graph.fillRoundRect(ASTEROIDS_POSX_FIRST, ASTEROIDS_POSY, ASTEROIDS_WIDTH, ASTEROIDS_HEIGHT, ASTEROIDS_ARCWIDTH,
                ASTEROIDS_ARCHEIGHT);
        graph.fillRoundRect(ASTEROIDS_POSX_SECOND, ASTEROIDS_POSY, ASTEROIDS_WIDTH, ASTEROIDS_HEIGHT,
                ASTEROIDS_ARCWIDTH, ASTEROIDS_ARCHEIGHT);
        graph.fillRoundRect(ASTEROIDS_POSX_THIRD, ASTEROIDS_POSY, ASTEROIDS_WIDTH, ASTEROIDS_HEIGHT, ASTEROIDS_ARCWIDTH,
                ASTEROIDS_ARCHEIGHT);
        blockGraph = graph;
    }
}
