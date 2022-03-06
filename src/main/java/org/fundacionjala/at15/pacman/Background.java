package org.fundacionjala.at15.pacman;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Image;

public class Background extends JLabel {
    private ImageIcon imageBackground;
    public Background(String path) {
        setBounds(0, 0, Window.WIDTH, Window.HEIGHT);
        imageBackground = new ImageIcon(path);
        imageBackground = new ImageIcon(imageBackground.getImage().getScaledInstance(Window.WIDTH, Window.HEIGHT, Image.SCALE_DEFAULT));
        setIcon(imageBackground);
        setVisible(true);
    }
}
