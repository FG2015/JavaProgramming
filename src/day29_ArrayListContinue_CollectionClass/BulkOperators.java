package day29_ArrayListContinue_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperators {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        list.removeAll(Arrays.asList(4,5,2));
        System.out.println("list = " + list);
        System.out.println("----------------------------------");
        ArrayList<Integer>list1=new ArrayList<>();
        list1.addAll(Arrays.asList(12,13,24,45,7,87,79,43));
        list1.retainAll(Arrays.asList(12,13,87)); //opposite of remove method
        System.out.println(list1);

        ArrayList<String>str=new ArrayList<>();
        str.addAll(Arrays.asList("developer","QA","SDET","PO","SM"));
        str.retainAll(Arrays.asList("SDET","QA"));
        System.out.println(str);
        System.out.println("---------------------------");

        //containsAll


        ArrayList<Integer>list3=new ArrayList<>();
        list3.addAll(Arrays.asList(1,3,4,5,6,7));
        boolean r1=list3.contains(3);
        System.out.println(r1);
        boolean r2=list3.containsAll(Arrays.asList(1,2,4,5,7,6));

        System.out.println(r2);
        System.out.println("---------------------------");
        String[]names={"Farod","Ferid","Ali","Demsalaq"};
        ArrayList<String>nameList=new ArrayList<>();
        nameList.addAll(Arrays.asList(names));
        System.out.println(nameList);
        System.out.println("--------------------------");
        Integer[]arr={1,2,3,4,4,5,6,7,8,8}; // we can not convert int
        ArrayList<Integer>arrList=new ArrayList<>();
        arrList.addAll(Arrays.asList(arr));
        System.out.println(arrList);
        System.out.println("________________________________________________");

        int[]arr2={1,4,5,7,8};
        System.out.println(convertArrayToArrayList(arr2));
    }

public static ArrayList<Integer>convertArrayToArrayList(int[]array){

        ArrayList<Integer>list=new ArrayList<>(); //now we need to get array from int and add to the ArrayList

    for (int each : array) {
        list.add(each);

    }
 return list;



}




}
