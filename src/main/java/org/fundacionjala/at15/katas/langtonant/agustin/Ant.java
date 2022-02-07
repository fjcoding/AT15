package org.fundacionjala.at15.katas.langtonant.agustin;

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

        while (xPos >= 0 && yPos >= 0 && xPos < g.getWidth() && yPos < g.getHeight() && !isFinished) {
            System.out.println("x: " + xPos + ", " + "y: " + yPos + ", " + "Facing: " + direction + ", " + "Color: " + g.isWhite(xPos, yPos));
            if (xPos == 0) {
                isFinished = true;
            } else if (xPos == g.getWidth()) {
                isFinished = true;
            } else if (yPos == 0) {
                isFinished = true;
            } else if (yPos == g.getHeight()) {
                isFinished = true;
            }

            // direction

            if (direction.equals("NORTH")) {
                if (g.isWhite(xPos, yPos)) {
                    g.setBlack(xPos,yPos);
                    setDirection("WEST");
                    xPos--; //move west
                    g.printGrid();
                } else {
                    g.setWhite(xPos,yPos);
                    setDirection("EAST");
                    xPos++; // move east
                    g.printGrid();
                }
            } else if (direction.equals("WEST")) {
                if(g.isWhite(xPos, yPos)) {
                    g.setBlack(xPos,yPos);
                    setDirection("SOUTH");
                    yPos--;
                    g.printGrid();
                } else {
                    g.setWhite(xPos,yPos);
                    setDirection("NORTH");
                    yPos++;
                    g.printGrid();
                }
            } else if (direction.equals("SOUTH")) {
                if(g.isWhite(xPos,yPos)) {
                    g.setBlack(xPos,yPos);
                    setDirection("EAST");
                    xPos++;
                    g.printGrid();
                } else {
                    g.setWhite(xPos,yPos);
                    setDirection("WEST");
                    xPos--;
                    g.printGrid();
                }
            } else if (direction.equals("EAST")) {
                if(g.isWhite(xPos,yPos)) {
                    g.setBlack(xPos,yPos);
                    setDirection("NORTH");
                    yPos++;
                    g.printGrid();
                } else {
                    g.setBlack(xPos,yPos);
                    setDirection("SOUTH");
                    yPos--;
                    g.printGrid();
                }
            }
        }
    }
}
