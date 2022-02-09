package org.fundacionjala.at15.katas.langtonant.alvaro;

public class Grid {
    
    
    private int sizeY;
    private int sizeX;
    private int[][] grid;
    
    public Grid(int sizeX, int  sizeY) 
    {
        grid=new int [sizeX][sizeY];
        this.sizeY = sizeY; // y 
        this.sizeX = sizeX;     //x
        
    }
    public void createGrid(){

        for (int x = 0; x < sizeX; x++) {
            for (int y = 0; y < sizeY; y++) {
                grid[x][y]='O'; //llenamos blanco
             }
        }
    }  
    public void printGrid() {
        for (int x = 0; x < sizeX; x++) {
            for (int y = 0; y < sizeY; y++) {
                 
                
                System.out.print(grid[x][y]);
                System.out.print(" ");

                
            }
            System.out.println();
        }
    }
    public int getPos(int x, int y)
    {
        return grid[x][y];
    }
    public void changePos(int x, int y)
    {
        grid[x][y]='X';
    }
    public int getSizex()
    {
        return sizeX;
    }
    public int getSizey()
    {
        return sizeY;
    }

}