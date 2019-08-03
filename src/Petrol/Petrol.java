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
        Refueling ref = new Refueling();
        Payment pay = new Payment();
        ref.sumaFinala = 0;


        refueling(ref);
        System.out.println();
        System.out.println("Doriti sa finalizati? (continue/finish)");
        while (true) {
            String decizie = input.nextLine();
            if (decizie.equals("continue")) {
                refueling(ref);
                System.out.println();

                System.out.println("Doriti sa finalizati? (continue/finish)");
            } else if (decizie.equals("finish")) {
                System.out.println("Va multumim!");
                payment(ref, pay);
                break;
            }
        }


    }

    public static String refueling(Refueling ref) {
        Scanner input = new Scanner(System.in);

        System.out.println("Cu ce tip de carburant doriti sa alimentati? (benzina/motorina)");
        ref.tipCarburant = input.nextLine();
        if (ref.tipCarburant.equals("benzina")) {
            ref.petrolPrice = 5.68;
        } else if (ref.tipCarburant.equals("motorina")) {
            ref.petrolPrice = 6.14;
        }


        System.out.println("Alegeti modalitatea de alimentare: (cantitate/suma)");
        String modalitate = input.nextLine();
        ref.setSumaTotala(0);

        if (modalitate.equals("cantitate")) {
            System.out.print("Introduceti cantitatea de carburant: ");
            ref.setPetrolAmount(input.nextDouble() * ref.petrolPrice);
            System.out.printf("Aveti de platit " + "%.2f", ref.getPetrolAmount());
            System.out.print(" lei");
            System.out.println();
            ref.setSumaTotala(ref.getSumaTotala() + ref.getPetrolAmount());
            ref.sumaFinala = ref.sumaFinala + ref.sumaTotala;
            System.out.printf("Suma totala: " + "%.2f", ref.getSumaFinala());
            System.out.print(" lei");
            System.out.println();
        }

        if (modalitate.equals("suma")) {
            System.out.print("Introduceti suma aferenta cantitatii de carburant: ");
            ref.money = input.nextDouble() / ref.petrolPrice;
            ref.petrolAmount = ref.money * ref.petrolPrice;
            System.out.printf("Ati alimentat cu " + "%.2f", ref.money);
            System.out.print(" litri");
            System.out.println();

            ref.setSumaTotala(ref.getSumaTotala() + ref.getPetrolAmount());
            ref.sumaFinala = ref.sumaFinala + ref.sumaTotala;
            System.out.println("Suma totala: ");
            System.out.printf("%.2f", ref.getSumaFinala());
            System.out.print(" lei");


        }

        String refuel = "";
        return refuel;
    }

    public static String payment(Refueling ref, Payment pay) {
        Scanner input = new Scanner(System.in);



        System.out.println("Introduceti suma totala: ");
        pay.sumaDePlata = input.nextDouble();


        if (pay.sumaDePlata > ref.getSumaFinala()) {
            pay.rest = pay.sumaDePlata - ref.getSumaFinala();
            System.out.printf("Va rugam ridicati restul de " + "%.2f", pay.rest);
            System.out.print(" lei");
            System.out.println();
            System.out.println("Va multumim!" + "\n Drum bun!");
        } else if (pay.sumaDePlata < ref.getSumaFinala()) {
            pay.setRestanta(ref.getSumaFinala());
            while (pay.sumaDePlata < pay.getRestanta()) {
                pay.setRestanta(pay.getRestanta()- pay.sumaDePlata);
                System.out.printf("Mai aveti de platit " +"%.2f",pay.getRestanta());
                System.out.print(" lei");
                System.out.println();
                System.out.println("Introduceti restul de plata: ");
                pay.sumaDePlata = input.nextDouble();
                if(pay.sumaDePlata==ref.getSumaFinala()){
                    System.out.println("Va multumim!" + "\n Drum bun!");
                }
            }

        } else if (pay.sumaDePlata == ref.getSumaFinala()) {
            System.out.println("Va multumim!" + "\n Drum bun!");
        }

        String payment = "";
        return payment;
    }

}
