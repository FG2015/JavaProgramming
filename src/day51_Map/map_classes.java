package day51_Map;

import java.util.*;

public class map_classes {
    public static void main(String[] args) {


        Map<Integer,String>map1=new HashMap<>();
        map1.put(10,"Artur");
        map1.put(3,"Bera");
        map1.put(44,"Asena");
        System.out.println(map1);

        Map<Integer, String>map2=new LinkedHashMap<>();

        Map<Integer, String>map3=new TreeMap<>();

        Map<Integer, String>map4=new Hashtable<>();

    }
}
