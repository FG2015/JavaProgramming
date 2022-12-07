package day25_CustomMethod_MethodOverloading;

public class SumOfNumbers {
    public static void main(String[] args) {
int result=sumOfTwoNumbers(5,7);
        System.out.println(result);
        int result2=sumOf3Numbers(15,28,1993);
        System.out.println(result2);
    }
    public static int sumOfTwoNumbers(int num1, int num2){
        return num1+num2;
    }
    public static int sumOf3Numbers(int num1,int num2, int num3){
        return num1+num2+num3;
    }
}
