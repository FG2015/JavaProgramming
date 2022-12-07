package day27_WrapperClass;

import Utilities.ArrayUtilities;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 3, 4, 5, 66};
        arr1 = removeDuplicates(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("--------------------------------");

        String[]arr2={"aabbccddee"};
        arr2=removeDuplicate(arr2);
        System.out.println(Arrays.toString(arr2));
    }



    public static int[]removeDuplicates(int[]array){
int[]result={};

//butun array elementlerini result elementine yukleyeceyik deye eachlop istifade edib butun elmtl elde edek
        for (int each : array) {
            if(!ArrayUtilities.contains(result,each)){//as long as result doesnt contains element each
       result=ArrayUtilities.addElement(result,each);
            }
        }
        return result;
    }

    public static  String[]removeDuplicate(String[]array){
        String[] result={};
        for (String each : array) {
            if(!ArrayUtilities.contains(result,each)){
               result =ArrayUtilities.addElement(result,each);
            }

        }
        return result;
    }




}
