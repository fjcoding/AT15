package org.fundacionjala.at15.katas.bankocr.adhemar;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EntryTest {
    @Test
    public void itShouldHaveAnOrigin() {
        IOFile theFile = new IOFile("src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\adhemar\\files\\test3.txt");
        theFile.readFile();
        String[] Entries = theFile.getEntries();
        Entry theEntry = new Entry(Entries[0]);

        assertEquals(Entries[0], theEntry.getOrigin());
    }
    
}
