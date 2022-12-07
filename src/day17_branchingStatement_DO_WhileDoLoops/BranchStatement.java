package day17_branchingStatement_DO_WhileDoLoops;

import java.util.Scanner;

public class BranchStatement {
    public static void main(String[] args) {
        for (char i = 'A'; i <='Z' ; i++) {
            if(i=='F'){
               break;
            }
            System.out.println(i+" "); // statement loopun moterizesi icnde olur
        }

        System.out.println("-------------------");
        Scanner scan =new Scanner(System.in);

        while (true){
            System.out.println("Enter number");
            int num= scan.nextInt();

            if(num<0){

                break; // break is for exiting
            }

        }

















    }



}
