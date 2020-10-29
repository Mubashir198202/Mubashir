package com.stingobjectclass;

import java.util.StringTokenizer;

public class StringClass {
	
	// What is a String?
		// Why String is a immutable?
		// When we declare the value we cannot change it

		// StringBuffer & StringBuider

		// StringBuffer is a mutable class & synchronized
		// StringBuider is a mutable class & not synchronized

		public static void stringImutable() {
			// Why String is a immutable?
			String name = "Smarttech";
			name = "Inc";
			name = "Alam";
			System.out.println(name);

		}

		public static void string1() {
			String obj = new String("UPS ");
			obj.concat("COMPANY");
			System.out.println("I am a String class : " + obj);
		}

		public static void stringBuffer() {
			StringBuffer obj = new StringBuffer("UPS ");
			obj.append("COMPANY");
			System.out.println("I am a StringBuffer class : " + obj);
		}

		public static void stringBuilder() {
			StringBuilder obj = new StringBuilder("UPS ");
			obj.append("COMPANY");
			System.out.println("I am a StringBuilder class : " + obj);
		}

		// How to reverse string ?
		public static void stringBufferReverse() {
			String obj = new String("SMARTTECH");
			String rev = new StringBuffer(obj).reverse().toString();
			System.out.println("Reverse String Value : " + rev);
		}

		public static void getSpecificCar() {
			String obj = new String("SMARTTECH");
			char ch = obj.charAt(4);
			System.out.println("Index number of char is a : " + ch);
		}

		// How to compare to string
		public static void compareString() {
			String s1 = "Mohammed";
			String s2 = "Mohammed";
			System.out.println(s1 == s2); // -3
			System.out.println(s1.equals(s2));

		}

		// How to split the word
		public static void splitWord() {
			String word = "United State Of America";
			String[] wd = word.split("\\s");
			for (String w : wd) {
				System.out.println(w);
			}
		}

		public static void upperCaseLowerCase() {
			String obj = new String("SMARTTECH");
			System.out.println(obj.toLowerCase());
			System.out.println(obj.toUpperCase());

		}
		
 public static void testEqual() {
	String s1 = new String ("Smarttech");		
	String s3 = new String ("Smarttech");		
	System.out.println(s1==s3);	
	System.out.println(s1.equals(s3));
	
	String s2 = "Smarttech";		
	String s4 ="Smarttech";
	System.out.println(s2==s4);	
	System.out.println(s2.equals(s4));
			
		}
 public static void removeSpecialsign() {
	 
	String st = "Mubas%hir A$hm#ed"; 
	    st = st.replaceAll("[^a-zA-Z0-9]", " ");
	 System.out.println(st);
	 
	 String num = "10,500.99";
		num = num.replaceAll("\\W+", " ");
		System.out.println(num);
		
	// How to remove extra space from your string value 
		
		String name = "Smart   tech   it   sulition     in";
		StringTokenizer obj =new StringTokenizer(name," ");
	    StringBuffer sb = new StringBuffer();
	     while(obj.hasMoreElements()) {
	    sb.append(obj.nextElement()).append(" ");	 
	    }
	  System.out.println(sb);   
	     
 }
		
		

		public static void main(String[] args) {
			// string1();
			// stringBuffer();
			// stringBuilder();
			// stringBufferReverse();
			// getSpecificCar();
			// compareString();
			// splitWord();
			//upperCaseLowerCase();
			//testEqual() ;
			removeSpecialsign();
		}	
	

}
