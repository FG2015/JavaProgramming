package day25_CustomMethod_MethodOverloading;

import java.util.Arrays;

public class AddElemenetsToArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
arr=addInteger(arr,5);
        System.out.println(Arrays.toString(arr));
        System.out.println("------------------------------------------");

        double[]array={1.4,2.5,3,5};
        array= addDouble(array,4.6);
        System.out.println(Arrays.toString(array));
        System.out.println("------------------------------------------");

        char[]array2={'F','E','R','I','D'};
        array2=addChar(array2,'G');
        System.out.println(Arrays.toString(array2));
        System.out.println("-------------------------------------------");
        String[]array3={"Farid"};
       array3= addString(array3,"Guluzade");
        System.out.println(Arrays.toString(array3));

    }
    public static int[]addInteger(int[]array, int element){ //array oldugu ucun repeat metodu mutleq array gostermeliyik
        int[]result=new int[array.length+1]; //netice beraberdir verilen array plus element

        int i=0;
        for (int each : array) { //verilen arrayda her bir elementi tapmaq ucun foreach loop veririk

          result[i++]=each;//each (element) assign olmalidir resultin index nomresine
            //bu yuxarida etdiyimiz butun prosedur arrayin elementleri ucun idi
            //asagida edeceyimiz proses ise sonuncu element ucun olacaq
            result[i]=element; //en basda sonuncu olan elementi de resulta beraber edirik

        }
        return result;
    }
    public static double[]addDouble(double[]array, double element){ //double arrayimizi ve elementimizi gosteririrk
        double[] result=new double[array.length+1];// array is fixed and unchanged oldugu ucun, yeni array yaradib uzerine element elave edirik
        int i=0;
        for (double each : array) {
            result[i++]=each;

        }
result[i]=element;
        return result;

    }
public  static  char[]addChar(char[]array,char element){
        char[]result=new char[array.length+1];//yeni char vermekle kohne olanin ustune elementi de elave etdik
     //                                     indi ise uzunlugun tapaq
    int i=0;
    for (char each : array) {

        result[i++]=each;
    }
    result[i]=element;
    return result;
}
public static  String[]addString(String[]array,String element){
        String []result=new String[array.length+1];
        int i=0;
    for (String each : array) {
        result[i++]=each;
    }
    result[i]=element;
    return result;
}

}
