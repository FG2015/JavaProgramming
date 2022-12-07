package day37_Inheritance.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {

        Iphone iphone=new Iphone("12 Pro Max","124Inc",800.0,"gray");
        iphone.facetime();
        iphone.call(000000000000);

        System.out.println(iphone);
        System.out.println("has a battery= "+Phone.hasBattery);








    }
}
