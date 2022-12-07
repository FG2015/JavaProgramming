package day30_CustomClass_Info2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {
    public static void main(String[] args) {
// we dont use int cuz collections dont support primitivs
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,5,6,7));
        Collections.swap(list,1,list.size()-1); // indexleri gosteririk
        System.out.println(list);
        System.out.println("_____________________________");

        // 0-lari arrayin sonuna getirmek

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        int size=numbers.size(); //  ilk once arrayin tam uzunlugunu aliriq (birinci olcu)
        numbers.removeAll(Arrays.asList(0));
        System.out.println(numbers);

        int newSize=numbers.size(); // sifirlari atdiqdan sonra qalan olcu
         int totalOfZero=size-newSize;//
        System.out.println("totalOfZero = " + totalOfZero); //
        for (int i = 0; i < totalOfZero; i++) {
            numbers.add(0);

        }

        System.out.println(numbers);
        System.out.println("------------------------------------");
        String str="ABCDererggf1234@#$%";
        ArrayList<Character>chars=new ArrayList<>(); //stringi bir basa chararrayliste kecirmek olmaz

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i)); //now I hv contains of all elements char array
        }
        ArrayList<Character>letterChars=new ArrayList<>(chars);
        letterChars.removeIf(p->!Character.isLetter(p));
        System.out.println(letterChars);






















    }
}
