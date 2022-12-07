package day17_branchingStatement_DO_WhileDoLoops;

public class RemoveDuplicates {
    public static void main(String[] args) {

String str="AABBCCDD";
String result= "";

        for (int i = 0; i < str.length(); i++) {
            String ch= "" +str.charAt(i); //  "AA" "BB" "CC" "DD"

            if (result.contains(ch)){ //  bu statementde biz ch variablini istifade edirik  i indexi gosterir
                continue;
            }
result+=ch;  //   resultin artmi ise for loopun icinde davam edilmelidir

        }


        System.out.println(result);   //  en son statemenet olmalidir for loop moterizelerinin colunde









    }
}
