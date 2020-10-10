package com.usa.smarttech;

import java.util.Scanner;

public class AreaOfTriangle_Rectangle_Square {
      

	public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);	
		//Area of triangle
	double base,height,area; //Triangle Area=0.5*base*hight	
		
	System.out.print("Enter base : ");	
		base=input.nextDouble();
		
	System.out.print("Enter height : ");	
		height=input.nextDouble();
		
		area=0.5 * base * height;
		System.out.println("area of triangle : "+area);
		
	
		
		
		
		

	}

}
