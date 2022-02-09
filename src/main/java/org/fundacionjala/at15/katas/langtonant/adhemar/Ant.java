package org.fundacionjala.at15.katas.langtonant.adhemar;

public class Ant {
    private int row;
    private int column;
    private int direction = 1; //Up: 1, rigth: 2, down: 3, left: 4

    public Ant(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

    public int getDirection() {
        return this.direction;
    }

    public void start(int steps, Grid grid) {
        for (int index = 0; index < steps; index++) {
            boolean currentColor = grid.getCurrentColor(this.row, this.column);

            grid.changeColor(this.row, this.column, !currentColor);

            this.turn(currentColor);
            this.move(grid);
        }
    }

    public void turn(boolean color) {
        if (color) {
            if ( this.direction - 1 == 0) {
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

    public void move(Grid grid) {
        switch (this.direction) {
            case 1:
                if (this.row - 1 == -1) {
                    this.row = 0;
                } else {
                    this.row = this.row - 1;
                }
                break;
            case 2:
                if (this.column + 1 == grid.getColumns()) {
                    this.column = grid.getColumns() - 1;
                } else {
                    this.column = this.column + 1;
                }
                break;
            case 3:
                if (this.row + 1 == grid.getRows()) {
                    this.row = grid.getRows() - 1;
                } else {
                    this.row = this.row + 1;
                }
                break;
            case 4:
                if (this.column - 1 == -1) {
                    this.column = 0;
                } else {
                    this.column = this.column - 1;
                }
                break;
            default:
                System.out.println("There is a problem with ant's position");
        }
    }
}
