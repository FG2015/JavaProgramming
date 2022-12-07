package day18_nestedLoops;

public class Ulduzlar {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.print("* ");
            }
        }

        System.out.println("---------------------------");

        for (int i = 0; i < 1; i++) {


            for (int j= 0; j <=i; j++) {
                System.out.println("*");

            }
            System.out.println(i);
        }



    }
}
