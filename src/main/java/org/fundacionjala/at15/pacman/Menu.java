package org.fundacionjala.at15.pacman;

//import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.*;

public class Menu {

    private JPanel panelMenu;
    private JButton[] buttons;
    private JLabel menuBackground;
    private ImageIcon imageMenuBackground;
    private String player;
    private Buttons buttons2;

    public Menu() {
        buttons = new JButton[2];
    }

    public void introMenu(Window window) {

        panelMenu = new JPanel();
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

        buttons2 = new Buttons(buttons, window, panelMenu);
        buttons2.setButtons();

        window.getWindow().add(panelMenu);

    }

    public void menuEvent(Window window, Play play) {

        buttons[0].addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                player = JOptionPane.showInputDialog(window.getWindow(), "Player name", "Write here");
                while (player.compareTo("Write here") == 0 || player.compareTo("") == 0) {
                    player = JOptionPane.showInputDialog(window.getWindow(), "Write player name", "Write here");
                }
                play.runGame(window, player, panelMenu);
            }
        });

        buttons[1].addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                System.exit(0);
            }
        });
    }

    public JPanel getPanelMenu() {
        return panelMenu;
    }

    public JButton[] getButtons() {
        return buttons;
    }

    public JLabel getmenuBackground() {
        return menuBackground;
    }

}
