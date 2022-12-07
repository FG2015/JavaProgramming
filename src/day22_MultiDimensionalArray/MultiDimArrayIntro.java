package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimArrayIntro {
    public static void main(String[] args) {

        String[]group1={"Farid", "Fariz","Hikmet"};
        String[]group2={"Farid", "Fariz","Hikmet"};
        String[]group3={"Farid", "Fariz","Hikmet"};
        String[][] groups=new String[3][];
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;
        System.out.println(Arrays.deepToString(groups));
        System.out.println("-----------------------------------------------------");

        int[][] arr2D={  {1,2,3},{4,5,6},{7,8,9,10,11}};
        //index of arrays   0       1          2

        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(arr2D[2][3]); // elementi elde etmek ucun 2dene moterize istifade edirik




    }
}
