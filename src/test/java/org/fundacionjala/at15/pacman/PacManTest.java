package org.fundacionjala.at15.pacman;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PacManTest {

    @Test
    public void itShoultShowTheEmptyConstructorAtributes() {
        PacMan pacman = new PacMan();
        int posX = pacman.getPosx();
        int posY = pacman.getPosy();
        boolean state = pacman.isState();
        int expectedPosx = 0;
        int expectedPosy = 0;
        boolean expectedState = true;
        assertEquals(expectedPosx, posX);
        assertEquals(expectedPosy, posY);
        assertEquals(state, expectedState);
    }

    @Test
    public void itShoultShowTheConstructorAtributes() {
        PacMan pacman = new PacMan(10,10,true);
        int posX = pacman.getPosx();
        int posY = pacman.getPosy();
        boolean state = pacman.isState();
        int expectedPosx = 10;
        int expectedPosy = 10;
        boolean expectedState = true;
        assertEquals(expectedPosx, posX);
        assertEquals(expectedPosy, posY);
        assertEquals(state, expectedState);
    }

    @Test
    public void itShoultChangeTheAtributes() {
        PacMan pacman = new PacMan();
        pacman.setPosx(10);
        int posX = pacman.getPosx();
        pacman.setPosy(10);
        int posY = pacman.getPosy();
        pacman.setState(false);
        boolean state = pacman.isState();
        int expectedPosx = 10;
        int expectedPosy = 10;
        boolean expectedState = false;
        assertEquals(expectedPosx, posX);
        assertEquals(expectedPosy, posY);
        assertEquals(state, expectedState);
    }
}
