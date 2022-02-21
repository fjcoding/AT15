package org.fundacionjala.at15.spaceinvaders;

import java.awt.event.KeyEvent;
import java.awt.*;

import static org.fundacionjala.at15.spaceinvaders.Constants.Player.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;

public class Ship extends Sprite {
    private int velX;

    public Ship(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public void paint(Graphics graphic) {
        // ImageIcon ship = new
        // ImageIcon(getClass().getResource("src/main/resources/spaceinvaders/ship.png"));
        // graphic.drawImage(ship.getImage(), posX, posY, PLAYER_WIDTH, PLAYER_HEIGHT,
        // null);

        graphic.setColor(Color.GREEN);
        graphic.fillOval(Math.round(posX), Math.round(posY), DIAMETER, DIAMETER);
    }

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

    /*
     * public Ellipse2D getBoundsBicho(){
     * return new Ellipse2D.Double(posX + 10, posY + 30, 80, 50) ;
     * }
     * public boolean llegaFinal() {
     * Rectangle cuadrado=new Rectangle (520, 520, 110, 110) ;
     * Area cuadradoArea=new Area(cuadrado) ;
     * return cuadradoArea.contains(getBoundsBicho().getBounds()) ;
     * }
     */
}