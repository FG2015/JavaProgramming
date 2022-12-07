package day25_CustomMethod_MethodOverloading;

import java.util.Arrays;

public class AddElementstoArray_Overloading {
    public static void main(String[] args) {
        String []name={"Ferid"};
       name=addElement(name,"1993");
        System.out.println(Arrays.toString(name));
    }

    public static int []addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;
            result[i] = element;
        }
        return result;
    }



public static  double []addElement(double[]array,double element){
    double[] result = new double[array.length + 1];
    int i = 0;
    for (double each : array) {
        result[i++] = each;
        result[i] = element;
    }
    return result;

}
    public static  char []addElement(char[]array,char element){
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
            result[i] = element;
        }
        return result;

    }
    public static  String[] addElement(String[]array,String element){
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;
            result[i] = element;
        }
        return result;
    }
}
