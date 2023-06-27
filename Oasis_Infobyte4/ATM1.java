import java.util.*;
public class ATM1 {
    public static void displayBalance(int balance) {
        System.out.println("Current Balance:" + balance);
        System.out.println();
    }
    public static int amountWithdrawing(int balance,int withdrawAmount){
        System.out.println("Withdrawn Operation:");
        System.out.println("Withdrawing Amount:" + withdrawAmount);
        if(balance>=withdrawAmount){
            balance=balance-withdrawAmount;
            System.out.println("please collect your money and collect the card");
        }else {
            System.out.println("sorry! Insufficient funds");
            System.out.println();
        }
        return balance;
    }
    public static void amountDepositing(int balance,int depositAmount){
        System.out.println("Deposit Operation:");
        System.out.println("Depositing Amount:" + depositAmount);
        balance=balance-depositAmount;
        System.out.println(" your money has n=been sucessfully deposited");
        displayBalance(balance);
    }
    public static void main(String[] args){
        int balance=10000;
        int withdrawAmount=5000;
        int depositAmount=2000;
        displayBalance(balance);
        balance=amountWithdrawing(balance,withdrawAmount);
        amountDepositing(balance,depositAmount);
    }
}