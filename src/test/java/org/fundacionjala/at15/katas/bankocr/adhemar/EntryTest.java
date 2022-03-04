package org.fundacionjala.at15.katas.bankocr.adhemar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EntryTest {
    @Test
    public void itShouldHaveAnOrigin() {
        IOFile theFile = new IOFile("src/main/java/org/fundacionjala/at15/katas/bankocr/adhemar/files/MainEntryFile.txt");
        String[] Entries = theFile.getEntries();
        Entry theEntry = new Entry(Entries[0]);

        assertEquals(Entries[0], theEntry.getOrigin());
    }

    @Test
    public void itShouldGetIndividualDigitPatterns() {
        IOFile theFile = new IOFile("src/main/java/org/fundacionjala/at15/katas/bankocr/adhemar/files/MainEntryFile.txt");
        String[] Entries = theFile.getEntries();
        Entry theEntry1 = new Entry(Entries[1]);
        String pattern1 =
            " _ \n" +
            "| |\n" +
            "|_|\n";

        assertEquals(pattern1, theEntry1.getDigitPatterns()[8]);

        Entry theEntry2 = new Entry(Entries[0]);
        String pattern2 =
            " _ \n" +
            "|_ \n" +
            " _|\n";

        assertEquals(pattern2, theEntry2.getDigitPatterns()[4]);

        Entry theEntry3 = new Entry(Entries[2]);
        String pattern3 =
            "   \n" +
            "  |\n" +
            "  |\n";

        assertEquals(pattern3, theEntry3.getDigitPatterns()[0]);
    }

    @Test
    public void itShouldCalculateNumberAccount() {
        IOFile theFile = new IOFile("src/main/java/org/fundacionjala/at15/katas/bankocr/adhemar/files/MainEntryFile.txt");
        String[] Entries = theFile.getEntries();
        Entry theEntry1 = new Entry(Entries[0]);

        assertEquals("123456789", theEntry1.getAccountNumber());

        Entry theEntry2 = new Entry(Entries[1]);

        assertEquals("000000000", theEntry2.getAccountNumber());

        Entry theEntry3 = new Entry(Entries[2]);

        assertEquals("111111111", theEntry3.getAccountNumber());
    }

    @Test
    public void itShouldHaveAnStatus() {
        IOFile theFile = new IOFile("src/main/java/org/fundacionjala/at15/katas/bankocr/adhemar/files/MainEntryFile.txt");
        String[] Entries = theFile.getEntries();
        Entry theEntry1 = new Entry(Entries[11]);

        assertTrue(theEntry1.getStatus());

        Entry theEntry2 = new Entry(Entries[2]);

        assertFalse(theEntry2.getStatus());
    }
}
