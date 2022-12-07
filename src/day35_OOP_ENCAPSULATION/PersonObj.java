package day35_OOP_ENCAPSULATION;

public class PersonObj {
    public static void main(String[] args) {

        Person person1=new Person("Eldar",34,'M',"Azerbaijani");
        System.out.println(person1);
        System.out.println("Is human = " +(Person.isHuman=true));
        System.out.println( Person.numOfArms=2);
        System.out.println( Person.numOfHead=1);
        System.out.println(Person.hasNose=true);

        Person.printPlanetName();



    }
}
