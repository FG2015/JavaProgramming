package day22_MultiDimensionalArray;

public class iterationMultDimArray2 {
    public static void main(String[] args) {
        int[][] arr2D={  {1,2,3},   {4,5,6},   {7,8,9,10,11}};
        for (int i = arr2D.length-1; i >= 0; i--) { //i is index num of 1 D array starting from last index to 0
            for (int j = 0; j < arr2D[i].length; j++) { //j is index num of elements
                System.out.print(arr2D[i][j]+" ");

            }
            System.out.println();
        }

        System.out.println("------------------------------------------------");
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j]);

            }
            System.out.println();
        }






    }
}
