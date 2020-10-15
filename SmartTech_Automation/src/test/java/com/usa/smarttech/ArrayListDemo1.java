package com.usa.smarttech;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo1 {

	public static void main(String[] args) {
	ArrayList al =new ArrayList();
	
	al.add("B1");
	al.add("B2");
	al.add("B6");
	al.add("B4");
	al.add("B5");
	al.add("B3");
	al.add("B7");
 ArrayList bl=new ArrayList();
	bl.addAll(al);
	System.out.println(bl);
	
	bl.removeAll(al);
	System.out.println("After removig: "+bl);
	//sort-----collections.sort()
	System.out.println("Elements in the Arraylist: "+al);
	Collections.sort(al);
	System.out.println("Elements after sorting: "+al);
	Collections.sort(al,Collections.reverseOrder());
	System.out.println("Elements after sorting after ReverseOrder: "+al);
	
	//shuffling---Collections.suffle()
	
	Collections.shuffle(al);
	System.out.println("After suffling elements in ArrayList: "+al);
	}

}
