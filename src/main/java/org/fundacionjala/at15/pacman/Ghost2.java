package org.fundacionjala.at15.pacman;

public class Ghost2 {
    private Board board;
    private int x;
    private int y;
    String direction;

    public Ghost2(Board board) {
        this.board = board;
        this.x = board.getGhostX2();
        this.y = board.getGhostY2();
        direction = "w";
    }
    public void setX(int newX){
        this.x = newX;
    }
    public void setY(int newY){
        this.y = newY;
    }



    public void move(String direction) {
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
            this.x = this.board.getGhostX2();
            this.y = this.board.getGhostY2();
        }
        else if (this.board.isPacman(this.x, this.y)) {
            this.x = this.board.getGhostX2();
            this.y = this.board.getGhostY2();
        }
        else if (this.board.isDot(this.x, this.y)) {
            board.setGhostX2(x);
            board.setGhostY2(y);
            this.board.setDot(x,y);
        }
        else if (this.board.isPellet(x, y)) {
            this.board.setPellet(x, y);
            board.setGhostX2(x);
            board.setGhostY2(y);
        }
    }
}
