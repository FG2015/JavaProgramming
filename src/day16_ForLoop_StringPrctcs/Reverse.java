package day16_ForLoop_StringPrctcs;

public class Reverse {
    public static void main(String[] args) {
        String str="Wooden Spoon";
   String result="";

        for (int i = str.length()-1; i >= 0; i--) {

            result+=str.charAt(i);





        }









/*
     result+=str.charAt(str.length()-1);
      result+=str.charAt(10); //by using this method we have to repeat it 11times, cuz there are 11chr, insted of it
      we use loop to repeat insted of us
 */



        System.out.println(result);
        System.out.println("_________________________________________");


        






    }
}
