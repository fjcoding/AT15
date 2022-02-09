package org.fundacionjala.at15.katas.langtonant.sergio;

public class Grid {
    //atributos
    private boolean [][] grid;
    private int columns;
    private int rows;

    //constructor
    public Grid(int columns, int rows){
        this.columns = columns;
        this.rows = rows;
        grid = new boolean [columns][rows];
    }

    //metodos 
    //getters

    public int getColumns(){
        return columns;
    }
    public int getRows(){
        return rows;
    }
    public boolean[][] getGrid(){
        return grid;        
    }
    public boolean isWhite(int currentColumn,int currentRow){
        return grid[currentColumn][currentRow];
    }
    //setters

    public void setWhite(int currentColumn, int currentRow){
        if(currentColumn < columns && currentRow < rows){
            this.grid[currentColumn][currentRow]=true;
        }        
    }
    public void setBlack(int currentColumn, int currentRow){
        if(currentColumn < columns && currentRow < rows){
            this.grid[currentColumn][currentRow]=false;
        }
    }
    public void printGrid(){
        for(int j=0;j<rows;j++){
            for (int i=0;i<columns;i++){
                if (isWhite (i, j)){
                    System.out.print(" ");
                }else {
                    System.out.print("x");
                }
            }System.out.println();
        }
    }
    
}
