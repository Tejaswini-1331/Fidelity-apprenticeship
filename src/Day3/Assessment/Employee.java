package Day3.Assessment;

public class Employee {
    int id;
    String name;
    float BasicSalary;
    float bonus;
    float netSalary;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("id: " + id);
    }
}
