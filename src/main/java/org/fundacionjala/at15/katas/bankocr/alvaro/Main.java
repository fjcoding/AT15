package org.fundacionjala.at15.katas.bankocr.alvaro;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    String string1 = scan.nextLine(); //primera ronda de caracteres
    //String string2 = scan.nextLine();
    //String string3 = scan.nextLine();
    //String string4 = scan.nextLine();

    char[] line1 = string1.toCharArray();
  //  char[] line2 = string2.toCharArray();
   // char[] line3 = string3.toCharArray();
    //char[] line4 = string4.toCharArray();


        divideArray(line1);

    }
    public static void divideArray(char[]array)
    {
        String[] tokens =Iterables.toArray(Splitter.fixedLength(4).split("Thequickbrownfoxjumps"),
        String.class
    );

    }
    public static void print(char[]array){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);

        }
    }

}
