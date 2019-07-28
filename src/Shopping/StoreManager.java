package Shopping;

import java.util.Scanner;

public class StoreManager {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Product[] produseMagazin = new Product[10];
        Product[] cart = new Product[5];

        System.out.println("Insert number of products: ");
        int numarProduseMagazin = input.nextInt();
        for(int i=0;i<numarProduseMagazin;i++){
            Product p=new Product();
            System.out.print("Insert product name: ");
            input.nextLine();
            p.setName(input.nextLine());
            System.out.print("Insert product price: ");
            p.setPrice(input.nextInt());
            produseMagazin[i]=p;
        }
for(int i=0;i<numarProduseMagazin;i++){
    System.out.println("Avem "+produseMagazin[i].getName()+" la "+produseMagazin[i].getPrice()+" lei");

}
    }
}
