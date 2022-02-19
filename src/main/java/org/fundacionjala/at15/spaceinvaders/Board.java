package org.fundacionjala.at15.spaceinvaders;

import javax.swing.JPanel;
import java.awt.*;

public class Board extends JPanel {
    private Alien alien;

    public Board() {
        this.alien = new Alien(Commons.ALIEN_INIT_X, Commons.ALIEN_INIT_Y, Commons.ALIEN_WIDTH, Commons.ALIEN_HEIGHT);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        setBackground(Color.BLACK);
        graphics.setColor(Color.GREEN);
        graphics.fillOval(alien.getPosX(), alien.getPosY(), alien.getWidth(), alien.getHeight());
    }
}
