package com.encapsulation;

public class GeterSeter_demo {
 
	private String name = "Mubashir Ahmed";
	private String jobtitle = "QA engineer";
	private long phonenumber = 1716094394;
	private int salary = 100000;
	
	
	public String getName() {
		return name;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public int getSalary() {
		return salary;
	}
	public static void main(String[] args) {
	GeterSeter_demo obj = new GeterSeter_demo();	
	System.out.println("My Name is a: "+obj.getName());	
	System.out.println("My job Title is a: "+obj.getJobtitle());	
	System.out.println("My phone Number is a: "+obj.getPhonenumber());
	System.out.println("My Salary is a: "+obj.getSalary());
	}
	
}
