package org.fundacionjala.at15.katas.langtonant.adrian;

public class Ant {
    public int x,y,state;
    public int up=0;
    public int right=1;
    public int down=2;
    public int left=3;
    public int direction;
    public Board tablero;

    public Ant(int x, int y, int direction, Board tablero){
        this.x=x;
        this.y=y;
        this.direction=direction;
        this.tablero=tablero;
        state = tablero.getPosTablero(y, x);
    }

    public void turnRight(){
        direction++;
        if (direction>left){
            direction=up;
        }
    }
    public void turnLeft(){
        direction--;
        if (direction<up){
            direction=left;
        }
    }
    public void moveForward(){
        switch (direction){
                case 0:
                state = tablero.getPosTablero(y-1, x);
                y=y-1;
                break;
                case 1:
                state = tablero.getPosTablero(y, x+1);
                x=x+1;
                break;
                case 2:
                state = tablero.getPosTablero(y+1, x);
                y=y+1;
                break;
                case 3:
                state = tablero.getPosTablero(y, x-1);
                x=x-1;
                break;
            }

            if (x > tablero.getWidth()-1){
                x=0;
            }else if (x < 0){
                x= tablero.getWidth()-1;
            }
            if (y > tablero.getHeight()-1){
                y=0;
            }else if (y < 0){
                y= tablero.getHeight()-1;
            }
    }
    public void draw(int n){
        while (n>0)
        {
            if (state==0){
                turnRight();
                tablero.setPos1(y, x);
                moveForward();
            } else if(state==1){
                turnLeft();
                tablero.setPos0(y, x);
                moveForward();
            }
            n--;
        }
        tablero.print();
    }
    
}
