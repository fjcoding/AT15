package org.fundacionjala.at15.katas.langtonant.sergio;

public class Ant {
    private int xPos;
    private int yPos;
    private String direction;
    private int moves;
    private boolean wall;
    private Grid grid;
    

    public Ant(int xPos, int yPos, String direction, int moves, Grid grid){
        this.xPos = xPos;
        this.yPos = yPos;
        this.direction = direction;
        this.moves = moves;
        this.grid = grid;
    }
    public int getXPos(){
        return xPos;
    }
    public int getYPos(){
        return yPos;
    }
    public String getDirection(){
        return direction;
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
    public void wall (int currentXPos, int currentYPos, String currentDirection){

        if (xPos == 0 && direction == "left"){
            this.wall = true;                               
        }else if (xPos == grid.getColumns() && direction == "right"){
            this.wall = true;                
        }else if (yPos == 0 && direction == "up"){
            this.wall = true;                
        }else if (yPos == grid.getRows()&& direction=="down"){
            this.wall = true;               
        }else if (yPos == 0 && xPos == 0 && (direction == "up" || direction == "left")){
            this.wall = true;               
        }else if (yPos == grid.getRows() && xPos == 0 && (direction == "down" || direction == "left")){
            this.wall = true;               
        }else if (yPos == 0 && xPos == grid.getColumns() && (direction == "up" || direction == "right")){
            this.wall = true;                
        }else if (yPos == grid.getRows() && xPos == grid.getColumns() && (direction == "down" || direction == "right")){
            this.wall = true;              
        }
    }
    
    public void antMovemenet (String currentDirection){
        switch (currentDirection){
            case "up": if (grid.isWhite(xPos, yPos)){
                       grid.setBlack(xPos, yPos);
                       setDirection("right");
                       xPos++;
                       grid.printGrid();
                       }
                       else{
                           grid.setWhite(xPos, yPos);
                           setDirection("left");
                           xPos--;
                           grid.printGrid();
                       }
                       break;
            case "right": if (grid.isWhite(xPos, yPos)){
                        grid.setBlack(xPos, yPos);
                        setDirection("down");
                        yPos++;
                        grid.printGrid();
                        }
                        else{
                            grid.setWhite(xPos, yPos);
                            setDirection("up");
                            yPos--;
                            grid.printGrid();
                        }
                        break;
            case "down": if (grid.isWhite(xPos, yPos)){
                        grid.setBlack(xPos, yPos);
                        setDirection("left");
                        xPos--;
                        grid.printGrid();
                        }
                        else{
                            grid.setWhite(xPos, yPos);
                            setDirection("right");
                            xPos++;
                            grid.printGrid();
                        }
                        break;
            case "left": if (grid.isWhite(xPos, yPos)){
                        grid.setBlack(xPos, yPos);
                        setDirection("up");
                        yPos--;
                        grid.printGrid();
                        }
                        else{
                            grid.setWhite(xPos, yPos);
                            setDirection("down");
                            yPos++;
                            grid.printGrid();
                        }
                        break;
        }

    }

    public void run(){ 
        
        wall(xPos, yPos, direction);
        
        while (xPos >= 0 && yPos >= 0 && xPos < grid.getColumns() && yPos < grid.getRows()&& wall != true && moves !=0){
            System.out.println("x:"+xPos+"\ny:"+yPos+"\ndirection: "+direction+"\ncolor: "+grid.isWhite(xPos, yPos));

            antMovemenet(direction);                  

            moves = moves -1;
        }

    }

    
}
