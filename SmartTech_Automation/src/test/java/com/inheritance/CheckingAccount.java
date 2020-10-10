package com.inheritance;

public class CheckingAccount extends  SavingsAccount {

    protected void checkingDetails () {
    	
    	SavingsAccount.	name      = "Mubashir Ahmed ";
    	SavingsAccount.	initialbalance = 1500;
    	SavingsAccount.deposit   = 2000;		
    	SavingsAccount.withdraw  =	500;
    	SavingsAccount.balance   = initialbalance + deposit - withdraw;
    	
    	System.out.println("customer total checking account balance: "+balance);
    	

    }
}
