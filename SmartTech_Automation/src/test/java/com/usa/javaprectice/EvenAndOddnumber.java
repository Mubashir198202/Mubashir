package com.usa.javaprectice;

public class EvenAndOddnumber {

	public static void main(String[] args) {
		 int [] num= {1,2,3,4,5,6,7,9,10,11};
		 for(int i = 0;i<num.length;i++) {
			 if(num[i]%2==0) {
				 System.out.println("This is Even Number :"+ num[i]);
			 }
			 else {
				 System.out.println("This is odd Number: "+ num[i]);
			 }
		 }
		
		

	}

}
