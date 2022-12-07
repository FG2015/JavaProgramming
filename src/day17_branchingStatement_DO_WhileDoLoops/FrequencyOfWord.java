package day17_branchingStatement_DO_WhileDoLoops;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str = "JavaJavaJavaJava";
        int frequency = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            String eachsub = str.substring(i , i + 4);
            if (eachsub.equals("Java")) {
                frequency++;

            }
        }
        System.out.println(frequency);
        System.out.println("--------------------------");


        String ad= "FaridGuluzadeFaridGuluzadeFaridGuluzade";
        int frequency1=0;

        for (int i = 0; i < ad.length()-12; i++) {//i; presents index from 0 to last
            String herAd=ad.substring(i,i+13); // cumle daxilinde eyni sozleri teklesdirir
            if (herAd.equals("FaridGuluzade")){ //if ise teklesen sozlerin stringdeki soze berbaer oldugunu yoxlayir
                frequency1++; //   son proses ise ""feridGuluzadenin nece defe tekrarlandigini gosterir
            }

        }


        System.out.println(frequency1);

//cumle icinde 1sozun nece defe tekrar oldugunu oyrenmemiz ucun istifade edirik frequenc
// 1ci. sozun nece defe toplanmasini oyrenmemiz ucun int istiade olunur, ve sonra substringin tekrarlanmasi ucun loop
// daha sonra ise loop icinde if statementini kullaniriq

    }


}