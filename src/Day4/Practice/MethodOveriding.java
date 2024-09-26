package Day4.Practice;

public class MethodOveriding extends MethodOverloading {
    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
        System.out.println("from ride");
    }
}
