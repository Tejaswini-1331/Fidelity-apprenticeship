package Day5.FindSquareAndCube;

import java.util.Scanner;

public class Main {
    public static void find(double square){
        System.out.println("square "+square*square);
        System.out.println("cube "+square*square*square);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        double s = sc.nextInt();
        find(s);
    }
}
