package day19_LoopsAndString;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your first number");
         int num=scan.nextInt();

        System.out.println("Enter a math operator");
        char operator=scan.next().charAt(0);


        if (!(operator=='+'||operator=='-')){
            System.out.println("Invalid math operator");
            System.exit(0);
        }
        System.out.println("Enter a second number");
        int num2= scan.nextInt();

        System.out.println(num+num2);

    }
}
