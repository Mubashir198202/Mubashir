package com.groupstudy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class StringPractice {

	
public static void getDate() {
	
	Date da = new Date ();
	Calendar cal = Calendar.getInstance();
	cal.setTime(da);
	System.out.println(da);
	
	String day;
	cal.add(Calendar.DAY_OF_YEAR, -15);
	Date obj = cal.getTime();
	SimpleDateFormat met = new SimpleDateFormat("MM/dd/YYYY");
	day = met.format(obj);
	System.out.println(day);
}
public static void evenNumber()	{
	
	int [] ev = {22, 23, 24, 25,26,27,28,29,30};
	
	for(int i = 0;i<ev.length;i++) {
	if(ev[i]%2==0)
	System.out.println(ev[i]+" This is even number");
	else {
	System.out.println(ev[i]+" This is odd number");	
	}
		
	}
}
 public static void removeExtraSpace() {
	 
	String st =new String( "I   Love   Bangladesh") ;
	StringTokenizer obj = new StringTokenizer(st," ");
	StringBuffer sb = new StringBuffer();
	while(obj.hasMoreElements()) {
	sb.append(obj.nextElement()).append(" ");
	System.out.println(sb.toString().trim());	
		
	}
	
}
public static void palindromeNumber() {
	int num = 232;
	int org = num;
	int rev =0;
	while(num !=0) {
	rev=rev*10 + num%10;
	num=num / 10;
	}
	if(org==rev) {
	System.out.println(org+" Palindrome Number");	
	}
	else {
		System.out.println(org+" Not palindrome number");
	}
}
	
 
	

	
		
		

	
	
	public static void main(String[] args) {
		
		//getDate();
		 //evenNumber();
		 //removeExtraSpace() ;
		palindromeNumber();
	}

}
