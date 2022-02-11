package org.fundacionjala.at15.katas.bankocr.alvaro;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main
{
    private static String[][] mat;
    private static String[] str1;
    public static void main(String[] args)
    {
        mat = new String[3][3]; //columnas // filas
        str1=new String[3];
        List<String> values = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        String string1 = scan.nextLine(); //primera ronda de caracteres
        String string2 = scan.nextLine();
        String string3 = scan.nextLine();
        String[] accountEntry = new String[9];

        char[] line1 = string1.toCharArray();
        char[] line2 = string2.toCharArray();
        char[] line3 = string3.toCharArray();



        values=divideArray(line1);
        System.out.println(values);
        for(int i=0; i<3;i++)
        {
            //System.out.println(values.get(i));
            mat[0][i]=values.get(i);

        }
        printMatriz(mat);
    }
    static ArrayList<String> divideArray(char[]array)
    {
        char[] digit=new char[3];//para mover los digitos de cada numero
        int counter=0;
        int index=0;
        List<String> valores = new ArrayList<String>();
        String cadena ="";
        for (int i=0;i<array.length; i++)
        {
            digit[index]=array[i]; //moviendo carater al array para convertirlo en cadena
            index++;
            counter++;
            if (counter==3){
                counter=0;
                index=0;

                cadena=Arrays.toString(digit).replace(",", "").replace("[", "").replace("]", "").replace(" ", "");
                valores.add(cadena);
                //System.out.println(valores.get(0));
                //System.out.println(Arrays.toString(digit).replace(",", "").replace("[", "").replace("]", "").replace(" ", ""));
            }

        }
        return (ArrayList<String>) (valores);
    }
    public static void print(String[]array){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);

        }
    }

    public static void printMatriz(String mat[][]) {
        for (int i = 0; i < 1; i++) {
            for (int columnsIndex = 0; columnsIndex < 3; columnsIndex++) {
                System.out.print(mat[i][columnsIndex] + "  ");
            }
            System.out.println();
        }
    }
}
