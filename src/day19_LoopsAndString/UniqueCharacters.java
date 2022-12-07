package day19_LoopsAndString;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str= "aabcccdeef";
        String result=""; // cavab bdf olmalidir en sonda

                                         // ilk novbede ilk indexin ilk characterini tapaqin

        for (int j = 0; j < str.length(); j++) {
            char ch= str.charAt(j);  //a ilk xarakterdir ve onun nece defe str icinde tekrarlanib tekrarlanmadigna baxaciq
            int count=0; // int ise 1 1 str icindeki xarakterleri yoxlamaqla a -nin nece defe tekrarlandigini oyrenir

            for (int i = 0; i <str.length() ; i++) { // i: str icindeki indexleri teqdim edir
                char each=str.charAt(i);//  each character of str .  str icinde olan butun chlari represent edir
                if(ch==each){
                    count++;
                }
            }

            if (count!=1) {     //   ve ya if(count==1) result+=ch
                continue;
            }
            result+=ch;
        }
        System.out.println(result);
        }





    }

