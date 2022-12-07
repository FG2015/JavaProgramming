package day17_branchingStatement_DO_WhileDoLoops;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String animal= " cat CAt  cat cat Dog dog dog";
        int frequency= 0;

        for (int i = 0; i < animal.length()-2; i++) {
            String each = animal.substring(i, i + 3);
            if (each.equalsIgnoreCase("dog")) {
                frequency++;
            }

        }
        System.out.println(frequency);
    }

}
