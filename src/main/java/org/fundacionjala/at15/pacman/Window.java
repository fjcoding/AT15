package org.fundacionjala.at15.pacman;

import javax.swing.*;

public class Window {
    private JFrame window;
    private final int windowX = 700;
    private final int windowY = 700;

    public Window() {
        window = new JFrame("PACMAN");
        window.setSize(windowX, windowY);
        window.setLayout(null);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JFrame getWindow() {
        return window;
    }
}
