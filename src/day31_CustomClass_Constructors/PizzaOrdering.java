package day31_CustomClass_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {
        //create 100 pizza object:size 'S' cheestopping 2, peperoni 3.
        //create 100 pizza object:size 'M' cheestopping 3, peperoni 4.
        //create 100 pizza object:size 'L' cheestopping 4, peperoni 5.

        ArrayList<Pizza>pizzas=new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Pizza small=new Pizza('S',2,3);
            Pizza medium=new Pizza('M',3,4);
            Pizza Large=new Pizza('L',4,5);
            pizzas.addAll(Arrays.asList(small,medium,Large));



        }

        System.out.println("Total number of pizza = "+pizzas.size());
        double totalPrice=0;
        for (Pizza each : pizzas) {
            each.calculate();
totalPrice+=each.calculate();
        }
        System.out.println(totalPrice);

    }
}
