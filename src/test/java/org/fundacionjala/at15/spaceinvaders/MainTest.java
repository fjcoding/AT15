package org.fundacionjala.at15.spaceinvaders;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void itShouldCreateAWindow() {
        Board board = new Board();
        boolean create = false;

        assertEquals(true,Main.createWindow(board,create) );
    }

}
