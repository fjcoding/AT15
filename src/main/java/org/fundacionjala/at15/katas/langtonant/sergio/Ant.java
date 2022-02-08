package org.fundacionjala.at15.katas.langtonant.sergio;

public class Ant {
    private int xPos;
    private int yPos;
    private String direction;
    private int moves;
    Grid grid;
    boolean isWall;

    public Ant(int xPos, int yPos, String direction, int moves, Grid grid){
        this.xPos = xPos;
        this.yPos = yPos;
        this.direction = direction;
        this.moves = moves;
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
        
        //String color;
        //if (grid.isWhite(xPos, yPos)){
        //    color = "White"; 
        //}else{
        //    color = "Black";
        //}
        while (xPos >= 0 && yPos >= 0 && xPos < grid.getHeight() && yPos < grid.getWidth()&& !isWall && moves !=0){
            System.out.println("x:"+xPos+"\ny:"+yPos+"\ndirection: "+direction+"\ncolor: "+grid.isWhite(xPos, yPos));
            if (xPos == 0 && direction == "left"){
                isWall = true;                               
            }else if (xPos == grid.getHeight() && direction == "right"){
                isWall = true;                
            }else if (yPos == 0 && direction == "up"){
                isWall = true;                
            }else if (yPos == grid.getWidth()&& direction=="down"){
                isWall = true;               
            }else if (yPos == 0 && xPos == 0 && (direction == "up" || direction == "left")){
                isWall = true;               
            }else if (yPos == grid.getWidth() && xPos == 0 && (direction == "down" || direction == "left")){
                isWall = true;               
            }else if (yPos == 0 && xPos == grid.getHeight() && (direction == "up" || direction == "right")){
                isWall = true;                
            }else if (yPos == grid.getWidth() && xPos == grid.getHeight() && (direction == "down" || direction == "right")){
                isWall = true;               
            }

            if (direction.equals("up")){
                if(grid.isWhite(xPos,yPos)){
                    grid.setBlack(xPos,yPos);
                    setDirection("right");
                    xPos++;
                    grid.printGrid();
                }else{
                    grid.setWhite(xPos,yPos);
                    setDirection("left");
                    xPos--;
                    grid.printGrid();
                }
            }else if (direction.equals("right")){
                if(grid.isWhite(xPos,yPos)){
                    grid.setBlack(xPos,yPos);
                    setDirection("down");
                    yPos++;
                    grid.printGrid();
                }else{
                    grid.setWhite(xPos,yPos);
                    setDirection("up");
                    yPos--;
                    grid.printGrid();
                } 
            }else if (direction.equals("down")){
                if(grid.isWhite(xPos,yPos)){
                    grid.setBlack(xPos,yPos);
                    setDirection("left");
                    xPos--;
                    grid.printGrid();
                }else{
                    grid.setWhite(xPos,yPos);
                    setDirection("right");
                    xPos++;
                    grid.printGrid();
                }
            }else if (direction.equals("left")){
                if(grid.isWhite(xPos,yPos)){
                    grid.setBlack(xPos,yPos);
                    setDirection("up");
                    yPos--;
                    grid.printGrid();
                }else{
                    grid.setWhite(xPos,yPos);
                    setDirection("down");
                    yPos++;
                    grid.printGrid();
                }
            }
            moves = moves -1;
        }

    }

    
}
