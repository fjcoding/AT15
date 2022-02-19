package org.fundacionjala.at15.spaceinvaders;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int shipLife = 1;
        final float posX = 250;
        final float posY = 385;
        JFrame jframe = new JFrame("Space Invaders");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setResizable(false);
        Ship ship = new Ship(shipLife, posX, posY);
        jframe.getContentPane().add(ship);
        jframe.pack();
        jframe.setVisible(true);
        Game game = new Game(ship);
        game.mainCycle();
    }

}
