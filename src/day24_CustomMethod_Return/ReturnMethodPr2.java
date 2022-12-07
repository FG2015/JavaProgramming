package day24_CustomMethod_Return;

public class ReturnMethodPr2 {
    public static void main(String[] args) {
        String str1=grade( 54);
        //System.out.println(str1);
        if(str1 == "A"){
            System.out.println("Excellent");
        }else {
            System.out.println("Great");// yarimciq etmisem esas odur ki anladim
        }



    }
    public static String grade(int score){
        String result=" "; //if u want to reuse it then must use return method not void
        if(score<0||score>100){
            result="invalid";
        }else {  //valid
            result=(score>=90)? "A":(score>=80)? "B":(score>=70)? "C": (score>=60)?"D": "F";
        }
        return result;
    }

}
