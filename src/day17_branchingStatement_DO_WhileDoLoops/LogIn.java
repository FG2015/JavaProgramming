package day17_branchingStatement_DO_WhileDoLoops;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your user name");
        String u= scan.next();
        System.out.println("Enter your password");
        String p=scan.next();

        if(u.equalsIgnoreCase("Cydeo")&&p.equalsIgnoreCase("Java123")){
            System.out.println("Logged In");
        }else {
            int attempts = 3;


            while (!(u.equals("Cydeo") && p.equals("Java123")) && attempts > 0) {

                System.out.println("Incorrect user name or password, Please re- enter");

                System.out.println("Enter your user name");
                u = scan.next();
                System.out.println("Enter your password");
                p = scan.next();
                attempts--;
            }

//we can use again here if else statemenet to continue to show a"lockdown" print
        }


    }
}
