package assignmentt.assign03;

public class person {
    private String name;
    public int age;
    public String gender;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
    public void display(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
    }
}
