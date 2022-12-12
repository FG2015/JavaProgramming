package day38_Inheritance.carTasks;

public class Car {
    public String brand,model;
    public int year;
    public double price;
    public double miles;
    public String color;

    public Car(String brand, String model, int year, double price, double miles, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.miles = miles;
        this.color = color;
    }
    public void stat(){
        System.out.println(brand+" is starting");
    }
    public void  drive(){
        System.out.println(brand+"is driving");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", miles=" + miles +
                ", color='" + color + '\'' +
                '}';
    }
}
