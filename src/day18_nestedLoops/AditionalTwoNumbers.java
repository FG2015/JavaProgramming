package day18_nestedLoops;

import java.util.Locale;
import java.util.Scanner;

public class AditionalTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your first number");
            int num = scan.nextInt();
            System.out.println("Enter your second number");
            int num2 = scan.nextInt();
            System.out.println("Addition " + (num2 + num));
            System.out.println("Would you like to continue");
            String answer = scan.next().toLowerCase(Locale.ROOT);

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid entry, please re-enter");
                 answer=scan.next();

            }


            if (answer.equals("no")) {
                break;
            }


        }
    }
}