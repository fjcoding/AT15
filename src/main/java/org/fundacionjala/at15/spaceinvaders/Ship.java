package org.fundacionjala.at15.spaceinvaders;

import java.awt.event.KeyEvent;
import javax.swing.*;
import java.awt.*;

import static org.fundacionjala.at15.spaceinvaders.Constants.Player.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;

public class Ship {
    private int posX = START_X;
    private int posY = START_Y;

    public void paint(Graphics graphic) {
        //ImageIcon ship = new ImageIcon(getClass().getResource("src/main/resources/spaceinvaders/ship.png"));
        //graphic.drawImage(ship.getImage(), posX, posY, PLAYER_WIDTH, PLAYER_HEIGHT, null);

        graphic.setColor(Color.GREEN);
        graphic.fillOval(Math.round(posX), Math.round(posY), DIAMETER, DIAMETER);
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (posX > 0) {
                posX = moveUptoLimit(posX - VELOCITY_X, 0, BOARD_WIDTH - 2 * DIAMETER);
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (posX < BOARD_WIDTH) {
                posX = moveUptoLimit(posX + VELOCITY_X, 0, BOARD_WIDTH - 2 * DIAMETER);
            }
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

    /*public Ellipse2D getBoundsBicho(){
        return new Ellipse2D.Double(posX + 10, posY + 30, 80, 50) ;
    }

    public boolean llegaFinal() {
        Rectangle cuadrado=new Rectangle (520, 520, 110, 110) ;
        Area cuadradoArea=new Area(cuadrado) ;
        return cuadradoArea.contains(getBoundsBicho().getBounds()) ;
    }*/

    public int getPosX() {
        return posX;
    }
    public void setPosX(int parameter) {
        this.posX = parameter;
    }
    public int getPosY() {
        return posY;
    }
    public void setPosY(int parameter) {
        this.posY = parameter;
    }

}
