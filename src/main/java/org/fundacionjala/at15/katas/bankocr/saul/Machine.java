package org.fundacionjala.at15.katas.bankocr.saul;

public class Machine {
    private String numberScanned;
    private DigitNumber[] digits;

    public Machine(String numberScanned) {
        this.numberScanned = numberScanned;
        startOcr();
    }

    public String getNumberScanned() {
        return numberScanned;
    }

    public void printNumberScanned() {
        System.out.println(numberScanned);
    }

    public void startOcr() {
        final int third = 3;
        String[] lines = numberScanned.split("\n");
        digits = new DigitNumber[lines[0].length() / third];
        String numberRead = "";
        String line_0 = "";
        String line_1 = "";
        String line_2 = "";
        int indexDigits = 0;

        for (int indexI = 0; indexI < lines[0].length(); indexI++) {
            line_0 += lines[0].charAt(indexI);
            line_1 += lines[1].charAt(indexI);
            line_2 += lines[2].charAt(indexI);

            if ((indexI + 1) % third == 0) {
                numberRead = line_0 + "\n" + line_1 + "\n" + line_2;
                digits[indexDigits] = new DigitNumber(numberRead);
                indexDigits += 1;
                line_0 = "";
                line_1 = "";
                line_2 = "";
            }
        }
    }

    public void printDigits() {
        for (int indexI = 0; indexI < digits.length; indexI++) {
            System.out.print(digits[indexI].getNumber());
        }
    }

    public int calculateChecksum() {
        int checksum = 0;
        final int eleven = 11;

        for (int indexDigits = 0; indexDigits < digits.length; indexDigits++) {
            checksum += digits[indexDigits].getNumber() * (digits.length - indexDigits);
        }

        checksum = checksum % eleven;

        return checksum;
    }

    public String generateReport() {
        String report = "";
        boolean ill = false;
        int checksum = calculateChecksum();

        for (int indexDigits = 0; indexDigits < digits.length; indexDigits++) {
            if (digits[indexDigits].getNumber() >= 0) {
                report += digits[indexDigits].getNumber() + "";
            } else {
                report += "?";
                ill = true;
            }
        }

        if (checksum != 0) {
            if (ill) {
                report += " ILL";
            } else {
                report += " ERR";
            }
        }

        return report;
    }

    public String getIntNumber() {
        String intNumber = "";

        for (int indexDigits = 0; indexDigits < digits.length; indexDigits++) {
            intNumber += digits[indexDigits].getNumber() + "";
        }

        return intNumber;
    }
}
