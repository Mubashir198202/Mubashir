package com.usa.smarttech;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		
    Scanner input=new Scanner(System.in);
	double side,area;	
	System.out.print("Enter length of side:  ");	
	side=input.nextDouble();	
		
	area=side*side;	
	System.out.print("Area of square:  "+area);	
		
		
	}

}
