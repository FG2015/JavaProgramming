package day30_CustomClass_Info2;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int ID;
    public char Grade;


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", Grade=" + Grade +
                '}';
    }

    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        Grade = grade;
    }


public void reading(){
    System.out.println(name+" is reading");
}

public void code(){
    System.out.println(name+" is coding");
}










}
