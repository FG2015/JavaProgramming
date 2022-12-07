package day33_Statics;

import java.util.Arrays;

public class StudentObject {
    public static void main(String[] args) {

        Student student1=new Student("Alex");

        Student student2=new Student("Fed",'M',29,11500139,'C');
       Student[]students={student1,student2};

        System.out.println(Arrays.toString(students));
    }
}
