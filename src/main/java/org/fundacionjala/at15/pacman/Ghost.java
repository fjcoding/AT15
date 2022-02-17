package org.fundacionjala.at15.pacman;

public class Ghost {
    private int xPos;
    private int yPos;

    public Ghost(int currentXPos, int currentYPos) {
        this.xPos = currentXPos;
        this.yPos = currentYPos;
    }

    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void setXPos(int posX) {
        this.xPos = posX;
    }

    public void setYPos(int posY) {
        this.yPos = posY;
    }

    public void movementUp() {
        yPos = yPos - 1;
    }

    public void movementRight() {
        xPos = xPos + 1;
    }

    public void movementDown() {
        yPos = yPos + 1;
    }

    public void movementLeft() {
        xPos = xPos - 1;
    }

    // public void ghostMoveUp(){

    // DirectionEnum random = DirectionEnum.getDirectionEnum();
    // if(random.equals(DirectionEnum.UP)){
    // this.yPos--;
    // } else if(random.equals(DirectionEnum.RIGHT)){
    // this.xPos++;
    // } else if(random.equals(DirectionEnum.DOWN)){
    // this.yPos++;
    // } else if(random.equals(DirectionEnum.LEFT)){
    // this.xPos--;
    // }
    // }
}
