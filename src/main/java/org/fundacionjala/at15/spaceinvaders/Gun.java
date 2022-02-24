package org.fundacionjala.at15.spaceinvaders;

import java.awt.event.KeyEvent;


public class Gun extends Sprite {

    private Ship ship;
    private Bullet bullet;

    public Gun(Ship ship) {
        this.ship = ship;
        this.bullet = new Bullet(this.ship.getPosX(), this.ship.getPosY(), false);
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if (!bullet.bulletStatus()) {
                fire();
                bullet.setPosX(ship.getPosX());
            } else {
                System.out.print(' ');
            }
        } else {
            System.out.print(' ');
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
    public int getPosYBullet() {
        return bullet.getPosY();
    }

    public int getPosXBullet() {
        return bullet.getPosX();
    }
    public void fire() {
        bullet.fire();
    }
    public void destroy() {
        bullet.destroyed();
    }
}
