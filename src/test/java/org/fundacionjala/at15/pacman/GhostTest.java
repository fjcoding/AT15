package org.fundacionjala.at15.pacman;


import static org.junit.Assert.*;
import org.junit.Test;

public class GhostTest {

    Board board = new Board();
    Ghost ghost = new Ghost(board);

    @Test
    public void itShouldSetXY(){
        int expectedX = 5;
        int expectedY = 3;
        int newX = 5;
        int newY = 3;
        ghost.setX(newX);
        ghost.setY(newY);
        assertEquals(expectedX, ghost.getX());
        assertEquals(expectedY, ghost.getY());
    }

    @Test
    public void itShouldChangePositionWithDirection(){
        Board board = new Board();
        Ghost ghost = new Ghost(board);
        int xExpectedW = 3;
        int xExpectedS = 4;
        int yExpectedD = 5;
        int yExpectedA = 4;
        ghost.move("w");
        assertEquals(xExpectedW,ghost.getX());
        ghost.move("s");
        assertEquals(xExpectedS,ghost.getX());
        ghost.move("d");
        assertEquals(yExpectedD,ghost.getY());
        ghost.move("a");
        assertEquals(yExpectedA,ghost.getY());
    }
    @Test
    public void itShouldStopIfIsWallUp(){
        Board board = new Board();
        board.setGhostX(1);
        Ghost ghost = new Ghost(board);
        ghost.move("w");
        int xExpectedIsWall = 1;
        assertEquals(xExpectedIsWall,ghost.getX());
    }
    @Test
    public void itShouldStopIfIsWallDown(){
        Board board = new Board();
        board.setGhostX(8);
        Ghost ghost = new Ghost(board);
        ghost.move("s");
        int xExpectedIsWall = 8;
        assertEquals(xExpectedIsWall,ghost.getX());
    }
    @Test
    public void itShouldStopIfIsWallRight(){
        Board board = new Board();
        board.setGhostY(8);
        Ghost ghost = new Ghost(board);
        ghost.move("d");
        int yExpectedIsWall = 8;
        assertEquals(yExpectedIsWall,ghost.getY());
    }
    @Test
    public void itShouldStopIfIsWallLeft(){
        Board board = new Board();
        board.setGhostY(1);
        Ghost ghost = new Ghost(board);
        ghost.move("a");
        int yExpectedIsWall = 1;
        assertEquals(yExpectedIsWall,ghost.getY());
    }
    @Test
    public void itShouldKillPacman(){
        Board board = new Board();
        board.setPacmanX(5);
        board.setPacmanY(4);
        Ghost ghost = new Ghost(board);
        ghost.move("s");
        int lifeDimished = 2;
        assertEquals(lifeDimished,board.getLives());
    }
    @Test
    public void itShouldntChangeDot(){
        Board board = new Board();
        board.setDot(5, 4);
        Ghost ghost = new Ghost(board);
        ghost.move("s");
        assertTrue(board.isDot(5,4));
    }
    @Test
    public void itShouldntChagePellet(){
        Board board = new Board();
        board.setPellet(5, 4);
        Ghost ghost = new Ghost(board);
        ghost.move("s");
        assertTrue(board.isPellet(5,4));
    }
}

