package org.fundacionjala.at15.katas.langtonant.diana;

public class Main {
    static final int NUMBER_ROWS = 10;
    static final int NUMBER_COLUMNS = 15;
    static final int NUMBER_STEPS = 3;
    static final int ANT_POSITION_ROW = 2;
    static final int ANT_POSITION_COLUMN = 2;

    public static void main(String[] args) {
        System.out.println("FROM DIANA: This is Langton's Ant main class, you can do yout implementation here :)");

        Grid grid = new Grid(NUMBER_ROWS, NUMBER_COLUMNS); // array size definition
        Ant ant = new Ant(ANT_POSITION_ROW, ANT_POSITION_COLUMN, grid, "up"); // define position and direction of the
                                                                              // ant
        ant.game(NUMBER_STEPS); // number of steps
    }
}