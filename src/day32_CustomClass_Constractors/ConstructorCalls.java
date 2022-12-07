package day32_CustomClass_Constractors;

public class ConstructorCalls {
    public ConstructorCalls(){
        System.out.println("default constructors");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
    }
    public ConstructorCalls(String str){
        this(100);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {


        ConstructorCalls obj3=new ConstructorCalls("Java");
        System.out.println("_____________________________");

    }

}
