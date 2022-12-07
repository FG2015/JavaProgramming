package day34_Static_GarbageCollection_AccessModifier;

public class CydeoStudent {
    public String name;
    public static String schoolName;

    public CydeoStudent(String name) {
        this.name = name;
    }
    static {
        schoolName="Cydeo School";
        System.out.println(schoolName);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                '}';
    }
}

class CydeoStudentObject{
    public static void main(String[] args) {

        CydeoStudent student1=new CydeoStudent("jimmy");
        CydeoStudent student2=new CydeoStudent("Angelina");
        System.out.println(student2);
        System.out.println(student1);



    }

}

