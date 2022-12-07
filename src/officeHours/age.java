package officeHours;

public class age {
    public static void main(String[] args) {
        int age=9;

        if(age>=0&&age<=2){
            System.out.println("Stay home");
        } else if (age>=3&&age<=6) {
            System.out.println("eligible to go to kindergarde");
        }else if (age>=7&&age<=12){
            System.out.println("Primary school");
        }else{
            System.out.println("enter valid age");
        }


    }
}
 /*0-2 at home
         3-6 kindergarten
         7-12 primary school

  */