package org.fundacionjala.at15.spaceinvaders;
import static org.fundacionjala.at15.spaceinvaders.Constants.Alien.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AliensTest {
    @Test
    public void itShouldHaveAliens() {
        Aliens aliens = new Aliens(ALIEN_ROWS, ALIEN_COLUMNS);

        assertEquals(ALIEN_ROWS * ALIEN_COLUMNS, aliens.getAliens().size());
    }
}