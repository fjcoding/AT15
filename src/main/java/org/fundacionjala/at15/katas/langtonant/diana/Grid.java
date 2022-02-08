package org.fundacionjala.at15.katas.langtonant.diana;

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

    public void fillGrid() { // Fill the matrix with 1
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                grid[i][j] = 1; // Fill the Grid with '1' (white)
            }
        }
    }

    public void printGrid() { // Print the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(grid[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public int getSquare(int x, int y) { // Get the position in the matrix
        return grid[x][y];
    }

    public void changeSquare(int x, int y) { // Get the value or the matrix
        if (grid[x][y] == 1)
            grid[x][y] = 0;
        else
            grid[x][y] = 1;
    }

    public int getRows() { // returns number of rows
        return grid.length;
    }

    public int getColumns() { // returns number of columns
        return grid[0].length;
    }
}
