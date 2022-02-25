package org.fundacionjala.at15.pacman;

import static org.junit.Assert.*;

import javax.swing.plaf.DimensionUIResource;

import org.junit.Test;

public class WindowTest {
    private Window window = new Window();

    @Test
    public void itShouldHaveTitle() {
        String title = "PACMAN";

        assertEquals(title, window.getWindow().getTitle());
        assertEquals(new DimensionUIResource(700, 700), window.getWindow().getSize());
        assertFalse(window.getWindow().isResizable());
    }

    @Test
    public void itShouldHaveSize() {
        assertEquals(new DimensionUIResource(700, 700), window.getWindow().getSize());
        assertFalse(window.getWindow().isResizable());
    }
}