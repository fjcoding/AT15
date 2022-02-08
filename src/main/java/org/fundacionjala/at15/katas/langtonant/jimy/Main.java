package org.fundacionjala.at15.katas.langtonant.jimy;


    
public class Main {
    
    public static void main(String[] args) {
        Grid grid = new Grid(8, 8);
        Ant ant = new Ant(2, 2, grid, "up"); 
        ant.game(6); // Ant`s steps 
    }   
}
