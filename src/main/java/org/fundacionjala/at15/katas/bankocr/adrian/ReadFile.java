package org.fundacionjala.at15.katas.bankocr.adrian;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    private final int rows = 3;
    private final int columns = 27;
    private Numbers matrix = new Numbers(rows, columns);

    public ReadFile(Numbers matrix) {
        this.matrix = matrix;
        String[][] myMatrix = matrix.getStrings();
        returnMatrixAfterReadTheFile(myMatrix);
    }

    public String[][] returnMatrixAfterReadTheFile(String[][] matrixAfterRead) {
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
                    matrixAfterRead[row][ind] = rowData[ind];
                }
                row++;
            }
            myReader.close();
        } catch (FileNotFoundException error) {
            System.out.println("An error occurred");
            error.printStackTrace();
        }
        return matrixAfterRead;
    }
}
