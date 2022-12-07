package day17_branchingStatement_DO_WhileDoLoops;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("enter your age ");
        int age=scan.nextInt();
        while (!(age>=18&& age<=120)){
            System.err.println("invalid age, enter your age");
            age=scan.nextInt();
        }



    }
;}
