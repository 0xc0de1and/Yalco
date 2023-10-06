package sec01.chap01.ex14;

public class Product {

    private static double discount = 0.2;
    private double maxdiscount = 1.2;

    private String name;
    private static int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()) return;
        this.name = name;
    }

    public static int getPrice() {
        return (int)(price * 1 - discount);
    }

    public void setPrice(int price) {
        int max = (int)(this.price * maxdiscount);
        this.price = price < max ? price : max;
    }
}
