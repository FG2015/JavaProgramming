package Day21;

import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) {

        int []num={1,2,3};
        int []num2={1,2,3};
        boolean n1= Arrays.equals(num,num2);
        System.out.println(n1);

        System.out.println("-----------------------------------");

        int[] number1={1,2,3,4};
        int[] number2={1,2,4,3};

        Arrays.sort(number1);
        Arrays.sort(number2);


boolean n=Arrays.equals(number1,number2);
        System.out.println(n);
        System.out.println("___________________________");
char[]ch={'a','c','b'};
char[]ch1={'b','c','a'};

Arrays.sort(ch);
Arrays.sort(ch1);
boolean anagram=Arrays.equals(ch,ch1);
        System.out.println(anagram);

    }
}
