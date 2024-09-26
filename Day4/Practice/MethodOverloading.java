package Day4.Practice;

//same name but different formal arguments
public class MethodOverloading {
    public void add(int a , int b){
        System.out.println(a+b);
        System.out.println("from load");
    }

    public int add(int a,int b,int c){
        return a+b+c;
    }
}
