package Shopping;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class StoreManager {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Product[] produseMagazin = new Product[10];
        Product[] cart = new Product[3];
        // ArrayList<Product>cart= new ArrayList<>();

        System.out.print("Insert number of products: ");
        int numarProduseMagazin = input.nextInt();
        int numarProduseCart = 0;
        for (int i = 0; i < numarProduseMagazin; i++) {
            Product p = new Product();
            System.out.print("Insert product name: ");
            input.nextLine();
            p.setName(input.nextLine());
            System.out.print("Insert product price: ");
            p.setPrice(input.nextInt());
            produseMagazin[i] = p;
        }
        for (int i = 0; i < numarProduseMagazin; i++) {

            System.out.println(i + 1 + ")" + " Avem " + produseMagazin[i].getName() + " la " + produseMagazin[i].getPrice() + " lei");

        }
        System.out.println("_______________________________");
        System.out.println("Ce ati dori sa cumparati?" + "( Introduceti indexul aferent produsului)");
        int i = 1;
        while (numarProduseCart < 3) {

            System.out.print("Produsul nr. " + i + "/3" + " : ");
            i++;
            int produs = input.nextInt();
            cart[numarProduseCart] = produseMagazin[produs - 1];
            numarProduseCart++;
        }
        System.out.println("Aveti in cos urmatoarele " + (numarProduseCart + 1) + " produse: ");

        for (int j = 0; j < numarProduseCart; j++) {
            System.out.println(j + ") " + cart[j].getName() + "-->" + cart[j].getPrice() + " RON");

        }
        int sum = 0;
        for (int j = 0; j < numarProduseCart; j++) {
            sum = sum + cart[j].getPrice();
        }
        System.out.println("Aveti de achitat: " + sum + " RON");
        System.out.println("Doriti sa achitati acum?");
      /*  String raspuns = input.nextLine();
        if(raspuns.equals("da")) {
            System.out.println("Introduceti suma dvs de plata: ");
        } else {
            System.out.println("Va multumim pentru colaborare!\n" + "Va mai asteptam!");
            System.exit(0);
        }*/
        System.out.println("Introduceti suma dvs de plata: ");
        int checkout = input.nextInt();
        while (checkout != sum) {
            System.out.println("Suma introdusa nu este corecta! Mai incercati");
            System.out.println("Introduceti suma dvs de plata: ");
            checkout=input.nextInt();
        }
        if (checkout == sum) {
            System.out.println("Va multumim pentru colaborare!\n" + "Va mai asteptam!");
        }


    }

}

