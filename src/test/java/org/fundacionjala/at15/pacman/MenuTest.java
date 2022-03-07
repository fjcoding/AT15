package org.fundacionjala.at15.pacman;

import static org.junit.Assert.assertTrue;
import javax.swing.JButton;
import org.junit.Test;

public class MenuTest {
    Window window = new Window();
    Play play = new Play();
    Menu menu = new Menu(window, play);

    @Test
    public void itShoulHaveAPanel() {
        for (int i = 0; i < menu.getButtonsGroup().getButtons().length; i++) {
            menu.getButtonsGroup().getButtons()[i] = new JButton();
        }
        menu.introMenu();

        assertTrue(menu.getPanelMenu().isVisible());
    }
}
