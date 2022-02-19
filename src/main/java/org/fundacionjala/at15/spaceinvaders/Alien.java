package org.fundacionjala.at15.spaceinvaders;

import java.awt.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;

public class Alien {
    private int posX;
    private int posY;
    private int width;
    private int height;
    private int deltaX = ALIEN_DELTA_X;

    public Alien(int posX, int posY, int width, int height) {
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
    }

    public int getPosX() {
        return this.posX;
    }

    public int getPosY() {
        return this.posY;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getDeltaX() {
        return this.deltaX;
    }

    public void setDeltaX(int deltaXVar) {
        this.deltaX = deltaXVar;
    }

    public void moveX() {
        this.posX += this.deltaX;
    }

    public void paint(Graphics graphics) {
        graphics.setColor(Color.RED);
        graphics.fillOval(this.getPosX(), this.getPosY(), this.getWidth(), this.getHeight());
    }
}
