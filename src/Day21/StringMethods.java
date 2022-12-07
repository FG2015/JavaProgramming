package Day21;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        String name="java";
        char []chars=name.toCharArray();
        System.out.println(Arrays.toString(chars));



        for(char each :name.toCharArray()){
            System.out.println(each);
        }
        System.out.println("---------------------------------------------");


        String sentence="Wooden Spoon";
        String[] word=sentence.split("");
        System.out.println(Arrays.toString(word));


        System.out.println("-------------------------------------");

        String email="Java@gmail.com";
        String []arr =email.split("@");
        System.out.println(Arrays.toString(arr));









    }
}
