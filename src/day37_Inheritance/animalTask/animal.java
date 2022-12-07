package day37_Inheritance.animalTask;

public class animal {
    public animal(String name, String breed, char gender, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.size = size;
        this.age = age;
    }

    public String name;
    public String breed;
    public char gender;
    public String size;
    public int age;

    public String toString() {
        return "animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", age=" + age +
                '}';
    }
    public void eating(){
        System.out.println(name+ " is eating");
    }
    public void drinking(){
        System.out.println(name+ " is drinking");
    }
}
