package assignmentt.assign06;

public class orderDetails extends Product {
    int orderID;
    int customerID;
    String customerName;

    orderDetails(int productID, String productName, int productPrice,int orderID, int customerID, String customerName) {
        super(productID,productName,productPrice);
        this.orderID = orderID;
        this.customerID = customerID;
        this.customerName = customerName;
    }

    public void display() {
        super.display();
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Customer Name: " + customerName);

    }
}
