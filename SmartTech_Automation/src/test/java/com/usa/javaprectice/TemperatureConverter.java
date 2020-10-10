package com.usa.javaprectice;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		
	Scanner input=new Scanner(System.in);	
	double celcius,fahrenheit;
	
	System.out.print("Enter celcius:  ");
	celcius=input.nextDouble();
		fahrenheit=1.8 * celcius + 32;
		System.out.print("Fahrenheit=  "+fahrenheit);
		
		
		
		
		

	}

}
