package assignmentt.assign01;

public class Product {
    int id;
    String name;
    int price;
    int quantity;
    double weight;

    public Product(int id, String name, int price, int quantity, double weight) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.weight = weight;
    }
    public void display() {
        System.out.println("id " +id);
        System.out.println("name " +name);
        System.out.println("price " +price);
        System.out.println("quantity " +quantity);
        System.out.println("weight " +weight);
    }
}
