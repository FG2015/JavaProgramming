package day38_Inheritance.carTasks;

public class Toyota extends Car {


    public Toyota( String model, int year, double price, double miles, String color) {
        super("Toyota", model, year, price, miles, color);
    }
    public void reliable(){
        System.out.println(model+ " is reliable");
    }


}
