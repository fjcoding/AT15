package org.fundacionjala.at15.spaceinvaders;

import javax.swing.*;

public class Alien extends Sprite {
    private int width;
    private int height;
    private Bomb bomb;

    public Alien(int posX, int posY, int width, int height) {
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
        this.bomb = new Bomb(posX, posY, false);
        this.dying = false;

        String alienImg = "src/main/resources/spaceinvaders/alien.png";
        ImageIcon imageIcon = new ImageIcon(alienImg);
        this.setImage(imageIcon.getImage());
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

    public void setBomb(Bomb param) {
        this.bomb = param;
    }

    public Bomb getBomb() {
        return this.bomb;
    }
}
