package day31_CustomClass_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

 Offer offer1=new Offer();
 // offer1.location="Virginia";
 offer1.setInfo("Virginia","Cydeo","QA's",28900,true,true,true,true);


 Offer offer2= new Offer();
 offer2.setInfo("California","Amazon","Developer",59000,true,true,true,true);

 Offer offer3=new Offer();
 offer3.setInfo("Azerbaycan","Pishka","sailer",6000,false,false,false,false);


 Offer offer4=new Offer();
 offer4.setInfo("Georgia","F&G","CEO",300000,true,true,true,true);


        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println("_----------------------------------------------_");
        Offer[]myOffers={offer1,offer2,offer3,offer4};
        ArrayList<Offer>fullTimeOffers=new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf(p-> !p.isFullTime);// removes if the offer is not full time
        System.out.println(fullTimeOffers.size());

        System.out.println("--------------------------------------------------------------");
        ArrayList<Offer>localOffers=new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> p.location.equals("Azerbaycan"));
        System.out.println(localOffers);








    }
}
