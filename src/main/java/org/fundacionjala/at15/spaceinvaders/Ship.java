package org.fundacionjala.at15.spaceinvaders;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.*;

import static org.fundacionjala.at15.spaceinvaders.Constants.Player.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;

public class Ship extends Sprite {
    private int velX;

    public Ship(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;

        String shipImage = "src/main/resources/spaceinvaders/player.png";
        ImageIcon imageIcon = new ImageIcon(shipImage);
        setImage(imageIcon.getImage());
    }

    /*public void paint(Graphics graphic) {

      graphic.setColor(Color.GREEN);
      graphic.fillOval(Math.round(posX), Math.round(posY), DIAMETER, DIAMETER);
    }*/

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            velX = -VELOCITY_X;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            velX = VELOCITY_X;
        }
    }
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            velX = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            velX = 0;
        }
    }

    public void move() {
        posX += velX;

        if (posX <= 2) {

            posX = 2;
        }

        if (posX >= BOARD_WIDTH - 2 * DIAMETER) {

            posX = BOARD_WIDTH - 2 * DIAMETER;
        }
    }
    public int moveUptoLimit(int value, int min, int max) {
        if (value > max) {
            return max;
        }
        if (value < 0) {
            return min;
        }
        return value;
    }
    public int getVelX() {
        return velX;
    }
}