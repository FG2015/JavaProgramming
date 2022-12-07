package day26_CustomMethodPractice;

import Utilities.ArrayUtilities;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {
    int []res1={12,4,67,4,76,7,67,12};
    int []unique=uniqueElements(res1);//and now ths uniele will excute those belowe actions
        System.out.println(Arrays.toString(unique));

}

    public static int[] uniqueElements(int[]array){
        //we first give an array below, but we dont know what is our array elements, thats why we show it empty below
        int[] result={};
        //but first before we add the elements to the result we need to get access to get all elements
        // thats why we should use loop
        for (int each : array) {
            if(ArrayUtilities.frequencyOfElement(array,each)==1){//here it returns from array a freq of elm each
                result=ArrayUtilities.addElement(result,each);//adding elem each to result
                                                                           //reslt assign cuz array unfixble
            }

        }
return result;
    }

}
