package org.fundacionjala.at15.katas.bankocr.agustin;

import java.io.*;


public class ReaderMachine {

    private static final int LINES = 4;
    private static final int CHAR_LONG = 28;
    private static String content;
    private String stringContent;

    public void readFile(String path, String inputFile) throws FileNotFoundException {


        try {
            BufferedReader input = new BufferedReader(new FileReader(inputFile));
            String newLine = input.readLine();
            while (input != null) {
                content += newLine + '\n';
                newLine = input.readLine();
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean checkSum(String stringContent) {
        return stringContent.split("\n").length % LINES == 0 && stringContent.length() % CHAR_LONG == 0;
    }
}
