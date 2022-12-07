package day23_CustomMethod;

public class CustomMethodPrct {
    public static void main(String[] args) {
        helloWorld5times();
        helloCydeo5times();
        evenNumbers();
    }
    public static void helloWorld5times(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");

        }

    }
    public static void helloCydeo5times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo!");
        }
    }

    public static  void evenNumbers(){  //even number bolunduyu zaman 0 qaliqi olan nomrelerdir
        for (int i = 2; i < 11; i+=2) {
            System.out.println(i);

        }
    }
}

