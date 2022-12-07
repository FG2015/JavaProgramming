package Day21;

import java.util.Arrays;

public class ReverseArray { //one of the interview questions
    public static void main(String[] args) {

        int[] numbers={10,20,30,40,50}; //array


        int []reversed=new int[numbers.length];//array is fixed thats why we have to get sure if 1st and 2nd int capacities are same


        for (int i = numbers.length-1, j=0; i >=0 ;j++, i--) {
reversed[j]=numbers[i];//whatever we need to print we write here

        }


        System.out.println(Arrays.toString(reversed));



    }
}
