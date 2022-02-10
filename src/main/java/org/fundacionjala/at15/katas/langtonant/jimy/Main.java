package org.fundacionjala.at15.katas.langtonant.jimy;
public class Main {
    public static void main(String[] args) {
        final int gridRows = 8;
        final int gridColumns = 8;
        final int antPosX = 4;
        final int antPosY = 4;
        final int steps = 3;
        Board board = new Board(gridRows, gridColumns);
        Ant ant = new Ant(antPosX, antPosY, board, "up");
        ant.playGame(steps);
    }
}
