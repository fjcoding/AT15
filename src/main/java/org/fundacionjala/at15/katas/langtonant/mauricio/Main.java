package org.fundacionjala.at15.katas.langtonant.mauricio;

public class Main {

    public static void main(String[] args) {
        //System.out.println("From Mauricio: This is Langton's Ant main class, you can do yout implementation here :)");
        Grid grid = new Grid(5, 5);
        Ant ant = new Ant(2,2,grid,"up");

        ant.game(10);
    }
}