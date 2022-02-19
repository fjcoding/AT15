package org.fundacionjala.at15.pacman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        game.start(scanner);
        /*
        Board board = new Board();
        Pacman pacman = new Pacman(board);
        board.printBoard();

        Scanner scanner = new Scanner(System.in);
        String direction = scanner.nextLine();
        //System.out.println(direction);

        while (true) {
            pacman.move(direction);
            board.printBoard();
            direction = scanner.nextLine();
        }
        */
    }
}