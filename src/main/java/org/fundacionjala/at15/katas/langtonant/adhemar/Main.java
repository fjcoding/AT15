package org.fundacionjala.at15.katas.langtonant.adhemar;

public class Main {
    public static void main(String[] args) {
        //Inputs
        //Grid's size
        int rows = 4;
        int columns = 4;

        int[] initialPosition = { 1, 1};
        int steps = 20;

        //Create a grid
        boolean color = true; //false: white, true: black
        Grid test = new Grid(rows, columns, color);
        test.printGrid();
        //Move the ant
        //Show grid status

    }
}