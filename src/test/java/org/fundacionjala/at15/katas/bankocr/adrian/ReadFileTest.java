package org.fundacionjala.at15.katas.bankocr.adrian;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReadFileTest {
    @Test
    public void readFileAndCompareItToItself() {
        Numbers myMatrix = new Numbers(3, 27);
        ReadFile fileToMatrix = new ReadFile(myMatrix);
        String[][] matrix = new String[3][27];
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
                    matrix[row][ind] = rowData[ind];
                }
                row++;
            }
            myReader.close();
        } catch (FileNotFoundException error) {
            System.out.println("An error occurred");
            error.printStackTrace();
        }
        assertEquals(matrix, fileToMatrix.returnMatrixAfterReadTheFile(myMatrix.getStrings()));
        assertEquals(matrix[2][26], fileToMatrix.returnMatrixAfterReadTheFile(myMatrix.getStrings())[2][26]);
    }

}
