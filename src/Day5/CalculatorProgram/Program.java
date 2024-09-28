package Day5.CalculatorProgram;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculate calculator = new Calculate();
        System.out.print("Enter first operand: ");
        int a = scanner.nextInt();
        System.out.print("Enter second operand: ");
        int b = scanner.nextInt();


        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Initialize remainder array for Division
        double[] remainder = new double[1];

        // Perform operation based on user input
        switch (operator) {
            case '+':
                System.out.println("Result: " + calculator.add(a, b));
                break;
            case '-':
                System.out.println("Result: " + calculator.subtract(a, b));
                break;
            case '*':
                System.out.println("Result: " + calculator.multiply(a, b));
                break;
            case '/':
                try {
                    double quotient = calculator.divide(a, b, remainder);
                    System.out.println("Quotient: " + quotient);
                    System.out.println("Remainder: " + remainder[0]);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
