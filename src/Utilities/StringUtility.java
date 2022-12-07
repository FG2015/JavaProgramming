package Utilities;



import java.util.Arrays;

public class StringUtility {

    public static void main(String[] args) {
        printEachChar("");
    }

//prints each characther of given string
    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));


        }

    }
//reverse the given string and then returns reversed string
public  static  String reverse(String str){
        String result=" ";
    for (int i = str.length()-1; i >=0 ; i--) {
        result+=str.charAt(i);

    }
    return result;
}



//if the giving string is polindrome returns boolean

public  static boolean isPalindrome(String str){
         reverse(str);
         return reverse(str).equalsIgnoreCase(str);

}


//if the given string is anagram and returns you boolean
public static boolean anagram(String str1, String str2){
        char[]ch1=str1.toCharArray();
        char[]ch2=str2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    return Arrays.equals(ch1,ch2);

}

//remove the duplicated characters from givien string and return string
    public static String removeDuplicates(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) { //each character of string
             char each=str.charAt(i); //  each charachter getting by this solution
            if(!result.contains("" +each)){
                result+=each;// if character doesnt contain we assign it to variable result
            }
        }
return result;


    }




}
