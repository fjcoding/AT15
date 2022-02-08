package org.fundacionjala.at15.katas.langtonant.adhemar;

public class Grid {
    int rows;
    int columns;
    boolean matrix[][];

    public Grid(int rows, int columns, boolean color) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new boolean[rows][columns];
        this.createMatrix(color);
    }

    public void createMatrix(boolean color) {
        if( color ) {
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.columns; j++) {
                    this.matrix[i][j] = true;
                }
            }
        }
    }

    public void printGrid() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
