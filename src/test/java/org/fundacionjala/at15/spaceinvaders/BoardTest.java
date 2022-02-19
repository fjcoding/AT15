package org.fundacionjala.at15.spaceinvaders;
import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoardTest {
    @Test
    public void itShouldHaveAliens() {
        Board theBoard = new Board();

        assertEquals(ALIEN_ROWS * ALIEN_COLUMNS, theBoard.getAliens().size());
    }
}
