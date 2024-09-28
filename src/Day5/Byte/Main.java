package Day5.Byte;

public class Main {
    public static void byt(byte b){
        if(b<128){
            System.out.println(b);
        }
        else{
            System.out.println("largest value stored in byte");
        }
    }
    public static void main(String[] args) {
        byte b = 12;
        System.out.println(b);
    }
}
