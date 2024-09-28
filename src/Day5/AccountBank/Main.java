package Day5.AccountBank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of your account");
        String name = sc.nextLine();
        System.out.println("Enter your account id");
        int id = sc.nextInt();
        System.out.println("Enter your account balance");
        double balance = sc.nextDouble();
        System.out.println("Enter your amount withdrawal");
        double withdrawal = sc.nextDouble();
        Account a = new Account(id,name,balance);

        a.getDetails();
        if(a.withDraw(withdrawal)) {

            System.out.println("Account withdrawal successful\nNew balance" +a.balance);
        }
        else{
            a.getDetails();
            System.out.println("Account withdrawal failed");
        }
    }
}
