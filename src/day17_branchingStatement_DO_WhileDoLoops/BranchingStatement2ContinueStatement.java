package day17_branchingStatement_DO_WhileDoLoops;

public class BranchingStatement2ContinueStatement {
    public static void main(String[] args) {

        for (char i = 'A'; i < 'Z' ; i++) {

            if (i=='C'){
                continue; // using for skipping
            }
            System.out.println(i);
        }
        System.out.println("--------------------------------");

        for (int i=1; i<11; i++){

            if(i%2!=0){ //ODD numbers printing // we can use continue statement
                System.out.println(i);
            }

        }
        System.out.println("====================================");
        for (int i = 1; i < 11; i++) {
            if(i%2==0){
                System.out.println(i); // or we can use "Continue" insted of statement // evwn numbers
            }

        }




    }
}
