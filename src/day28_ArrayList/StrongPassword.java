package day28_ArrayList;

public class StrongPassword {// interview question
    public static void main(String[] args) {


        String password="Cydeo@1993"; //verify if it is a strong password
        //1 confirm if the length of characters are 8
        // 2nd should not contain the spaces

        boolean r1=password.length()>=8&&!password.contains(" ");
        boolean r2=false; // this falses giving temporarly
        boolean r3=false;
        boolean r4=false;
        boolean r5=false;

        for (char each : password.toCharArray()) {
            if(Character.isUpperCase(each)){
                r2=true;
            } else if (Character.isLowerCase(each)) {
                r3=true;
            } else if (Character.isDigit(each)) {
                r5=true;
            }else {
                r4=true;
            }

        }
boolean isStrongPassword= r1&&r2&&r3&&r4&&r5;
        System.out.println(isStrongPassword);






    }
}
