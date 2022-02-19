package org.fundacionjala.at15.spaceinvaders;

import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Board extends JPanel {
    private List<Alien> aliens;

    public Board() {
        aliens = new ArrayList<>();
        createAliens(Commons.ALIEN_ROWS, Commons.ALIEN_COLUMNS);
    }

    public List<Alien> getAliens() {
        return this.aliens;
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        setBackground(Color.BLACK);
        graphics.setColor(Color.RED);
        for (Alien alien : this.aliens) {
            graphics.fillOval(alien.getPosX(), alien.getPosY(), alien.getWidth(), alien.getHeight());
        }
    }

    public void createAliens(int rows, int columns) {
        for (int yIndex = 0; yIndex < rows; yIndex++) {
            for (int xIndex = 0; xIndex < columns; xIndex++) {
                Alien alien = new Alien(
                    Commons.ALIEN_INIT_X + Commons.ALIEN_SEPARATION * xIndex,
                    Commons.ALIEN_INIT_Y + Commons.ALIEN_SEPARATION * yIndex,
                    Commons.ALIEN_WIDTH,
                    Commons.ALIEN_HEIGHT);
                this.aliens.add(alien);
            }
        }
    }
}
