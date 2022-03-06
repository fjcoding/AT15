package org.fundacionjala.at15.pacman;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class PlayTest {
    Play play = new Play();
    @Test
    public void itShouldInstance() {
        Window window = new Window("PACMAN");
        Panel panel = new Panel();
        String player = "player";

        panel.setLayout(null);
        panel.setBounds(0, 0, window.getWidth(), window.getHeight());
        panel.setVisible(true);

        play.runGame(window, player, panel);

        assertFalse(panel.isVisible());
    }
}
