package Day4.Problem2;

public class Main {


    public static void main(String[] args) {
        Transaction t = new Transaction(90000);
        System.out.println("your balance is " +t.performTransaction(10000,true));
    }
}
