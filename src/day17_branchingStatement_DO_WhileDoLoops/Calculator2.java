package day17_branchingStatement_DO_WhileDoLoops;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your first name");
        int num=scan.nextInt();

        System.out.println("Enter your second number");
        int num2= scan.nextInt();

        System.out.println("Enter your math operator");
        char ch=scan.next().charAt(0);

        while (!(ch=='+'||ch=='-')){
            System.out.println("Invalid pls re enter valid operator");
ch=scan.next().charAt(0);
        }


        System.out.println((ch=='+')? num+num2:num-num2);




    }
}
