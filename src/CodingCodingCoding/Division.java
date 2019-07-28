package CodingCodingCoding;
import java.util.*;
public class Division {
    public static void main(String[] args) {
        //Write a “divide by” application.
        // User should be able to enter initial value that will be divided in a loop by a new value entered by a user.
        // Division should occur as long, as entered value will be different than 0.
        // Result of division should be rounded to the fourth decimal point and printed to the console.

        double a;
        double b;
        double c;
    Scanner input=new Scanner(System.in);
        System.out.print("a= ");
        a=input.nextDouble();
        System.out.print("b= ");
        b=input.nextDouble(); c=a/b;
        while(b!=0){

            System.out.print("Reaultatul este: ");
            System.out.printf("%.4f",c);
            System.out.println();
            c=c/b;
            System.out.print("b= ");
            b=input.nextDouble();
        }

    }
}
