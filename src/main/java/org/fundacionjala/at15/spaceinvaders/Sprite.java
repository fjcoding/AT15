package org.fundacionjala.at15.spaceinvaders;
import java.awt.Image;

public class Sprite {

    private boolean visible;
    private Image image;
    protected boolean dying;

    protected int posX;
    protected int posY;

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

    public void setPosX(int posXParam) {
        this.posX = posXParam;
    }

    public void setPosY(int posYParam) {
        this.posY = posYParam;
    }

    public int getPosY() {
        return posY;
    }

    public int getPosX() {
        return posX;
    }

    public void setDying(boolean isDying) {
        this.dying = isDying;
    }

    public boolean isDying() {
        return this.dying;
    }
}
