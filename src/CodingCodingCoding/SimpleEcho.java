package CodingCodingCoding;
import java.util.*;
public class SimpleEcho {
    public static void main(String[] args) {

        //Write a simple “echo” application, that will: a. print back entered string,
        //
        //b. go to the beginning of a loop if user will enter “continue”,
        //
        //c. break the loop with a “good bye!” message, if user will enter “quit”.

        Scanner input=new Scanner(System.in);
        System.out.println("Introduceti un cuvant: ");

        String echo= "";
        while(!echo.equals("goodbye")){

            echo=input.nextLine();
            if (echo.equals("continue")) {
                System.out.println("Introduceti un cuvant: ");
               continue;
            }System.out.println(echo);
        }
    }
}
