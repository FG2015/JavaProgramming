package day23_CustomMethod;

public class CustomMethodsWithParametrs {

    public static void main(String[] args) {
        evenOrOdd(122);
        System.out.println("__________________________");
        displayAgeofPerson(1993);
    }
    public static void evenOrOdd(int number){
        if(number%2==0){
            System.out.println(number+" is even number");
        }else {
            System.out.println(number+" is odd number");
        }
    }

    public static void displayAgeofPerson(int birtYear){
        int age =2022-birtYear;
        System.out.println(age);

    }


}
