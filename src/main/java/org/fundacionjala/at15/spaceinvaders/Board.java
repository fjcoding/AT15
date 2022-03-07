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
    protected AlienGroup aliens = new AlienGroup(ALIEN_ROWS, ALIEN_COLUMNS);
    private FireController fireController = new FireController(aliens);
    protected Ship ship = new Ship(START_X, START_Y);
    private Gun gun = new Gun(ship);
    private Timer timer;
    protected String message;
    protected boolean inGame = true;
    private Score score;

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
        this.score = new Score(String.valueOf(aliens.getScores()));

        timer = new Timer(DELAY, new GameCycle());
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        setBackground(Color.BLACK);
        if (inGame) {
            score.drawScore(g);;
            drawShip(g);
            if (gun.shooted()) {
                drawBullet(g);
                gun.move();
            }
            score.setScore(String.valueOf(aliens.getScores()));
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

    private void update() {
        if (aliens.getDeaths() == ALIENS_TO_DESTROY) {
            inGame = false;
            timer.stop();
            message = "YOU WON";
        }
        if (ship.isDying()) {
            inGame = false;
            timer.stop();
            message = "YOU LOSE";
        }
        if (aliens.getInvasion()) {
            inGame = false;
            timer.stop();
            message = "ALIENS INVADED YOUR PLANET";
        }

        ship.move();
        aliens.moveAliens();
        fireController.aliensStartFire();
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
}