package org.fundacionjala.at15.katas.langtonant.saul;

public class Grid {
    private int rows;
    private int columns;
    private int[][] grid;
    
    public Grid(int rows, int columns){
        
        this.rows    = rows;
        this.columns = columns;
        grid = new int[rows][columns];

        fillGrid();
    }

    /**
     * 
     */
    public void fillGrid(){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                grid[i][j] = 1;                 // Fill the Grid with '1' (all white)
            }
        }
    }

    /**
     * Print the Grid
     */
    public void printGrid(){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(grid[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public int getSquare(int x, int y){
        return grid[x][y];
    }

    

    public void changeSquare(int x, int y){
        if(grid[x][y] == 1)
            grid[x][y] = 0;
        else
            grid[x][y] = 1;
    }

    public int getRows(){
        return grid.length;
    }

    public int getColumns(){
        return grid[0].length;
    }
}
