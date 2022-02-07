package org.fundacionjala.at15.katas.langtonant;

public class Ant {
    // TODO: Make Ant Class with constructor and methods

    // variables
    int xPos;
    int yPos;
    // direction
    String direction;
    Grid g;
    boolean isFinished;

    public Ant(int xPos, int yPos, String direction, Grid g) {
        // constructor
        this.xPos = xPos;
        this.yPos = yPos;
        this.direction = direction;
        this.g = g;
    }

    // Getter coordinates


    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

    // Setters

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void run() {
        //TODO: while(!isFinished) determine direction, change tile color
    }
}
