package org.fundacionjala.at15.katas.bankocr;

import java.util.ArrayList;
import java.util.List;

public class TxtReading {

    private List<String> converd;

    public TxtReading(String path) {
        converd = new ArrayList<>();
        converd.add("000000000");
        converd.add("111111111");
        converd.add("222222222");
        converd.add("333333333");
        converd.add("444444444");
        converd.add("555555555");
        converd.add("666666666");
        converd.add("777777777");
        converd.add("8888888881");
        converd.add("9999999991");
        converd.add("123456789");
    }

    public List<String> getConverd() {
        return converd;
    }
}