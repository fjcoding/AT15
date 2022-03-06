package org.fundacionjala.at15.spaceinvaders;

import java.awt.*;

import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;

public class Score {
    private String score;
    private Font font;
    private Color color;

    public Score(String score) {
        setFont(new Font("Arial", Font.BOLD, TEN));
        setColor(Color.WHITE);
        setScore(score);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public void setScore(String newScore) {
        this.score = "SCORE: " + newScore;
    }

    public void drawScore(Graphics graphic) {
        graphic.setColor(color);
        graphic.setFont(font);
        graphic.drawString(score, TEN, TEN);
    }
}
