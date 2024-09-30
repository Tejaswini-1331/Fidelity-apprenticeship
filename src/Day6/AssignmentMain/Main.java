package Day6.AssignmentMain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the insurance no");
        String no = sc.nextLine();
        System.out.println("enter the insurance name");
        String name = sc.nextLine();
        System.out.println("enter the covered amount");
        double amountcovered = sc.nextDouble();
        System.out.println("1. LifeInsurance \n2. Moto insurance");
        int choice = sc.nextInt();

        if(choice == 1) {
            System.out.println("enter the policy term");
            int policyterm = sc.nextInt();
            System.out.println("enter the benefit percentage");
            float benefitpercent = sc.nextFloat();
                LifeInsurance obj = new LifeInsurance(no,name,amountcovered,policyterm,benefitpercent);
            System.out.println("Calculated premium "+obj.calculatePremium());
        }
        else{
            System.out.println("enter the dep percentage");
            float depPercent = sc.nextFloat();
            MotorInsurance obj = new MotorInsurance(no,name,amountcovered,depPercent);
            System.out.println("Calculated premium "+obj.calculatePremium());
        }
    }
}
