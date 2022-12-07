package day35_OOP_ENCAPSULATION;

public class CydeoStudentObj {
    public static void main(String[] args) {


        CydeoStudent student1 = new CydeoStudent("Farid", 29, 'M', 26, 22, "SDET");
        CydeoStudent student2 = new CydeoStudent("Khayale", 25, 'F', 26, 22, "SDET");
        CydeoStudent student3 = new CydeoStudent("Enis", 22, 'M', 26, 22, "SDET");
        CydeoStudent student4 = new CydeoStudent("Wasta", 19, 'F', 22, 21, "CyberSecurity");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println((CydeoStudent.programmingLanguage)+" is Programming language");
        System.out.println(CydeoStudent.schoolName+" is school name");


    }
}