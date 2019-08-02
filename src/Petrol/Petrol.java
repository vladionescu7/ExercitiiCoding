package Petrol;

import java.util.*;

public class Petrol {
    // Petrol.Petrol
    //-v-a. Simulate the process of refueling. Within the while loop ask user if you should continue or finish.
    //-v- For every entered “continue” command you should add a specific amount of petrol and money (both of type double) and view it on the console.
    //
    //--b. At the end user should pay for petrol. Consider multiple possibilities, like:
    //
    //--The user paid exactly as much as required.
    //
    //--The user paid too much (cashier should return the rest of the money).
    //
    //--The user paid too little – should be asked for the rest.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       refueling();
        System.out.println();
        System.out.println("Doriti sa finalizati? (continue sau finish)");
        while (true){
            String decizie=input.nextLine();
            if (decizie.equals("continue")){
                refueling();
                System.out.println();
                System.out.println("Doriti sa finalizati? (continue sau finish)");
            } else if(decizie.equals("finish")){
                System.out.println("Va multumim!");
                break;
            }
        }





    }
    public static String refueling(){
        Scanner input=new Scanner(System.in);

        System.out.println("Cu ce tip de carburant doriti sa alimentati? (benzina sau motorina)");
        Refueling refueling= new Refueling();
        refueling.tipCarburant=input.nextLine();
       if(refueling.tipCarburant.equals("benzina")){refueling.petrolPrice=5.68;} else if (refueling.tipCarburant.equals("motorina")){refueling.petrolPrice = 6.14;}


        System.out.println("Alegeti modalitatea de alimentare: (cantitate sau suma)");
        String modalitate = input.nextLine();


        if (modalitate.equals("cantitate")) {
            System.out.print("Introduceti cantitatea de carburant: ");
            refueling.petrolAmount = input.nextDouble() * refueling.petrolPrice;
            System.out.println("Aveti de platit "+refueling.petrolAmount+" lei");
        }

        if (modalitate.equals("suma")) {
            System.out.print("Introduceti suma aferenta cantitatii de carburant: ");
            refueling.money =input.nextDouble()/refueling.petrolPrice;
            System.out.printf("Ati alimentat cu "+"%.2f", refueling.money);
            System.out.print(" litri");

        }

        String refuel="";
        return refuel;
    }

    public static String payment(){



        String payment="";
        return payment;
    }

}
