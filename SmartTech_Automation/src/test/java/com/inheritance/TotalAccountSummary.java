package com.inheritance;

public class TotalAccountSummary extends  CreditAccount {

	public static void main(String[] args) {
	
		TotalAccountSummary information = new TotalAccountSummary();
        information.openAccount();
        information.savingsDetails();
        information.checkingDetails();
        information.creditDetails();
	}

}
