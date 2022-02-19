package org.fundacionjala.at15.katas.bankocr.agustin;

import java.io.*;


public class ReaderMachine {

    private static String content;

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

    public static boolean checkSum() {
        return true;
    }
}
