package Day5.GameInheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Game without Time Limit. \n 2. Game with time limit");
         int choice = sc.nextInt();

         if(choice == 1)
         {
             System.out.println("Enter the game name.");
             String gameName = sc.next();
             System.out.println("Enter the maximum number of players.");
             int noOfPlayers = sc.nextInt();
             Game game = new Game(gameName,noOfPlayers);
             System.out.println(game.toString());
         }
         else
         {
             System.out.println("Enter the game that has time limit.");
             String gameName = sc.next();
             System.out.println("Enter the maximum number of players.");
             int noOfPlayers = sc.nextInt();
             System.out.println("Enter the time limit.");
             int timeLimit = sc.nextInt();
             GameWithTimeLimit game = new GameWithTimeLimit(gameName,noOfPlayers,timeLimit);
             System.out.println(game.toString());
         }
    }
}
