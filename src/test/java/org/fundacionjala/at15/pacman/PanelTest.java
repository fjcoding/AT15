package org.fundacionjala.at15.pacman;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PanelTest {
    @Test
    public void itShouldHaveAPanel() {
        Panel thePanel = new Panel();

        assertTrue(thePanel.isVisible());
    }
}
