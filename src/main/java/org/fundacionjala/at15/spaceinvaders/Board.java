package org.fundacionjala.at15.spaceinvaders;

import java.awt.event.*;
import javax.swing.Timer;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;

import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Player.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Bullet.*;

public class Board extends JPanel {
    protected Aliens aliens = new Aliens(ALIEN_ROWS, ALIEN_COLUMNS);
    protected Ship ship = new Ship(START_X, START_Y);
    private Gun gun = new Gun(ship);
    private Timer timer;
    private int deaths;
    protected String message;
    protected boolean inGame = true;
    private int scores;
    private String score;
    private String explote = "src/main/resources/spaceinvaders/explosion.png";

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
        score = "SCORE: " + String.valueOf(scores);
        graphic.drawString(score, TEN, TEN);
    }

    private void update() {
        if (deaths == ALIEN_ROWS * ALIEN_COLUMNS) {
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
        aliens.aliensShoot();

        for (int index = 0; index < aliens.getAliens().size(); index++) {
            int shotY = gun.getPosYBullet();
            int shotX = gun.getPosXBullet();
            int alienX = aliens.getAliens().get(index).getPosX();
            int alienY = aliens.getAliens().get(index).getPosY();
            if (!aliens.getAliens().get(index).isDying() && gun.shooted()) {
                if (shotX >= (alienX)
                        && shotX <= (alienX + ALIEN_WIDTH)
                        && shotY >= (alienY)
                        && shotY <= (alienY + ALIEN_HEIGHT)) {
                    ImageIcon imageIcon = new ImageIcon(explote);
                    aliens.getAliens().get(index).setImage(imageIcon.getImage());
                    aliens.getAliens().get(index).setDying(true);
                    aliens.getAliens().remove(index);
                    gun.destroy();
                    deaths++;
                    scores = TEN * deaths;
                }
            }
        }

        for (Alien alien : this.aliens.getAliens()) {
            int bombX = alien.getBomb().getPosX();
            int bombY = alien.getBomb().getPosY();
            int playerX = this.ship.getPosX();
            int playerY = this.ship.getPosY();

            if (this.ship.isVisible()) {

                if (bombX >= (playerX)
                        && bombX <= (playerX + PLAYER_WIDTH)
                        && bombY >= (playerY)
                        && bombY <= (playerY + PLAYER_HEIGHT)) {

                    ImageIcon imageIcon = new ImageIcon(explote);
                    this.ship.setImage(imageIcon.getImage());
                    ship.setDying(true);
                    alien.getBomb().destroyed();
                }
            }
        }

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

    protected void setDeaths(int parameter) {
        this.deaths = parameter;
    }
}