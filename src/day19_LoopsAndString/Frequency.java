package day19_LoopsAndString;

public class Frequency {
    public static void main(String[] args) {
//  eyer 1xarakterin nece defe tekrar edildiyin yoxlamaq isteyirikse o zaman
         String str= "aabcccd";
         String result= " ";

            for (int j = 0; j< str.length(); j++) {  //  we make another loop to get other of character of str

            char ch=str.charAt(j); // stringimizi gosterdikden sonra 1ci indeximizi char artaa keciririk
            int count=0;
                            // novbeti olaraq, bunun nece defe tekaralandirdigini gosterecek int verablesini yaziriq
            for (int i = 0; i < str.length(); i++) { //  umumi cumlede olan indexi gosteririk

                char each = str.charAt(i); // butun str-i xaraketire ceviririk
                if (each == ch) {  //  ve eyer statemenetini fori daxilinde istifade ederek neece defe a nin tekrarlandigina baxiriq
                    count++;
                }
            }
                if (result.contains("" + ch)) {
                    continue;
                }
            result+=ch;
            result+=count;


        }
        System.out.println(result);
    }
}
 //  very complicated task, need to make more practice again