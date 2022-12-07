package day16_ForLoop_StringPrctcs;

public class Unique {
    public static void main(String[] args) {

        String str = "ffaariid";

        String result = " ";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i); // ch variable is represents each character
            if (str.indexOf(ch) == str.lastIndexOf(ch)) { //if the first and last index numbers of characters are same then the character is unique


                result += ch;             //when we use if we should repeat it for 6times inorder to avoid it we will  use loop


            }

        }
        System.out.println(result);
    }
}