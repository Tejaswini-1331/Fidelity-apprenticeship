package Day5.BooleanResult;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public  static boolean greater(int x,int y){
        if(x>y) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the numbers x & y");
        int x = s.nextInt();
        int y = s.nextInt();
        if(greater(x,y)){
            System.out.println("x is greater");
        }
        else{
            System.out.println("y is greater");
        }
    }
}
