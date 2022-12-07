package day30_CustomClass_Info2;

public class Car {
    public String brand;
    public String model;
    public int year;
    public String color;
    public double price;


    public void setInfo(String carBrand,String carModel, String carColor, int carYear, double carPrice){
        brand=carBrand;
        model=carModel;
        year=carYear;
        color=carColor;
        price=carPrice;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=$" + price +
                '}';
    }

    public void drive(){
        System.out.println("driving "+brand+" "+model);


}

}



/*
Atributes
brand
model
year
color
price
&&&&&&&&&&&
Action
stop()
drive()
start()

 */