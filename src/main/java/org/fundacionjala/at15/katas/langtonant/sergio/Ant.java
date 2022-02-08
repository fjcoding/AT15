package org.fundacionjala.at15.katas.langtonant.sergio;

public class Ant {
    private int xPos;
    private int yPos;
    private String direction;
    Grid grid;
    boolean isWall;

    public Ant(int xPos, int yPos, String direction, Grid grid){
        this.xPos = xPos;
        this.yPos = yPos;
        this.direction = direction;
        this.grid = grid;
    }
    public void setXPos(int xPos){
        this.xPos = xPos;
    }
    public void setYPos(int yPos){
        this.yPos = yPos;
    }
    public void setDirection(String direction){
        this.direction = direction;
    }

    public void run(){
        
        String color;
        if (grid.isWhite(xPos, yPos)){
            color = "White"; 
        }else{
            color = "Black";
        }
        while (xPos >= 0 && yPos >= 0 && xPos < grid.getWidth() && yPos < grid.getHeight()&& !isWall){
            System.out.println("x:"+xPos+"\n y:"+yPos+"\n direction: "+direction+"\n color: "+color);
            if (xPos == 0 && direction == "left"){
                isWall = true;
                System.out.println("I can't go on anymore");                
            }else if (xPos == grid.getWidth() && direction == "right"){
                isWall = true;
                System.out.println("I can't go on anymore");
            }else if (yPos == 0 && direction == "up"){
                isWall = true;
                System.out.println("I can't go on anymore");
            }else if (yPos == grid.getHeight()&& direction=="down"){
                isWall = true;
                System.out.println("I can't go on anymore");
            }else if (yPos == 0 && xPos == 0 && (direction == "up" || direction == "left")){
                isWall = true;
                System.out.println("I can't go on anymore");
            }else if (yPos == grid.getHeight() && xPos == 0 && (direction == "down" || direction == "left")){
                isWall = true;
                System.out.println("I can't go on anymore");
            }else if (yPos == 0 && xPos == grid.getWidth() && (direction == "up" || direction == "right")){
                isWall = true;
                System.out.println("I can't go on anymore");
            }else if (yPos == grid.getHeight() && xPos == grid.getWidth() && (direction == "down" || direction == "right")){
                isWall = true;
                System.out.println("I can't go on anymore");
            }

            if (direction == "up"){
                if(grid.isWhite(xPos,yPos)){
                    grid.setBlack(xPos,yPos);
                    setDirection("right");
                    xPos++;
                    grid.printGrid();
                }else{
                    grid.setWhite(xPos,yPos);
                    setDirection("left");
                    xPos--;
                }
            }else if (direction == "right"){
                if(grid.isWhite(xPos,yPos)){
                    grid.setBlack(xPos,yPos);
                    setDirection("down");
                    yPos--;
                    grid.printGrid();
                }else{
                    grid.setWhite(xPos,yPos);
                    setDirection("up");
                    yPos++;
                } 
            }else if (direction == "down"){
                if(grid.isWhite(xPos,yPos)){
                    grid.setBlack(xPos,yPos);
                    setDirection("left");
                    xPos--;
                    grid.printGrid();
                }else{
                    grid.setWhite(xPos,yPos);
                    setDirection("right");
                    xPos++;
                }
            }else if (direction == "left"){
                if(grid.isWhite(xPos,yPos)){
                    grid.setBlack(xPos,yPos);
                    setDirection("up");
                    yPos++;
                    grid.printGrid();
                }else{
                    grid.setWhite(xPos,yPos);
                    setDirection("down");
                    yPos--;
                }
            }
        }

    }

    
}
