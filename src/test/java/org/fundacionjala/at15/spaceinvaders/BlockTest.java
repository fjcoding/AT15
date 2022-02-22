package org.fundacionjala.at15.spaceinvaders;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.awt.Graphics;

public class BlockTest {
    int life = 3;

    @Test
    public void itShouldHaveLifes() {
        Block asteroid = new Block(life);
        assertEquals(life, asteroid.getLife());
    }
}
