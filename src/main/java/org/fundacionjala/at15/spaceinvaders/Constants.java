package org.fundacionjala.at15.spaceinvaders;

public final class Constants {

    public final class Board {

        static final int BOARD_WIDTH = 800;
        static final int BOARD_HEIGHT = 600;
        static final int GROUND = 290;
        static final int SLEEP = 290;
    }

    public final class Player {

        static final int PLAYER_WIDTH = 15;
        static final int PLAYER_HEIGHT = 10;
        static final int START_X = 400;
        static final int START_Y = 545;
        static final int VELOCITY_X = 15;
        static final int DIAMETER = 15;
    }

    public final class Alien {

        static final int ALIEN_INIT_X = 10;
        static final int ALIEN_INIT_Y = 10;
        static final int ALIEN_HEIGHT = 10;
        static final int ALIEN_WIDTH = 20;
        static final int ALIEN_ROWS = 5;
        static final int ALIEN_COLUMNS = 12;
        static final int ALIEN_SEPARATION = 35;
        static final int ALIEN_DELTA_X = 1;
    }

    public final class Bullet {
        static final int BULLET_WIDTH = 5;
        static final int BULLET_HEIGHT = 15;
        static final int SPEED = 1;
    }

    public final class Block {
        static final int IMAGE_WIDTH = 50;
        static final int IMAGE_HEIGHT = 50;
        static final int ASTEROIDS_POSX_FIRST = 125;
        static final int ASTEROIDS_POSX_SECOND = 350;
        static final int ASTEROIDS_POSX_THIRD = 575;
        static final int ASTEROIDS_POSY = 400;
        static final int ASTEROIDS_WIDTH = 100;
        static final int ASTEROIDS_HEIGHT = 50;
        static final int ASTEROIDS_ARCWIDTH = 25;
        static final int ASTEROIDS_ARCHEIGHT = 25;
        static final int LIFE_ASTEROID = 3;
    }
}
