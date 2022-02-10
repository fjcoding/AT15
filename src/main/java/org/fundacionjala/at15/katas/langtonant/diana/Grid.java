package org.fundacionjala.at15.katas.langtonant.diana;

public class Grid {
    private int rows;
    private int columns;
    private int[][] matrix;

    public Grid(int rows, int columns) {

        this.rows = rows;
        this.columns = columns;
        matrix = new int[rows][columns];
        fillGrid();
    }

    public void fillGrid() { // Fill the matrix with 1
        for (int indexRows = 0; indexRows < rows; indexRows++) {
            for (int indexColumns = 0; indexColumns < columns; indexColumns++) {
                matrix[indexRows][indexColumns] = 1;
            }
        }
    }

    public void printGrid() { // Print the matrix
        for (int indexRows = 0; indexRows < rows; indexRows++) {
            for (int indexColumns = 0; indexColumns < columns; indexColumns++) {
                System.out.print(matrix[indexRows][indexColumns] + " ");
            }
            System.out.println();
        }
    }

    public int getSquare(int x, int y) { // Get the position in the matrix
        return matrix[x][y];
    }

    public void changeSquare(int x, int y) { // Get the value or the matrix
        if (matrix[x][y] == 1) {
            matrix[x][y] = 0;
        } else {
            matrix[x][y] = 1;
        }
    }

    public int getRows() { // returns number of rows
        return rows;
    }

    public int getColumns() { // returns number of columns
        return columns;
    }
}
