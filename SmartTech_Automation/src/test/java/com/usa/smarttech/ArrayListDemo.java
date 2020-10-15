package com.usa.smarttech;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemo {

	public static void main(String[] args) {
		
	 //Declare ArrayList	
	//ArrayList al = new ArrayList();//Handle heterogeneous data with duplicate valu		
    //ArrayList <Integer> al = new ArrayList<Integer>();//handle homogeneous data.	
    // ArrayList <String> al = new ArrayList<String>();	//handle homogeneous data.
	//List al = new ArrayList();
		ArrayList al = new ArrayList();	
		
	//Add new elements to arrylist.	
	al.add(100);
	al.add("Rupon");
	al.add(11.01);
	al.add('M');
	al.add(true);
 System.out.println("Valu: "+al);//[100,Rupon,11.01,M,true]
   //Size()
   System.out.println("Number of elements in arraylist: "+al.size());
 //remove()
  al.remove(3);//3 is index
 System.out.println("After removing element from arraylist:"+al);
 //insert a new element
 //add(index,object)
 al.add(1,"Bangladesh");
 System.out.println("After insert in arraylist: "+al);
 //retreive specific element
 System.out.println("Specific Valu: "+al.get(1));
 //Replace element
 al.set(2, "Mubashir");
 System.out.println("After replacing element: "+al);
 //verify element/search---contains.....Return true/false
System.out.println(al.contains(100));
System.out.println(al.contains(200));
//isEmpty()
  System.out.println(al.isEmpty());
  
  //1.how to read the data using for loop
 /* System.out.println("Reading elements using for loop.....");
  for(int i=0;i<al.size();i++)
  {
	System.out.println(al.get(i));  
  }*/
  
  //2.for...each loop
 /* System.out.println("Reading elements using for...each loop");
  for(Object e:al)
  {
    System.out.println(e); 
  }*/
  
  //3.iterator()
  System.out.println("Reading elements using iterator method");
  Iterator it=al.iterator();
  while(it.hasNext())
  {
	System.out.println(it.next());  
  }
  
  
	}

}
