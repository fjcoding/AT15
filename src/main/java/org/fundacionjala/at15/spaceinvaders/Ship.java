package org.fundacionjala.at15.spaceinvaders;

import java.awt.event.KeyEvent;
import javax.swing.*;
<<<<<<< HEAD
import org.fundacionjala.at15.spaceinvaders.Constants.*;
=======
import java.awt.*;
>>>>>>> dev/spaceinvaders

import static org.fundacionjala.at15.spaceinvaders.Constants.Player.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;

<<<<<<< HEAD
    public Ship(int life, float posX, float posY) {
        this.life = life;
        this.posX = posX;
        this.posY = posY;
        setPreferredSize(new Dimension(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT));
        addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    updateKeyPressed(e.getKeyCode(), true);
                }
=======
public class Ship {
    private int posX = START_X;
    private int posY = START_Y;
>>>>>>> dev/spaceinvaders

    public void paint(Graphics graphic) {
        //ImageIcon ship = new ImageIcon(getClass().getResource("src/main/resources/spaceinvaders/ship.png"));
        //graphic.drawImage(ship.getImage(), posX, posY, PLAYER_WIDTH, PLAYER_HEIGHT, null);

<<<<<<< HEAD
                public void updateKeyPressed(int keyCode, boolean pressed) {
                    switch (keyCode) {
                        case KeyEvent.VK_LEFT:
                            left = pressed;
                            break;
                        case KeyEvent.VK_RIGHT:
                            right = pressed;
                            break;
                        default:
                            break;
                    }
                }
            });
        setFocusable(true);
=======
        graphic.setColor(Color.GREEN);
        graphic.fillOval(Math.round(posX), Math.round(posY), DIAMETER, DIAMETER);
>>>>>>> dev/spaceinvaders
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

<<<<<<< HEAD
    public float moveUptoLimit(float value, float min, float max) {
=======
    public int moveUptoLimit(int value, int min, int max) {
>>>>>>> dev/spaceinvaders
        if (value > max) {
            return max;
        }
        if (value < 0) {
            return min;
        }
        return value;
    }
<<<<<<< HEAD
    public void paint(Graphics graphic) {
        graphic.setColor(Color.BLACK);
        graphic.fillRect(0, 0, Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);
        graphic.setColor(Color.RED);
        graphic.fillRect(Commons.ALIEN_INIT_X, Commons.ALIEN_INIT_Y, Commons.ALIEN_WIDTH, Commons.ALIEN_HEIGHT);
        graphic.setColor(Color.GREEN);
        graphic.fillOval(Math.round(posX), Math.round(posY), Commons.DIAMETER, Commons.DIAMETER);
    }

    public void render() throws Exception {
        SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    paintImmediately(0, 0, Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);
                }
            });
    }

    public int getLife() {
        return life;
    }
    public void setLife(int parameter) {
        this.life = parameter;
    }
    public float getPosX() {
=======

    /*public Ellipse2D getBoundsBicho(){
        return new Ellipse2D.Double(posX + 10, posY + 30, 80, 50) ;
    }

    public boolean llegaFinal() {
        Rectangle cuadrado=new Rectangle (520, 520, 110, 110) ;
        Area cuadradoArea=new Area(cuadrado) ;
        return cuadradoArea.contains(getBoundsBicho().getBounds()) ;
    }*/

    public int getPosX() {
>>>>>>> dev/spaceinvaders
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
    public void setLeft(boolean parameter) {
        this.left = parameter;
    }
    public void setRight(boolean parameter) {
        this.right = parameter;
    }

}
