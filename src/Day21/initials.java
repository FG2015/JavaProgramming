package Day21;

public class initials {
    public static void main(String[] args) {

        String[]classMates={"Farid G","Dovlet S","Ali A","Emin B","Aygun A","Kemale N","Rufane M"};

        for (String names:classMates){
            String initial = ""+names.charAt(0)+"."+names.charAt(names.indexOf(" ")+1);
            System.out.println(initial);

        }



    }
}
