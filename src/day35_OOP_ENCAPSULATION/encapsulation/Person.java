package day35_OOP_ENCAPSULATION.encapsulation;

public class Person {
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public int getAge(int i){
        return age;
    }
public void setName(String name){
        this.name=name;
}
public void setAge(int age){
        if(age<=0){
            System.err.println("Invalid number");
            System.exit(0);
        }
        this.age=age;
}


}
