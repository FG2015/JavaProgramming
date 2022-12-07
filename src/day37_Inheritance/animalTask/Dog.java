package day37_Inheritance.animalTask;

public class Dog extends animal {
    public Dog(String name, String breed, char gender, String size, int age) {
        super(name, breed, gender, size, age);
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", age=" + age +
                '}';
    }

    public void  barking(){
        System.out.println(name+" is barking");
    }

    public static void main(String[] args) {
        Dog dog1=new Dog("Lika","Husky",'M',"Large",4);


        dog1.barking();
        dog1.eating();
        System.out.println(dog1);

    }
//constructor name should be same with class name
    //for example here only const name shoudl be Dog
}
