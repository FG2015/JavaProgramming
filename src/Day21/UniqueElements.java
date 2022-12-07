package Day21;

public class UniqueElements {
    public static void main(String[] args) {

        String []word={"asan","asan","cetin","sade","sade"};
        for (String s : word) {

            int count = 0;
            for (String each : word) {
                if (each.equals(s)) {
                    count++;
                }
            }
if(count==1){
    System.out.println(s);
}
        }



    }
}
