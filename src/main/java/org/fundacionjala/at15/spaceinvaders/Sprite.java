package org.fundacionjala.at15.spaceinvaders;
import java.awt.Image;

public class Sprite {

    private boolean visible;
    private Image image;
    private boolean dying;

    private int posX;
    private int posY;
    private int dirX;

    public Sprite() {
        visible = true;
    }

    public void die() {
        visible = false;
    }

    public boolean isVisible() {
        return visible;
    }

    protected void setVisible(boolean isVisible) {
        this.visible = isVisible;
    }

    public void setImage(Image imageParam) {
        this.image = imageParam;
    }

    public Image getImage() {
        return image;
    }

    public void setY(int posYParam) {
        this.posY = posYParam;
    }

    public int getY() {
        return posY;
    }

    public int getX() {
        return posX;
    }

    public void setDying(boolean isDying) {
        this.dying = isDying;
    }

    public boolean isDying() {
        return this.dying;
    }
}
