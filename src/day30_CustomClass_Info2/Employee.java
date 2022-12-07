package day30_CustomClass_Info2;

public class Employee {

    public String name;
    public double salary;
    public int age;
    public int ID;
    public boolean isFullTime;
    public String JobTitle;

    public Employee() {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.ID = ID;
        this.isFullTime = isFullTime;
    }

    public void setInfo(String name, int salary, int age, int ID, boolean isFullTime) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.ID = ID;
        this.isFullTime = isFullTime;

    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", ID=" + ID +
                ", isFullTime=" + isFullTime +
                ", JobTitle='" + JobTitle + '\'' +
                '}';
    }
    public void work(){
        System.out.println(name+" is working");
    }


}
