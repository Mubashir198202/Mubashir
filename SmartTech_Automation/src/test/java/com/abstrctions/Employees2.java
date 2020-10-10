package com.abstrctions;

public class Employees2 implements CompanyIdea {

	public void getEmployees() {
	System.out.println("Employee Name :Zaviyar Ahmed Ayyash" );
		
	}

	public void getSalary() {
	System.out.println("Employee Salary :200000" );
		
	}

	public void getCar() {
	System.out.println("Employee Car :New BMW Car" );
		
	}

	public void getMedicare() {
    System.out.println("Employee Get : Medicare" );
		
	}
	
	public static void main(String[] args) {
		Employees2 obj = new Employees2();
		obj.getEmployees();
		obj.getSalary();
		obj.getCar();
		obj.getMedicare();
		
}
	
	
	
	
}
