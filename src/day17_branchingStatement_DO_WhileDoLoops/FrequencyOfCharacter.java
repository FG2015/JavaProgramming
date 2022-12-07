package day17_branchingStatement_DO_WhileDoLoops;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str= "AAABBBCC";
        char ch= 'A'; //  cumle icinde olan 1xarakterin adi
int frequency= 0; // cumle icinde bizden istenilen xarakterin nece defe tekrar oldugunu oyrenmek ucundur

        for (int i = 0; i < str.length(); i++) { //verilen cumlenin nece dene indexini oldugunu yoxlayib
           char eachchar= str.charAt(i);// xaraktere cevrilmis indexleri gosterir
            if(ch==eachchar){ //xarakter cumle icinde olan  nece karakter varsa eyni olan onunla beraberdirse
                frequency++; //  beraber olan xarakterleri toplayib sonunu gosterir
            }

        }

        System.out.println(frequency);

        System.out.println("---------------------------------");


        String word= "AZERBAYCANAZERBAYCAN";
        char ch1= 'Z';
        int frequency1=0;

        for (int i = 0; i < word.length(); i++) {
            char eachchar1=word.charAt(i);
            if (ch1==eachchar1){
                frequency1++;
            }

        }


        System.out.println(frequency1);






    }
}
