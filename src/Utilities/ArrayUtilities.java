package Utilities;

import java.util.Arrays;

public class ArrayUtilities {

    //print each integer of an integer ARRAY in separate lines
    public static void printEach(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    public static void printEach(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }

    public static void printEach(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }

    public static void printEach(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }

    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }


    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    //check if the given integer is contained in the ARRAY, returns BOOLEAN
    public static boolean contains(int[] array, int element) {
        //[]={1,2,3,4} ---->element 6,  yoxlamaliyiq ki 6elementi arrayin icnde var ya yox
        boolean result = false;// false ona gore verirrik ki eyer 6 array icinde tapilmazsa false olaraq netice gostersin
        for (int each : array) { //0 dan sona qeder butun elementi yoxladiq hemcinin verilen elementi
            if (each == element) { //  ve deyirik ki eyer element6 = arraya
                result = true; // o zaman netice true olaraq gosterilisin
            }

        }
        return result;
    }
    public static boolean contains(double[] array, double element) {
        //[]={1,2,3,4} ---->element 6,  yoxlamaliyiq ki 6elementi arrayin icnde var ya yox
        boolean result = false;// false ona gore verirrik ki eyer 6 array icinde tapilmazsa false olaraq netice gostersin
        for (double each : array) { //0 dan sona qeder butun elementi yoxladiq hemcinin verilen elementi
            if (each == element) { //  ve deyirik ki eyer element6 = arraya
                result = true; // o zaman netice true olaraq gosterilisin
            }

        }
        return result;
    }
    public static boolean contains(String[] array, String element) {
        //[]={1,2,3,4} ---->element 6,  yoxlamaliyiq ki 6elementi arrayin icnde var ya yox
        boolean result = false;// false ona gore verirrik ki eyer 6 array icinde tapilmazsa false olaraq netice gostersin
        for (String each : array) { //0 dan sona qeder butun elementi yoxladiq hemcinin verilen elementi
            if (each == element) { //  ve deyirik ki eyer element6 = arraya
                result = true; // o zaman netice true olaraq gosterilisin
            }

        }
        return result;
    }
    public static boolean contains(char[] array, char element) {
        //[]={1,2,3,4} ---->element 6,  yoxlamaliyiq ki 6elementi arrayin icnde var ya yox
        boolean result = false;// false ona gore verirrik ki eyer 6 array icinde tapilmazsa false olaraq netice gostersin
        for (char each : array) { //0 dan sona qeder butun elementi yoxladiq hemcinin verilen elementi
            if (each == element) { //  ve deyirik ki eyer element6 = arraya
                result = true; // o zaman netice true olaraq gosterilisin
            }

        }
        return result;
    }

    public static int frequencyOfElement(int[] array, int element) { //have to find how many times givin element accured in array
        int count = 0;

        for (int each : array) { //each here represents , each element of array
            if (each == element) { //eyer verilen element verilen array icindeki elementlerin birine beraberdirse
                count++; // each time each==element is matching need to increase element by one

            }

        }
        return count;


    }

    public static double frequencyOfElement(double[] array, double element) { //have to find how many times givin element accured in array
        int count = 0;

        for (double each : array) { //each here represents , each element of array
            if (each == element) { //eyer verilen element verilen array icindeki elementlerin birine beraberdirse
                count++; // each time each==element is matching need to increase element by one

            }

        }
        return count;

    }

    public static int frequencyOfElement(String[] array, String element) { //have to find how many times givin element accured in array
        int count = 0;

        for (String each : array) { //each here represents , each element of array
            if (each == element) { //eyer verilen element verilen array icindeki elementlerin birine beraberdirse
                count++; // each time each==element is matching need to increase element by one

            }

        }
        return count;

    }

    public static int frequencyOfElement(char[] array, char element) { //have to find how many times givin element accured in array
        int count = 0;

        for (char each : array) { //each here represents , each element of array
            if (each == element) { //eyer verilen element verilen array icindeki elementlerin birine beraberdirse
                count++; // each time each==element is matching need to increase element by one

            }

        }
        return count;

    }


    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }

    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
            result[i] = element;
        }
        return result;
    }

    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;
            result[i] = element;
        }
        return result;
    }

    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
            result[i] = element;
        }
        return result;
    }


    public static int[] uniqueElements(int[] array) {
        //we first give an array below, but we dont know what is our array elements, thats why we show it empty below
        int[] result = {};
        //but first before we add the elements to the result we need to get access to get all elements
        // thats why we should use loop
        for (int each : array) {
            if (ArrayUtilities.frequencyOfElement(array, each) == 1) {//here it returns from array a freq of elm each
                result = ArrayUtilities.addElement(result, each);//adding elem each to result
                //reslt assign cuz array unfixble
            }

        }
        return result;
    }

    public static double[] uniqueElements(double[] array) {
        //we first give an array below, but we dont know what is our array elements, thats why we show it empty below
        double[] result = {};
        //but first before we add the elements to the result we need to get access to get all elements
        // thats why we should use loop
        for (double each : array) {
            if (ArrayUtilities.frequencyOfElement(array, each) == 1) {//here it returns from array a freq of elm each
                result = ArrayUtilities.addElement(result, each);//adding elem each to result
                //reslt assign cuz array unfixble
            }

        }
        return result;
    }

    public static char[] uniqueElements(char[] array) {
        //we first give an array below, but we dont know what is our array elements, thats why we show it empty below
        char[] result = {};
        //but first before we add the elements to the result we need to get access to get all elements
        // thats why we should use loop
        for (char each : array) {
            if (ArrayUtilities.frequencyOfElement(array, each) == 1) {//here it returns from array a freq of elm each
                result = ArrayUtilities.addElement(result, each);//adding elem each to result
                //reslt assign cuz array unfixble
            }

        }
        return result;
    }

    public static String[] uniqueElements(String[] array) {
        //we first give an array below, but we dont know what is our array elements, thats why we show it empty below
        String[] result = {};
        //but first before we add the elements to the result we need to get access to get all elements
        // thats why we should use loop
        for (String each : array) {
            if (ArrayUtilities.frequencyOfElement(array, each) == 1) {//here it returns from array a freq of elm each
                result = ArrayUtilities.addElement(result, each);//adding elem each to result
                //reslt assign cuz array unfixble
            }

        }
        return result;
    }

    public static int[] removeElement(int[] array, int index) {

        int[] result = new int[array.length - 1]; // length-1 ona gore verilir ki bir eded index cixilanda array kicilir

        int j = 0; // represents "result" index number

        for (int i = 0; i < array.length; i++) { //  we use loop to get the each element
            // in order to ignore the index(2) we should use if condition under below
            //if element of array is matching with the element of given index,directly element can not match with index
            if (i == index) { //whenever any of element is matching index then we skip it with continue
                continue;
            }
            result[j++] = array[i];

        }
        return result;

    }

    public static double[] removeElement(double[] array, int index) {

        double[] result = new double[array.length - 1]; // length-1 ona gore verilir ki bir eded index cixilanda array kicilir

        int j = 0; // represents "result" index number

        for (int i = 0; i < array.length; i++) { //  we use loop to get the each element
            // in order to ignore the index(2) we should use if condition under below
            //if element of array is matching with the element of given index,directly element can not match with index
            if (i == index) { //whenever any of element is matching index then we skip it with continue
                continue;
            }
            result[j++] = array[i];

        }
        return result;

    }

    public static char[] removeElement(char[] array, int index) {

        char[] result = new char[array.length - 1]; // length-1 ona gore verilir ki bir eded index cixilanda array kicilir

        int j = 0; // represents "result" index number

        for (int i = 0; i < array.length; i++) { //  we use loop to get the each element
            // in order to ignore the index(2) we should use if condition under below
            //if element of array is matching with the element of given index,directly element can not match with index
            if (i == index) { //whenever any of element is matching index then we skip it with continue
                continue;
            }
            result[j++] = array[i];

        }
        return result;

    }

    public static String[] removeElement(String[] array, int index) {

        String[] result = new String[array.length - 1]; // length-1 ona gore verilir ki bir eded index cixilanda array kicilir

        int j = 0; // represents "result" index number

        for (int i = 0; i < array.length; i++) { //  we use loop to get the each element
            // in order to ignore the index(2) we should use if condition under below
            //if element of array is matching with the element of given index,directly element can not match with index
            if (i == index) { //whenever any of element is matching index then we skip it with continue
                continue;
            }
            result[j++] = array[i];

        }
        return result;

    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};

        for (int each : arr1) {
            result = addElement(result, each); //adelem vastesile result-a each elementini elave edirik
        }
        for (int each : arr2) {
            result = addElement(result, each);

        }
        return result;
    }

    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = {};

        for (double each : arr1) {
            result = addElement(result, each); //adelem vastesile result-a each elementini elave edirik
        }
        for (double each : arr2) {
            result = addElement(result, each);

        }
        return result;
    }

    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = {};

        for (char each : arr1) {
            result = addElement(result, each); //adelem vastesile result-a each elementini elave edirik
        }
        for (char each : arr2) {
            result = addElement(result, each);

        }
        return result;
    }

    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = {};

        for (String each : arr1) {
            result = addElement(result, each); //adelem vastesile result-a each elementini elave edirik
        }
        for (String each : arr2) {
            result = addElement(result, each);

        }
        return result;
    }


    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            result[j++] = array[i];

        }
        return result;
    }

    //                  {1,2,3,4}
    public static double[] reverse(double[] array) {
        double[] result = new double[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            result[j++] = array[i];

        }
        return result;
    }

    //                  {1,2,3,4}
    public static char[] reverse(char[] array) {
        char[] result = new char[array.length];
        for (char i = (char) (array.length - 1), j = 0; i >= 0; i--) {
            result[j++] = array[i];

        }
        return result;
    }

    //                  {1,2,3,4}
    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            result[j++] = array[i];

        }
        return result;
    }

    public static int[] replaceElement(int[] array, int index, int newElement) {

        if (index < 0 || index > array.length - 1) {
            System.out.println(index + "is invalid");
            System.exit(0);
        }
        array[index] = newElement; //  new element assigning to array's index
        return array;
    }

    public static double[] replaceElement(double[] array, int index, double newElement) {

        if (index < 0 || index > array.length - 1) {
            System.out.println(index + "is invalid");
            System.exit(0);
        }
        array[index] = newElement; //  new element assigning to array's index
        return array;
    }

    public static char[] replaceElement(char[] array, int index, char newElement) {

        if (index < 0 || index > array.length - 1) {
            System.out.println(index + "is invalid");
            System.exit(0);
        }
        array[index] = newElement; //  new element assigning to array's index
        return array;
    }

    public static String[] replaceElement(String[] array, int index, String newElement) {

        if (index < 0 || index > array.length - 1) {
            System.out.println(index + "is invalid");
            System.exit(0);
        }
        array[index] = newElement; //  new element assigning to array's index
        return array;
    }

    public static int[] replaceAll(int[] array, int oldElement, int newElement) {
        //firs I need to check all the element one by one and then once element is matching i need to acces to element and also index
        for (int i = 0; i < array.length; i++) {//indexi elde etdik
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static double[] replaceAll(double[] array, double oldElement, double newElement) {
        //firs I need to check all the element one by one and then once element is matching i need to acces to element and also index
        for (int i = 0; i < array.length; i++) {//indexi elde etdik
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static char[] replaceAll(char[] array, char oldElement, char newElement) {
        //firs I need to check all the element one by one and then once element is matching i need to acces to element and also index
        for (int i = 0; i < array.length; i++) {//indexi elde etdik
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static String[] replaceAll(String[] array, String oldElement, String newElement) {
        //firs I need to check all the element one by one and then once element is matching i need to acces to element and also index
        for (int i = 0; i < array.length; i++) {//indexi elde etdik
            if (array[i].equals(oldElement)) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static int[] removeDuplicates(int[] array) {
        int[] result = {};

//butun array elementlerini result elementine yukleyeceyik deye eachlop istifade edib butun elmtl elde edek
        for (int each : array) {
            if (!ArrayUtilities.contains(result, each)) {//as long as result doesnt contains element each
                result = ArrayUtilities.addElement(result, each);
            }
        }
        return result;
    }
    public static  String[]removeDuplicate(String[]array){
        String[] result={};
        for (String each : array) {
            if(!ArrayUtilities.contains(result,each)){
                result =ArrayUtilities.addElement(result,each);
            }

        }
        return result;
    }











}
