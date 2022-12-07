package day25_CustomMethod_MethodOverloading;

import java.util.Arrays;

public class MethodOverloadingIntro {
    public static void main(String[] args) {
        int   []intArray={1,2,0,-1,5};
        Arrays.sort(intArray);
        double[]doubleArray={10.4,12.4,32,1};
        Arrays.sort(doubleArray);
        char  []charArray={'E','A','N','F'};
        Arrays.sort(charArray);
        System.out.println(Arrays.toString(doubleArray));
        System.out.println("----------------------------------------------------------");


    }public static int sumOfNumbers(int num1,int num2){
        return  num1+num2;
    }
    public static double samOfNumbers(double num1, double num2){
        return num1+num2;
        //adlar eyni ola biler(sumofNumbers) parametrin icindekiler ise ferqli olmalidir

    }
}
