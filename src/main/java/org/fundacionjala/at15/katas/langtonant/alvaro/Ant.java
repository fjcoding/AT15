package org.fundacionjala.at15.katas.langtonant.alvaro;

public class Ant {
    private int posX;
    private int posY;
    private Grid grid;
    private char direction;

    public Ant(int posX, int posY, Grid grid, char direction) {
        this.posX = posX;
        this.posY = posY;
        this.grid = grid;
        this.direction = direction;


    }
    public void nextStep() {
        if (direction == 'u') { //up
            if (grid.getPos(posX, posY) == 0) { //if it is white
                grid.changetoBlack(posX, posY); //put X (black)
                posY++;
                direction = 'r';
            } else { //If it's black, I'll change it to white
                grid.changetoWhite(posX, posY); //put 0 (white)
                direction = 'l';
                posY--;
            }

        } else if (direction == 'd') { //down
            if (grid.getPos(posX, posY) == 0) {
                grid.changetoBlack(posX, posY);
                posY--;
                direction = 'l';
            } else {
                grid.changetoWhite(posX, posY);
                direction = 'r';
                posY++;
            }
        } else if (direction == 'r') { //rigth
            if (grid.getPos(posX, posY) == 0) {
                grid.changetoBlack(posX, posY);
                posX++;
                direction = 'd';
            } else {
                grid.changetoWhite(posX, posY);
                direction = 'u';
                posX--;
            }
        } else if (direction == 'l') { //left
            if (grid.getPos(posX, posY) == 0) {
                grid.changetoBlack(posX, posY);
                posX--;
                direction = 'u';
            } else {
                grid.changetoWhite(posX, posY);
                direction = 'd';
                posX--;
            }
        }
    }
    public void run(int jumps) {
        grid.printGrid();
        for (int index = 0; index <= jumps; index++) {
            nextStep();
            System.out.println();
            System.out.println("number of runs" + index);
            grid.printGrid();
        }
    }
}