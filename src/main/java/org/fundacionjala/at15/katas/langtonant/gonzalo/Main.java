package org.fundacionjala.at15.katas.langtonant.gonzalo;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is Gonzalo's Kata Langtonant exercise");
        String pos="up"; 
        int steps=(int)(Math.random()*10+1);
        int initialPosX=(int)(Math.random()*9+1);
        int initialPosY=(int)(Math.random()*9+1);
        int wideGrid=10;
        int highGrid=10;
        System.out.println("The grid is: "+wideGrid+"*"+highGrid+":");
        System.out.println("this is the numbers of steps: "+steps+",this is the X position: "+initialPosX+",this is the Y position: "+initialPosY+":");
        move(steps, pos, initialPosX, initialPosY, wideGrid,highGrid);
    }
    
    static void move(int amountSteps, String orientation, int posX, int posY, int wide, int high){
        Grid grid=new Grid(wide,high);
        Ant ant=new Ant();
        String orient=orientation;
        int steps=amountSteps;
        int counter=0;
        grid.loadGrid();
        char valueBlack='█';
        char valueWhite='░';
        while(counter<steps){
            if(orient=="up"&&grid.getPosition(posX, posY)==valueBlack){   
                loadFunctionOfGrid(posX, posY, grid);
                posY++;
                if(posY>wide-1){
                    counter=steps;
                }
                else{
                    orient=ant.lookingRight();
                    System.out.println();
                }
            }
            else if(orient=="up"&&grid.getPosition(posX, posY)==valueWhite){  
                loadFunctionOfGrid(posX, posY, grid);
                posY--;
                if(posY<0){
                    counter=steps;
                }
                else{
                    orient=ant.lookingLeft();
                    System.out.println();
                }
            }
            else if(orient=="down"&&grid.getPosition(posX, posY)==valueBlack){
                loadFunctionOfGrid(posX, posY, grid);
                posY--;
                if(posY<0){
                    counter=steps;
                }
                else{
                    orient=ant.lookingLeft();
                    System.out.println();
                }
            }
            else if(orient=="down"&&grid.getPosition(posX, posY)==valueWhite){
                loadFunctionOfGrid(posX, posY,grid);
                posY++;
                if(posY>wide-1){
                    counter=steps;
                }
                else{
                    orient=ant.lookingRight();
                    System.out.println();
                }
            }
            else if(orient=="right"&&grid.getPosition(posX, posY)==valueBlack){
                loadFunctionOfGrid(posX, posY, grid);
                posX++;
                if(posX>high-1){
                    counter=steps;
                }
                else{
                    orient=ant.lookingDown();
                    System.out.println();
                }
            }
            else if(orient=="right"&&grid.getPosition(posX, posY)==valueWhite){
                loadFunctionOfGrid(posX, posY, grid);
                posX--;
                if(posX<0){
                    counter=steps;
                }
                else{
                    orient=ant.lookingUp();
                    System.out.println();
                }
            }
            else if(orient=="left"&&grid.getPosition(posX, posY)==valueBlack){
                loadFunctionOfGrid(posX, posY, grid);
                posX--;
                if(posX<0){
                    counter=steps;
                }
                else{
                    orient=ant.lookingUp();
                    System.out.println();
                }
            }
            else if(orient=="left"&&grid.getPosition(posX, posY)==valueWhite){ 
                loadFunctionOfGrid(posX, posY, grid);
                posX++;
                if(posX>high-1){
                    counter=steps;
                }
                else{
                    orient=ant.lookingDown();
                    System.out.println();
                }
            }
            counter++;
        }
        System.out.println("Game Over");
    }
    
    static void loadFunctionOfGrid(int posX, int posY, Grid grid){
        grid.getPosition(posX, posY);
        grid.changeValue(posX, posY);
        grid.printGrid();
    }
    
}

