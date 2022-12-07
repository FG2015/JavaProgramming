package day18_nestedLoops;

public class DivideTwoNumbers {
    public static void main(String[] args) {

int a=43;
int b= 4;
int count=0;
 while (a>=b){
     a-=b;
     count++;
 }

        System.out.println(count+"with the remainder of "+a);


        System.out.println("_____________________________________");


        int f=19932805;
        int g=19931504;
        int hesab=0;


        while (f>=g){
            f-=g;
            hesab++;
        }


        System.out.println(hesab+"geride qalan"+f);











    }
}
