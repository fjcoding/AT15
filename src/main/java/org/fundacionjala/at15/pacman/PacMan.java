package org.fundacionjala.at15.pacman;

public class PacMan {
    private int posx = 0;
    private int posy = 0;
    private boolean state = true;

    public PacMan() {
    }

    public PacMan(int posx, int posy, boolean state) {
        this.posx = posx;
        this.posy = posy;
        this.state = state;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public boolean isState() {
        return state;
    }

    public void setPosx(int posX) {
        this.posx = posX;
    }

    public void setPosy(int posY) {
        this.posy = posY;
    }

    public void setState(boolean stateVm) {
        this.state = stateVm;
    }

}