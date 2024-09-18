package org.KNUJavaLabs.ClassWork.lab9;

public class Item {

    float price;
    String name;
    String type;

    public Item() {
        this.name = "Empty";
        this.type = "Empty";
    }

    public Item(float price, String name, String type) {
        this.price = price;
        this.name = name;
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "shop.Item " + name + ", price " + price;
    }

    public static void main(String[] args) {
        Client cl = new Client("Name", "Surname", 1000.0);
        Payment p = new Payment(cl);

        Item item1 = p.order(EnumProducts.MEAT, "Pork", 100);
        Item item2 = p.order(EnumProducts.MILK, "Almond", 20);
        Item item3 = p.order(EnumProducts.MEAT, "Japanese Wagyu", 3000);


        System.out.println("shop.Payment: " + p.sum_money);
    }
}
