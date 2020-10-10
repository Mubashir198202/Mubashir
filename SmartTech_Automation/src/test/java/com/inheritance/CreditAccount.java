package com.inheritance;

public class CreditAccount extends CheckingAccount  {

	
	protected void creditDetails () {
		
		
    	SavingsAccount.	name      = "Mubashir Ahmed ";
    	SavingsAccount.	initialbalance = 20000;
        SavingsAccount.withdraw  =	1000;
    	SavingsAccount.balance   = initialbalance - withdraw;	
		
		System.out.println("total credit account money: "+balance);
		
	}

}
