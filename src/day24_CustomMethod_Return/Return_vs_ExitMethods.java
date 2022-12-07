package day24_CustomMethod_Return;

public class Return_vs_ExitMethods {
    public static void main(String[] args) {
        nameOfMonth(30);

    }

    public static void nameOfMonth(int number) { //parantez icine int qoyuruq ki sonda run ederken olan paranteze hansisa ayin reqemini qoyaq
        if (number < 1 || number > 12) {
            System.out.println("Invalid");
            return; // it exits the method :
            //if here we will give exit method it will excuse whole method
        }


        String name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May" : (number == 6) ? "Jun" :
                (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Okt" : (number == 11) ? "Nov" : "Dec";


        System.out.println(name);
    }
}