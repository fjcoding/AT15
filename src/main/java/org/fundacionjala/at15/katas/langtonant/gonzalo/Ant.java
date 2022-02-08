package org.fundacionjala.at15.katas.langtonant.gonzalo;

public class Ant{
    private int posX;
    private int posY;
    private Grid grid;
    private String direction;
    private boolean finished;

    public Ant(int x, int y, Grid grid, String direction){
        posX = x;
        posY = y;
        this.grid = grid;
        this.direction = direction;
        finished = false;           
    }
//this function is for the ant to give next step
    public void nextStep(){
        switch (direction) {
            case "up":
                if(grid.getSquare(posX, posY) == 1){          
                    if(isValidNextPosition(posX, posY+1, "right")){
                        grid.changeSquare(posX, posY);
                        posY += 1;
                        this.direction = "right";
                    }else
                        finished = true;
                }else{
                    if(isValidNextPosition(posX, posY-1, "left")){
                        grid.changeSquare(posX, posY);
                        posY -= 1;
                        this.direction = "left";
                    }else  
                        finished = true;
                }
                break;
            case "right":
                if(grid.getSquare(posX, posY) == 1){
                    if(isValidNextPosition(posX+1, posY, "down")){
                        grid.changeSquare(posX, posY);
                        posX++;
                        direction = "down";
                    }else
                        finished = true;
                }else{
                    if(isValidNextPosition(posX-1, posY, "up")){
                        grid.changeSquare(posX, posY);
                        posX--;
                        direction = "up";
                    }else
                        finished = true;
                }
                break;

            case "left":
                if(grid.getSquare(posX, posY) == 1){
                    if(isValidNextPosition(posX-1, posY, "up")){
                        grid.changeSquare(posX, posY);
                        posX--;
                        direction = "up";
                    }else
                        finished = true;
                }else{
                    if(isValidNextPosition(posX+1, posY, "down")){
                        grid.changeSquare(posX, posY);
                        posX++;
                        direction = "down";
                    }else
                        finished = true;
                }
                break;

            case "down":
                if(grid.getSquare(posX, posY) == 1){
                    if(isValidNextPosition(posX, posY-1, "left")){
                        grid.changeSquare(posX, posY);
                        posY--;
                        direction = "left";
                    }else
                        finished = true;
                }else{
                    if(isValidNextPosition(posX, posY+1, "right")){
                        grid.changeSquare(posX, posY);
                        posY++;
                        direction = "right";
                    }else
                        finished = true;
                    break;
            
                }
        }
            
    }
//this function verifies if the next position is valid or not
    public boolean isValidNextPosition(int x, int y, String dir){
        boolean flag = false;
        
        switch (dir) {
            case "up":
                if(x > 0)
                    flag = true;
                break;

            case "left":
                if(y > 0)
                    flag = true;
                break;

            case "right":
                if(y < grid.getColumns()-1)
                    flag = true;
                    break;

            case "down":
                if(x < grid.getRows()-1)
                    flag = true;
                    break;
        }
        return flag;
    }
//this funtion verifies if the game continues or not
    public void game(int n){
        grid.printGrid();
        System.out.println();
        while(n > 0){
            if(finished == false){
                nextStep();
                n--;
            }
            System.out.println();
            grid.printGrid();
        }
        System.out.println("The game is over...");
    }
}