package day20_Array;

public class AvarageNumbers {
    public static void main(String[] args) {

        int[] numbers={10,30,43,56,98};
        double sum=0;


        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];

        }

        double avarage=sum/numbers.length;
        System.out.println(avarage);
    }
}
