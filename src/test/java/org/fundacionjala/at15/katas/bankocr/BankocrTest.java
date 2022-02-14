package org.fundacionjala.at15.katas.bankocr;
import static org.junit.Assert.*;

import org.fundacionjala.at15.katas.bankocr.agustin.ReaderMachine;
import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;

import java.io.*;
public class BankocrTest {

    File file1, file2;

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Before
    public void setUp() {
        try {
            file1 = folder.newFile( "testfile1.txt" );
            file2 = folder.newFile( "testfile2.txt" );
        } catch (IOException e) {
            System.err.println(
                    "error creating temporary test file in " +
                            this.getClass().getSimpleName() );
        }
    }

    @Test
    public void itShouldReturnDecodedNumbers() {
        try {
            FileWriter fw1 = new FileWriter(file1);
            BufferedWriter bw1 = new BufferedWriter( fw1 );
            bw1.write( "    _  _     _  _  _  _  _ "+'\n'+"  | _| _||_||_ |_   ||_||_|"+'\n'+"  ||_  _|  | _||_|  ||_| _|");
            bw1.close();

            FileWriter fw2 = new FileWriter( file2 );
            BufferedWriter bw2 = new BufferedWriter( fw2 );
            bw2.write( "content" );
            bw2.close();

        } catch (IOException e) {
            System.err.println(
                    "error creating temporary test file in " +
                            this.getClass().getSimpleName() );
        }

        final String ABSOLUTE_PATH1 = file1.getAbsolutePath();

        assertTrue( file1.isFile() );

    }

    @Test
    public void itShouldDoCheckSumCorrectly() {
        assertFalse(ReaderMachine.checkSum("    _  _     _  _  _  _  _ "+'\n'+"  | _| _||_||_ |_   ||_||_|"+'\n'+"  ||_  _|  | _||_|  ||_| _|"));
    }
}
