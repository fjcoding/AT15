package org.fundacionjala.at15.spaceinvaders;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Sound {
    protected Clip clip;

    public static void soundMusic()
            throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file = new File("src/main/resources/spaceinvaders/SI.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();
        clip.loop(clip.LOOP_CONTINUOUSLY);
    }
}