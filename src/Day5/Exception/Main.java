package Day5.Exception;

import java.util.Scanner;

class passMissMatchException extends Exception {
    passMissMatchException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password");
        String s1 = sc.next();
        System.out.println("confirm password");
        String s2 = sc.next();
    try {
        if (!s1.equalsIgnoreCase(s2)) {
            throw new passMissMatchException("Passwords don't match");
        }
    }
    catch (passMissMatchException e) {
        System.out.println(e.getMessage());
        System.exit(0);
    }
        System.out.println("password matched");
    }
}
