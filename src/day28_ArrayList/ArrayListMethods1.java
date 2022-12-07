package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(20);//  you can add as many as you want
        numbers.add(30);



        numbers.add(2,25); //  20 ile 30 arasina yerlesdirmek ucun 25i index nomresi 2olandan sonraya yaz
        System.out.println(numbers);
        System.out.println(numbers.size());

        int lastIndex=numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);
        int num=numbers.get(2); //getting the index and printing element
        System.out.println("num = " + num);
        System.out.println("___________________________________________");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("----------------------------");


        ArrayList<String>list=new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("Ruby");
        list.add("Java");

        list.set(4,"JavaScript"); //set method as same as replace method
        System.out.println(list);












    }
}
