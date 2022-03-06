package org.fundacionjala.at15.spaceinvaders;

import static org.junit.Assert.assertEquals;

import java.awt.Color;

import org.junit.Test;

public class ScoreTest {
    @Test
    public void itShouldHaveScore() {
        Score score = new Score("0");
        String expectedValue = "SCORE: 0";

        assertEquals(expectedValue, score.getScore());
    }

    @Test
    public void itShouldSetScore() {
        Score score = new Score("0");
        String expectedValue = "SCORE: 50";

        score.setScore("50");
        assertEquals(expectedValue, score.getScore());
    }
}
