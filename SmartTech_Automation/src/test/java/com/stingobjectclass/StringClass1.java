package com.stingobjectclass;

public class StringClass1 {
	

public static void stringPrectice() {
	
	
	//immutable String.
			String name = "Dog";
	               name ="cat";
	               System.out.println(name);
	               
	       String obj = new String("Mubashir");        
	              obj.concat("Ahmed") ;
	              System.out.println(obj); 
			
			 StringBuffer obj1 = new StringBuffer("Mubashir");        
	         obj1.append(" Ahmed") ;
	         System.out.println("I am StringBuffer Class: "+obj1);
	         
	         StringBuilder num = new StringBuilder("Mubashir");        
	         num.append(" Ahmed") ;
	         System.out.println("I am StringBuffer Class: "+num);
}
public static void stringPrectice1() {
			
			  String obj = new String("Mubashir");
	        String num = new StringBuffer(obj).reverse().toString();
	         System.out.println(num);
			
			 String obj1 = new String("Mubashir");
			char ch = obj1.charAt(2);
			System.out.println(ch);
			
			String s1 ="Bangladesh";
			String s2 ="Bangladesh";
			System.out.println(s1==s2);
			System.out.println(s1.equals(s2));
			
			
			String name ="I Love Bangladesh";
			String [] sp = name.split("\\s");
			for(String j : sp) {
			System.out.println(j);
			}
			
			String obj2 = new String("Mubashir");
			
			System.out.println(obj2.toLowerCase());
			System.out.println(obj2.toUpperCase());
}	
          public static void stringPrectice2() {
	String country= new String ("United state of America");
	int count =0;
	for(int i=0;i<country.length();i++) {
		if(country.charAt(i)=='e') {
			System.out.println("");
			System.out.println(country.charAt(i)+"::"+count);
			System.out.println("index of e :"+i);
			count++;
		}
	}
}

			public static void main(String[] args) {
				//stringPrectice();	
				//stringPrectice1();
				stringPrectice2();
}			
}
