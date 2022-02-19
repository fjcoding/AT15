package org.fundacionjala.at15.spaceinvaders;

import java.awt.*;
import javax.swing.*;

public class Game extends JComponent {
    private Ship ship;
    private static final float TIMEINTERNVAL = 1000000000f;

    public Game(Ship ship) {
        this.ship = ship;
    }

    public void mainCycle() throws Exception {
        long oldTime = System.nanoTime();
        while (true) {
            long newTime = System.nanoTime();
            float deltaT = (newTime - oldTime) / TIMEINTERNVAL;
            oldTime = newTime;
            this.ship.movement(deltaT);
            this.ship.render();
        }
    }
}
