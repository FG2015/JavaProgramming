package day17_branchingStatement_DO_WhileDoLoops;

import java.util.Scanner;

public class  Calculator {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter your first number");
        int num=scanner.nextInt();

        System.out.println("Enter your second number");
        int num2= scanner.nextInt();

        System.out.println("Enter a math operator");
        char ch=scanner.next().charAt(0);


        while (!(ch== '+'|| ch=='-')){
            System.err.println("Invalid operator, please re-enter operator");
             ch=scanner.next().charAt(0);

        }

        System.out.println((ch=='+')? num+num2 : num-num2);

















    }
}
