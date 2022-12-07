package day37_Inheritance.phoneTask;

public class Iphone extends Phone {

    public Iphone( String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public void facetime(){
        System.out.println(brand +" is having a face time ");
    }



}
