package org.fundacionjala.at15.spaceinvaders;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import java.awt.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Block.*;

public class Board extends JPanel {
    private Aliens aliens = new Aliens(ALIEN_ROWS, ALIEN_COLUMNS);
    private Ship ship = new Ship();
    private Gun gun = new Gun(ship);
    private Block block = new Block(ASTEROID_LIFE);

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
    }

    public static void pause() {
        try {
            Thread.sleep(SLEEP);
        } catch (Exception ignored) {
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        setBackground(Color.BLACK);
        // Font score = new Font("Arial" ,Font.BOLD, 25) ;
        // g.setFont (score);
        block.paint(g);
        ship.move();
        ship.paint(g);
        if (gun.shooted()) {
            gun.paint(g);
            gun.move();
        }

        for (Alien alien : this.aliens.getAliens()) {
            alien.paint(g);
        }
        pause();
        this.aliens.moveAliens();
        g.dispose();
        repaint();
    }
}
