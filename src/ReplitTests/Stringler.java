package ReplitTests;

import java.util.Scanner;

public class Stringler {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String word=scan.next();

        int son=word.length();
        String word2=word.substring(0,son-1);


        System.out.println(word2);

    }
}
