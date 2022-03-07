package org.fundacionjala.at15.pacman;

//import java.awt.Color;
import java.awt.Image;

import javax.swing.*;

public class Menu {

    private JPanel panelMenu = new JPanel();
    private JLabel menuBackground;
    private ImageIcon imageMenuBackground;
    private ButtonsGroup buttons;
    private Window window;
    private Play play;

    public Menu(Window window, Play play) {
        this.window = window;
        this.play = play;
        buttons = new ButtonsGroup(window, panelMenu);
    }

    public void introMenu() {
        panelMenu.setLayout(null);
        panelMenu.setBounds(0, 0, window.getWindow().getWidth(), window.getWindow().getHeight());
        panelMenu.setVisible(true);

        menuBackground = new JLabel();
        menuBackground.setBounds(0, 0, window.getWindow().getWidth(), window.getWindow().getHeight());
        imageMenuBackground = new ImageIcon("src/main/java/org/fundacionjala/at15/pacman/images/menuImage.jpg");
        imageMenuBackground = new ImageIcon(imageMenuBackground.getImage()
                .getScaledInstance(window.getWindow().getWidth(), window.getWindow().getHeight(), Image.SCALE_DEFAULT));
        menuBackground.setIcon(imageMenuBackground);
        menuBackground.setVisible(true);
        panelMenu.add(menuBackground, 0);

        buttons.setButtons();
        buttons.buttonsEvent(play);

        window.getWindow().add(panelMenu);
    }

    public JPanel getPanelMenu() {
        return panelMenu;
    }

    public ButtonsGroup getButtonsGroup() {
        return buttons;
    }

    public JLabel getmenuBackground() {
        return menuBackground;
    }

}
