package org.fundacionjala.at15.pacman;

import static org.junit.Assert.assertTrue;
import javax.swing.JButton;
import org.junit.Test;

public class MenuTest {
    Menu menu = new Menu();
    Window window = new Window();

    @Test
    public void itShoulHaveButtons() {
        for (int i = 0; i < menu.getButtons().length; i++) {
            menu.getButtons()[i] = new JButton();
        }
        menu.introMenu(window);

        assertTrue(menu.getPanelMenu().isVisible());
        for (int i = 0; i < menu.getButtons().length; i++) {
            assertTrue(menu.getButtons()[i].isVisible());
        }
    }
}
