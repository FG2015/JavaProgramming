package day37_Inheritance.phoneTask;

public class Phone {
    public String brand,model,size;
    public double price;
    public String color;
    public static boolean hasBattery=true; // if there is one step we directly assign =true

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    } //only constr will not inheritance
  /*
    static {    //  we use static block to set it
        hasBattery=true;
    }
  */

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=$ " + price +
                ", color='" + color + '\'' +
                '}';
    }

    public void call(long phoneNumber){
      System.out.println(brand+" ,"+model+" is calling "+phoneNumber);
  }
  public void text(){
      System.out.println(brand +" is texting");
  }




}
