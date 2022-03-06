package org.fundacionjala.at15.pacman;

import javax.swing.JButton;
import java.awt.Color;

public class Button extends JButton {
    private final int buttonPosX = 450;
    private final int buttonPosY = 50;
    private final int buttonWidth = 200;
    private final int buttonHeight = 40;

    public Button(String buttonLabel, int index) {
        setText(buttonLabel);
        setBounds(buttonPosX, index * buttonPosY, buttonWidth, buttonHeight);
        setBackground(Color.white);
        setVisible(true);
    }
}
