package com.stingobjectclass;

public class StringClass1 {
	

public static void main(String[] args) {
	
	
	//immutable String.
			/*String name = "Dog";
	               name ="cat";
	               System.out.println(name);*/
	               
	      /* String obj = new String("Mubashir");        
	              obj.concat("Ahmed") ;
	              System.out.println(obj); */
			
			/* StringBuffer obj = new StringBuffer("Mubashir");        
	         obj.append(" Ahmed") ;
	         System.out.println("I am StringBuffer Class: "+obj);
	         
	         StringBuilder num = new StringBuilder("Mubashir");        
	         num.append(" Ahmed") ;
	         System.out.println("I am StringBuffer Class: "+obj);*/
			
			
			/*  String obj = new String("Mubashir");
	        String num = new StringBuffer(obj).reverse().toString();
	         System.out.println(num);*/
			
			/* String obj = new String("Mubashir");
			char ch = obj.charAt(2);
			System.out.println(ch);*/
			
			/*String s1 ="Bangladesh";
			String s2 ="Bangladesh";
			System.out.println(s1==s2);
			System.out.println(s1.equals(s2));*/
			
			
			String name ="I Love Bangladesh";
			String [] sp = name.split("\\s");
			for(String j : sp) {
			System.out.println(j);
			}
			
			String obj = new String("Mubashir");
			
			System.out.println(obj.toLowerCase());
			System.out.println(obj.toUpperCase());
}			
}
