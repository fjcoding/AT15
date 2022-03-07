package org.fundacionjala.at15.spaceinvaders;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoardTest {
    @Test
    public void itShouldBeAnloseText() {
        Board board = new Board();
        String compare = "YOU LOSE";
        board.ship.setDying(true);
        board.doGameCycle();
        assertEquals(compare, board.message);
    }

    @Test
    public void itShouldBeAnWonText() {
        Board board = new Board();
        String compare = "YOU WON";
        board.deadController.setDeaths(45);
        board.doGameCycle();
        assertEquals(compare, board.message);
    }
    @Test

    public void itShouldBeAnAliensInvadedText() {
        Board board = new Board();
        String compare = "ALIENS INVADED YOUR PLANET";
        board.aliens.setInvasion(true);;
        board.doGameCycle();

        assertEquals(compare, board.message);
    }
}
