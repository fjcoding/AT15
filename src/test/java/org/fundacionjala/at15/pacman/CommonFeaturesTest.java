package org.fundacionjala.at15.pacman;

import static org.junit.Assert.*;
import org.junit.Test;

public class CommonFeaturesTest {

    @Test
    public void itShouldChangePositionWithDirection(){
        CommonFeatures someThing = new CommonFeatures();
        someThing.setTransitionX(4);
        someThing.setTransitionY(4);
        int xExpectedW = 3;
        int xExpectedS = 4;
        int yExpectedD = 5;
        int yExpectedA = 4;
        someThing.move("w");
        assertEquals(xExpectedW,someThing.getTransitionX());
        someThing.move("s");
        assertEquals(xExpectedS,someThing.getTransitionX());
        someThing.move("d");
        assertEquals(yExpectedD,someThing.getTransitionY());
        someThing.move("a");
        assertEquals(yExpectedA,someThing.getTransitionY());
    }

}
