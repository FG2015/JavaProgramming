package day16_ForLoop_StringPrctcs;

public class Palindrome {
    public static void main(String[] args) {


        String word="DAD";
        String result= "";
        for (int i = word.length()-1; i >=0 ; i--) {
            result += word.charAt(i); //  after getting each character we are reversing it into result
        }

            boolean isPalindrome = word.equalsIgnoreCase(result);




        System.out.println(isPalindrome);





    }

}

/*
 String str= "Dade"; //  this is a palindrome and first we need to reverse it
String result= "";

result+=str.equalsIgnoreCase("Dad");

        System.out.println(result);

 */