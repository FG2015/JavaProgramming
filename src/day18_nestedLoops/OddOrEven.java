package day18_nestedLoops;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in); // nomrelerimizi ve he/yox cavabimizi vermek ucun istifade edirik

      while (true) {
          System.out.println("Enter the number"); // daha sonra if statementle nomrelerin odd ve ya even oldugunu tanimalayiriq
          int number = scan.nextInt();

          if (number % 2 == 0) {
              System.out.println(number + "is Even number");

          } else {
              System.out.println(number + "is Odd number");

          }

          System.out.println("Would you like to enter the new number ?");
          String answer = scan.next().toLowerCase(); // burda ise sistemin bizden tekrar sorusmasi ucun dirnaq icindeki cumlenin bize tekrar etmesini isteyirik
//  ve eyer cavablar arasinda he/yox dan basqa bir cvb olarsa sistemin bunu error kimi gosterib bizi xeberdarliq etmesini isteyrik
          while (!(answer.equals("yes")||answer.equals("no"))) {
              System.out.println("invalid answer");
              answer=scan.next();
          }
 if (answer.equals("no")){ // en sonda ise eyer cavab yox olarsa 1ci loop icinde if statement istifade edib ve break use etmemiz lazimdir
     break;
 }
      }

    }
}
