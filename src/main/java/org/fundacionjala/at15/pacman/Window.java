package org.fundacionjala.at15.pacman;

import javax.swing.JFrame;

public class Window extends JFrame {
    static final int WIDTH = 700;
    static final int HEIGHT = 700;

    public Window(String title) {
        setTitle(title);
        setSize(WIDTH, HEIGHT);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
