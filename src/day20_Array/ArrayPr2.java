package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPr2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length=scan.nextInt(); //herer we used length to indicate length of array

        if(length<=0){
            System.err.println("invalid entry");
            System.exit(0);
        }

        int[] num=new int[length]; //burda vereceyimiz her hansi nomreleri array edirik deye beraberlesir
        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number");
            num[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(num));

    }
}
// scanner, if, fori, array..