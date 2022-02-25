package org.fundacionjala.at15.pacman;

import static org.junit.Assert.assertFalse;

import javax.swing.JPanel;

import org.junit.Test;

public class PlayTest {
    Play play = new Play();
    @Test
    public void itShouldInstance() {
        Window window = new Window();
        JPanel panel = new JPanel();
        String player = "player";

        panel.setLayout(null);
        panel.setBounds(0, 0, window.getWindow().getWidth(), window.getWindow().getHeight());
        panel.setVisible(true);

        play.runGame(window, player, panel);

        assertFalse(panel.isVisible());
    }
}
