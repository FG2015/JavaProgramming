package day26_CustomMethodPractice;

import Utilities.ArrayUtilities;

import java.util.Arrays;

public class RemoveElements2 {


    public static void main(String[] args) {
        int[]array={1,2,3,4,6};
        array=removeElements(array,3);
        System.out.println(Arrays.toString(array));
    }



    public static int[] removeElements(int[]array, int index){
        int []result={}; // temporary result to add actions below later
        for (int i=0;i<array.length;i++){ //to get the index of array
            if(i!=index){ //the index which we want to remove from the array is not matching with index of other elemenents
               result= ArrayUtilities.addElement(result,array[i]);
            }

        }
return result;
    }





}
