package Day5.AccountBank;

public class Account {
    int id;
    String accountType;
    double balance;

    Account(int id, String accountType, double balance) {
        this.id = id;
        this.accountType = accountType;
        this.balance = balance;
    }
    public void getDetails(){
        System.out.println("ID: "+id);
        System.out.println("Account Type: "+accountType);
        System.out.println("Balance: "+balance);

    }

    public boolean withDraw(double amount) {
        if(amount>balance) return false;
        balance = balance - amount;
        return true;
    }


}
