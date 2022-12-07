package day27_WrapperClass;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {
int[]arr1={10,20,30,40,50,30,46};
arr1=replaceAll(arr1,30,1528);
        System.out.println(Arrays.toString(arr1));

    }

    public static int[] replaceAll(int[]array, int oldElement,int newElement){
        //firs I need to check all the element one by one and then once element is matching i need to acces to element and also index
        for (int i = 0; i < array.length; i++) {//indexi elde etdik
            if (array[i]==oldElement){
                array[i]=newElement;
            }
        }
        return array;
    }
}
