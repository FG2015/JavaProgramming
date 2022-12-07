package Day21;

public class MaxNNumber {
    public static void main(String[] args) {

        int[]numbers={1,23,45,34,54}; //  1st gave the elements
        int max=numbers[0]; //assamption that 0(1st)element is grater


        for (int each : numbers) {               //arrey ->left size
            if(each>max){   //if each elements one by one after checking is greater than 1st element
                max=each;   //then the greater one is assigned to the max
            }
        }

        System.out.println(max);

    }
}
