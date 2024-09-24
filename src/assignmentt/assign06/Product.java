package assignmentt.assign06;

public class Product {
    private int productID;
    String productName;
    private int productPrice;

    Product(int productID, String productName, int productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }
    public void display() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
    }
}
