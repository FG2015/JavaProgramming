package day35_OOP_ENCAPSULATION;

public class CydeoStudent {
    public String studentName;
    public int age;
    public char gender;
    public int bachNumber;
    public int groupNumber;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String schoolName;

    public CydeoStudent(String studentName, int age, char gender, int bachNumber, int groupNumber, String fieldOfStudy) {
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.bachNumber = bachNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    public String toString() {
        return "CydeoStudent{" +
                "studentName='" + studentName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", bachNumber=" + bachNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }

    static {
        programmingLanguage="Java";
        schoolName="Cydeo";

    }
}

