package org.fundacionjala.at15.spaceinvaders;
import java.awt.Image;

public class Sprite {

    private boolean visible;
    private Image image;
    private boolean dying;

    int posX;
    int posY;
    int dirX;

    public Sprite() {
        visible = true;
    }

    public void die() {
        visible = false;
    }

    public boolean isVisible() {
        return visible;
    }

    protected void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Image getImage() {
        return image;
    }

    public void setY(int posY) {
        this.posY = posY;
    }

    public int getY() {
        return posY;
    }

    public int getX() {
        return posX;
    }

    public void setDying(boolean dying) {
        this.dying = dying;
    }

    public boolean isDying() {
        return this.dying;
    }
}
