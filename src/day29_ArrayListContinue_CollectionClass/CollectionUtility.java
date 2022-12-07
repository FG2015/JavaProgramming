package day29_ArrayListContinue_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,90,6,67));
        Collections.sort(list);

        System.out.println(list);
        System.out.println("-----------------------------------------------");

        ArrayList<Character>list1=new ArrayList<>();
        list1.addAll(Arrays.asList('a','b','b','c','f'));
        Collections.reverse(list1);
        System.out.println(list1);

        System.out.println("----------------------------------------------------");

        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(Arrays.asList(10,20,30,40,50));
        Collections.swap(list2,1,3);
        System.out.println(list2);

        System.out.println("----------------------------------------------------");

        int max=Collections.max(list2);
        System.out.println(max); //opposite is min

        System.out.println("----------------------------------------------------");

        ArrayList<Integer>list3=new ArrayList<>();
        list3.addAll(Arrays.asList(10,10,20,30,40,10,1,01,10));
        Collections.replaceAll(list3,10,1528);
        System.out.println(list3);

        System.out.println("----------------------------------------------------");

        int frequnecy=Collections.frequency(list3,1528);
        System.out.println(frequnecy);







    }
}
