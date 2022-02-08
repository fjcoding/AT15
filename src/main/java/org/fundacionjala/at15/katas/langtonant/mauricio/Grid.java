package org.fundacionjala.at15.katas.langtonant.mauricio;

public class Grid {
    // Define the variables
    int[][] grid;
    int rows;
    int columns;

    public Grid(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        grid = new int[rows][columns];
        fillGrid();
    }

    public int getRows(){
        return rows;
    }
    public int getColumns(){
        return columns;
    }

    public int getSquare(int x, int y){
        return grid[x][y];
    }
    
    public void changeSquare(int x, int y){
        if(grid[x][y] ==1)
            grid[x][y] =0;
        else
            grid[x][y] =1;
    }

    public void fillGrid() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                grid[i][j] = 0;
            }
        }
    }

    public void printGrid() {

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                System.out.print(grid[i][j] + "  ");

            }

            System.out.println();

        }

    }

}