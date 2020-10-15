package com.usa.smarttech;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo2 {

	public static void main(String[] args) {
	String arr[] = {"Netrokona","Mymensing","Bangladesh"};
	
	for(String valu:arr)
	{
	System.out.println(valu);	
	}
	//How to convert Array to ArrayList.
	ArrayList al=new ArrayList(Arrays.asList(arr));
	System.out.println(al);
	

	}

}
