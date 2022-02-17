package org.fundacionjala.at15.pacman;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DotTest {

    @Test
    public void itShouldHaveAnStatusAndDissapearAndPrint() {
        String dot_character = "*";
        boolean status = true;
        String dot_dissapear = " ";
        Dot theDot = new Dot(dot_character);

        assertEquals(status, theDot.getStatus());
        assertEquals(dot_character, theDot.printDot());
        assertEquals(dot_dissapear, theDot.dissapear());
    }
}
