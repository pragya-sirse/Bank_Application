package org.example;

import com.sun.deploy.util.SyncAccess;

import java.util.Scanner;

public class Process {
    Scanner sc=new Scanner(System.in);
    static BankInfo bank1=new BankInfo();
    static {
        bank1.setAccno("854621348597");
        bank1.setName("RBI bank");
        bank1.setAcc_type("Savings");
        bank1.setBalance(100000000);
    }
    public void openAccount(){
        System.out.println("Enter Account no:");
        bank1.setAccno(sc.next());
        System.out.println("Enter Account type:");
        bank1.setAcc_type(sc.next());
        System.out.println("Enter balance:");
        bank1.setBalance(sc.nextLong());
        System.out.println("--------YOUR ACCOUNT DETAILS IS----------");
        System.out.println("Name of account holder :: "+bank1.getName());
        System.out.println("Account no             ::"+bank1.getAccno());
        System.out.println("Account type           ::"+bank1.getAcc_type());
        System.out.println("Balance                ::"+bank1.getBalance());
    }
    public void demoaccount(){
        int demobalance=5000;
        System.out.println("Name of account holder::"+"Demo user");
        System.out.println("Account no            ::"+"8529637412");
        System.out.println("Account type          ::"+"demo");
        System.out.println("Balance               ::"+demobalance);
    }
    public void deposite(){
        System.out.println("Enter the Amount you want to deposite::");
        int deposite=sc.nextInt();
        int amount=(int)(bank1.getBalance()+deposite);
        bank1.setBalance(amount);
        System.out.println(" "+deposite+"is deposited into your Account");
        System.out.println("Current Available Balance is Rs="+bank1.getBalance());
    }
    public void withdraw(){
        System.out.println("Enter the Amount you want to withdraw:");
        Scanner sc=new Scanner(System.in);
        int withdraw =sc.nextInt();
        if(withdraw<bank1.getBalance()){
            bank1.setBalance(bank1.getBalance()-withdraw);
            System.out.println(" "+withdraw+"is withdraw from your Account");
            System.out.println("Current Available Balance is Rs::"+bank1.getBalance());

        }
        else{
            System.out.println("Low Balance");
            System.out.println("Current Available Balance is Rs ::"+bank1.getBalance());
        }
    }
    public void checkbalance(){
        System.out.println("Your name is    ::"+bank1.getName());
        System.out.println("Account no      ::"+bank1.getAccno());
        System.out.println("Account type    ::"+bank1.getAcc_type());
        System.out.println("Balance         ::"+bank1.getAcc_type());
        System.out.println("THANKS FOR BALANCE CHECKING");
    }


}
