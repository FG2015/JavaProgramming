package day29_ArrayListContinue_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {

        ArrayList<Integer>scores=new ArrayList<>();
        scores.addAll(Arrays.asList(54,32,23,55,67,88,87,98,75,63,51,44));
        ArrayList<Integer>gradeA=new ArrayList<>(scores);
        gradeA.removeIf(p-> !(p>=90&& p<=100)  );
        System.out.println(gradeA); //sadece 98 cap olunur elecede diger asagidakilar eyni qaydada loop olmadan cap olunur

        ArrayList<Integer>gradeB=new ArrayList<>(scores);
        gradeB.removeIf(p-> !(p>=80&&p<=90));
        System.out.println(gradeB);

        ArrayList<Integer>gradeC=new ArrayList<>(scores);
        gradeC.removeIf(p-> !(p>=70&&p<=80));
        System.out.println(gradeC);
        ArrayList<Integer>gradeD=new ArrayList<>(scores);
        gradeD.removeIf(p-> !(p>=60&&p<=70));
        System.out.println(gradeD);
        ArrayList<Integer>gradeF=new ArrayList<>(scores);
        gradeF.removeAll(gradeC);
        gradeF.removeAll(gradeD);
        gradeF.removeAll(gradeB);
        gradeF.removeAll(gradeA);
        System.out.println(gradeF);





    }
}
