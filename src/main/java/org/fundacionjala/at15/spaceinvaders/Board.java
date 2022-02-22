package org.fundacionjala.at15.spaceinvaders;

import java.awt.event.*;
import javax.swing.Timer;
import javax.swing.JPanel;
import java.awt.*;
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
        this.aliens.moveAliens();
        this.aliens.aliensShoot();
        this.aliens.paint(g);
        g.dispose();
        Toolkit.getDefaultToolkit().sync();
    }

    private class GameCycle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            doGameCycle();
        }
    }

    private void doGameCycle() {
        repaint();
    }
}