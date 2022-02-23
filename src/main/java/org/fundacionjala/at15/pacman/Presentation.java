package org.fundacionjala.at15.pacman;

import java.awt.Color;
import java.awt.Image;
import javax.swing.*;

public class Presentation {

    JPanel panelPresentation;
    JButton start;
    JLabel presentationBackground;
    ImageIcon imagePresBackground;

    public Presentation(Window window) {

        panelPresentation = new JPanel();
        panelPresentation.setLayout(null);
        panelPresentation.setBounds(0, 0, window.getWindow().getWidth(), window.getWindow().getHeight());
        panelPresentation.setVisible(true);
        panelPresentation.setBackground(Color.red);


        start = new JButton("start");
        start.setBounds(window.getWindow().getWidth()-130, 20, 100, 30);
        start.setVisible(true);
        start.setBackground(Color.white);
        panelPresentation.add(start,0);


        presentationBackground = new JLabel();
        presentationBackground.setBounds(0, 0, window.getWindow().getWidth(), window.getWindow().getHeight());
        imagePresBackground = new ImageIcon("src/main/java/org/fundacionjala/at15/pacman/images/presentationImage.jpg");
        imagePresBackground = new ImageIcon(imagePresBackground.getImage().getScaledInstance(window.getWindow().getWidth(), window.getWindow().getHeight(), Image.SCALE_DEFAULT));
        presentationBackground.setIcon(imagePresBackground);
        presentationBackground.setVisible(true);
        panelPresentation.add(presentationBackground, 0);
    }

    public JPanel getPanelPresentation() {
        return panelPresentation;
    }

    public JButton getStart() {
        return start;
    }

}
