package Day21;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
        String[]students={"Gi","FG"};
        String[]earlyBirds= Arrays.copyOf(students,2);

        System.out.println(Arrays.toString(earlyBirds));

        System.out.println("------------------------------");

        char[] ch1={'a','b','c','d'};
        char[] ch2=Arrays.copyOfRange(ch1,2,3+1);

        System.out.println(Arrays.toString(ch2));





    }
}
