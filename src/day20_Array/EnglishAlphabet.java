package day20_Array;

import java.util.Arrays;

public class EnglishAlphabet {
    public static void main(String[] args) {

        char[]letters=new char[26];
        for (char i = 0 ,j='A'; i < letters.length; i++,j++) { //j burda xarakteri presents
letters [i]=j;

        }

        System.out.println(Arrays.toString(letters));


        System.out.println("---------------------------------------------------");
        //another way
        char[] letters1=new char[26];
        char ch='A';
        for (int i = 0; i <letters1.length ; i++,ch++) {
            letters1[i]=ch;


        }


        System.out.println(Arrays.toString(letters1));



    }
}
