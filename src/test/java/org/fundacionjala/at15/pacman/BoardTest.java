package org.fundacionjala.at15.pacman;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import javax.swing.JPanel;

import org.junit.Test;

public class BoardTest {
    @Test
    public void itShouldHaveAInitializedBoard() {
        Board board = new Board();
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
                                {1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 1, 4, 4, 4, 1},
                                {1, 4, 4, 4, 1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
                        };
        assertArrayEquals(sample, board.getBoard());
    }
    /*
    @Test
    public void itShouldHaveADefectTable() {
        Board board = new Board();
        int[][] expected = {
                            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                            {1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                            {1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                            {1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                            {1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                            {1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                            {1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                            {1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                            {1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                            {1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                            {1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                            {1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                            {1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                            {1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1},
                            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        };
        //assertArrayEquals(expected, board.defectTable());
    }*/

    @Test
    public void itShouldHaveABoard() {
        Board board = new Board();
        Play play = new Play();
        Window window = new Window();
        String player = "player";
        JPanel panel = new JPanel();
        int wall = 1;
        int dot = 4;

        play.jugar(window, player, panel);

        for (int i = 0; i < board.getBoard().length; i++) {
            assertEquals(wall, board.getBoard()[0][i]);
            assertEquals(wall, board.getBoard()[board.getBoard()[0].length-1][i]);
        }
        assertEquals(dot, board.getBoard()[5][5]);
    }

    @Test
    public void itShouldHaveAPacman() {
        Board board = new Board();
        Play play = new Play();
        Window window = new Window();
        String player = "player";
        JPanel panel = new JPanel();
        int PACMAN = 2;

        play.jugar(window, player, panel);
        int x = board.getPacman().getPosX();
        int y = board.getPacman().getPosY();
        assertEquals(2, board.getBoard()[x][y]);
    }

    @Test
    public void itShouldListenKeyEvent() {
        Board board = new Board();
        Play play = new Play();
        Window window = new Window();
        String player = "player";
        JPanel panel = new JPanel();

        play.jugar(window, player, panel);

    }
}
