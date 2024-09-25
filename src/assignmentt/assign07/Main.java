package assignmentt.assign07;

public class Main {
    public static void main(String [] args){
        Animal animal = new Animal();
        animal.eat();
        dog dogg = new dog(); // dog can access all animal methods
        dogg.eat();
    }
}
