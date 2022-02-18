package org.fundacionjala.at15.spaceinvaders;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.TexturePaint;

public class Block extends JPanel {
    private static final int ASTEROIDS_POSX_FIRST = 125;
    private static final int ASTEROIDS_POSX_SECOND = 350;
    private static final int ASTEROIDS_POSX_THIRD = 575;
    private static final int ASTEROIDS_POSY = 400;
    private static final int ASTEROIDS_WIDTH = 100;
    private static final int ASTEROIDS_HEIGHT = 50;
    private static final int ASTEROIDS_ARCWIDTH = 25;
    private static final int ASTEROIDS_ARCHEIGHT = 25;

    private static final int IMAGE_WIDTH = 50;
    private static final int IMAGE_HEIGHT = 50;
    private static final int LIFE_ASTEROID = 3;
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private int lifeAsteroid;

    public Block(int life) {
        this.lifeAsteroid = life;
    }

    public int getLife() {
        return lifeAsteroid;
    }

    public void setLife(int parameter) {
        this.lifeAsteroid = parameter;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        setBackground(Color.BLACK);
        try {
            BufferedImage asteroidImage = ImageIO.read(this.getClass().getResource("Images/asteroide_3.png"));
            TexturePaint texture = new TexturePaint(asteroidImage, new Rectangle(IMAGE_WIDTH, IMAGE_HEIGHT));
            Graphics2D g2d = (Graphics2D) g;
            g2d.setPaint(texture);
            g2d.fillRoundRect(ASTEROIDS_POSX_FIRST, ASTEROIDS_POSY, ASTEROIDS_WIDTH, ASTEROIDS_HEIGHT,
                    ASTEROIDS_ARCWIDTH, ASTEROIDS_ARCHEIGHT);
            g2d.fillRoundRect(ASTEROIDS_POSX_SECOND, ASTEROIDS_POSY, ASTEROIDS_WIDTH, ASTEROIDS_HEIGHT,
                    ASTEROIDS_ARCWIDTH, ASTEROIDS_ARCHEIGHT);
            g2d.fillRoundRect(ASTEROIDS_POSX_THIRD, ASTEROIDS_POSY, ASTEROIDS_WIDTH, ASTEROIDS_HEIGHT,
                    ASTEROIDS_ARCWIDTH, ASTEROIDS_ARCHEIGHT);

        } catch (IOException exc) {
            System.out.println(exc.toString());
        }
    }

    public static void main(String[] args) {
        int lifeAsteroid = LIFE_ASTEROID;
        JFrame window = new JFrame("Space Invaders");
        Block blockers = new Block(lifeAsteroid);
        window.add(blockers);
        window.setSize(WIDTH, HEIGHT);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
