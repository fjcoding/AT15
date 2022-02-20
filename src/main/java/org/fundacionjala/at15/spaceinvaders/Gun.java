package org.fundacionjala.at15.spaceinvaders;

import java.awt.event.KeyEvent;
import java.awt.*;
import static org.fundacionjala.at15.spaceinvaders.Constants.Bullet.*;

public class Gun {

    private Ship ship;
    private Bullet bullet;
    private int posx;

    public Gun(Ship ship) {
        this.ship = ship;
        this.posx = this.ship.getPosX();
        this.bullet = new Bullet(this.ship.getPosX(), this.ship.getPosY(), false);
    }

    public void paint(Graphics graphic) {
        graphic.setColor(Color.YELLOW);
        graphic.fillRect(bullet.getPosx(), bullet.getPosy(), BULLET_WIDTH, BULLET_HEIGHT);

    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if (!bullet.bulletStatus()) {
                bullet.fire();
                bullet.setStaticPosX(ship.getPosX());

            }
        }
    }

    /**
     * public Ellipse2D getBoundsBala() {
     * return new Ellipse2D.Double(posx + 10, posy + 30, 80, 50);
     * }
     */
    public boolean shooted() {

        return bullet.bulletStatus();
    }

    public void move() {

        bullet.move();

    }

}
