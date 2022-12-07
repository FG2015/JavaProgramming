package day20_Array;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
 // create variable which  capable enough to contain  5names

String []myGroup=new String[5];// new string methodu ona gore istifade etdikki biz adlarin ne oldugunu bilmirdik
myGroup[0]="Gunay";  // using the rihgt index is very important
myGroup[1]="Nira";
myGroup[2]="Hulya";
myGroup[3]="Totosh";
myGroup[4]="Potu";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("--------------------------------");
// curly brace ona gore istifade etdik ki gunlerin adlarini bilirdik
        String[]days={"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println(Arrays.toString(days));
        int number=5; // 5nomre b5ci gunun teqlid etdiyi ucun asagida numbver -1etdik.indx5-1=4(Friday)

        if (number<1||number>7){
            System.out.println("Invalid number");
            System.exit(0);

        }
        System.out.println(days[number-1]);

        System.out.println("---------------------------------------------------------");
        String[] months={"January","February","March","April","May","June","July","August","September" +
                "October","November","December"};
        System.out.println(Arrays.toString(months));
        //May ayini  print etmke isteyirikse
        int monthNum=5;
        if (monthNum<1||monthNum>12){
            System.out.println("Invalid number");
        }
        System.out.println(months[monthNum-1]);
        System.out.println("_____________________________________________________");


        //store the elements 10.20,30,40,50
        int[] elements={10,20,30,40,50}; //size of elements is 5
        System.out.println(Arrays.toString(elements));

        System.out.println("--------------------------");
        //create  variable which contains 5score

int[]score=new int[5] ;
   score[0]=10;
   score[1]=20;
   score[2]=30;
   score[3]=40;
   score[4]=50;
        System.out.println(Arrays.toString(score));




    }
}
