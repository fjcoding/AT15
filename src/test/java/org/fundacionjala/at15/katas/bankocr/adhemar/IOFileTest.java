package org.fundacionjala.at15.katas.bankocr.adhemar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IOFileTest {
    @Test
    public void itShouldHaveAPath() {
        IOFile theFile = new IOFile("files\testFile.txt");

        assertEquals("files\testFile.txt", theFile.getPath());
    }

    @Test
    public void itShouldReadAFile() {
        IOFile theFile = new IOFile("src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\adhemar\\files\\test1.txt");
        theFile.readFile();

        assertEquals("Hello", theFile.getStringContent());
    }
}
