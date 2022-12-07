package Day21;

public class ForEachLoopPractices {
    public static void main(String[] args) {
        String[]words={"Java Programming","Cydeo School","Batch2022"};
        for (String s : words) {

            System.out.println(s.charAt(0)+""+s.charAt(s.length()-1)); //by using charArt we got 1st letters of words


        }
    }
}
