package com.abstrctions;

public class IdeaTest implements CompanyIdea,CompanyIdea1{


	public void getEmployees() {
	System.out.println("Employee Name : Mubashir Ahmed");
	System.out.println("Employee Name :Zaviyar Ahmed Ayyash" );
	}

	public void getSalary() {
		System.out.println("Employee salary : 100000");	
	System.out.println("Employee Salary :200000" );
		
	}

	public void getCar() {
	System.out.println("Employee Get : new BMW Car");
	System.out.println("Employee Get : new BMW Car");	
	}

	public void getMedicare() {
	System.out.println("Employee Get : Medicare");
		
	}

	public void carBrand() {
	System.out.println("Brand Name: BMW");
		
	}

	public void carModel() {
    System.out.println("Model Name: 2020 BMW X5");
		
	}

	public void carColour() {
    System.out.println("Car Colour: Perl White");
		
	}

	public void carInside() {
	System.out.println("Inside Design : Red with lether");
		
	}
   public static void main(String[] args) {
	   IdeaTest obj = new IdeaTest();
	   obj.getEmployees();
	   obj.getSalary();
	   obj.getCar();
	   obj.getMedicare();
	   obj.carBrand();
	   obj.carModel();
	   obj.carColour();
	   obj.carInside();
	   
}  
}
