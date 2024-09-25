package Day3.Assessment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of Employee");
        System.out.println("1. Permanent Employee" );
        System.out.println("2. Temporary Employee");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the employee ID");
                int id = sc.nextInt();
                System.out.println("Enter the employee name");
                String name = sc.next();
                System.out.println("Enter the basic Salary");
                float basicSalary = sc.nextFloat();
                System.out.println("Enter the PF");
                int pf = sc.nextInt();
                PermanentEmployee emp = new PermanentEmployee(id,name,basicSalary,pf);

                emp.getBonus();
                emp.salary();
                System.out.println("details are");
                emp.display();
                break;
            case 2:
                System.out.println("Enter the employee ID");
                int id1 = sc.nextInt();
                System.out.println("Enter the employee name");
                String name1 = sc.next();
                System.out.println("enter the daily wages");
                int wages=sc.nextInt();
                System.out.println("Enter the number of days");
                int days=sc.nextInt();

                TemporaryEmployee emp2 = new TemporaryEmployee(id1,name1,wages,days);
                emp2.getBonus();
                emp2.salary();
                System.out.println("details are");
                emp2.display();

        }
    }
}
