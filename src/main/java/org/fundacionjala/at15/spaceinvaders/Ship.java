package org.fundacionjala.at15.spaceinvaders;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ship extends JComponent {
    private int life;
    private float posX;
    private float posY;
    private static final int WIDTH = 500;
    private static final int HEIGHT = 400;
    private static final int DIAMETER = 15;
    private static final int VELOCITYRIGHT = 300;
    private static final int VELOCITYLEFT = -300;
    private static final float TIMEINTERNVAL = 1000000000f;
    private float velocityX;
    private boolean left;
    private boolean right;

    public Ship(int life, float posX, float posY) {
        this.life = life;
        this.posX = posX;
        this.posY = posY;
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
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

    private float moveUptoLimit(float value, float min, float max) {
        if (value > max) {
            return max;
        }
        if (value < min) {
            return min;
        }
        return value;
    }
    private void movement(float deltaT) {
        velocityX = 0;
        if (left) {
            velocityX = VELOCITYLEFT;
        }
        if (right) {
            velocityX = VELOCITYRIGHT;
        }
        posX = moveUptoLimit(posX + velocityX * deltaT, 0, WIDTH - DIAMETER);
    }

    public void paint(Graphics graphic) {
        graphic.setColor(Color.BLACK);
        graphic.fillRect(0, 0, WIDTH, HEIGHT);
        graphic.setColor(Color.GREEN);
        graphic.fillOval(Math.round(posX), Math.round(posY), DIAMETER, DIAMETER);
    }
    private void render() throws Exception {
        SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    paintImmediately(0, 0, WIDTH, HEIGHT);
                }
            });
    }
    public void mainCycle() throws Exception {
        long oldTime = System.nanoTime();
        while (true) {
            long newTime = System.nanoTime();
            float deltaT = (newTime - oldTime) / TIMEINTERNVAL;
            oldTime = newTime;
            movement(deltaT);
            render();
        }
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

    public static void main(String[] args) throws Exception {
        int life = 1;
        final float xpos = 250;
        final float ypos = 385;
        JFrame jframe = new JFrame("PingBall");
        jframe.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        jframe.setResizable(false);
        Ship ship = new Ship(life, xpos, ypos);
        jframe.getContentPane().add(ship);
        jframe.pack();
        jframe.setVisible(true);
        ship.mainCycle();
    }
}