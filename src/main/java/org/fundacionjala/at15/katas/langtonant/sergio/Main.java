package org.fundacionjala.at15.katas.langtonant.sergio;

public class Main {

    public static void main(String[] args) {
       
       int xPos = 3;
       int yPos = 4;
       String direction = "up";
       int columns = 5;
       int rows = 7;
       int moves = 3;       
       
       Grid grid = new Grid(columns, rows);
       Ant ant = new Ant(xPos, yPos, direction, moves, grid);          
       ant.run();

       System.out.println("Final Position: ");

    }
}