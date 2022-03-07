package org.fundacionjala.at15.spaceinvaders;

import java.awt.*;

import static org.fundacionjala.at15.spaceinvaders.Constants.Board.*;

public class Score {
    private String score;
    private Font font;
    private Color color;

    public Score(String score) {
        this.font = new Font("Arial", Font.BOLD, TEN);
        this.color = Color.white;
        setScore(score);
    }

    public void setScore(String newScore) {
        this.score = "SCORE: " + newScore;
    }

    public String getScore() {
        return score;
    }

    public void drawScore(Graphics graphic) {
        graphic.setColor(color);
        graphic.setFont(font);
        graphic.drawString(score, TEN, TEN);
    }
}
