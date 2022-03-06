package org.fundacionjala.at15.pacman;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MenuTest {
    

    @Test
    public void itShouldHaveAMenuWithButtons() {
        Window window = new Window();
        Play play = new Play();
        Menu menu = new Menu(window, play);

        assertTrue(menu.getMenuPanel().isVisible());
        assertTrue(menu.getPlayButton().isVisible());
        assertTrue(menu.getExitButton().isVisible());
    }
}
