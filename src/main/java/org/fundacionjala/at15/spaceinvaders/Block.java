package org.fundacionjala.at15.spaceinvaders;

import static org.fundacionjala.at15.spaceinvaders.Constants.Block.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.TexturePaint;

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
