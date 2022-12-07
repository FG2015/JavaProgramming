package Day21;

public class AvarageNumber {
    public static void main(String[] args) {
        int[] numbers={2,3,4,6,8,56,78};
        double sum=0; //in order to get sum we need to collect all elements and add to the sun
        for (int each : numbers) {
            sum+=each;
        }
        double avarage=sum/numbers.length;
        System.out.println(avarage);
    }
}
