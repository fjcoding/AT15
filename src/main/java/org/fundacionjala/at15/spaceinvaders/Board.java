package org.fundacionjala.at15.spaceinvaders;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;

import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Block.*;

public class Board extends JPanel {
    private List<Alien> aliens;
    private Ship ship = new Ship();
    private Gun gun = new Gun(ship);
    private Block block = new Block(ASTEROID_LIFE);

    public Board() {
        aliens = new ArrayList<>();
        createAliens(ALIEN_ROWS, ALIEN_COLUMNS);
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
            }
        });
        setFocusable(true);
    }

    public List<Alien> getAliens() {
        return this.aliens;
    }

    public void createAliens(int rows, int columns) {
        for (int yIndex = 0; yIndex < rows; yIndex++) {
            for (int xIndex = 0; xIndex < columns; xIndex++) {
                Alien alien = new Alien(
                        ALIEN_INIT_X + ALIEN_SEPARATION * xIndex,
                        ALIEN_INIT_Y + ALIEN_SEPARATION * yIndex, ALIEN_WIDTH, ALIEN_HEIGHT);
                this.aliens.add(alien);
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        setBackground(Color.BLACK);
        // Font score = new Font("Arial" ,Font.BOLD, 25) ;
        // g.setFont (score);
        ship.paint(g);
        if (gun.shooted()) {
            gun.paint(g);
            gun.move();
        }

        for (Alien alien : this.aliens) {
            alien.paint(g);
        }
        for (Alien alien : this.getAliens()) {
            int posX = alien.getPosX();
            if (posX >= BOARD_WIDTH - ALIEN_WIDTH && alien.getDeltaX() == ALIEN_DELTA_X) {
                alien.setDeltaX(-ALIEN_DELTA_X);
            }
            if (posX == 0 && alien.getDeltaX() == -ALIEN_DELTA_X) {
                alien.setDeltaX(ALIEN_DELTA_X);
            }
            alien.moveX();
        }

        g.dispose();
        repaint();
    }
}
