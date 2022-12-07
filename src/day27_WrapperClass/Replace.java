package day27_WrapperClass;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,4,5};
        arr1=replaceElement(arr1,4,6);
        System.out.println(Arrays.toString(arr1));

    }



//                                      array        inx    new element which want to replay
    public static int[]replaceElement(int[]array,int index,int newElement){

        if(index<0||index> array.length-1){
            System.out.println(index +"is invalid");
            System.exit(0);
        }
            array[index]=newElement; //  new element assigning to array's index
        return array;
    }



}
