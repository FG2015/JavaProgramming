package day17_branchingStatement_DO_WhileDoLoops;

import java.util.Scanner;

public class WillYouMarryMe {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Will you marry me");
        String answer=scanner.nextLine();


        while (!(answer.equalsIgnoreCase("yes")|| answer.equalsIgnoreCase("no"))){
            System.out.println("invalid answer");
            answer=scanner.nextLine();
        }
if(answer.equalsIgnoreCase("yes")){
    System.out.println("Congratulation");

}

if (answer.equalsIgnoreCase("no")){
    System.out.println("goodbye");
}

















    }
}
