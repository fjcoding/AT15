package org.fundacionjala.at15.pacman;

import static org.junit.Assert.assertArrayEquals;

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
}
