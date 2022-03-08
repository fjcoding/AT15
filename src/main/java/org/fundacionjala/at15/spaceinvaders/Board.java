package org.fundacionjala.at15.spaceinvaders;

import java.awt.event.*;
import javax.swing.Timer;
import javax.swing.*;
import java.awt.*;

import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Player.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Bullet.*;

public class Board extends JPanel {
    protected Aliens aliens = new Aliens(ALIEN_ROWS, ALIEN_COLUMNS);
    protected Ship ship = new Ship(START_X, START_Y);
    private Gun gun = new Gun(ship);
    private Timer timer;
    protected String message;
    protected boolean inGame = true;
    private String score;

    public Board() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                ship.keyPressed(e);
                gun.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                ship.keyReleased(e);
            }
        });
        setFocusable(true);

        timer = new Timer(DELAY, new GameCycle());
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        setBackground(Color.BLACK);
        if (inGame) {
            score(g);
            drawShip(g);
            if (gun.shooted()) {
                drawBullet(g);
                gun.move();
            }
            drawAliens(g);
            g.dispose();
        } else {
            gameOver(g);
        }

        Toolkit.getDefaultToolkit().sync();
    }

    private void drawShip(Graphics g) {
        g.drawImage(ship.getImage(), ship.getPosX(), ship.getPosY(), this);
    }

    private void drawBullet(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(gun.getPosXBullet(), gun.getPosYBullet(), BULLET_WIDTH, BULLET_HEIGHT);
    }

    private void drawAliens(Graphics g) {
        for (Alien alien : this.aliens.getAliens()) {
            if (alien.getBomb().bombStatus()) {
                g.setColor(Color.CYAN);
                g.fillRect(alien.getBomb().getPosX(), alien.getBomb().getPosY(), BULLET_WIDTH, BULLET_HEIGHT);
            }
            g.drawImage(alien.getImage(), alien.getPosX(), alien.getPosY(), this);
        }
    }

    private void gameOver(Graphics g) {
        Font small = new Font("Helvetica", Font.BOLD, FONT_SIZE);
        FontMetrics fontMetrics = this.getFontMetrics(small);
        g.setColor(Color.white);
        g.setFont(small);
        g.drawString(message, (BOARD_WIDTH - fontMetrics.stringWidth(message)) / 2, BOARD_HEIGHT / 2);
    }

    private void score(Graphics graphic) {
        Font small = new Font("Arial", Font.BOLD, TEN);
        graphic.setColor(Color.white);
        graphic.setFont(small);
        score = "SCORE: " + String.valueOf(aliens.getScores());
        graphic.drawString(score, TEN, TEN);
    }

    private void update() {
        if (aliens.getDeaths() == ALIENS_TO_DESTROY) {
            message = "YOU WON";
            displayFinalMessage(message);
        }
        if (ship.isDying()) {
            message = "YOU LOSE";
            displayFinalMessage(message);
        }
        if (aliens.getInvasion()) {
            message = "ALIENS INVADED YOUR PLANET";
            displayFinalMessage(message);
        }

        ship.move();
        aliens.moveAliens();
        aliens.aliensShoot();
        aliens.killAliens(gun);
        aliens.killShip(ship);
    }

    private class GameCycle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            doGameCycle();
        }
    }

    protected void doGameCycle() {
        update();
        repaint();
    }
    private void displayFinalMessage(String finalMessage) {
        inGame = false;
        timer.stop();
        message = finalMessage;
    }
}