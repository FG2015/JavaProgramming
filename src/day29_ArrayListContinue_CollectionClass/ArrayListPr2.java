package day29_ArrayListContinue_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPr2 {
    public static void main(String[] args) {
        ArrayList<String>employees=new ArrayList<>();
        employees.addAll(Arrays.asList("Babek","Dayi","Farid","Vidadi","Rza"));
        employees.removeIf(p-> !p.equals("Farid")&&!p.equals("Rza"));
        System.out.println(employees);

        System.out.println("_-------------------------------------_");

        String[]names={"Bala","Bal","Baliq","Manis","Mahi"};

        ArrayList<String>list=new ArrayList<>(Arrays.asList(names));
        list.removeIf(p-> p.startsWith("M"));
        System.out.println(list);
        System.out.println("------------------------------------");












    }
}
/*
remove the names from employees name except Farid and Rza
 */