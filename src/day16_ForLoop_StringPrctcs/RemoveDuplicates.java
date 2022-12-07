package day16_ForLoop_StringPrctcs;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str="aaaacc";
        String result=" ";
        for (int i = 0; i < str.length(); i++) { //i:  represents  all the index numbers from 0 to the end

              String ch = ""+str.charAt(i); // string char-lar toplumudur, chari strime cevirmek ucun ""istfde edilir
if (!result.contains(ch)){ //!eks isaresi ona gore veririk ki eyni herfleri tekrar resulta contain etmesin
    result+=ch;
}

        }

        System.out.println(result);


        System.out.println("----------------------------------");


        String  word= "cecded";
        String result1=" ";
        for (int i = 0; i <=word.length()-1; i++) {
             String ch1=""+word.charAt(i);

             if (!result1.contains(ch1)){
                 result1+=ch1;
             }
            System.out.println(result1 +" ");

        }



    }
}
