package day18_nestedLoops;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your username");
        String u= scan.next();                      //ilk olaraq scan edirik
        System.out.println("Enter your password");
        String p=scan.next();

        if(u.equalsIgnoreCase("Cydeo")&& p.equals("WoodenSpoon")){
            System.out.println("Logged In"); // ikinci merhelede if sttmnt istifade edirik ki, eyer databazada olan usname and pass ust uste dusecekse dogrudur
        }else{
            for (int i = 1; i < 3; i++) { //ve else statementde fori istfd ederek 3defe girdiikden sonra incorrect olacaqini gosteririk

                System.out.println("Incorrect Username or Password"); // hemcinin burda da tekraren giris et, parolu yazi gosteririk
                System.out.println("Enter your username");
                 u= scan.next();
                System.out.println("Enter your password");
                 p=scan.next();

                 if(u.equalsIgnoreCase("Cydeo")&& p.equals("WoodenSpoon")){
                     System.out.println("Logged In"); // yene de if istifade edib forinin icinde ne istediuimizi bildiririk
                     break; //  break istifade etmekle loopu dayandirirq
                 }
            }
            if (!(u.equalsIgnoreCase("Cydeo")&& p.equals("WoodenSpoon"))){ // en sonda ise eyer 3defe ersiznde parol ve ad duz olmazsa ne print olmasini gostermemiz ucun if statement istifade edirik
                System.out.println("Incorrect username or password. Please ask to help");
            } //  en sonuncu if ve println de else -in icnde olur

        }







    }
}
