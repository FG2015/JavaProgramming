package day18_nestedLoops;

import java.util.Scanner;

public class Age_Pr2 {
    public static void main(String[] args) {


        while (true){
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter your age"); // ilk olaraq, while ile baslamamizin sebebi, adin sonsuz daxil olunmasidir
                                            //butun scanner ,ve int value while loopun icinde verilir.
            int age=scan.nextInt();      //  "Yasini daxil et "

            while (!(age>=18&& age<=120)){ //  loop icinde indi loopumuz var ve bizden indi gosterilen yas araligindan basqa yas olarsa sistem error versin codunu yazmagimizi isteyir
                System.out.println("Invalid Entry:");
                age=scan.nextInt();
            }
            System.out.println("Would you like to continue?");//  novbeti merhelede tekraren, sistemin bizden davam etmeyimizi istediyini sorusmasi ucun boyuk loop icinde yaratdigimiz println
            String answer=scan.next().toLowerCase(); //eyer invalid reqem olarsa, sistem tekrar yas girmeyimizi sorusur

            while (!(answer.equals("yes")||answer.equals("no"))){
                System.out.println("Invalid answer, please re enter"); //  ola bilerki yazini yazarken he ve ya yox evezine bashqa soz yazdiq
                answer=scan.next(); // bu cavabin da dogru olmadigini ve tekrar girmemizi istemesi ucun tekrrar while loop istifade edirik
            }

          if (answer.equals("no")){ //  boyuk loop icinde yaratdigimiz if bize yox cavabini print etmemiz ucundur
                break;  // ve yox cavabi aliriqsa demek ki prosederu tamamalamaq isteyirik ve, break ile loopun tekrar etmesini dayandirir ve sonladirirq
                  }







        }



    }
}
