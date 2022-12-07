package day34_Static_GarbageCollection_AccessModifier;

public class AccessModifiers {
    public static int publicDate=100; //reachable in all java
    static int defaultDate= 200; // reachable in same package
    private static int privateDate=300; // only in same class

    public static void main(String[] args) {
        System.out.println(publicDate);
        System.out.println(defaultDate);
        System.out.println(privateDate);  //all ofthem vizible in same class
    }
}
