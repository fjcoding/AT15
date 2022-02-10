package org.fundacionjala.at15.katas.langtonant.agustin;

public class Ant {

    // variables
    int xPos;
    int yPos;
    // direction
    String direction;
    Grid grid;
    int steps;

    public Ant(int xPos, int yPos, String direction, Grid grid, int steps) {
        // constructor
        this.xPos = xPos;
        this.yPos = yPos;
        this.direction = direction;
        this.grid = grid;
        this.steps = steps;
    }


    // Setters

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void printCoordinates() {

        System.out.println("x: " + xPos + ", " + "y: " + yPos + ", " +
                "Facing: " + direction + ", " + "Color: " + (grid.isWhite(xPos, yPos) ? "BLACK" : "WHITE"));
    }

    public void moveNorth() {
        setDirection("NORTH");
        yPos++;
        grid.printGrid();
        steps--;
        printCoordinates();
    }

    public void moveSouth() {
        setDirection("SOUTH");
        yPos--;
        grid.printGrid();
        steps--;
        printCoordinates();
    }

    public void moveEast() {
        setDirection("EAST");
        xPos++;
        grid.printGrid();
        steps--;
        printCoordinates();
    }

    public void moveWest() {
        setDirection("WEST");
        xPos--;
        grid.printGrid();
        steps--;
        printCoordinates();
    }

    public void run() {

        while (xPos >= 0 && yPos >= 0 && xPos < grid.getWidth() && yPos < grid.getHeight() && steps > 0) {

            switch (direction) {

                case "NORTH":
                    if (grid.isWhite(xPos, yPos)) {
                        grid.setBlack(xPos,yPos);
                        moveWest();
                    } else {
                        grid.setWhite(xPos,yPos);
                        moveEast();
                    }
                    break;

                case "WEST":
                    if(grid.isWhite(xPos, yPos)) {
                        grid.setBlack(xPos,yPos);
                        moveSouth();
                    } else {
                        grid.setWhite(xPos,yPos);
                        moveNorth();
                    }
                    break;

                case "SOUTH":
                    if(grid.isWhite(xPos,yPos)) {
                        grid.setBlack(xPos,yPos);
                        moveEast();
                    } else {
                        grid.setWhite(xPos,yPos);
                        moveWest();
                    }
                    break;
                case "EAST":
                    if(grid.isWhite(xPos,yPos)) {
                        grid.setBlack(xPos,yPos);
                        moveNorth();
                    } else {
                        grid.setBlack(xPos,yPos);
                        moveSouth();
                    }
            }
        }
    }
}
