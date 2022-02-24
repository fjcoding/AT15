package org.fundacionjala.at15.pacman;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WindowTest {
    private Window window = new Window();

    @Test
    public void itShouldHaveTitle() {
        String title = "PACMAN";
        assertEquals(title, window.getWindow().getTitle());
    }
}
