package day24_CustomMethod_Return;

public class WarmUpTasks {
    public static void main(String[] args) {
        initial("Farid", "Guluzade");
        System.out.println("------------------------------------");
        domain("ferid2805@gmail.com");
        System.out.println("-----------------------------------");
        String []emails={"fg.28@gmail.com", "cydeo.school@yahoo.com", "fgfgf@mail.ru" };
        for (String email : emails) {
            domain(email);
        }
        System.out.println("--------------------");
        nameOfMonth(5);
        System.out.println("------------------------------------");
daysOfMonths(2);
        System.out.println("___________________________");
        String str="Java";
           String result=reverse(str);
        System.out.println(result);
            
        }



    //       ilk olaraq initial adini verib parantez icinde de adi soyadi variable edirik
    public static void initial(String firstName ,String lastName){
       String initial=firstName.charAt(0)+"."+lastName.charAt(0); //bas herfler istendiyine gore, ilk charlar cixarilir
       initial=initial.toUpperCase(); //sonra boyuk herfe kecirilir
        System.out.println(initial); //initiali tam hala getirmek ucun bu son print istifade olunub
        //                          daha sonra ise run olmasi ucun main methoda gonderilir
    }



public static void domain(String email){
        String domain=email.substring(email.indexOf("@")+1 ,email.lastIndexOf("."));
    System.out.println("domain = " + domain);

}

public  static  void nameOfMonth(int number){ //parantez icine int qoyuruq ki sonda run ederken olan paranteze hansisa ayin reqemini qoyaq

        String name=" "; //aylarin adlarini yazmaq ucun
        if(number>1&&number<=12){
name=(number==1)?"Jan":(number==2)?"Feb":(number==3)?"Mar":(number==4)?"Apr":(number==5)?"May":(number==6)?"Jun":
        (number==7)?"Jul":(number==8)?"Aug":(number==9)?"Sep":(number==10)?"Okt":(number==11)?"Nov":"Dec";
        }else {
            name="Invalid";

        }
    System.out.println(name);//ilk burda name deyer qazandirilir ki run edilerken name run edile bilsin
}

public static void  daysOfMonths(int number){


    boolean has28Days = number == 2; // for the month that has 28 days
    boolean has30Days =  number == 4 || number == 6 || number ==9 || number == 11; // for the months that has 30 days
    boolean has31Days = !has28Days && !has30Days; // if the month does not have 28 days and does not have 30 days

    if(has28Days){
        System.out.println("February");

    } else if (has30Days) {
        System.out.println("April,June,September,November");

    }else {
        System.out.println("Jan,Mar,May,Jul,Aug,Okt,Dec");
    }


}

public static String reverse(String str){ // Java

 String reverse=" ";
    for (int i = str.length()-1; i >=0 ; i--) {   //biz burda avajin index nomresini aldiq
        reverse+=str.charAt(i);
    }
    return reverse;

}













}
