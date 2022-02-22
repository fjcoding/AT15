package org.fundacionjala.at15.spaceinvaders;

import java.awt.*;

public class Alien extends Sprite {
    private int posX;
    private int posY;
    private int width;
    private int height;
    private Bullet bullet;

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

    public void setPosY(int posYNew) {
        this.posY = posYNew;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void moveX(int deltaX) {
        this.posX += deltaX;
    }

    public void setBullet(Bullet param) {
        this.bullet = param;
    }

    public Bullet getBullet() {
        return this.bullet;
    }

    public void paint(Graphics graphics) {
        graphics.setColor(Color.RED);
        graphics.fillOval(this.getPosX(), this.getPosY(), this.getWidth(), this.getHeight());
    }
}
