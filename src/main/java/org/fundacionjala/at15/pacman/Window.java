package org.fundacionjala.at15.pacman;

import javax.swing.*;

public class Window {
    private JFrame window;
    static final int WIDTH = 700;
    static final int HEIGHT = 700;

    public Window() {
        window = new JFrame("PACMAN");
        window.setSize(WIDTH, HEIGHT);
        window.setLayout(null);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JFrame getWindow() {
        return window;
    }
}
