package day20_Array;

public class AppeardTwice {
    public static void main(String[] args) {
        char[]chars={'A','B','C','A','C'};
        for (int j = 0; j < chars.length; j++) {

            char ch=chars[j]; //  this represents first character 'A'
            int frequency=0; // lets check how many times char'A' occured in the chars

            for (int i = 0; i < chars.length; i++) { // now i represents the chars' elements
                if(ch==chars[i]){  // if elements matching ch
                    frequency++;
                    //in order to get all chars we need to use another loop


                    }



                }
            if(frequency==2){
                System.out.println(ch);
            }


        }









    }
}
