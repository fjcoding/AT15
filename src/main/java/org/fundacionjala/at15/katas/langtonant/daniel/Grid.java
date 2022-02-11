package org.fundacionjala.at15.katas.langtonant.daniel;

public class Grid {
    private int rows;
    private int columns;
    private int[][] grid;

    public Grid(int rows, int columns) {

        this.rows = rows;
        this.columns = columns;
        grid = new int[rows][columns];

        fillGrid();
    }

    /**
     * Fill the Grid with "1"
     */
    public void fillGrid() {
        for (int posI = 0; posI < rows; posI++) {
            for (int posJ = 0; posJ < columns; posJ++) {
                grid[posI][posJ] = 1;
            }
        }
    }

    /**
     * Print the Grid
     */
    public void printGrid() {
        for (int posI = 0; posI < rows; posI++) {
            for (int posJ = 0; posJ < columns; posJ++) {
                System.out.print(grid[posI][posJ] + "  ");
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
