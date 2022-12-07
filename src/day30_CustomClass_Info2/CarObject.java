package day30_CustomClass_Info2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CarObject {
    public static void main(String[] args) {

        Car car1=new Car();
        car1.setInfo("BMW","X5","BLUE",2020,22534);
        car1.drive();
        System.out.println(car1);
        System.out.println("------------------------------------------------------------------");

        Car car2= new Car();
        car2.setInfo("Toyota","Lexus","Black",2018,33200);
        car2.drive();
        System.out.println(car2);

        System.out.println("---------------------------------------------------------------------------");
        // car[] cars={car1,car2,car3}
        ArrayList<Car>carList=new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2));

        for (Car each : carList) {
            System.out.println(each.brand+":"+each.price);
            
        }
         carList.removeIf(p-> p.brand.equals("BMW")&& p.year>2005&&p.year <2008);
        System.out.println(carList);

        carList.removeIf(p-> p.brand.equals("Toyota")&&p.year>2015&&p.year<2019);
        System.out.println(carList);











    }
}
