package org.fundacionjala.at15.pacman;

import static org.fundacionjala.at15.pacman.Constants.Table.*;

public class Table {

    public int[][] tablePositions() {
        int[][] aux = {{WALL, WALL, WALL, WALL, WALL, WALL, WALL, WALL, WALL, WALL, WALL, WALL, WALL, WALL, WALL},
            {WALL, DOT, DOT, DOT, DOT, DOT, DOT, WALL, DOT, DOT, DOT, DOT, DOT, DOT, WALL},
            {WALL, DOT, WALL, WALL, DOT, WALL, DOT, WALL, DOT, WALL, WALL, DOT, WALL, DOT, WALL},
            {WALL, DOT, WALL, DOT, DOT, WALL, DOT, WALL, DOT, WALL, WALL, DOT, WALL, DOT, WALL},
            {WALL, DOT, DOT, DOT, WALL, WALL, DOT, DOT, DOT, DOT, DOT, DOT, DOT, DOT, WALL},
            {WALL, DOT, WALL, DOT, DOT, DOT, DOT, DOT, WALL, WALL, WALL, DOT, WALL, WALL, WALL},
            {WALL, DOT, WALL, WALL, DOT, WALL, WALL, DOT, DOT, WALL, WALL, DOT, DOT, DOT, WALL},
            {WALL, DOT, DOT, DOT, DOT, DOT, WALL, WALL, DOT, DOT, DOT, DOT, WALL, DOT, WALL},
            {WALL, WALL, WALL, DOT, WALL, DOT, WALL, WALL, WALL, DOT, WALL, DOT, WALL, DOT, WALL},
            {WALL, DOT, DOT, DOT, WALL, DOT, DOT, DOT, DOT, DOT, DOT, DOT, DOT, DOT, WALL},
            {WALL, DOT, WALL, DOT, DOT, DOT, WALL, WALL, WALL, DOT, WALL, DOT, WALL, DOT, WALL},
            {WALL, DOT, DOT, DOT, WALL, DOT, WALL, DOT, DOT, DOT, DOT, DOT, WALL, DOT, WALL},
            {WALL, DOT, WALL, DOT, WALL, DOT, WALL, DOT, WALL, DOT, WALL, DOT, DOT, DOT, WALL},
            {WALL, DOT, DOT, DOT, WALL, DOT, DOT, DOT, DOT, DOT, DOT, DOT, DOT, DOT, WALL},
            {WALL, WALL, WALL, WALL, WALL, WALL, WALL, WALL, WALL, WALL, WALL, WALL, WALL, WALL, WALL}
        };
        return aux;
    }
}
