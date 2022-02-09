package org.fundacionjala.at15.katas.langtonant.saul;

public class Grid {
    private int rows;
    private int columns;
    private int[][] grid;
    public Grid(int rows, int columns) {
        this.rows    = rows;
        this.columns = columns;
        grid = new int[rows][columns];

        fillGrid();
    }

    public void fillGrid() {
        for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
            for (int columnsIndex = 0; columnsIndex < columns; columnsIndex++) {
                grid[rowIndex][columnsIndex] = 1;                 // Fill the Grid with '1' (all white)
            }
        }
    }

    /**
     * Print the Grid
     */
    public void printGrid() {
        for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
            for (int columnsIndex = 0; columnsIndex < columns; columnsIndex++) {
                System.out.print(grid[rowIndex][columnsIndex] + "  ");
            }
            System.out.println();
        }
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

    public int getRows() {
        return grid.length;
    }

    public int getColumns() {
        return grid[0].length;
    }
}