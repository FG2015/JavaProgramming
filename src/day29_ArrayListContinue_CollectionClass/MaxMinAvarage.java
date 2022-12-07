package day29_ArrayListContinue_CollectionClass;

import java.util.ArrayList;

public class MaxMinAvarage {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(list);
        int max=list.get(0); // we assume first element as max number and then compare it with others
        int min=list.get(0);
        int sum=0;
        
        for (Integer each : list) {
            if(each>max){
                max=each;
            }
        }
        System.out.println("max = " + max);

        for (Integer each : list) {
            if(each<min){
                min=each;
            }
            sum+=each;
            
        }

        double avarage=(double) sum/list.size();
        System.out.println("avarage = " + avarage);


        System.out.println("min = " + min);


















    }
}
