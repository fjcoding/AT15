package org.fundacionjala.at15.spaceinvaders;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoardTest {
    @Test
    public void itShouldHaveAliens() {
        Board theBoard = new Board();

        assertEquals(Commons.ALIEN_ROWS * Commons.ALIEN_COLUMNS, theBoard.getAliens().size());
    }
}
