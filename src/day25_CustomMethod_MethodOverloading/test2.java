package day25_CustomMethod_MethodOverloading;

import Utilities.ArrayUtilities;

public class test2 {
    public static void main(String[] args) {
int[]num={1,2,3,4,5};

ArrayUtilities.printEach(num);

        System.out.println("----------------------");
        char[] ch={'A','c','@','9'};
        ArrayUtilities.printEach(ch);
        System.out.println("--------------------------------");

        int[]number={4,8,9};
        int max1=ArrayUtilities.max(number);
        System.out.println(max1);
        System.out.println("-----------------------------------");

        int []a1={1,2,3,4,5};
        boolean r1=ArrayUtilities.contains(a1,4);
        System.out.println(r1);




    }
}
