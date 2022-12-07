package day26_CustomMethodPractice;

import Utilities.ArrayUtilities;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[]arr1={2,3,4,5};
        int[]arr2={6,7,8,8,9};
        int[]arr3=ArrayUtilities.merge(arr1,arr2);

        System.out.println(Arrays.toString(arr3));
    }
}
