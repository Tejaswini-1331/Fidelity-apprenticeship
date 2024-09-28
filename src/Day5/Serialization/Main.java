package Day5.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Product implements Serializable {
    int productId;
    String proName;

    Product(int productId, String name){
        this.productId = productId;
        proName = name;
    }

}
public class Main {
    public static void main(String[] args) {
         try(ObjectOutputStream obj =new ObjectOutputStream(new FileOutputStream("Product.txt")))
         {
          Product p1 = new Product(1,"P1");
         obj.writeObject(p1);
         System.out.println("serialization completed");
         }
         catch(IOException e){
             throw new RuntimeException(e);
         }
    }

}
