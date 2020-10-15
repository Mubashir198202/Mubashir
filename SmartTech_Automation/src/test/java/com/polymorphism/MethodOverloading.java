package com.polymorphism;

public class MethodOverloading {
	
	public void getName(String name,int age) {
		
	System.out.println("My name is :"+name +"\nMy age :"+age);
	}	
	public void getName(String name,int id,double age) {
	System.out.println("My name is:"+name + "\nMy id :"+id + "\nMy age :"+age);
	}
   public void getName(int id,int phone,int age) {
   System.out.println("My id :"+id + "\nMy phone no :"+phone + "\nMy age :"+age);   
   }
   
   public static void main(String[] args) {
  MethodOverloading obj = new MethodOverloading();
  obj.getName("Mubashir", 36);
  obj.getName("Ayyash", 04142017, 3.5);
  obj.getName(8202,34728500 , 34);
  
} 
   
   
}

