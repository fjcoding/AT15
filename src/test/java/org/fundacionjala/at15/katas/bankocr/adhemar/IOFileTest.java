package org.fundacionjala.at15.katas.bankocr.adhemar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IOFileTest {
    @Test
    public void itShouldHaveAPath() {
        IOFile theFile = new IOFile("files\testFile.txt");

        assertEquals("files\testFile.txt", theFile.getPath());
    }

    @Test
    public void itShouldReadAOneLineFile() {
        IOFile theFile = new IOFile("src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\adhemar\\files\\test1.txt");
        theFile.readFile();

        assertEquals("Hello\n", theFile.getStringContent());
    }

    @Test
    public void itShouldReadMultiLinesFiles() {
        IOFile theFile = new IOFile("src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\adhemar\\files\\test2.txt");
        theFile.readFile();
        String multiLineFile =
        "    _  _     _  _  _  _  _ \n" +
        "  | _| _||_||_ |_   ||_||_|\n" +
        "  ||_  _|  | _||_|  ||_| _|\n" +
        "                           \n";

        assertEquals(multiLineFile, theFile.getStringContent());
    }

    @Test
    public void itShouldVerifyCorrectNumberOfLinesAndCharacteresInTheFile() {
        IOFile theFile1 = new IOFile("src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\adhemar\\files\\test3.txt");
        theFile1.readFile();

        assertTrue(theFile1.verifyFile());

        IOFile theFile2 = new IOFile("src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\adhemar\\files\\test4.txt");
        theFile2.readFile();

        assertFalse(theFile2.verifyFile());
    }

    @Test
    public void itShouldSplitEntriesOfTheFile() {
        IOFile theFile = new IOFile("src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\adhemar\\files\\test3.txt");
        theFile.readFile();

        assertEquals( 3, theFile.getEntries().length);
    }
}
