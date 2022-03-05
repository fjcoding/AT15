package org.fundacionjala.at15.pacman;

import javax.swing.*;
import java.awt.Color;

public class Buttons {
    private JPanel panelMenu;
    private JButton[] buttons;
    private Window window;
    private final int buttonPosX = 200;
    private final int buttonPosY = 50;
    private final int buttonWeight = 200;
    private final int buttonHeight = 40;

    public Buttons(JButton[] buttons, Window window, JPanel panelMenu) {
        this.buttons = buttons;
        this.window = window;
        this.panelMenu = panelMenu;
    }

    public void setButtons() {
        buttons[0].setText("Play");
        buttons[1].setText("Exit");
        for (int ind = 0; ind < buttons.length; ind++) {
            buttons[ind].setBounds(window.getWindow().getWidth() - (buttonPosX + buttonPosY), (ind + 1) * buttonPosY, buttonWeight, buttonHeight);
            buttons[ind].setVisible(true);
            buttons[ind].setBackground(Color.white);
            panelMenu.add(buttons[ind], 0);
        }
    }
}
