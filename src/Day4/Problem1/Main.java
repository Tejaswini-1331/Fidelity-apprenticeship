package Day4.Problem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose shape ");
        System.out.println("1.cube");
        System.out.println("2.cylinder");
        int shape = sc.nextInt();

        if(shape == 1) {
            System.out.println("enter side");
            int a = sc.nextInt();
            cube cub = new cube();
            System.out.println(cub.CalculateVolume(a));
        }
        else if(shape == 2) {
            System.out.println("enter radius and height ");
            int r = sc.nextInt();
            int h = sc.nextInt();

            cylinder cyl = new cylinder();
            System.out.println(cyl.CalculateVolume(r,h));
        }
    }
}
