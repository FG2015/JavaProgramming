package day29_ArrayListContinue_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class INTQUESTION_LargestNumber {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(2,3,4,5,6,7,8,8,89,9));
        int n=7;
        for (int i=1; i<n;i++){
            list.removeIf(p-> Collections.max(list)==p);

        }
        int maxList=Collections.max(list);
        System.out.println(maxList);


    }
}
