package day17_branchingStatement_DO_WhileDoLoops;

public class FrequancyOfWord_LoopWhile {
    public static void main(String[] args) {


        String str = "JavaJavaPhytoPhyto";
        int frequency = 0;

        for (int i = 0; i < str.length() - 4; i++) {
            String each = str.substring(i, i + 4);
           if(each.equalsIgnoreCase("java")){
             frequency++;
           }
        }
        System.out.println(frequency);


        System.out.println("--------------------");

        String animal= "CAT CAT cat cat cat cat cat cat cat cat dog dog dog".toLowerCase();

        int countCat=0;
int countDog=0;
        while (animal.contains("cat")){
            animal=animal.replaceFirst("cat", "");
            countCat++;
        }

        System.out.println(countCat);



while (animal.contains("dog")){
    animal=animal.replaceFirst("dog", "");
    countDog++;
}
        System.out.println(countDog);





    }
}
