package com.usa.javaprectice;

public class JumpingStateMentsBreakContinue {

	public static void main(String[] args) {
	
	for(int i=1;i<=10;i++)
	{
	if(i==6)	
	{
	break;
	}
	System.out.println(i);
	}
	
	for(int a=1;a<=10;a++)
	{
	if(a==6 || a==8)
	{	
	continue;	
	}	
	System.out.println(a);	
	}
	
	
	}

}
