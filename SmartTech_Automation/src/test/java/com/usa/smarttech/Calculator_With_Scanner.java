package com.usa.smarttech;

import java.util.Scanner;

public class Calculator_With_Scanner {

	public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);	
		
	int num1,num2,result;
	System.out.print("Enter first number: ");
	num1=input.nextInt();
	
	System.out.print("Enter second number: ");
	num2=input.nextInt();
	
	num1=20;	
	num2=10;	
	result=num1+num2;	
	System.out.println("sum=" +result);	
	result=num1-num2;	
	System.out.println("sub=" +result);
	
	 result=num1*num2;
	 System.out.println("multiflicasion=" +result);
		
	 result=num1/num2;	
     System.out.println("div=" +result);
		
	 result=num1%num2;
	 System.out.println("remaining=" +result);
		 
		 
		 
		 
		 
	}

}
