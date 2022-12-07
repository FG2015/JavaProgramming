package Day21;

import java.util.Arrays;

public class MergeTwoArrays { // interview question
    public static void main(String[] args) {

        String[]gropu1={"Hikmet","Farid","Rza","Fariz"};
        String[]group2={"Misha","Azer","Eshgin","Kamandar"};

        String[]students=new String[gropu1.length+group2.length];//to make sure that 3rd array has capacity to collect all of them
     //   next step is to get all element out by one by

        int i=0; // we give it out of the loop cuz above variable name students &student's index starts from 0
        for (String each : gropu1) {
            students[i++]=each;

        }

        for (String each : group2) {
            students[i++]=each;
        }

        System.out.println(Arrays.toString(students));

        System.out.println("--------------------------------------");
//one of interview questions
        char[]ch1={'A','B','C'};
        char[]ch2={'D','E','N'};
        char[]ch3=new char[ch1.length+ ch2.length];
int u=0;
        for (char each : ch1) {
            ch3[u++]=each;
        }

        for (char each : ch2) {
            ch3[u++]=each;

        }

        System.out.println(Arrays.toString(ch3));










    }
}
