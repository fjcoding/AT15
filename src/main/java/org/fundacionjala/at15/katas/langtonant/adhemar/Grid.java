package org.fundacionjala.at15.katas.langtonant.adhemar;

public class Grid {
    private int rows;
    private int columns;
    private boolean matrix[][];

    public Grid(int rows, int columns, boolean color) {
        this.rows = rows;
        this.columns = columns;
        this.matrix = new boolean[rows][columns];
        this.createMatrix(color);
    }

    public int getRows() {
        return this.rows;
    }

    public int getColumns() {
        return this.columns;
    }

    public void createMatrix(boolean color) {
        if (color) {
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < this.columns; j++) {
                    this.matrix[i][j] = true;
                }
            }
        }
    }

    public boolean getCurrentColor(int row, int column) {
        return this.matrix[row][column];
    }

    public void changeColor(int row, int column, boolean color) {
        this.matrix[row][column] = color;
    }

    public void printGrid() {
        for (int indexRow = 0; indexRow < this.rows; indexRow++) {
            for (int indexCol = 0; indexCol < this.columns; indexCol++) {
                System.out.print(this.matrix[indexRow][indexCol] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
