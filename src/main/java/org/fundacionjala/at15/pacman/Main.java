package org.fundacionjala.at15.pacman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        game.start(scanner);
    }
}
