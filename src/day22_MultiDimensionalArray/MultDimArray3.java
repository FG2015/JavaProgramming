package day22_MultiDimensionalArray;

public class MultDimArray3 {
    public static void main(String[] args) {
        int[][][] arr3D={{{1,2,3},{4,5,6}},{{10,20,30},{40,50,60}}};
        for (int[][]arr2d:
             arr3D) {
            for(int[]arr1D:arr2d){
                for ( int each:arr1D){
                    System.out.println(each);
                }
            }

        }
    }
}
