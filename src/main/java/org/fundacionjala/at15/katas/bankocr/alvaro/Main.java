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
        String[] dat = {"    _  _     _  _  _  _  _ ", "|   _| _||_||_ |_   ||_||_|", "|  |_  _|  | _||_|  ||_| _|"};
        boolean dataEntry = false;
        Read read = new Read();
        dataEntry = Read.entryData(dat);
        if (dataEntry) {
            read.mainOperator();
        }
    }
}
