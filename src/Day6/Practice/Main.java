package Day6.Practice;

import java.util.Scanner;

public class Main {
    static double Grosspay = 0.0;
    static double NetPay = 0.0;
    static double tax=0.0;
    static double standardRate = 80.0;
    static double standardtime = 56;

    public static double GetGrossPay(int hr){
        if(hr<=standardtime){
            Grosspay = hr*standardRate;
            return Grosspay;
        }
        else{
            double regularpay = standardRate * standardtime;
            double overtime = hr - standardtime;
            double otpay = 1.5 * overtime* standardRate;
            Grosspay = regularpay+ otpay;
        }
        return Grosspay;
    }
    public static double CalculateTax(double grosspay){
        tax=grosspay*0.02;
        return tax;
    }

    public static double CalculateNetPay(int time){
        NetPay=Grosspay-tax;
        return NetPay;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of hours");
        int hours = sc.nextInt();
        double gross =GetGrossPay(hours);
        double taxm=CalculateTax(gross);
        double net =CalculateNetPay(hours);
        System.out.println("total pay "+net+" dollars");

    }
}
