package org.fundacionjala.at15.katas.langtonant.alvaro;

public class Ant{
    private int posX;
    private int posY;
    private Grid grid;
    private char direction;
    //private boolean finished;

    public Ant(int posX,int posY, Grid grid, char direction)
    {
        this.posX=posX;
        this.posY=posY;
        this.grid=grid;
        this.direction=direction;


    }
    public void nextStep()
    {
        if (direction=='u') //up arriba
        {
            
                
                if(grid.getPos(posX, posY) == 0) //si esta en blanco
                {            
                    grid.changetoBlack(posX, posY); //pongo una x(negro)
                    posY ++;
                    direction='r';
                }
                else //si esta negro le cambio por blanco
                {
                    grid.changetoWhite(posX, posY); //pongo una O si esta en negro
                    direction='l';
                    posY --;
                    
                }

        }
        else if(direction== 'd')//down
        {
            if(grid.getPos(posX, posY) == 0) //si esta en blanco
            {            
                grid.changetoBlack(posX, posY); //pongo una x(negro)
                posY --;
                direction='l';
            }
            else //si esta negro le cambio por blanco
            {
                grid.changetoWhite(posX, posY); //pongo una O si esta en negro
                direction='r';
                posY ++;
                
            }
        }  
        
        else if(direction=='r') //rigth
        {
            if(grid.getPos(posX, posY) == 0) //si esta en blanco
            {            
                grid.changetoBlack(posX, posY); //pongo una x(negro)
                posX ++;
                direction='d';
            }
            else //si esta negro le cambio por blanco
            {
                grid.changetoWhite(posX, posY); //pongo una O si esta en negro
                direction='u';
                posX --;
                
            }
                
        }
        else if(direction=='l') //left izquierda
        {
            if(grid.getPos(posX, posY) == 0) //si esta en blanco
            {            
                grid.changetoBlack(posX, posY); //pongo una x(negro)
                posX --;
                direction='u';
            }
            else //si esta negro le cambio por blanco
            {
                grid.changetoWhite(posX, posY); //pongo una O si esta en negro
                direction='d';
                posX --;
                
            }
                
        }
        
    }
  
    public void run(int saltos)
    {
        grid.printGrid();
        for (int index=0; index<=saltos;index ++)
        {
            nextStep();
            System.out.println();
            System.out.println("Numero de Corridas"+index);
            grid.printGrid();
        }
    }
}