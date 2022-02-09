package org.fundacionjala.at15.katas.langtonant.adhemar;

public class Main {
    public static void main(String[] args) {
        //Inputs
        //Grid's size
        final int rows = 11;
        final int columns = 11;

        //Initial ant's position
        final int initialRow = 5; //From 0 to n
        final int initialColumn = 4; //From 0 to n
        final int steps = 100;

        //Grid initial color
        final boolean color = false; //false: white, true: black

        //Create grid
        Grid grid = new Grid(rows, columns, color);

        //Move the ant
        Ant ant = new Ant(initialRow, initialColumn);
        ant.start(steps, grid);

        //Show grid status
        System.out.println("Grid status after " + steps + " steps taken by he ant:");
        grid.printGrid();
    }
}