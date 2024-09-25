package assignmentt.assign01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of customers: ");
    int num = sc.nextInt();

    Product[] cutomers = new Product[num];

    for(int i = 0; i < num; i++){
      System.out.println("Enter the product name: ");
      String name = sc.next();
      System.out.println("Enter the product price: ");
      int price = sc.nextInt();
      System.out.println("Enter the quantity: ");
      int quantity = sc.nextInt();
      System.out.println("Enter the id: ");
      int id= sc.nextInt();
      System.out.println("Enter the weight: ");
      double weight = sc.nextDouble();
    }
    for(int i = 0; i < num; i++){
        cutomers[i].display();
    }
    }
}
