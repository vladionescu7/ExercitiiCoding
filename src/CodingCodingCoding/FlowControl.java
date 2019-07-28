package CodingCodingCoding;
import java.util.*;
public class FlowControl {
    public static void main(String[] args) {
/*
        //Write an application that will show if entered value is greater, equal or lower than 30.
        Scanner input = new Scanner(System.in);
        System.out.println("Hai baga si tu un numar: ");
        int numar = input.nextInt();
        if (numar < 30) {
            System.out.println("E prea mic");
        } else if (numar == 30) {
            System.out.println("ALA E!");
        } else if (numar > 30) {
            System.out.println("E prea mare");
        }


        System.out.println("========================================");


        //As above but compare two values at the same time.
        // Verify if first value is greater than 30 and second value is greater than 30, and so on.

        System.out.println("Hai baga si tu un numar: ");
        int numar1 = input.nextInt();
        int numar2 = input.nextInt();
        if (numar1 < 30 && numar2 < 30) {
            System.out.println("E prea mic");
        } else if (numar1 == 30 && numar2 == 30) {
            System.out.println("ALA E!");
        } else if (numar1 > 30 && numar2 > 30) {
            System.out.println("E prea mare");
        }
        //.....and so on

    /*    boolean ab;
        ab=a<30&&b<30;
        if(ab) System.out.println("a si b < 30");
*/
        System.out.println("========================================");

        // Write an application that for any entered number between 0 and 9 will provide it’s name.
        // For example for “3” program should print “three”.

        while (true) {
            System.out.println("Introduceti numarul");
            Scanner numere = new Scanner(System.in);
            int numarul = numere.nextInt();

            switch (numarul) {
                case 0:System.out.println("zero"); break;
                case 1:System.out.println("one"); break;
                case 2:System.out.println("two"); break;
                case 3:System.out.println("three"); break;
                case 4:System.out.println("four"); break;
                case 5:System.out.println("five"); break;
                case 6:System.out.println("six"); break;
                case 7:System.out.println("seven"); break;
                case 8:System.out.println("eight"); break;
                case 9:System.out.println("nine"); break;
                default:System.out.println("Please try again"); break;


            }
        }
    }
}
