package Day21;

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {


        int[]score={1,4,2,3,7,6,5};
        Arrays.sort(score);
        System.out.println(Arrays.toString(score));
        System.out.println( "Min Score:" +score[0]);
        System.out.println("Max Score:"+score[score.length-1]);

String []names={"Jana", "Farid","Adil","Ziya"};
Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
