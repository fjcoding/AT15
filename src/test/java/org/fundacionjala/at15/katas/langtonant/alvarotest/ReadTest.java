package org.fundacionjala.at15.katas.langtonant.alvarotest;

import static org.junit.Assert.assertEquals;

import org.fundacionjala.at15.katas.bankocr.alvaro.Read;
import org.junit.Test;

public class ReadTest {
    @Test
    public void itshoulreadentrysofarray() {
        Read newRead=new Read();
        String[] dat = {"    _  _     _  _  _  _  _ ", "|   _| _||_||_ |_   ||_||_|", "|  |_  _|  | _||_|  ||_||_|"};
        assertEquals(true, Read.entryData(dat));

    }
    @Test
    public void itshoulfailifanarraywithmoredata() {
        Read newRead=new Read();
        String[] dat = {"    _  _     _  _  _  _  _ ", "|   _| _||_||_ |_   ||_||_|", "|  |_  _|  | _||_|  ||_||_|","  __ "};
        assertEquals(false, Read.entryData(dat));

    }

}
