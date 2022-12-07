package day32_CustomClass_Constractors;

public class Test {
    //  certification exam question
    public Test(){
        System.out.println("Farid");
    }
    public Test(int a){
        this();
        System.out.println("FG");
    }
    public Test(double b){
        this(10);
        System.out.println("Guluzade");
        System.out.println("-----------------------------");
    }


    public static void main(String[] args) {
        new Test(12.3);

    }



}
