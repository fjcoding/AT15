package org.fundacionjala.at15.katas.langtonant.adhemar;

public class Main {
    public static void main(String[] args) {
        //Inputs
        //Grid's size
        int rows = 11;
        int columns = 11;

        //Initial ant's position
        int initialRow = 10; //From 0 to n
        int initialColumn = 8; //From 0 to n
        
        int steps = 100;

        //Create a grid
        boolean color = false; //false: white, true: black
        Grid grid = new Grid(rows, columns, color);

        //Move the ant
        Ant ant = new Ant(initialRow, initialColumn);
        ant.start(steps, grid);

        //Show grid status
        grid.printGrid();
    }
}