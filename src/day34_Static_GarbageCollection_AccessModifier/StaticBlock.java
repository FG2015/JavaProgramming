package day34_Static_GarbageCollection_AccessModifier;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("M");
    }


    static {
        System.out.println("Static Block"); //get executed first and only ones

    }




}
