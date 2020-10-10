package com.usa.smarttech;

public class MyFirstJavaClass {
 
	
 public static void main(String[] args) {
	
	int a=200;
	int b=20;
	
	String x="Hello";
	String y="Mubashir";
	
	double c=9.01;
	double d=10.99;
	
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
	
	System.out.println(a+b+x+y);
	System.out.println(a-b+x+y);
	System.out.println(a*b+x+y);
	System.out.println(a/b+x+y);
	System.out.println(x+y+a+b);
	System.out.println(x+y+(a+b));
	System.out.println(a+b+x+y+a+x+b+y);
	
	System.out.println(c+d);
	System.out.println(a+c+(a+c));
	
	System.out.println("I am Mubashir.");
	System.out.println("I Love JAVA.");
	
	//assignments operators in java
	
	int e=20;
	int f=40;
	
	e=f;
	System.out.println("e output:"+e);
	
	e+=f;
	System.out.println("e output:"+e);
	
	e-=f;
	System.out.println("e output:"+e);
	
	e*=f;
	System.out.println("e output:"+e);
	
	e/=f;
	System.out.println("e output:"+e);
	
	e%=f;
	System.out.println("e output:"+e);
	
	//auto increment and auto decrement operatoes ++ and--
	
	int num1=100;
	int num2=200;
	num1++;
	num2--;
	
	System.out.println("output of num1:"+num1);
	System.out.println("output of num2:"+num2);
	
	//logical operator in java are:&&,||,!
	
	boolean b1=true;
	boolean b2=false;
	
	System.out.println("&& output:"+(b1&&b2));
	System.out.println("|| output:"+(b1||b2));
	System.out.println("!(b1&&b2)"+!(b1&&b2));
	
	
	
	
	
	
	
	
	
	
	}
	
}
