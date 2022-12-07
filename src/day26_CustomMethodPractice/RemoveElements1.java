package day26_CustomMethodPractice;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {
        int[]array={1,2,3,4};
        array=removeElement(array,2);
        System.out.println(Arrays.toString(array));
    }


                                 //   {1,2,3,4}        2
    public static int[]removeElement(int[]array,int index){

        int[]result=new int[array.length-1]; // length-1 ona gore verilir ki bir eded index cixilanda array kicilir

        int j=0; // represents "result" index number

        for (int i=0;i<array.length;i++) { //  we use loop to get the each element
            // in order to ignore the index(2) we should use if condition under below
            //if element of array is matching with the element of given index,directly element can not match with index
            if (i==index){ //whenever any of element is matching index then we skip it with continue
                continue;
            }
              result[j++]=array[i];

        }
              return result;

    }

}
