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
        graphic.fillRect(this.ship.getPosX(), bullet.getPosy(), BULLET_WIDTH, BULLET_HEIGHT);

    }
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {

            bullet.fire();
        }
    }
    /**
    public Ellipse2D getBoundsBala() {
        return new Ellipse2D.Double(posx + 10, posy + 30, 80, 50);
    }
    */
    public boolean disparado() {

        return bullet.devolverstatusbala();
    }
    public void mover() {

        bullet.move();
    }

}


