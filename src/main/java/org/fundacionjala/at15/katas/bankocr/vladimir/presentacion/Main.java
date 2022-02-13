package org.fundacionjala.at15.katas.bankocr.vladimir.presentacion;

import java.util.Scanner;
import org.fundacionjala.at15.katas.bankocr.vladimir.manejo.*;

public class Main {
    private static final int CASE0 = 0;
    private static final int CASE1 = 1;
    private static final int CASE2 = 2;
    private static final int CASE3 = 3;
    private static final int CASE4 = 4;
    public static void main(String[] args) {
        var opcion = -1;
        var scanner = new Scanner(System.in);
        MostrarDatosImpl muestra = new MostrarDatosImpl();

        while (opcion != 0) {
            System.out.println("Elige una opcion: \n"
                    + "1. Probar si es cuenta\n"
                    + "2. Mostrar OCR\n"
                    + "3. Corregir ERR\n"
                    + "4. Corregir ILL\n"
                    + "0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case CASE1:
                    System.out.println(muestra.esCta());
                    break;
                case CASE2:
                    muestra.listarNumeros();
                    break;
                case CASE3:
                    muestra.err();
                    break;
                case CASE4:
                    muestra.ill();
                    break;
                case CASE0:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
