package org.fundacionjala.at15.katas.bankocr.diana;

public class Display {
    private int numberInput; // number of de fle.txt
    private String numberInputString;
    // CREAR ARRAAAAAAYYY DE MATRICES

    public Display(int numberInput) {
        this.numberInput = numberInput;

    }

    public void fileInput() { // Read de file.txt and data processing
        String numberInputString = String.valueOf(numberInput);

        for (int indexInput = 0; indexInput < numberInputString.length(); indexInput++) {
            String number = numberInputString.charAt(indexInput);
            char[][] matrixNumber = new char[4][3];
            int position = indexInput;

            switch (number) {
                case "0":
                    matrixNumber = numberZero(matrixNumber);
                    break;
                case "1":
                    matrixNumber = numberOne(matrixNumber);
                    break;
                case "2":
                    matrixNumber = numberTwo(matrixNumber);
                    break;
                case "3":
                    matrixNumber = numberThree(matrixNumber);
                    break;
                case "4":
                    matrixNumber = numberFour(matrixNumber);
                    break;
                case "5":
                    matrixNumber = numberFive(matrixNumber);
                    break;
                case "6":
                    matrixNumber = numberSix(matrixNumber);
                    break;
                case "7":
                    matrixNumber = numberSeven(matrixNumber);
                    break;
                case "8":
                    matrixNumber = numberEight(matrixNumber);
                    break;
                default:
                    matrixNumber = numberNine(matrixNumber);
                    break;
            }

            // Array[position] = matrixNewNumber; GUARDAR EN ARRAAAAAYYYYY
            // System.out.print(//array);

        }

    }

    private char[][] numberZero(char[][] matrixNumber) { // create number zero on a matrix 4x3
        matrixNumber[0][0] = " ";
        matrixNumber[0][1] = "_";
        matrixNumber[0][2] = " ";
        matrixNumber[1][0] = "|";
        matrixNumber[1][1] = " ";
        matrixNumber[1][2] = "|";
        matrixNumber[2][0] = "|";
        matrixNumber[2][1] = "_";
        matrixNumber[2][2] = "|";
        matrixNumber[3][0] = " ";
        matrixNumber[3][1] = " ";
        matrixNumber[3][2] = " ";

        return matrixNumber;
    }

    private char[][] numberOne(char[][] matrixNumber) { // create number one on a matrix 4x3
        matrixNumber[0][0] = " ";
        matrixNumber[0][1] = " ";
        matrixNumber[0][2] = " ";
        matrixNumber[1][0] = " ";
        matrixNumber[1][1] = " ";
        matrixNumber[1][2] = "|";
        matrixNumber[2][0] = " ";
        matrixNumber[2][1] = " ";
        matrixNumber[2][2] = "|";
        matrixNumber[3][0] = " ";
        matrixNumber[3][1] = " ";
        matrixNumber[3][2] = " ";

        return matrixNumber;
    }

    private char[][] numberTwo(char[][] matrixNumber) { // create number two on a matrix 4x3
        matrixNumber[0][0] = " ";
        matrixNumber[0][1] = "_";
        matrixNumber[0][2] = " ";
        matrixNumber[1][0] = " ";
        matrixNumber[1][1] = "_";
        matrixNumber[1][2] = "|";
        matrixNumber[2][0] = "|";
        matrixNumber[2][1] = "_";
        matrixNumber[2][2] = " ";
        matrixNumber[3][0] = " ";
        matrixNumber[3][1] = " ";
        matrixNumber[3][2] = " ";

        return matrixNumber;
    }

    private char[][] numberThree(char[][] matrixNumber) { // create number three on a matrix 4x3
        matrixNumber[0][0] = " ";
        matrixNumber[0][1] = "_";
        matrixNumber[0][2] = " ";
        matrixNumber[1][0] = " ";
        matrixNumber[1][1] = "_";
        matrixNumber[1][2] = "|";
        matrixNumber[2][0] = " ";
        matrixNumber[2][1] = "_";
        matrixNumber[2][2] = "|";
        matrixNumber[3][0] = " ";
        matrixNumber[3][1] = " ";
        matrixNumber[3][2] = " ";

        return matrixNumber;
    }

    private char[][] numberFour(char[][] matrixNumber) { // create number four on a matrix 4x3
        matrixNumber[0][0] = " ";
        matrixNumber[0][1] = " ";
        matrixNumber[0][2] = " ";
        matrixNumber[1][0] = "|";
        matrixNumber[1][1] = "_";
        matrixNumber[1][2] = "|";
        matrixNumber[2][0] = " ";
        matrixNumber[2][1] = " ";
        matrixNumber[2][2] = "|";
        matrixNumber[3][0] = " ";
        matrixNumber[3][1] = " ";
        matrixNumber[3][2] = " ";

        return matrixNumber;
    }

    private char[][] numberFive(char[][] matrixNumber) { // create number five on a matrix 4x3
        matrixNumber[0][0] = " ";
        matrixNumber[0][1] = "_";
        matrixNumber[0][2] = " ";
        matrixNumber[1][0] = "|";
        matrixNumber[1][1] = "_";
        matrixNumber[1][2] = " ";
        matrixNumber[2][0] = " ";
        matrixNumber[2][1] = "_";
        matrixNumber[2][2] = "|";
        matrixNumber[3][0] = " ";
        matrixNumber[3][1] = " ";
        matrixNumber[3][2] = " ";

        return matrixNumber;
    }

    private char[][] numberSix(char[][] matrixNumber) { // create number six on a matrix 4x3
        matrixNumber[0][0] = " ";
        matrixNumber[0][1] = "_";
        matrixNumber[0][2] = " ";
        matrixNumber[1][0] = "|";
        matrixNumber[1][1] = "_";
        matrixNumber[1][2] = " ";
        matrixNumber[2][0] = "|";
        matrixNumber[2][1] = "_";
        matrixNumber[2][2] = "|";
        matrixNumber[3][0] = " ";
        matrixNumber[3][1] = " ";
        matrixNumber[3][2] = " ";

        return matrixNumber;
    }

    private char[][] numberSeven(char[][] matrixNumber) { // create number seven on a matrix 4x3
        matrixNumber[0][0] = " ";
        matrixNumber[0][1] = "_";
        matrixNumber[0][2] = " ";
        matrixNumber[1][0] = " ";
        matrixNumber[1][1] = " ";
        matrixNumber[1][2] = "|";
        matrixNumber[2][0] = " ";
        matrixNumber[2][1] = " ";
        matrixNumber[2][2] = "|";
        matrixNumber[3][0] = " ";
        matrixNumber[3][1] = " ";
        matrixNumber[3][2] = " ";

        return matrixNumber;
    }

    private char[][] numberEight(char[][] matrixNumber) { // create number eight on a matrix 4x3
        matrixNumber[0][0] = " ";
        matrixNumber[0][1] = "_";
        matrixNumber[0][2] = " ";
        matrixNumber[1][0] = "|";
        matrixNumber[1][1] = "_";
        matrixNumber[1][2] = "|";
        matrixNumber[2][0] = "|";
        matrixNumber[2][1] = "_";
        matrixNumber[2][2] = "|";
        matrixNumber[3][0] = " ";
        matrixNumber[3][1] = " ";
        matrixNumber[3][2] = " ";

        return matrixNumber;
    }

    private char[][] numberNine(char[][] matrixNumber) { // create number nine on a matrix 4x3
        matrixNumber[0][0] = " ";
        matrixNumber[0][1] = "_";
        matrixNumber[0][2] = " ";
        matrixNumber[1][0] = "|";
        matrixNumber[1][1] = "_";
        matrixNumber[1][2] = "|";
        matrixNumber[2][0] = " ";
        matrixNumber[2][1] = "_";
        matrixNumber[2][2] = "|";
        matrixNumber[3][0] = " ";
        matrixNumber[3][1] = " ";
        matrixNumber[3][2] = " ";

        return matrixNumber;
    }

    private void printArrayMatrix(Array[matrices]){ //Print array of matrix, check the order
        for (matrices = 0; Array.length; i++) {
            for (columna = 0; 2; columna++) {
                for (fila = 0; 3; fila++) {
                    Console.Log(Array[matrices[columna][fila]]);
                }
            }
        }
        System.out.println();
    }

    private boolean determinateIfZero(char[][] matriz) {
        if ((matriz[0][0] = " ") && (matriz[0][1] = "_") && (matriz[0][2] = " ") && (matriz[1][0] = "|")
                && (matriz[1][1] = " ") && (matriz[1][2] = "|") &&
                (matriz[2][0] = "|") && (matriz[2][1] = "_") && (matriz[2][2] = "|") && (matriz[3][0] = " ")
                && (matriz[3][1] = " ") && (matriz[3][2] = " ")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean determinateIfOne(char[][] matriz) {
        if ((matriz[0][0] = " ") && (matriz[0][1] = " ") && (matriz[0][2] = " ") && (matriz[1][0] = " ")
                && (matriz[1][1] = " ") && (matriz[1][2] = "|") &&
                (matriz[2][0] = " ") && (matriz[2][1] = " ") && (matriz[2][2] = "|") && (matriz[3][0] = " ")
                && (matriz[3][1] = " ") && (matriz[3][2] = " ")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean determinateIfTwo(char[][] matriz) {
        if ((matriz[0][0] = " ") && (matriz[0][1] = " ") && (matriz[0][2] = " ") && (matriz[1][0] = " ")
                && (matriz[1][1] = " ") && (matriz[1][2] = "|") &&
                (matriz[2][0] = " ") && (matriz[2][1] = " ") && (matriz[2][2] = " ") && (matriz[3][0] = " ")
                && (matriz[3][1] = " ") && (matriz[3][2] = " ")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean determinateIfThree(char[][] matriz) {
        if ((matriz[0][0] = " ") && (matriz[0][1] = " ") && (matriz[0][2] = " ") && (matriz[1][0] = " ")
                && (matriz[1][1] = " ") && (matriz[1][2] = "|") &&
                (matriz[2][0] = " ") && (matriz[2][1] = "_") && (matriz[2][2] = "|") && (matriz[3][0] = " ")
                && (matriz[3][1] = " ") && (matriz[3][2] = " ")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean determinateIfFour(char[][] matriz) {
        if ((matriz[0][0] = " ") && (matriz[0][1] = " ") && (matriz[0][2] = " ") && (matriz[1][0] = "|")
                && (matriz[1][1] = "_") && (matriz[1][2] = "|") &&
                (matriz[2][0] = " ") && (matriz[2][1] = " ") && (matriz[2][2] = "|") && (matriz[3][0] = " ")
                && (matriz[3][1] = " ") && (matriz[3][2] = " ")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean determinateIfFive(char[][] matriz) {
        if ((matriz[0][0] = " ") && (matriz[0][1] = " ") && (matriz[0][2] = " ") && (matriz[1][0] = "|")
                && (matriz[1][1] = " ") && (matriz[1][2] = " ") &&
                (matriz[2][0] = " ") && (matriz[2][1] = "_") && (matriz[2][2] = "|") && (matriz[3][0] = " ")
                && (matriz[3][1] = " ") && (matriz[3][2] = " ")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean determinateIfSix(char[][] matriz) {
        if ((matriz[0][0] = " ") && (matriz[0][1] = " ") && (matriz[0][2] = " ") && (matriz[1][0] = "|")
                && (matriz[1][1] = " ") && (matriz[1][2] = " ") &&
                (matriz[2][0] = "|") && (matriz[2][1] = "_") && (matriz[2][2] = "|") && (matriz[3][0] = " ")
                && (matriz[3][1] = " ") && (matriz[3][2] = " ")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean determinateIfSeven(char[][] matriz) {
        if ((matriz[0][0] = " ") && (matriz[0][1] = "_") && (matriz[0][2] = " ") && (matriz[1][0] = " ")
                && (matriz[1][1] = " ") && (matriz[1][2] = "|") &&
                (matriz[2][0] = " ") && (matriz[2][1] = " ") && (matriz[2][2] = "|") && (matriz[3][0] = " ")
                && (matriz[3][1] = " ") && (matriz[3][2] = " ")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean determinateIfEight(char[][] matriz) {
        if ((matriz[0][0] = " ") && (matriz[0][1] = " ") && (matriz[0][2] = " ") && (matriz[1][0] = "|")
                && (matriz[1][1] = " ") && (matriz[1][2] = "|") &&
                (matriz[2][0] = "|") && (matriz[2][1] = "_") && (matriz[2][2] = "|") && (matriz[3][0] = " ")
                && (matriz[3][1] = " ") && (matriz[3][2] = " ")) {
            return true;
        } else {
            return false;
        }
    }

    private boolean determinateIfNine(char[][] matriz){
        if ((matriz[0][0] = " ") && (matriz[0][1] = " ") && (matriz[0][2] = " ") && (matriz[1][0] = "|") &&() matriz[1][1] = " ") && (matriz[1][2] = "|") && 
        (matriz[2][0] = " ") && (matriz[2][1] = "_") && (matriz[2][2] = "|") && (matriz[3][0] = " ") && (matriz[3][1] = " ") && (matriz[3][2] = " ")){
            return true;
        }
        else{
            return false;
        }
    }

    private int getNumber(char[][] matriz) {
        if (determinateIfZero(matriz) = true) {
            return 0;
        }
        if (determinateIfOne(matriz) = true) {
            return 1;
        }
        if (determinateIfTwo(matriz) = true) {
            return 2;
        }
        if (determinateIfThree(matriz) = true) {
            return 3;
        }
        if (determinateIfFour(matriz) = true) {
            return 4;
        }
        if (determinateIfFive(matriz) = true) {
            return 5;
        }
        if (determinateIfSix(matriz) = true) {
            return 6;
        }
        if (determinateIfSeven(matriz) = true) {
            return 7;
        }
        if (determinateIfEight(matriz) = true) {
            return 8;
        }
        if (determinateIfNine(matriz) = true) {
            return 9;
        }
    }

    private void accountNumber() {
        String finalResult = " ";
        for (matrices = 0; Array.length; matrices++) {
            int result = getNumber(Array(matrices));
            resultadoFinal = resultadoFinal + result.ToString();
        }
        Console.Log("THE ACCOUNT NUMBER IS: " + resultadoFinal);
    }
}
