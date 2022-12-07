package day36_OOP_InheritanceIntro.Encopsulation.animalTask;

public class Zoo {
    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.setInfo("Tarzan","cobanIti",'M',3,43,"brown");
        dog.drink();
        dog.eat();
        dog.barking();
        System.out.println(dog);


        Cat cat = new Cat();
        cat.setInfo("mestan","bengal",'f',2,12,"gray");
        cat.eat();
        cat.scratch();
        System.out.println(cat);
    }
}