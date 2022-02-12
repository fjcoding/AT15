package org.fundacionjala.at15.katas.bankocr.adrian;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int rows = 3;
        final int columns = 27;
        Numbers matrix = new Numbers(rows, columns);
        String[][] myMatrix = matrix.getStrings();
        String[] rowData;
        int row = 0;
        try {
            File myFile = new File("C:/Users/Adrian/Documents/JALA/Coding/AT15/src/main/java/org/fundacionjala/at15/katas/bankocr/adrian/Text.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                rowData = data.split("");

                for (int ind = 0; ind < rowData.length; ind++) {
                    myMatrix[row][ind] = rowData[ind];
                }
                row++;
            }
            myReader.close();
        } catch (FileNotFoundException error) {
            System.out.println("An error occurred");
            error.printStackTrace();
        }
        matrix.case3();
        //matrix.case4();
    }
}
