package day29_ArrayListContinue_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {


        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>unique=new ArrayList<>();

        list1.addAll(Arrays.asList(1,2,3,4,5,5,4,3,2,0));
        for (Integer each : list1) {
           int freq= Collections.frequency(list1,each);
           if(freq==1){
               unique.add(each);
           }
        }

        System.out.println(unique);
        System.out.println("---------------------------------------");
        //without using any loop


        ArrayList<Integer>list2=new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5,5,4,3,2,7,1,90));
        ArrayList<Integer>unique2=new ArrayList<>(list2);
        unique2.removeIf(p-> Collections.frequency(list2,p)>1);
        System.out.println(unique2);

















    }
}
