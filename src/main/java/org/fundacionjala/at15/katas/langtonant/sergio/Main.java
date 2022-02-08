package org.fundacionjala.at15.katas.langtonant.sergio;

public class Main {

    public static void main(String[] args) {
       // System.out.println("Hello World");
       Grid grid = new Grid(5,7);
       
       Ant ant = new Ant(3,4,"up",3,grid);
       ant.run();

       //System.out.println("Final Position: ");
       //grid.printGrid();
    }
}