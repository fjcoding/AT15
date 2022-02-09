package org.fundacionjala.at15.katas.langtonant.sergio;

public class Ant {
    private int xPos;
    private int yPos;
    private String direction;
    private int moves;
    private boolean wall;
    private Grid grid;

    public Ant(int xPos, int yPos, String direction, int moves, Grid grid) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.direction = direction;
        this.moves = moves;
        this.grid = grid;
    }
    public int getXPos() {
        return xPos;
    }
    public int getYPos() {
        return yPos;
    }
    public String getDirection() {
        return direction;
    }
    public void setXPos(int xPosNew) {
        this.xPos = xPosNew;
    }
    public void setYPos(int yPosNew) {
        this.yPos = yPosNew;
    }
    public void setDirection(String directionNew) {
        this.direction = directionNew;
    }
    public void wall(int currentXPos, int currentYPos, String currentDirection) {

        if (xPos == 0 && direction == "left") {
            this.wall = true;
        } else if (xPos == grid.getColumns() && direction == "right") {
            this.wall = true;
        } else if (yPos == 0 && direction == "up") {
            this.wall = true;
        } else if (yPos == grid.getRows() && direction == "down") {
            this.wall = true;
        } else if (yPos == 0 && xPos == 0 && (direction == "up" || direction == "left")) {
            this.wall = true;
        } else if (yPos == grid.getRows() && xPos == 0 && (direction == "down" || direction == "left")) {
            this.wall = true;
        } else if (yPos == 0 && xPos == grid.getColumns() && (direction == "up" || direction == "right")) {
            this.wall = true;
        } else if (yPos == grid.getRows() && xPos == grid.getColumns() && (direction == "down" || direction == "right")) {
            this.wall = true;
        }
    }

    private void changeDirection(String currentDirection) {
        if (grid.isWhite(xPos, yPos) && currentDirection.equals("up")) {
              setDirection("right");
        } else if (grid.isWhite(xPos, yPos) && currentDirection.equals("right")) {
            setDirection("down");
        } else if (grid.isWhite(xPos, yPos) && currentDirection.equals("down")) {
            setDirection("left");
        } else if (grid.isWhite(xPos, yPos) && currentDirection.equals("left")) {
            setDirection("up");
        } else if (!grid.isWhite(xPos, yPos) && currentDirection.equals("up")) {
            setDirection("left");
        } else if (!grid.isWhite(xPos, yPos) && currentDirection.equals("right")) {
            setDirection("up");
        } else if (!grid.isWhite(xPos, yPos) && currentDirection.equals("down")) {
            setDirection("right");
        } else if (!grid.isWhite(xPos, yPos) && currentDirection.equals("left")) {
            setDirection("down");
        }
    }

    private void changeColor() {
        if (grid.isWhite(xPos, yPos)) {
            grid.setBlack(xPos, yPos);
        } else {
            grid.setWhite(xPos, yPos);
        }
    }

    private void newPosition(String currentDirection) {
        if (currentDirection.equals("up")) {
            yPos--;
      } else if (currentDirection.equals("right")) {
          xPos++;
      } else if (currentDirection.equals("left")) {
        xPos--;
      } else if (currentDirection.equals("down")) {
        yPos++;
      }
    }

    public void antMovemenet(String currentDirection) {
        changeColor();
        changeDirection(currentDirection);
        newPosition(currentDirection);
        grid.printGrid();
    }

    public void run() {

        wall(xPos, yPos, direction);
        if (wall) {
            System.out.println("The Ant can't go on");
        } else {
                while (xPos >= 0 && yPos >= 0 && xPos < grid.getColumns() && yPos < grid.getRows() && moves != 0) {
                System.out.println("x:" + xPos + "\ny:" + yPos + "\ndirection: " + direction + "\ncolor: " + grid.isWhite(xPos, yPos));

                antMovemenet(direction);

                moves = moves - 1;
            }
        }
    }
}
