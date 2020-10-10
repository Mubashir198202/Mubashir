package com.inheritance;

public class SavingsAccount {
    
	static String name;
	static double initialbalance;
	static double deposit;
	static double withdraw;
	static double balance;
	
	protected void openAccount() {
    
		
	name           = "Mubashir Ahmed";
	int id         = 2020;	
	int acc        = 101010;
	String address = "1439 metropolitan ave Bronx NY";
	
	String customer = " Customer Name: "+name +"\n Customer ID:  "+id +"\n Customer Account: "+acc +
			          "\n Customer Address: "+address;
			
	System.out.println(" Customer Information: \n"+customer);
	System.out.println("\n \n");
	}
	protected void savingsDetails() {
	name      = "Mubashir Ahmed ";
	initialbalance = 2000;
	deposit   = 3000;		
	withdraw  =	1000;
	balance   = initialbalance + deposit - withdraw;
	
	
	System.out.println(" Account total savings: "+balance);
	}
	
		
}
