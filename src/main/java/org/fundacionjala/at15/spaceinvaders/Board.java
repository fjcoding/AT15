package org.fundacionjala.at15.spaceinvaders;

import java.awt.event.*;
import javax.swing.Timer;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;

import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Block.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Player.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Bullet.*;

public class Board extends JPanel {
    private Aliens aliens = new Aliens(ALIEN_ROWS, ALIEN_COLUMNS);
    protected Ship ship = new Ship(START_X, START_Y);
    private Gun gun = new Gun(ship);
    private Block block = new Block(ASTEROID_LIFE);
    private Timer timer;
    private int deaths;
    protected String message;
    private boolean inGame = true;
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
        // Font score = new Font("Arial" ,Font.BOLD, 25) ;
        // g.setFont (score);
        if (inGame) {
            block.paint(g);
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
            if (!alien.isDying()) {
                g.drawImage(alien.getImage(), alien.getPosX(), alien.getPosY(), this);
            }
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


        ship.move();
        aliens.moveAliens();
        aliens.aliensShoot();


        //if (gun.isVisible()) {
        for (Alien alien: this.aliens.getAliens()) {
            int shotY = gun.getPosYBullet();
            int shotX = gun.getPosXBullet();
            int alienX = alien.getPosX();
            int alienY = alien.getPosY();
            if (!alien.isDying() && gun.shooted()) {
                if (shotX >= (alienX)
                    && shotX <= (alienX + ALIEN_WIDTH)
                    && shotY >= (alienY)
                    && shotY <= (alienY + ALIEN_HEIGHT)) {
                    ImageIcon imageIcon = new ImageIcon(explote);
                    alien.setImage(imageIcon.getImage());
                    alien.setDying(true);
                    deaths++;
                    gun.die();
                }
            }
        }
        //}



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

    protected int setDeaths() {
        deaths = DEATHE;
        return deaths;
    }
}