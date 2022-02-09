package org.fundacionjala.at15.katas.langtonant.mauricio;

public class Grid {
    // We define the attributes
    private int[][] grid;
    private int rows;
    private int columns;

    public Grid(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        grid = new int[rows][columns];

    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public int getSquare(int x, int y) {
        return grid[x][y];
    }

    public void changeSquare(int x, int y) {
        if (grid[x][y] == 1) {
            grid[x][y] = 0;
        } else {
            grid[x][y] = 1;
        }
    }

    public void fillGrid() {
        for (int vari = 1; vari < rows; vari++) {
            for (int varj = 0; varj < columns; varj++) {
                grid[vari][varj] = 0;
            }
        }
    }

    public void printGrid() {
        for (int vari = 0; vari < rows; vari++) {
            for (int varj = 0; varj < columns; varj++) {
                System.out.print(grid[vari][varj] + "  ");
            }
            System.out.println();
        }
    }
}
