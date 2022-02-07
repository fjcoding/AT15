package org.fundacionjala.at15.katas.langtonant.adrian;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is Langton's Ant main class, you can do yout implementation here :)");
        System.out.println();

        Board tabler = new Board(30, 30);//size of the board
        Ant ant = new Ant(15, 15, 0, tabler);//Ant object with initial position in x and y, also a direction, and the table where it will move

        ant.draw(100);//draw(n); where 'n' is the steps taken by the "ant"
    }

}