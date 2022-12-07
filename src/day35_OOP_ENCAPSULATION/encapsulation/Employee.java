package day35_OOP_ENCAPSULATION.encapsulation;

public class Employee {
    private String name;
    private char gender;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public Employee(String name, char gender, int age, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("name is empty");
            System.exit(0);
        }
        this.name = name;
    }

    public void setGender(char gender) {
        if (gender!='M'&&gender!='F'){
            System.out.println("not accessable gender");
        }
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(double salary){
        if(salary<=0){
            System.out.println("invalid digits");
            System.exit(0);
        }
        this.salary=salary;
    }



}
