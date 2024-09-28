package Day5.AgeOfPerson;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date in the format YYYY-MM-DD");
        String date = sc.next();
        LocalDate dob = LocalDate.parse(date);
        Person p = new Person("teju","L",dob);
        p.display();
    }
}
