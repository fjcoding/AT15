package org.fundacionjala.at15.katas.bankocr.vladimir;

import java.util.Scanner;

public class Main {
    private static final int CASE0 = 0;
    private static final int CASE1 = 1;
    private static final int CASE2 = 2;
    private static final int CASE3 = 3;
    private static final int CASE4 = 4;
    public static void main(String[] args) {
        int opcion = -1;
        Scanner scanner = new Scanner(System.in);
        MostrarDatosImpl muestra = new MostrarDatosImpl();

        while (opcion != 0) {
            System.out.println("Elige una opcion: \n"
                    + "1. Mostrar OCR\n"
                    + "2. Probar si es cuenta\n"
                    + "3. Corregir ERR\n"
                    + "4. Corregir ILL\n"
                    + "0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case CASE1:
                    for (int ind = 0; ind < muestra.listarNumeros().length; ind++) {
                        System.out.println(muestra.listarNumeros()[ind]);
                    }
                    break;
                case CASE2:
                    System.out.println(muestra.esCta());
                    break;
                case CASE3:
                    System.out.println(muestra.err());
                    break;
                case CASE4:
                    System.out.println(muestra.ill());
                    break;
                case CASE0:
                    System.out.println("Terminado");
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
