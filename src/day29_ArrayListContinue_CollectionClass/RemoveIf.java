package day29_ArrayListContinue_CollectionClass;

import Utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIf {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(12,2,35,7,89,78,5,23,232,1,1,1));
        list.addAll(Arrays.asList(12,3,56,7,9,9,0,0));

        list.removeIf(p-> p<5); //Lambda Expression

        System.out.println(list);
        System.out.println("----------------------------------------------------");
        ArrayList<Integer>list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list1.removeIf(p-> p%2==0);
        System.out.println(list1);
        System.out.println("----------------------------------------------------");

        ArrayList<String>names=new ArrayList<>();
        names.addAll(Arrays.asList("Arman","Maral","Sal","Araz","Kur"));
        names.removeIf(p -> p.startsWith("A"));
        System.out.println(names);

        System.out.println("---------------------------------");

        ArrayList<String>name=new ArrayList<>();
        name.addAll(Arrays.asList("Ala","Bala","quluq","Ula","anna"));
        name.removeIf(p -> StringUtility.isPalindrome(p)); // isPolindrome doesnt work at my utulity class


        System.out.println(name);

















    }
}
