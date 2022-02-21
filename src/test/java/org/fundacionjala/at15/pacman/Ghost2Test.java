package org.fundacionjala.at15.pacman;

import static org.junit.Assert.*;
import org.junit.Test;

public class Ghost2Test {
    Board board = new Board();
    Ghost2 ghost = new Ghost2(board);

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
        Ghost2 ghost = new Ghost2(board);
        int xExpectedW = 5;
        int xExpectedS = 6;
        int yExpectedD = 7;
        int yExpectedA = 6;
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
        board.setGhostX2(1);
        Ghost2 ghost = new Ghost2(board);
        ghost.move("w");
        int xExpectedIsWall = 1;
        assertEquals(xExpectedIsWall,ghost.getX());
    }
    @Test
    public void itShouldStopIfIsWallDown(){
        Board board = new Board();
        board.setGhostX2(8);
        Ghost2 ghost = new Ghost2(board);
        ghost.move("s");
        int xExpectedIsWall = 8;
        assertEquals(xExpectedIsWall,ghost.getX());
    }
    @Test
    public void itShouldStopIfIsWallRight(){
        Board board = new Board();
        board.setGhostY2(8);
        Ghost2 ghost = new Ghost2(board);
        ghost.move("d");
        int yExpectedIsWall = 8;
        assertEquals(yExpectedIsWall,ghost.getY());
    }
    @Test
    public void itShouldStopIfIsWallLeft(){
        Board board = new Board();
        board.setGhostY2(1);
        Ghost2 ghost = new Ghost2(board);
        ghost.move("a");
        int yExpectedIsWall = 1;
        assertEquals(yExpectedIsWall,ghost.getY());
    }
    @Test
    public void itShouldntChangeDot(){
        Board board = new Board();
        board.setDot(5, 4);
        Ghost2 ghost = new Ghost2(board);
        ghost.move("s");
        assertTrue(board.isDot(5,4));
    }
    @Test
    public void itShouldntChagePellet(){
        Board board = new Board();
        board.setPellet(5, 4);
        Ghost2 ghost = new Ghost2(board);
        ghost.move("s");
        assertTrue(board.isPellet(5,4));
    }

}
