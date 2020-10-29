package com.collectionInterface;

public class ArrayPractice2D {

public static void Array2D() {
	int [][] num =new int [2][3];	//2D Array
			
		   num[0][0]=10;
		   num[0][1]=20;
		   num[0][2]=30;
		   num[1][0]=40;
		   num[1][1]=50;
		   num[1][2]=60;
		  // System.out.println(num[0][0]);
		   for(int row = 0; row < num.length; row++) {
			for(int col = 0; col < num[0].length;col++) {  
			   System.out.println(num[row][col]);
		   }
			System.out.println();
		   }
	}

public static void TwoDimentionalArray() {
	String name[][] = new String[3][4];
	System.out.println(name.length);//Total number of rows=3
	System.out.println(name[0].length);//Total number of col=4
	//1st row
	name[0][0]="Rupon";
	name[0][1]="Ayyash";
	name[0][2]="Sadid";
	name[0][3]="Muhit";
	//2nd row
	name[1][0]="Netrakona";
	name[1][1]="Newyork";
	name[1][2]="Mymensing";
	name[1][3]="Mymensing";
	
  //3rd row
	name[2][0]="Male";
	name[2][1]="Good boy";
	name[2][2]="Cute Boy";
	name[2][3]="Tall Boy";
	
	System.out.println(name[0][1]);
//Print all the values of 2D array using loop
	for(int row = 0;row<name.length;row++) {
	for(int col = 0;col<name[0].length;col++) {
		System.out.println(name[row][col]);
	}
	System.out.println();
	}
	
	}

public static void main(String[] args) {
	//Array2D();
	TwoDimentionalArray();
	
}

}













			




