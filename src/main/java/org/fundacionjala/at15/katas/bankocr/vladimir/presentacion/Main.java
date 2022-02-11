package org.fundacionjala.at15.katas.bankocr.vladimir.presentacion;
import java.util.Scanner;
import org.fundacionjala.at15.katas.bankocr.vladimir.manejo.*;

public class Main {
    public static void main(String[] args) {
        var opcion = -1;
        var scanner=new Scanner(System.in);
        MostrarDatosImpl muestra=new MostrarDatosImpl();

        while (opcion!=0) {
            System.out.println("Elige una opcion: \n"
            + "1. Probar si es Cta\n"
                    + "2. Listar Numeros\n"
                    + "0. Salir");
            opcion=Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1:
                    muestra.esCta();
                    break;
                case 2:
                    muestra.listarNumeros();
                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
