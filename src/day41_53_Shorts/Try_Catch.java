package day41_53_Shorts;

public class Try_Catch {
    public static void main(String[] args) {


try {
    System.out.println(9 / 0);

}catch (ArithmeticException e){
    e.printStackTrace();
   //  unchecked exception try catch etmekle novbeti printimizi ede bilirik.  cunki try catch 1ci printi handle edir
}
        System.out.println("Hello World");

    }
}
