package Day6.Assignment2;

import java.util.*;

class EmployeeNotFoundException extends Exception {
    EmployeeNotFoundException(String message) {
        super(message);
    }
}
class Employee{
    String name;

    Employee(String name) {
        this.name = name;
    }
    public void setName(String name){
       this.name = name;
    }
    public String getName(){
        return name;
    }
}
public class Main {

    public static void findEmployee(List<Employee> emp, String name) throws EmployeeNotFoundException {
        boolean found = emp.stream().anyMatch(Employee -> Employee.getName().equals(name));

       if(!found){
           throw new EmployeeNotFoundException("Emplpoyee with name " + name + " not found");
       }

       else{
           System.out.println("Employee found");
       }
    }
    public static void main(String[] args) {
        List<Employee> empl = new ArrayList<Employee>();
        empl.add(new Employee("John"));
        empl.add(new Employee("Jane"));
        empl.add(new Employee("Bob"));
        empl.add(new Employee("Mary"));
        empl.add(new Employee("Jack"));
        empl.add(new Employee("teju"));

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        try{
            findEmployee(empl, s);
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
