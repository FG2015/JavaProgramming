package day20_Array;

public class MaxNumOfArray {
    public static void main(String[] args) {

        int[] numbers={10,5, 4, 1,20,0};
        int max= numbers[0]; //biz burda max reqemin 1ci indexin aid oldugunu ferz edirik yeni 10 reqeminin
//amma 10reqeminden sonra hansi reqemler geldiyini bilmek ucun for loop istifade etmemiz lazimdir
        for (int i = 0; i < numbers.length; i++) { // belelikle butun capasitede olan reqemleri aldiq ve onlara i adi verdik

            if(numbers[i]>max){ //eyer numbersler icinde olan i lerden biriboyukdurse ilk gosterdiyimiz numberden onda....
                max=numbers[i]; // en boyuk reqem odur demekdir(numbersler icinde en boyuk reqem)
            }

        }
        System.out.println(max);
        System.out.println("--------------------------------");

        int []sayilar={1,2,3,4,6,7,9};
        int enkicik=sayilar[0];  //en kicik reqem kimi ilk indexi goste
        for (int i = 0; i < sayilar.length; i++) { // hal hazirda butun reqemleri present eden i oldu
            if(sayilar[i]<enkicik){
                enkicik=sayilar[i];
            }



        }

        System.out.println(enkicik);

    }
}
