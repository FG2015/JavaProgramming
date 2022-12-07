package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i)*2);
        }
        System.out.println(list);
        System.out.println("-------------------------------------");
        //remove method : decreases the size
        ArrayList<String>employee=new ArrayList<>();
        employee.add("FEd");
        employee.add("dEd");
        employee.add("GEd");
        employee.add("mEd");
        employee.add("tEd");
        System.out.println(employee);
        employee.remove(1);
        employee.remove("mEd");

        System.out.println(employee);













    }
}
