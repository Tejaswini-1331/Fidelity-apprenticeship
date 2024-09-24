package assignmentt.assign06;

public class Payment extends orderDetails {
    boolean paymentDetails;
    Payment(int productID, String productName, int productPrice,int orderID, int customerID, String customerName,boolean paymentDetails) {
        super(productID,productName,productPrice,orderID, customerID,customerName);
        this.paymentDetails = paymentDetails;

    }
    public void display(){
        super.display();
        System.out.println("Payment Details");
    }
}
