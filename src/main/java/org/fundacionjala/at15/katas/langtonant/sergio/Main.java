package org.fundacionjala.at15.katas.langtonant.sergio;

public class Main {
    private static final int X_POS = 3;
    private static final int Y_POS = 4;
    private static final String DIRECTION = "up";
    private static final int COLUMNS = 5;
    private static final int ROWS = 7;
    private static final int MOVES = 3;
    public static void main(String[] args) {

        Grid grid = new Grid(COLUMNS, ROWS);
        Ant ant = new Ant(X_POS, Y_POS, DIRECTION, MOVES, grid);
        ant.run();

        System.out.println("Final Position");
    }
}