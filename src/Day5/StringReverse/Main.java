package Day5.StringReverse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
        String s = "My name is Teju";

        String [] arr = s.split(" ");
        String reverse ="";
        for(int i=arr.length-1;i>=0;i--){
            reverse+=arr[i]+" ";
        }

        System.out.println(reverse);
    }
}
