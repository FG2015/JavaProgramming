package day30_CustomClass_Info2;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {


        Student student1=new Student();
        student1.setInfo("Farid",'M',29,534,'B');
        student1.code();


        Student student2=new Student();
        student2.setInfo("Hiko",'M',30,234,'B');
        student2.reading();



        Student[]studentList={student1,student2};
        System.out.println(Arrays.toString(studentList));
        //  or we can use forloop


        System.out.println("-----------------------------------");

        ArrayList<Student>earlyBirds=new ArrayList<>();
        ArrayList<Student>angryBirds=new ArrayList<>();
        for (Student each : studentList) {
            if(each.Grade=='A'){
                earlyBirds.add(each);
            }else {
                angryBirds.add(each);
            }

        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);













    }
}
