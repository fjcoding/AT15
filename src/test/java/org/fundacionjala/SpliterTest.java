package org.fundacionjala;


import org.fundacionjala.at15.katas.bankocr.sergio.Spliter;
import static org.junit.Assert.*;
import org.junit.Test;

public class SpliterTest {

    String line1 = "    _  _     _  _  _  _  _ ";
    String line2 = "  | _| _||_||_ |_   ||_||_|";
    String line3 = "  ||_  _|  | _||_|  ||_| _|";

    @Test
    public void itShouldSplitStringOfCharachtersOneByOne() {
        String lineOneArray[] = {" ", " ", " ", " ", "_", " ", " ", "_", " ", " ", " ", " ", " ", "_", " ", " ", "_", " ", " ", "_", " ", " ", "_", " ", " ", "_", " "};
        String lineTwoArray[] = {" ", " ", "|", " ", "_", "|", " ", "_", "|", "|", "_", "|", "|", "_", " ", "|", "_", " ", " ", " ", "|", "|", "_", "|", "|", "_", "|"};
        String lineThreeArray[] = {" ", " ", "|", "|", "_", " ", " ", "_", "|", " ", " ", "|", " ", "_", "|", "|", "_", "|", " ", " ", "|", "|", "_", "|", " ", "_", "|"};

        Spliter theSpliter = new Spliter(line1,line2,line3);
        theSpliter.theSplit();

        assertArrayEquals(lineOneArray, theSpliter.getLineOneArray());
        assertArrayEquals(lineTwoArray, theSpliter.getLineTwoArray());
        assertArrayEquals(lineThreeArray, theSpliter.getLineThreeArray());
    }

    @Test
    public void itShouldTransformToSingleString(){
        String completeDigit = "123456789";
        Spliter theSpliter = new Spliter(line1,line2,line3);

        assertEquals(completeDigit,theSpliter.completeDigit());

    }
}