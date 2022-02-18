package org.fundacionjala.at15.spaceinvaders;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ship extends JComponent {
    private int life;
    private float posX;
    private float posY;
    private static final int VELOCITYRIGHT = 300;
    private static final int VELOCITYLEFT = -300;
    private float velocityX;
    private boolean left;
    private boolean right;

    public Ship(int life) {
        this.life = life;
        this.posX = Commons.START_X;
        this.posY = Commons.START_Y;
        setPreferredSize(new Dimension(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT));
        addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    updatekeyPressed(e.getKeyCode(), true);
                }

                public void keyReleased(KeyEvent e) {
                    updatekeyPressed(e.getKeyCode(), false);
                }

                private void updatekeyPressed(int keyCode, boolean pressed) {
                    switch (keyCode) {
                        case KeyEvent.VK_LEFT:
                            left = pressed;
                            break;
                        case KeyEvent.VK_RIGHT:
                            right = pressed;
                            break;
                        default:
                            System.err.println("Is not right or left");
                    }
                }
            });
        setFocusable(true);
    }

    public void movement(float deltaT) {
        velocityX = 0;
        if (left) {
            velocityX = VELOCITYLEFT;
        }
        if (right) {
            velocityX = VELOCITYRIGHT;
        }
        posX = moveUptoLimit(posX + velocityX * deltaT, 0, Commons.BOARD_WIDTH - Commons.DIAMETER);
    }

    private float moveUptoLimit(float value, float min, float max) {
        if (value > max) {
            return max;
        }
        if (value < min) {
            return min;
        }
        return value;
    }

    public void render() throws Exception {
        SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    paintImmediately(0, 0, Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);
                }
            });
    }

    public void paint(Graphics graphic) {
        graphic.setColor(Color.BLACK);
        graphic.fillRect(0, 0, Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);
        graphic.setColor(Color.RED);
        graphic.fillRect(Commons.ALIEN_INIT_X, Commons.ALIEN_INIT_Y, Commons.ALIEN_WIDTH, Commons.ALIEN_HEIGHT);
        graphic.setColor(Color.GREEN);
        graphic.fillOval(Math.round(posX), Math.round(posY), Commons.DIAMETER, Commons.DIAMETER);
    }

    public int getLife() {
        return life;
    }
    public void setLife(int parameter) {
        this.life = parameter;
    }
    public float getPosX() {
        return posX;
    }
    public void setPosX(float parameter) {
        this.posX = parameter;
    }
    public float getPosY() {
        return posY;
    }
    public void setPosY(float parameter) {
        this.posY = parameter;
    }
}
