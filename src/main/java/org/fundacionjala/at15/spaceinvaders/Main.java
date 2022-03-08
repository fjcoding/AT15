package org.fundacionjala.at15.spaceinvaders;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

import java.io.IOException;

public class Main extends JFrame {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Window aux = new Window();
        aux.displayMainFrame();
        Sound.soundMusic();
    }
}
