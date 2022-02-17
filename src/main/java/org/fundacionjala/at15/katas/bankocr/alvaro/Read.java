package org.fundacionjala.at15.katas.bankocr.alvaro;

public class Read {


    private static final int NROENTRYS = 3;
    private final int dimensions = 3;
    private final int longitudNumber = 9;
    private final int jumpTonextnumber = 3;
    private static Data data = new Data();
    private static String entry;
    private int numberobtained = 0;
    private int index = 0;
    private char[][] mat3x3 = new char[dimensions][dimensions];
    private int[] matnros = new int[longitudNumber];

    public static boolean entryData(String[] dat) {
        boolean cond = false;

        for (int ind = 0; ind < NROENTRYS; ind++) {
            entry = Data.readData(dat, ind);
            data.addToMatrix(entry, ind);
        }
        if (dat.length == NROENTRYS) {
            return !cond;
        } else {
            return cond;
        }
    }
    public void mainOperator() {
        for (int ind = 0; ind < longitudNumber; ind++) {

            mat3x3 = Data.extractNumberIn3x3Matrix(index);
            index = index + jumpTonextnumber;
            numberobtained = Data.compareNumbers(mat3x3);
            matnros[ind] = numberobtained;
        }

        Data.showNumbers(matnros);
        Data.checkIfitIsaValidAccount(matnros);
    }
}