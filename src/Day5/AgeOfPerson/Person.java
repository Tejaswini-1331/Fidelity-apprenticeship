package Day5.AgeOfPerson;

import java.time.LocalDate;


public class Person {
    String Firstname;
    String lastName;
    LocalDate date;

    Person(String Firstname, String lastName,LocalDate date) {
        this.Firstname = Firstname;
        this.lastName = lastName;
        this.date = date;
    }



    private int calculateAge() {
        return 2024 - date.getYear();
    }

    public String isAdult() {
        int age = calculateAge();
        return (age >= 18) ? "Adult" : "Child";
    }




    public void display(){
        System.out.println(Firstname + " " + lastName);
        System.out.println(date);
        System.out.println(isAdult());
    }
}
