package org.fundacionjala.at15.pacman;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoardTest {
    @Test
    public void itShouldHaveAInitializedBoard() {
        Board board = new Board();
        int[][] sample = new int[][]{
                            {1,1,1,1,1,1,1,1,1,1},
                            {1,2,4,4,4,4,4,4,4,1},
                            {1,4,4,4,4,4,4,4,4,1},
                            {1,4,4,4,4,4,4,4,4,1},
                            {1,4,4,4,4,4,4,4,4,1},
                            {1,4,4,4,4,4,4,4,4,1},
                            {1,4,4,4,4,4,4,4,4,1},
                            {1,4,4,4,4,4,4,4,4,1},
                            {1,4,4,4,4,4,4,4,4,1},
                            {1,1,1,1,1,1,1,1,1,1}
                        };
        assertArrayEquals(sample, board.getBoard());
    }

    @Test
    public void itShouldHaveAPacmanPosition() {
        Board board = new Board();
        assertEquals(1, board.getPacmanX());
        assertEquals(1, board.getPacmanY());
    }

    @Test
    public void itShouldHaveAGhostPosition() {
        Board board = new Board();
        assertEquals(4, board.getGhostX());
        assertEquals(4, board.getGhostY());
    }

    @Test
    public void itShouldHaveAGhost2Position() {
        Board board = new Board();
        assertEquals(6, board.getGhostX2());
        assertEquals(6, board.getGhostY2());
    }

    @Test
    public void itShouldHaveAScore() {
        Board board = new Board();
        assertEquals(0, board.getScore());
    }

    @Test
    public void itShouldHaveALevel() {
        Board board = new Board();
        assertEquals(1, board.getLevel());
    }

    @Test
    public void itShouldSetNewPacmanPosition() {
        Board board = new Board();
        int newX = 5;
        int newY = 1;

        board.setPacmanX(newX);
        board.setPacmanY(newY);
        assertEquals(newX, board.getPacmanX());
        assertEquals(newY, board.getPacmanY());
    }

    @Test
    public void itShouldSetNewGhostsPosition() {
        Board board = new Board();
        int newX = 7;
        int newY = 3;
        int newX2 = 8;
        int newY2 = 4;

        board.setGhostX(newX);
        board.setGhostY(newY);
        board.setGhostX2(newX2);
        board.setGhostY2(newY2);
        assertEquals(newX, board.getGhostX());
        assertEquals(newY, board.getGhostY());
        assertEquals(newX2, board.getGhostX2());
        assertEquals(newY2, board.getGhostY2());
    }
}
