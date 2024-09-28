package Day5.CalculatorProgram;

public class Calculate {

    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public double divide(int a, int b, double [] remainder) {
        if(b==0)
        {
            throw new ArithmeticException();
        }
        remainder[0]=a%b;
        return (double) a/b; //gives quotiuent
    }
}
