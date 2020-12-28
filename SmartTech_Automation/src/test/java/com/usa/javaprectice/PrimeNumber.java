package com.usa.javaprectice;

public class PrimeNumber {
	
	public static  void primeNumber() {
		int  num = 9;
		int count = 0;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("This is prime Number : "+ num);
		}else {
			System.out.println("This is not preime Number :"+num);
		}
		
	}
	
	public static void main(String[] args) {
		primeNumber();
		
	}
	

}
