package day35_OOP_ENCAPSULATION;

public class Person {
    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }
    static {
        planet="Earth";
        isHuman=true;
        hasNose=true;
        numOfWings=0;
        numOfHead=1;
        numOfArms=2;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                '}';
    }

    public String name;
 public int age;
 public char gender;
 public String language;

 public static String planet;
 public static boolean isHuman, hasNose;
 public  static int numOfWings,numOfArms,numOfHead;


 public static  void printPlanetName(){
     System.out.println("Planet name is "+planet);

 }






}
