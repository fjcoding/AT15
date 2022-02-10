package org.fundacionjala.at15.katas.langtonant.gonzalo;

public class Main {
    static Grid grid=new Grid(10,10);
    static Ant ant=new Ant();
    
    public static void main(String[] args) {
        System.out.println("This is Gonzalo's Kata Langtonant exercise");
        String pos="up"; 
        int steps=(int)(Math.random()*10+1);
        int initialPosX=(int)(Math.random()*9+1);
        int initialPosY=(int)(Math.random()*9+1);
        System.out.println("this is the numbers of steps: "+steps+",this is the X position: "+initialPosX+",this is the Y position: "+initialPosY+":");
        move(steps, pos, initialPosX, initialPosY);
    }
    
    static void move(int amountSteps, String orientation, int posX, int posY){
        
        String orient=orientation;
        int steps=amountSteps;
        int counter=0;
        grid.loadGrid();
        //char valueSquare='█';
        while(counter<steps){
            if(orient=="up"&&grid.getPosition(posX, posY)=='█'){   
                loadFunctionOfGrid(posX, posY);
                posY++;
                orient=ant.lookingRight();
                System.out.println();
            }
            else if(orient=="up"&&grid.getPosition(posX, posY)=='░'){  
                loadFunctionOfGrid(posX, posY);
                posY--;
                orient=ant.lookingLeft();
                System.out.println();
            }
            else if(orient=="down"&&grid.getPosition(posX, posY)=='█'){
                loadFunctionOfGrid(posX, posY);
                posY--;
                orient=ant.lookingLeft();
                System.out.println();
            }
            else if(orient=="down"&&grid.getPosition(posX, posY)=='░'){
                loadFunctionOfGrid(posX, posY);
                posY++;
                orient=ant.lookingRight();
                System.out.println();
            }
            else if(orient=="right"&&grid.getPosition(posX, posY)=='█'){
                loadFunctionOfGrid(posX, posY);
                posX++;
                orient=ant.lookingDown();
                System.out.println();
            }
            else if(orient=="right"&&grid.getPosition(posX, posY)=='░'){
                loadFunctionOfGrid(posX, posY);
                posX--;
                orient=ant.lookingUp();
                System.out.println();
            }
            else if(orient=="left"&&grid.getPosition(posX, posY)=='█'){
                loadFunctionOfGrid(posX, posY);
                posX--;
                orient=ant.lookingUp();
                System.out.println();
            }
            else if(orient=="left"&&grid.getPosition(posX, posY)=='░'){ 
                loadFunctionOfGrid(posX, posY);
                posX++;
                orient=ant.lookingDown();
                System.out.println();
            }
            counter++;
        }
    }
    
    static void loadFunctionOfGrid(int posX, int posY){
        grid.getPosition(posX, posY);
        grid.changeValue(posX, posY);
        grid.printGrid();
    }
    
}
