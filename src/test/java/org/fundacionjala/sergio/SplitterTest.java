package org.fundacionjala.sergio;

import org.fundacionjala.at15.katas.bankocr.sergio.Splitter;

import static org.junit.Assert.*;
import org.junit.Test;

public class SplitterTest {

    String line1 = "    _  _     _  _  _  _  _ ";
    String line2 = "  | _| _||_||_ |_   ||_||_|";
    String line3 = "  ||_  _|  | _||_|  ||_| _|";

    String lineOneArray[] = {" ", " ", " ", " ", "_", " ", " ", "_", " ", " ", " ", " ", " ", "_", " ", " ", "_", " ", " ", "_", " ", " ", "_", " ", " ", "_", " "};
    String lineTwoArray[] = {" ", " ", "|", " ", "_", "|", " ", "_", "|", "|", "_", "|", "|", "_", " ", "|", "_", " ", " ", " ", "|", "|", "_", "|", "|", "_", "|"};
    String lineThreeArray[] = {" ", " ", "|", "|", "_", " ", " ", "_", "|", " ", " ", "|", " ", "_", "|", "|", "_", "|", " ", " ", "|", "|", "_", "|", " ", "_", "|"};

    @Test
    public void itShouldSplitStringOfCharachtersOneByOne() {


        Splitter theSpliter = new Splitter(line1,line2,line3);
        theSpliter.theSplit();

        assertArrayEquals(lineOneArray, theSpliter.getLineOneArray());
        assertArrayEquals(lineTwoArray, theSpliter.getLineTwoArray());
        assertArrayEquals(lineThreeArray, theSpliter.getLineThreeArray());
    }

}
