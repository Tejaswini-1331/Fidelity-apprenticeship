package assignmentt.assign02;

public class Account {
    String name;
     int balance;
    private static String bankName = "SBI";
     int pin;
    Account(){

    }

    Account(String name, int balance, int pin)
    {
        this.name = name;
        this.balance = balance;
        this.pin = pin;
    }
    public void display(){
        System.out.println("Name: " +name);
        System.out.println("Balance: " +balance);
        System.out.println("Bank name: " +bankName);
        System.out.println("PIN: " +pin);

    }
}
