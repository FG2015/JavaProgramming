package day29_ArrayListContinue_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPr1 {
    public static void main(String[] args) {

        String[]countries={"Japan","USA","Turkey","Georgia","Kazakhistan"};
        ArrayList<String>convertArrayToArrayList=new ArrayList<>(Arrays.asList(countries));
        convertArrayToArrayList.removeIf(p-> p.length()>=10);
        //convert array list to array
        countries=convertArrayToArrayList.toArray(new String[0]);
        System.out.println(Arrays.toString(countries));




















    }
}
