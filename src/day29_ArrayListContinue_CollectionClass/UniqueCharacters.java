package day29_ArrayListContinue_CollectionClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str="aaaabbbcccdddeefg";
        str.split("");
        //now array list below has str's all characters
        ArrayList<String>list=new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println(list);

        ArrayList<String>unique=new ArrayList<>(list);
        unique.removeIf(p -> Collections.frequency(list,p)>1);
        System.out.println(unique);





    }
}
