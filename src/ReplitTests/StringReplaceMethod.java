package ReplitTests;

public class StringReplaceMethod {
    public static void main(String[] args) {

        String sentence="I am dumb for failing  the quiz";


        sentence=sentence.replaceFirst("dumb", "cool");
        System.out.println(sentence);



    }
}
/*
Change the bad word `dumb` into `cool`
 */