package com.usa.smarttech;

public class Constractor {
	String name;
	String gender;
	int phone;
	
	Constractor(String n,String g,int p){
		name= n;
		gender= g;
		phone= p;
	}
	Constractor(){
	System.out.println("I have no valu");	
	}
	public void displayInformation() {
	System.out.println("My name :"+name);
	System.out.println("My gender :"+gender);
	System.out.println("My phone no :"+phone);
	System.out.println("\n");
	}

		
	}

