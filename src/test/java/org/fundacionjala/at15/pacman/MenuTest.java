package org.fundacionjala.at15.pacman;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MenuTest {
    

    @Test
    public void itShouldHaveAMenuWithButtons() {
        Menu menu = new Menu();
        Window window = new Window();
        menu.introMenu(window);

        assertTrue(menu.getMenuPanel().isVisible());
        assertTrue(menu.getPlayButton().isVisible());
        assertTrue(menu.getExitButton().isVisible());
    }
}
