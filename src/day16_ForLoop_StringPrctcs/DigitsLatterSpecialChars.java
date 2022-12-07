package day16_ForLoop_StringPrctcs;
public class DigitsLatterSpecialChars {
    public static void main(String[] args) {


     String str= "Cydeo12345!@#$%WoodenSpoon";

     String letters=" ";
     String digits=" ";
     String specialChars= " ";

        for (int i = 0; i < str.length(); i++) {

            char ch=str.charAt(i);
            if(ch >= '0' && ch<= '9' ){
                digits+=ch;
            } else if (ch>='A'&& ch<='Z') {
                letters += ch;
            } else if (ch>='a'&& ch<='z') {
                letters+=ch;
             }else {
                specialChars+=ch;
            }

        }

        System.out.println(letters+","+digits+","+specialChars);

    }
}
