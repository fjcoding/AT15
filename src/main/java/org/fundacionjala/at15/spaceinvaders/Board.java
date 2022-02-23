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

public class Board extends JPanel {
    private Aliens aliens = new Aliens(ALIEN_ROWS, ALIEN_COLUMNS);
    private Ship ship = new Ship(START_X, START_Y);
    private Gun gun = new Gun(ship);
    private Block block = new Block(ASTEROID_LIFE);
    private Timer timer;
    private int deaths;
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

    private void drawShip(Graphics g) {
        g.drawImage(ship.getImage(), ship.getPosX(), ship.getPosY(), this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        setBackground(Color.BLACK);
        // Font score = new Font("Arial" ,Font.BOLD, 25) ;
        // g.setFont (score);
        block.paint(g);
        //ship.paint(g);
        drawShip(g);
        if (gun.shooted()) {
            gun.paint(g);
            gun.move();
        }
        for (Alien alien : this.aliens.getAliens()) {
            aliens.paint(g);
            g.drawImage(alien.getImage(), alien.getPosX(), alien.getPosY(), this);

        }
<<<<<<< HEAD
=======
        this.aliens.moveAliens();
        this.aliens.aliensShoot();
>>>>>>> dev/spaceinvaders
        g.dispose();
        Toolkit.getDefaultToolkit().sync();
    }

    private void update() {
        if (deaths == ALIENS_TO_DESTROY) {
            // game must stop
            timer.stop();
            // message of game win
        }


        ship.move();
        aliens.moveAliens();
        aliens.aliensShoot();

        if (gun.isVisible()) {
            int shotY = gun.getPosYBullet();
            int shotX = gun.getPosXBullet();
            for (Alien alien: this.aliens.getAliens()) {
                int alienX = alien.getPosX();
                int alienY = alien.getPosY();
                if (alien.isVisible() && gun.shooted()) {
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
        }

    }

    private class GameCycle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            doGameCycle();
        }
    }

    private void doGameCycle() {
        update();
        repaint();
    }
}