package Day5.StringConcat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name");
        String s = sc.nextLine();
        System.out.println("Enter the last name");
        String s1 = sc.nextLine();
        System.out.println("Full name: " + s.concat(s1));
    }
}
