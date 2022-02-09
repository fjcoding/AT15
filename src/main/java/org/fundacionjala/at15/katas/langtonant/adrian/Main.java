package org.fundacionjala.at15.katas.langtonant.adrian;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is Langton's Ant main class, you can do yout implementation here :)");
        System.out.println();

        final int boardSizeY = 30;
        final int boardSizeX = 30;
        final int antPosY = 15;
        final int antPosX = 15;
        final int steps = 100;
        Board tabler = new Board(boardSizeY, boardSizeX); //size of the board
        Ant ant = new Ant(antPosY, antPosX, 0, tabler); //Ant object with initial position in x and y, a direction, and the table where it will move

        ant.draw(steps); //draw(n); where 'n' is the steps taken by the "ant"
    }
}