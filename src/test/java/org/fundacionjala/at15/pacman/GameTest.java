package org.fundacionjala.at15.pacman;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {

    @Test
    public void itShouldHaveAScore() {
        Game theGame = new Game();

        assertEquals(0, theGame.getScore());
    }
    @Test
    public void itShouldHaveADirection() {
        Game theGame = new Game();
        String[] direction = {"w","a","s","d"};

        assertArrayEquals(direction, theGame.getDirection());
    }
}
