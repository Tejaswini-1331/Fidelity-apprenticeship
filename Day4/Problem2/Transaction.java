package Day4.Problem2;

import java.sql.SQLOutput;

public class Transaction {
    int balance;
    Transaction(int balance){
        this.balance = balance;
    }

    public int performTransaction(int amount){
        System.out.println("amount has been deposited");
          return balance + amount;
    }

    public int performTransaction(int amount,boolean isWithDrawal){
        System.out.println("amount has been withdrawed");
        return balance - amount;
    }

    public int performTransaction(int amount,String fromAccount,String toAccount){
        System.out.println("amount tranfered "+ fromAccount +"to " + toAccount);
        return balance - amount;
    }

}
