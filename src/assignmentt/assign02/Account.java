package assignmentt.assign02;

public class Account {
    String name;
     int balance;
     int accNo;


    Account(String name, int balance, int accNo)
    {
        this.name = name;
        this.balance = balance;
        this.accNo = accNo;
    }

    public void deposit(int amount){
        balance = balance + amount;
    }
    public void withdraw(int amount){
       if(balance>amount) balance = balance - amount;
       else System.out.println("Insufficient Balance");
    }
    public void display(){
        System.out.println("Name: " +name);
        System.out.println("Balance: " +balance);
        System.out.println("Account number: " +accNo);

    }
}
