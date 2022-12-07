package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentences="Today is a good day to learn Java";
        String[]words=sentences.split(" ");
        System.out.println(Arrays.toString(words));
        String reverseSentences="";
        for (int i = words.length - 1; i >= 0; i--) {
            reverseSentences+=words[i]+" ";

        }
        System.out.println(reverseSentences);
    }
}
