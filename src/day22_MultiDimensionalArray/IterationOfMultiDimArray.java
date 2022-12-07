package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IterationOfMultiDimArray {
    public static void main(String[] args) {
        int[][] arr2D={  {1,2,3},{4,5,6},{7,8,9,10,11}}; //this is the array that we have
        for (int i = 0; i < arr2D.length; i++) { //i is index num of single dimensional array
            //System.out.println(Arrays.toString(arr2D[i])); 3arrayin 3u de print edir
            for (int j = 0; j < arr2D[i].length; j++) { //j represents index number of elements
                //outer loop represents:  getting each dim array
                // inner loop ;iterating each single element
                System.out.print(arr2D[i][j]+" "); //  printing elements

            }
            System.out.println(); // using for to get new line after each single arrays
        }
    }
}
