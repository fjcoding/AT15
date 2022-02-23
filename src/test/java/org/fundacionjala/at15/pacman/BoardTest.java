package org.fundacionjala.at15.pacman;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BoardTest {
    @Test
    public void itShouldHaveAInitializedBoard() {
        Board board = new Board();
        int[][] sample = new int[][]{
                            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                            {1,2,4,4,4,4,4,4,4,4,4,4,4,4,1},
                            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
                            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
                            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
                            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
                            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
                            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
                            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
                            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
                            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
                            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
                            {1,4,4,4,4,4,4,4,4,4,4,4,4,4,1},
                            {1,4,4,4,4,4,4,4,4,4,4,4,4,3,1},
                            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                        };
        assertArrayEquals(sample, board.getBoard());
    }
/*
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

    @Test
    public void itShouldSetNewScore() {
        Board board = new Board();
        int newScore = 500;

        board.setScore(newScore);
        assertEquals(newScore, board.getScore());
    }

    @Test
    public void itShouldCheckIfPacmanExistInAGivenPosition() {
        Board board = new Board();
        int newX = 1;
        int newY = 3;
        board.setPacmanX(newX);
        board.setPacmanY(newY);
        assertEquals(true, board.isPacman(newX, newY));
        newX = 8;
        newY = 8;
        board.setPacmanX(newX);
        board.setPacmanY(newY);
        assertTrue(board.isPacman(newX, newY));
    }

    @Test
    public void itShouldCheckIfIsADot() {
        Board board = new Board();
        assertFalse(board.isDot(3, 3));
        board.setDot(3, 3);
        assertTrue(board.isDot(3, 3));
    }

    @Test
    public void itShouldVerifiesIfExistAWall() {
        Board board = new Board();
        assertFalse(board.isWall(1, 1));
        assertFalse(board.isWall(3, 5));
        assertTrue(board.isWall(0, 0));
        assertTrue(board.isWall(9, 9));
    }

    @Test
    public void itShouldVerifiesIfExistAPellet() {
        Board board = new Board();
        assertFalse(board.isPellet(0, 0));
        assertFalse(board.isPellet(0, 8));
        assertTrue(board.isPellet(1, 2));
        assertTrue(board.isPellet(5, 2));

        board.setDot(5, 2);
        assertFalse(board.isPellet(5, 2));
        board.setPellet(5, 2);
        assertTrue(board.isPellet(5, 2));
    }

    @Test
    public void itShouldRestartBoard() {
        Board board = new Board();
        board.setPacmanX(5);
        board.setPacmanY(6);
        board.setGhostX(2);
        board.setGhostY(2);
        board.setGhostX2(1);
        board.setGhostY2(7);
        board.setScore(200);

        assertTrue(board.isPacman(5, 6));
        assertTrue(board.isGhost(2, 2));
        assertTrue(board.isGhost(1, 7));
        assertEquals(200, board.getScore());
        board.restart();

        assertFalse(board.isPacman(5, 6));
        assertFalse(board.isGhost(2, 2));
        assertFalse(board.isGhost(1, 7));
        assertEquals(0, board.getScore());

        assertTrue(board.isPacman(1, 1));
        assertTrue(board.isGhost(4, 4));
        assertTrue(board.isGhost(6, 6));
    }

    @Test
    public void itShouldRestartAfterDie() {
        Board board = new Board();
        board.setPacmanX(4);
        board.setPacmanY(4);

        assertFalse(board.isPacman(1, 1));
        board.restartAfterDie();
        assertTrue(board.isPacman(1, 1));
    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
    @Test
    public void itShouldPrintTheBoard() {
        Board board = new Board();
        board.printBoard();
        String newline = System.lineSeparator();
        assertEquals("# # # # # # # # # # "+newline+
                    "# P * * * * * * * # "+newline+
                    "# * * * * * * * * # "+newline+
                    "# * * * * * * * * # "+newline+
                    "# * * * G * * * * # "+newline+
                    "# * * * * * * * * # "+newline+
                    "# * * * * * G * * # "+newline+
                    "# * * * * * * * * # "+newline+
                    "# * * * * * * * * # "+newline+
                    "# # # # # # # # # # "+newline+
                    "Score: 0"+newline
                    , outContent.toString());
    }*/
}
