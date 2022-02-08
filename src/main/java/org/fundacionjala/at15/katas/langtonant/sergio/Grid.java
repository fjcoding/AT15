package org.fundacionjala.at15.katas.langtonant.sergio;

public class Grid {
    //atributos
    private boolean [][] grid;
    private int height;
    private int width;

    //constructor
    public Grid(int height, int width){
        this.height = height;
        this.width = width;
        grid = new boolean [height][width];
    }

    //metodos 
    //getters

    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    public boolean[][] getGrid(){
        return grid;        
    }
    public boolean isWhite(int h,int w){
        return grid[h][w];
    }
    //setters

    public void setWhite(int h, int w){
        if(h<height && w<width){
            this.grid[h][w]=true;
        }        
    }
    public void setBlack(int h, int w){
        if(h<height && w<width){
            this.grid[h][w]=false;
        }
    }
    public void printGrid(){
        for(int h=0;h<height;h++){
            for (int w=0;w<width;w++){
                if (isWhite(h,w)){
                    System.out.print(" ");
                }else {
                    System.out.print("x");
                }
            }System.out.println();
        }
    }
    
}
