package org.fundacionjala.at15.katas.langtonant.adhemar;

public class Ant {
    int row;
    int column;
    int direction = 3; //Up: 1, rigth: 2, down: 3, left: 4

    public Ant(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void move(int steps, Grid grid) {
        for (int i = 0; i < steps; i++) {
            boolean currentColor = grid.getCurrentColor(row, column);
            //Change color
            grid.changeColor(row, column, !currentColor);
            //turn
            this.turn(currentColor);

            //check border

            //move
        }
    }

    public void turn(boolean color) {
        if (color) {
            if( this.direction - 1 == 0) {
                this.direction = 4;
            } else {
                this.direction = this.direction - 1;
            }
        } else {
            if( this.direction + 1 == 5) {
                this.direction = 1;
            } else {
                this.direction = this.direction + 1;
            }
        }
    }
}
