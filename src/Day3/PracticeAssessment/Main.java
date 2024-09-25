package Day3.PracticeAssessment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("choose the device option ");
       System.out.println("1. Basic Media Player");
       System.out.println("2. Smart Tv");
       System.out.println("3. Home Theatre System");
       int choice = sc.nextInt();

       switch(choice){
           case 1: BasicMediaPlayer b = new BasicMediaPlayer("Sony",23,2024,"IOT");
                   b.displayInfo();
                   b.play();
                   break;

           case 2: SmartTv tv = new SmartTv("Samsung",12,2012,55,"Sensors");
                   tv.displayInfo();
                   tv.adjustments();
                   break;
           case 3: HomeTheatreSystem th = new HomeTheatreSystem("LG",10,2010,100,"touch", 90,"tremble");
                  th.displayInfo();
                  th.changeChannel();
                  th.adjustments();
                  th.bass();
                  th.tremblel();
                  break;

       }

    }
}
