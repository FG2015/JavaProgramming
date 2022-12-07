package day32_CustomClass_Constractors;

public class Carpet {

    public  double width, length,unitPrice;
    public boolean isPersian;


    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calCost(){
        double totalCost=(width*length)*unitPrice; //formula of total price
        if(isPersian){
            totalCost+=200;
        }
        return totalCost;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price = $" + calCost() +
                '}';
    }
}
