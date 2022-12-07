package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod2 {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(100);
        list.add(400);
        list.add(400);
        System.out.println(list);
        int num=2;
        Integer number=200;

        list.remove(number);
        list.remove(2);

        System.out.println(list);
        System.out.println("----------------------------------");
        //clear :removes all the elements: the size will be 0
        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
        System.out.println(list);
        System.out.println("-----------------------------");
        // indexof and lastindexof
        ArrayList<Character>characters=new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('b');
        characters.add('A');
        int a=characters.indexOf('A');
        int b=characters.lastIndexOf('A');
        System.out.println(a+","+b);

        System.out.println("-------------------------------------");

        boolean r2=characters.contains('A');
        System.out.println(r2);
























    }
}
