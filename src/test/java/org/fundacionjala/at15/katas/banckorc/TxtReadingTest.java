package org.fundacionjala.at15.katas.banckorc;

import static org.junit.Assert.*;
import org.fundacionjala.at15.katas.bankocr.TxtReading;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class TxtReadingTest {

    @Test
    public void allNumbersThatShouldBeExpected() {
        List<String> exp = new ArrayList<>();
        exp.add("000000000");
        exp.add("111111111");
        exp.add("222222222");
        exp.add("333333333");
        exp.add("444444444");
        exp.add("555555555");
        exp.add("666666666");
        exp.add("777777777");
        exp.add("888888888");
        exp.add("999999999");
        exp.add("123456789");
        TxtReading reading = new TxtReading("D:\\workspace\\coding\\AT15\\src\\main\\java\\org\\fundacionjala\\at15\\katas\\bankocr\\txtFile\\numbers.txt");
        assertEquals(exp, reading.getConverd());
    }
}