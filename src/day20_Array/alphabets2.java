package day20_Array;

import java.util.Arrays;

public class alphabets2 {
    public static void main(String[] args) {

        char[]alphabets2=new char[26];
        char ch='Z';

        for (int i = 0; i < alphabets2.length; i++, ch--) {
            alphabets2[i]=ch;  // alphabetin indexi ile xarakterin bir birine beraber oldugunu gosteririk
                               //
        }

        System.out.println(Arrays.toString(alphabets2)); // prints the whole array
        //system.out.println(alphabets) prints the element of array
    }

}
