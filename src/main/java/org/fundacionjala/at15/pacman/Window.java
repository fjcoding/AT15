package org.fundacionjala.at15.pacman;

import javax.swing.*;

public class Window {
    JFrame window;

    public Window() {
        window = new JFrame("PACMAN");
        window.setSize(700,700);
        window.setLayout(null);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JFrame getWindow() {
        return window;
    }

}
