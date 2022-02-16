package org.fundacionjala.at15.katas.bankocr.adhemar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IOFileTest {

    @Test
    public void itShouldReadAOneLineFile() {
        IOFile theFile = new IOFile("src/main/java/org/fundacionjala/at15/katas/bankocr/adhemar/files/HelloTestFile.txt");

        assertEquals("Hello\n", theFile.getStringContent());
    }

    @Test
    public void itShouldReadMultiLinesFiles() {
        IOFile theFile = new IOFile("src/main/java/org/fundacionjala/at15/katas/bankocr/adhemar/files/OneEntryFile.txt");
        String multiLineFile =
        "    _  _     _  _  _  _  _ \n" +
        "  | _| _||_||_ |_   ||_||_|\n" +
        "  ||_  _|  | _||_|  ||_| _|\n" +
        "                           \n";

        assertEquals(multiLineFile, theFile.getStringContent());
    }

    @Test
    public void itShouldVerifyCorrectNumberOfLinesAndCharacteresInTheFile() {
        IOFile theFile1 = new IOFile("src/main/java/org/fundacionjala/at15/katas/bankocr/adhemar/files/MainEntryFile.txt");

        assertTrue(theFile1.verifyFile());

        IOFile theFile2 = new IOFile("src/main/java/org/fundacionjala/at15/katas/bankocr/adhemar/files/ErrorFile.txt");

        assertFalse(theFile2.verifyFile());
    }

    @Test
    public void itShouldSplitEntriesOfTheFile() {
        IOFile theFile = new IOFile("src/main/java/org/fundacionjala/at15/katas/bankocr/adhemar/files/MainEntryFile.txt");

        assertEquals( 14, theFile.getEntries().length);
    }

    @Test
    public void itShouldGetAccountNumbersFile() {
        IOFile theFile1 = new IOFile("src/main/java/org/fundacionjala/at15/katas/bankocr/adhemar/files/MainEntryFile.txt");
        String AccountNumbers1 =
        "123456789\n" +
        "000000000\n" +
        "111111111\n" +
        "222222222\n" +
        "333333333\n" +
        "444444444\n" +
        "555555555\n" +
        "666666666\n" +
        "777777777\n" +
        "888888888\n" +
        "999999999\n" +
        "000000051\n" +
        "49006771?\n" +
        "1234?678?\n";

        assertEquals(AccountNumbers1, theFile1.getAccountNumbers());

        IOFile theFile2 = new IOFile("src/main/java/org/fundacionjala/at15/katas/bankocr/adhemar/files/OneEntryFile.txt");
        String AccountNumbers2 = "123456789\n";

        assertEquals(AccountNumbers2, theFile2.getAccountNumbers());
    }
}
