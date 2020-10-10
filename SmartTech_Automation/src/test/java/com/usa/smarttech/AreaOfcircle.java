package com.usa.smarttech;

import java.util.Scanner;

public class AreaOfcircle {

	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);
	double radius,area;
	System.out.print("Enter radius:  ");
	radius=input.nextDouble();
	area=3.1416 * radius *radius;
    System.out.print("Area of circle: "+area);
	
	
	
	}

}
