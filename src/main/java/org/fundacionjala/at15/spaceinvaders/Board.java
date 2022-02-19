package org.fundacionjala.at15.spaceinvaders;

import static org.fundacionjala.at15.spaceinvaders.Constants.Block.*;

import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;

public class Board extends JPanel {
    private List<Alien> aliens;
    private int asteroidLife;

    public Board() {
        aliens = new ArrayList<>();
        createAliens(Commons.ALIEN_ROWS, Commons.ALIEN_COLUMNS);
        Block block = new Block(asteroidLife);
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
        try {
            BufferedImage asteroidImage = ImageIO.read(this.getClass().getResource("Images/asteroide.png"));
            TexturePaint texture = new TexturePaint(asteroidImage, new Rectangle(IMAGE_WIDTH, IMAGE_HEIGHT));
            Graphics2D g2d = (Graphics2D) graphics;
            g2d.setPaint(texture);
            g2d.fillRoundRect(ASTEROIDS_POSX_FIRST, ASTEROIDS_POSY, ASTEROIDS_WIDTH,
                    ASTEROIDS_HEIGHT,
                    ASTEROIDS_ARCWIDTH, ASTEROIDS_ARCHEIGHT);
            g2d.fillRoundRect(ASTEROIDS_POSX_SECOND, ASTEROIDS_POSY, ASTEROIDS_WIDTH,
                    ASTEROIDS_HEIGHT,
                    ASTEROIDS_ARCWIDTH, ASTEROIDS_ARCHEIGHT);
            g2d.fillRoundRect(ASTEROIDS_POSX_THIRD, ASTEROIDS_POSY, ASTEROIDS_WIDTH,
                    ASTEROIDS_HEIGHT,
                    ASTEROIDS_ARCWIDTH, ASTEROIDS_ARCHEIGHT);

        } catch (IOException exc) {
            System.out.println("Error no image.");
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
