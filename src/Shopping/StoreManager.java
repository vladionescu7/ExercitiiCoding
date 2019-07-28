package Shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreManager {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Product[] produseMagazin = new Product[10];
        Product[] cart = new Product[5];
       // ArrayList<Product>cart= new ArrayList<>();

        System.out.println("Insert number of products: ");
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
            System.out.println(i+1+" Avem " + produseMagazin[i].getName() + " la " + produseMagazin[i].getPrice() + " lei");

        }
        while (numarProduseCart<3){
            System.out.println("Ce ati dori sa cumparati?");
            int produs=input.nextInt();
            cart[numarProduseCart]=produseMagazin[produs-1];
            numarProduseCart++;
        }
        System.out.println("Aveti in cos urmatoarele "+numarProduseCart+" produse: ");

        for(int j=0; j<=numarProduseCart; j++){
            System.out.println(j+cart[j].getName()+"-->"+cart[j].getPrice()+" lei");
        }
    }
}
