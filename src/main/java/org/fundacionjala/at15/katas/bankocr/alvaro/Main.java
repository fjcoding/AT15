package org.fundacionjala.at15.katas.bankocr.alvaro;
public class Main {
    public static void main(String[] args) {
         /**
     Test Data
     Number 123456789
     [    _  _     _  _  _  _  _ ]
     [|   _| _||_||_ |_   ||_||_|]
     [|  |_  _|  | _||_|  ||_| _|]
     */
        Data data = new Data();
        String entry;
        int numberobtained = 0;
        int index = 0;
        char mat3x3[][] = new char[3][3];
        int matnros[] = new int[9];
        for (int ind = 0; ind < 3; ind++) {
            entry = data.readData();
            data.addToMatrix(entry, ind);
        }

        for(int ind = 0; ind < 9; ind++) {

            mat3x3 = Data.extractnumberin3x3matrix(index);
            index = index + 3;
            numberobtained = Data.comparenumbers(mat3x3);
            matnros[ind] = numberobtained;

        }
        Data.shownumbers(matnros);
        Data.checkifitisavalidaccount(matnros);
    }

    }

