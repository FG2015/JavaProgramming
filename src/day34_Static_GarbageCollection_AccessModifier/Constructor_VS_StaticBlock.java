package day34_Static_GarbageCollection_AccessModifier;

public class Constructor_VS_StaticBlock {

    static {
        System.out.println("Stat");

    }


    public  Constructor_VS_StaticBlock(){
        System.out.println("Con"); // it only depends on object and above we did not show any obj
                                  //we need to show an obj


    }

    public static void main(String[] args) {
        System.out.println("jbfelkmr");
        new Constructor_VS_StaticBlock(); //these are objects
        new Constructor_VS_StaticBlock();
        new Constructor_VS_StaticBlock();

    }

}
