package org.fundacionjala.at15.katas.langtonant.alvaro;


public class Main {
   
    public static void main(String[] args) {
        Grid grid = new Grid(6, 7); //6 filas, 7 columnas
        Ant ant = new Ant(2,2,grid,'u');
        ant.run(3);
    }
}