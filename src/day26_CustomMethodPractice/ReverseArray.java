package day26_CustomMethodPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5};
        arr1=reverse(arr1);
        System.out.println(Arrays.toString(arr1));

    }

    //                  {1,2,3,4}
    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            result[j++] = array[i];

        }
return result;
    }
}
