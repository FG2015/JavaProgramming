package day27_WrapperClass;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str="123";
        Integer.parseInt(str); // parse method
        int num=Integer.parseInt(str); //int
        System.out.println(num+1); //124
        System.out.println(str+1); //1231
        System.out.println("------------------------------");

        String str2="10.5";
        double num2=Double.parseDouble(str2);
        System.out.println(num2+1.5);

        String str3="true";
        boolean b1=Boolean.parseBoolean(str3);
        System.out.println(b1);


        int max=Integer.MAX_VALUE; //  max and min values of any primitive type
        int min=Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);

        System.out.println("-------------------------------");
        String s2="123";
       Integer num22=Integer.valueOf(s2);
       int x=num22;
        System.out.println(num22); //same
        System.out.println(x); // same
        System.out.println("----------------");
        //is digit
        char ch='0';
        boolean r1=Character.isDigit(ch);
        System.out.println(r1);

        char ch2='l';
        boolean r2=Character.isLetter(ch2);
        System.out.println(r2);
        char ch3=':';
        boolean r3=!Character.isLetterOrDigit(ch3);
        System.out.println(r3);
        System.out.println("_---------------------------");
        
        String s="12fge55ntti5::;@#";
        int sum=0;
        for (char each : s.toCharArray()) {
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }

        }



















    }
}
