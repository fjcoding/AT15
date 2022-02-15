package org.fundacionjala.at15.katas.bankocr.adhemar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EntryTest {
    @Test
    public void itShouldHaveAnOrigin() {
        IOFile theFile = new IOFile("src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\adhemar\\files\\ThreeEntryFile.txt");
        String[] Entries = theFile.getEntries();
        Entry theEntry = new Entry(Entries[0]);

        assertEquals(Entries[0], theEntry.getOrigin());
    }

    @Test
    public void itShouldHaveDigitPatternsArrayEmpty() {
        IOFile theFile = new IOFile("src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\adhemar\\files\\ThreeEntryFile.txt");
        String[] Entries = theFile.getEntries();
        Entry theEntry = new Entry(Entries[0]);

        assertEquals("", theEntry.getDigitPatterns()[0]);
    }

    @Test
    public void itShouldGetIndividualDigitPatterns() {
        IOFile theFile = new IOFile("src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\adhemar\\files\\ThreeEntryFile.txt");
        String[] Entries = theFile.getEntries();
        Entry theEntry1 = new Entry(Entries[1]);
        String pattern1 =
            " _ \n" +
            "| |\n" +
            "|_|\n";
        theEntry1.splitDigitPatterns();

        assertEquals(pattern1, theEntry1.getDigitPatterns()[8]);

        Entry theEntry2 = new Entry(Entries[0]);
        String pattern2 =
            " _ \n" +
            "|_ \n" +
            " _|\n";
        theEntry2.splitDigitPatterns();

        assertEquals(pattern2, theEntry2.getDigitPatterns()[4]);

        Entry theEntry3 = new Entry(Entries[2]);
        String pattern3 =
            "   \n" +
            "  |\n" +
            "  |\n";
        theEntry3.splitDigitPatterns();

        assertEquals(pattern3, theEntry3.getDigitPatterns()[0]);
    }
}
