package org.fundacionjala.at15.pacman;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Menu {

    static JPanel panelMenu;
    JButton buttons[];
    JLabel menuBackground;
    ImageIcon imageMenuBackground;
    String player;

    public Menu() {
        buttons = new JButton[2];
    }

    public void introMenu(Window window){

        //presentacion.panelPresentation.setVisible(false);
        panelMenu = new JPanel();
        panelMenu.setLayout(null);
        panelMenu.setBounds(0, 0, window.getWindow().getWidth(), window.getWindow().getHeight());
        panelMenu.setVisible(true);


        menuBackground = new JLabel();
        menuBackground.setBounds(0, 0, window.getWindow().getWidth(), window.getWindow().getHeight());
        imageMenuBackground = new ImageIcon("src/main/java/org/fundacionjala/at15/pacman/images/menuImage.jpg");
        imageMenuBackground = new ImageIcon(imageMenuBackground.getImage().getScaledInstance(window.getWindow().getWidth(), window.getWindow().getHeight(), Image.SCALE_DEFAULT));
        menuBackground.setIcon(imageMenuBackground);
        menuBackground.setVisible(true);
        panelMenu.add(menuBackground, 0);

        buttons[0].setText("Jugar");
        buttons[1].setText("Salir");

        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setBounds(window.getWindow().getWidth()-(200+50), (i+1)*50, 200, 40);
            buttons[i].setVisible(true);
            buttons[i].setBackground(Color.white);
            panelMenu.add(buttons[i],0);
        }
        window.getWindow().add(panelMenu);

    }

    public void menuEvent(Window window, Play play){

        buttons[0].addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e){
                System.out.println("Play");


                player = JOptionPane.showInputDialog(window.getWindow(), "Player name", "Write here");
                while (player == null || player.compareTo("Write here") == 0 || player.compareTo("")==0) {
                    player = JOptionPane.showInputDialog(window.getWindow(), "Write player name", "Write here");
                }
                play.jugar(window, player);
            }
        });

        buttons[1].addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e){
                System.out.println("Quit");
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
