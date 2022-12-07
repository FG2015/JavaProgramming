package Day21;

import java.util.Arrays;

public class ForEachLoopIntro {
    public static void main(String[] args) {

        int []numbers={1,4,65,76,889};

        for (int i = 0; i < numbers.length; i++) {
            int eachElement=numbers[i];
            System.out.println(eachElement);  //it is also way for getting the elements but not fastest
        }
        System.out.println("---------------------------------------------------------");

        for (int each:numbers){ //each are elements of array
                                     //eyni elementelri print etdik amma daha tez ve asan
            System.out.println(each);
        }










    }
}
