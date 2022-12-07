package day26_CustomMethodPractice;


public class FrequencyOfElements {

    public static void main(String[] args) {
        int[]numbers={1,3,4,65,3,5,4};
       int c1= frequencyOfElement(numbers,3);
        System.out.println(c1);
    }

public static int frequencyOfElement(int[]array,int element){ //have to find how many times givin element accured in array
   int count=0;

    for (int each : array) { //each here represents , each element of array
        if (each == element){ //eyer verilen element verilen array icindeki elementlerin birine beraberdirse
          count++; // each time each==element is matching need to increase element by one

        }

    }
    return count;
}
}
