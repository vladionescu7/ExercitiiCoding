package CodingCodingCoding;

import java.util.Scanner;
public class Basics {
    public static void main(String[]args){
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");

        System.out.println("=================================================");

      //  Enter any value with several digits after the decimal point and assign it to variable of type double.
       //     Display the given value rounded to two decimal places.

        System.out.println("Srieti numarul pe care vreti sa il convertiti intr-un nr cu 2 zecimale: ");
        Scanner input=new Scanner(System.in);
        double numar= input.nextDouble();
        System.out.printf("%.2f", numar);
        System.out.println();

        System.out.println("=================================================");

//Display any three strings of characters on one line so that they are aligned to the right edge of the 15-character blocks.
// How to align strings to the left edge?
        //se face cu functia printf si "%15s" unde % indica un sir de formatare, 15 este numarul de spatii si s este string

        String str="Mariola";
        System.out.printf("%15s", str);
        System.out.println();

        System.out.println("=================================================");

        //Enter two values of type int. Display their division casted to the double type and rounded to the third decimal point.

        int t=20;
        int y=3;
        double u= (double) t/y;
        System.out.printf("%.3f",u);
        System.out.println();

        System.out.println("=================================================");
//*Sum two integer variables initialized with maximal values for that type.

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        long sum= (long)a+(long)b;
        System.out.println(sum);

        System.out.println("=================================================");


        //Create three variables, one for each type: float, byte and char.
        // Enter values corresponding to those types using Scanner.
        // What values are you able to enter for each type?

        Scanner valori=new Scanner(System.in);
        System.out.println("Input float: ");
        float float1=valori.nextFloat();
        System.out.println(float1);
        System.out.println("Input byte: ");
        byte byte1=valori.nextByte();
        System.out.println(byte1);
        System.out.println("Input char: ");
        char char1=valori.next().charAt(0);
        System.out.println(char1);

        System.out.println("=================================================");


    }
}
