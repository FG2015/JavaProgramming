package day25_CustomMethod_MethodOverloading;

import Utilities.ArrayUtilities;
import Utilities.StringUtility;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str = "Java Programming Language";
        StringUtility.printEachChar(str);
        System.out.println("--------------------------------------");
        String s1 = "Wooden Spoon";
    String reverse= StringUtility.reverse(s1);
        System.out.println(reverse);
        System.out.println("--------------------------------");

        String word = "civic";

        boolean palindrome = StringUtility.isPalindrome(word);

        System.out.println("palindrome = " + palindrome);
        System.out.println("---------------------------------------");
        String[] names = {"Anna", "Java", "Python", "racecar", "MoM", "Cydeo"};

        int count=0;

        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }
        }

        System.out.println(count);
        System.out.println("_______________________________----------");

        String s2="aaabbbeeecdii";
String s3=StringUtility.removeDuplicates(s2);
        System.out.println(s3);





    }
}