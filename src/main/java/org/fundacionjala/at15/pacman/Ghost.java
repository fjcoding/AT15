package org.fundacionjala.at15.pacman;

public class Ghost {
<<<<<<< HEAD
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
=======
    private Board board;
    private int x;
    private int y;
    private boolean isDead;
    String direction;

    public Ghost(Board board) {
        this.board = board;
        this.x = board.getGhostX();
        this.y = board.getGhostY();
        this.isDead = false;
        direction = "w";
    }

    public void move() {
        //char direction = this.board.getDirection();
        if (direction.compareTo("w") == 0) {
            this.x--;
        } else if (direction.compareTo("s") == 0) {
            this.x++;
        } else if (direction.compareTo("a") == 0) {
            this.y--;
        } else if (direction.compareTo("d") == 0) {
            this.y++;
        }
        if (this.board.isWall(this.x, this.y)) {
            this.x = this.board.getGhostX();
            this.y = this.board.getGhostY();
        }
        if (this.board.isPacman(this.x, this.y)) {
            //this.lives--;
            this.x = this.board.getGhostX();
            this.y = this.board.getGhostY();
        }
        //if (this.lives == 0) {
        //    this.isDead = true;
        //}
    }

    public boolean isDead() {
        return this.isDead;
    }
>>>>>>> d0446edb05367d07c94cce18f9d88b9f64a5ad51
}
