package day29_ArrayListContinue_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArray_ArrayList {
    public static void main(String[] args) {
 // reverse
        int[]arr={1,3,4,5,6,7};
        int []result=new int[arr.length];
        int j=0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[j++]=arr[i];
        }

        System.out.println(Arrays.toString(result));

        System.out.println("---------------------------------------");

        ArrayList<Integer>arrlist=new ArrayList<>();
        arrlist.addAll(Arrays.asList(1,2,3,4,5,67,78));
         Collections.reverse(arrlist);
        System.out.println(arrlist);












    }
}
