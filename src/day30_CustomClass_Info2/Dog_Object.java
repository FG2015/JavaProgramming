package day30_CustomClass_Info2;

import java.util.ArrayList;
import java.util.Arrays;

public class Dog_Object {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Tarzan";
        dog1.age = 1;
        dog1.gender = 'M';
        dog1.breed = "Husky";
        dog1.color = "White-Blue";

        Dog dog2 = new Dog();
        dog2.name = "Paris";
        dog2.breed = "Golden";
        dog2.age = 2;
        dog2.gender = 'F';
        dog2.color = "golden";

        Dog dog3 = new Dog();
        dog3.setInfo("Peleng", "German", 4, 'M', "black", "large");

        Dog dog4 = new Dog();
        dog4.setInfo("Evak", "COBAN", 6, 'M', "White", "ExtraLarge");
        Dog dog5 = new Dog();
        dog5.setInfo("Alaba", "Pitbull", 3, 'F', "Black", "Large");


        Dog[] dogList = {dog1, dog2, dog3, dog4, dog5};
        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogList));
        ArrayList<Dog> maleDogs = new ArrayList<>();
        femaleDogs.removeIf(p -> p.gender == 'M');
        System.out.println(femaleDogs);
    }
}




/*

        System.out.print(dog1);
        System.out.println();
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
        System.out.println(dog5);




 */