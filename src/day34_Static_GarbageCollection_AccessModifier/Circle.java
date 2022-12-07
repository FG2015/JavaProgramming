package day34_Static_GarbageCollection_AccessModifier;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi; //pi=3.14 burda da yaza bilerik
    public static String name;
    public static ArrayList<Integer>numbers; //any static block going to static block class..



    public Circle(double radius){
        this.radius=radius;
    }

    static { //it can execute by itself
        pi=3.14;
        name="Circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(29);
    }

  /*public static void main(String[] args) { // it only runs in this class, for ex we can not use it in another class
   pi=3.14;
    name="Circle";
    numbers=new ArrayList<>();
    numbers.add(10);
    numbers.add(20);

    System.out.println(pi);
    System.out.println("Name="+name);
    System.out.println(numbers);



}
*/

}
