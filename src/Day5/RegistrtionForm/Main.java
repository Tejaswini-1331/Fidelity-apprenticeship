package Day5.RegistrtionForm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name ");
        String name = sc.nextLine();
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("Enter the country");
        String country = sc.nextLine();
        System.out.println("Welcome" + name+" your age is "+age+" and you are from "+country);
    }
}
