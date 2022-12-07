package day33_Statics;

public class Iphone {
    public static String brand= "Apple";
    public String model;
    public double price;
    public static String OS="iOS";
    public String color;
    public String size;
    public static String country="Made in China";
    public static boolean isTouchScreen= true;

    public Iphone(String model, double price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

