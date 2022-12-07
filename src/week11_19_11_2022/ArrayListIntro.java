package week11_19_11_2022;

import java.util.AbstractList;
import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
//how to create an array list
        ArrayList<String>cities=new ArrayList<>();
        //how to add element
        cities.add("Kiev");//add returns boolean
        cities.add("Tbilisi");
        cities.add("Vilnius");
        // how to add one element at the begining
        cities.add(0,"Baku"); // we use index to add element
        System.out.println(cities);
        // how to get one element

        System.out.println(cities.get(2));


        // how to update element
        cities.set(3,"NY");

        // how to learn position of the element or indx of element

        System.out.println(cities.indexOf("NY")); ///indx of yny is 3
        System.out.println(cities.lastIndexOf("NY"));// if the element is unique index of last will be same as indexof



        System.out.println(cities);
















    }
}
