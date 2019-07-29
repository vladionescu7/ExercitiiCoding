package Shopping;
// Grocery Shopping
//-v-Create class Product, it should contain at least two fields – name and price.
//-v-Create an empty array of Products – it’s size should be at least 5.
//-v-Fill it within while loop. Simulate the process of doing shopping:
//-v-ask for a product,
//-v-add it to the cart (array),
//-v-change index,
//-v-if index will be greater than 5 – finish shopping,
//--*pay for the products. Station

public class Product{
        private int price;
        private String name;



        public Product(){}

    public Product(int pret, String nume) {
        this.price = pret;
        this.name = nume;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


