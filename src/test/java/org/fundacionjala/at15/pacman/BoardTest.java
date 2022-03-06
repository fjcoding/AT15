package org.fundacionjala.at15.pacman;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoardTest {
    @Test
    public void itShouldHaveAInitializedBoard() {
        Panel gamePanel = new Panel();
        Board board = new Board(gamePanel);
        int[][] sample = {
                                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                                {1, 2, 4, 4, 4, 4, 4, 1, 4, 4, 4, 4, 4, 4, 1},
                                {1, 4, 1, 1, 4, 1, 4, 1, 4, 1, 1, 4, 1, 4, 1},
                                {1, 4, 1, 4, 4, 1, 4, 1, 4, 1, 1, 4, 1, 4, 1},
                                {1, 4, 4, 4, 1, 1, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                                {1, 4, 1, 4, 4, 4, 4, 4, 1, 1, 1, 4, 1, 1, 1},
                                {1, 4, 1, 1, 4, 1, 1, 4, 4, 1, 1, 4, 4, 4, 1},
                                {1, 4, 4, 4, 4, 4, 1, 1, 4, 4, 4, 4, 1, 4, 1},
                                {1, 1, 1, 4, 1, 4, 1, 1, 1, 4, 1, 4, 1, 4, 1},
                                {1, 4, 4, 4, 1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                                {1, 4, 1, 4, 4, 4, 1, 1, 1, 4, 1, 4, 1, 4, 1},
                                {1, 4, 4, 4, 1, 4, 1, 4, 4, 4, 4, 4, 1, 4, 1},
                                {1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 4, 3, 1},
                                {1, 4, 4, 4, 1, 4, 4, 4, 4, 4, 4, 4, 3, 3, 1},
                                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
                        };
        assertArrayEquals(sample, board.getGrid());
    }

    @Test
    public void itShouldHaveADefectTable() {
        Panel gamePanel = new Panel();
        Board board = new Board(gamePanel);
        int[][] expected = {
                            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                            {1, 4, 4, 4, 4, 4, 4, 1, 4, 4, 4, 4, 4, 4, 1},
                            {1, 4, 1, 1, 4, 1, 4, 1, 4, 1, 1, 4, 1, 4, 1},
                            {1, 4, 1, 4, 4, 1, 4, 1, 4, 1, 1, 4, 1, 4, 1},
                            {1, 4, 4, 4, 1, 1, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                            {1, 4, 1, 4, 4, 4, 4, 4, 1, 1, 1, 4, 1, 1, 1},
                            {1, 4, 1, 1, 4, 1, 1, 4, 4, 1, 1, 4, 4, 4, 1},
                            {1, 4, 4, 4, 4, 4, 1, 1, 4, 4, 4, 4, 1, 4, 1},
                            {1, 1, 1, 4, 1, 4, 1, 1, 1, 4, 1, 4, 1, 4, 1},
                            {1, 4, 4, 4, 1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                            {1, 4, 1, 4, 4, 4, 1, 1, 1, 4, 1, 4, 1, 4, 1},
                            {1, 4, 4, 4, 1, 4, 1, 4, 4, 4, 4, 4, 1, 4, 1},
                            {1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 4, 4, 1},
                            {1, 4, 4, 4, 1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
                        };
        assertArrayEquals(expected, board.defectTable());
    }

    @Test
    public void itShouldHaveABoard() {
        Panel gamePanel = new Panel();
        Board board = new Board(gamePanel);
        Play play = new Play();
        Window window = new Window("PACMAN");
        String player = "player";
        Panel panel = new Panel();
        int wall = 1;
        int dot = 4;

        play.runGame(window, player, panel);

        for (int i = 0; i < board.getGrid().length; i++) {
            assertEquals(wall, board.getGrid()[0][i]);
            assertEquals(wall, board.getGrid()[board.getGrid()[0].length-1][i]);
        }
        assertEquals(dot, board.getGrid()[5][5]);
    }

    @Test
    public void itShouldHaveAPacman() {
        Panel gamePanel = new Panel();
        Board board = new Board(gamePanel);
        Play play = new Play();
        Window window = new Window("PACMAN");
        String player = "player";
        Panel panel = new Panel();
        int PACMAN = 2;

        play.runGame(window, player, panel);
        int x = board.getPacman().getPosX();
        int y = board.getPacman().getPosY();
        assertEquals(PACMAN, board.getGrid()[x][y]);
    }

    @Test
    public void itShouldListenKeyEvent() {

        Play play = new Play();
        Window window = new Window("PACMAN");
        String player = "player";
        Panel panel = new Panel();

        play.runGame(window, player, panel);
    }
}
