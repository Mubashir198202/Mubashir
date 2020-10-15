package com.polymorphism;

public class Methodoverridding1 extends MethodOverridding {
	
	public void getJob() {
	System.out.println("QA Engineer");	
}
	public void getApartment() {
	System.out.println("Two Family House");
}
public static void main(String[] args) {
	Methodoverridding1 obj = new Methodoverridding1();
	obj.getApartment();
	obj.getCity();
	obj.getBook();
	obj.getJob();
	
 	
}   
}
