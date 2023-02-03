package day41_53_Shorts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        System.out.println("Hello Kitty");

   /*     try {
            throw new InterruptedException("wrong language");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


    */


        System.out.println("Enter your age");
        int age= new Scanner(System.in).nextInt();
        
        if (age<0||age>130){
            throw new InputMismatchException("invalid age: ");
        }
        System.out.println("age = " + age);
        
    }
}
