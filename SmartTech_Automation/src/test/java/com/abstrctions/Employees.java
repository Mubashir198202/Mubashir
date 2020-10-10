package com.abstrctions;

public class Employees implements CompanyIdea{

	public void getEmployees() {
	System.out.println("Employee Name : Mubashir Ahmed");	
		
	}

	public void getSalary() {
	System.out.println("Employee salary : 100000");
		
	}

	public void getCar() {
	System.out.println("Employee Get : new BMW Car");
		
	}

	public void getMedicare() {
	System.out.println("Employee Get : Medicare");
	
	
		
	}
	public static void main(String[] args) {
	Employees obj = new Employees();
	obj.getEmployees();
	obj.getSalary();
	obj.getCar();
	obj.getMedicare();
	}

}
