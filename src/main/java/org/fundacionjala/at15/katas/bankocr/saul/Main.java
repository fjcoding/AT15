package org.fundacionjala.at15.katas.bankocr.saul;

public class Main {
    public static void main(String[] args) {
        String numberScanned1 = " _  _  _  _  _  _  _  _    \n| || || || || || || ||_   |\n|_||_||_||_||_||_||_| _|  |";
        System.out.println(numberScanned1);

        String numberScanned2 = "    _  _  _  _  _  _     _ \n|_||_|| || ||_   |  |  | _ \n  | _||_||_||_|  |  |  | _|";
        System.out.println(numberScanned2);

        String numberScanned3 = "    _  _     _  _  _  _  _ \n  | _| _||_||_ |_   ||_||_|\n  ||_  _|  | _||_|  ||_||_|";
        System.out.println(numberScanned3);

        Machine machineOcr1 = new Machine(numberScanned1);
        Machine machineOcr2 = new Machine(numberScanned2);
        Machine machineOcr3 = new Machine(numberScanned3);
        System.out.println(machineOcr1.generateReport());
        System.out.println(machineOcr2.generateReport());
        System.out.println(machineOcr3.generateReport());
    }
}
