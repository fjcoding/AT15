package org.fundacionjala.at15.spaceinvaders;

import javax.swing.*;
import java.awt.*;

import static org.fundacionjala.at15.spaceinvaders.Constants.Bullet.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Player.START_Y;

public class Alien extends Sprite {
    private int width;
    private int height;
    private Bomb bomb;

    public Alien(int posX, int posY, int width, int height) {
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
        this.bomb = new Bomb(posX, posY, false);

        var alienImg = "src/main/resources/spaceinvaders/alien.png";
        var imageIcon = new ImageIcon(alienImg);
        this.setImage(imageIcon.getImage());
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void moveX(int deltaX) {
        this.posX += deltaX;
    }

    public void setBomb(Bomb param) {
        this.bomb = param;
    }

    public Bomb getBomb() {
        return this.bomb;
    }


    public class Bomb extends Sprite {

        private boolean fired = false;

        public Bomb(int posX, int posY, boolean fired) {
            this.posX = posX;
            this.posY = posY;
            this.fired = fired;
        }

        public void fire() {
            this.fired = true;
        }

        public void destroyed() {
            this.fired = false;
        }

        public void move() {
            if(fired) {
                if (getPosY() <=0) {
                    setPosY(START_Y);
                    destroyed();
                } else {
                    posY -= SPEED;
                }
            }
        }

        public boolean bombStatus() {
            return fired;
        }
    }

    public void paint(Graphics graphics) {
        graphics.setColor(Color.RED);
        graphics.fillOval(this.getPosX(), this.getPosY(), this.getWidth(), this.getHeight());
        graphics.setColor(Color.CYAN);
        if (bomb.bombStatus()) {
            graphics.fillRect(bomb.getPosX(), bomb.getPosY(), BULLET_WIDTH, BULLET_HEIGHT);
        }
    }
}
