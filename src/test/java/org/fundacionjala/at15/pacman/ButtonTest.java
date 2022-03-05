package org.fundacionjala.at15.pacman;

import static org.junit.Assert.assertTrue;
import javax.swing.JButton;
import org.junit.Test;

public class ButtonTest {
    Window window = new Window();
    Play play = new Play();
    Menu menu = new Menu(window, play);

    @Test
    public void itShoulHaveButtons() {
        for (int ind = 0; ind < menu.getButtons().getButton().length; ind++) {
            menu.getButtons().getButton()[ind] = new JButton();
        }

        for (int i = 0; i < menu.getButtons().getButton().length; i++) {
            assertTrue(menu.getButtons().getButton()[i].isVisible());
        }
    }

}
