package day31_CustomClass_Constructors;

public class BankAccount {


    public String accountHolder;
    public int accountNumber;
    public double accountBalance;

    public void setInfo(String accountHolder, int accountNumber, double accountBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountBalance=$" + accountBalance +
                '}';
    }
    public void checkBalance(){
        System.out.println("Your available balance is: "+accountBalance);
    }

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Depositing amount can not be zero or negative");
            return;
        }

        accountBalance+=amount;
    }


    public  void withdraw(double amount){
        if(amount>accountBalance){
            System.out.println("Insufficient Balance");
            return;
        }
        if (amount<=0){
            System.out.println("amount should not be negative");
            return;
        }
        accountBalance-=amount;
    }


}

