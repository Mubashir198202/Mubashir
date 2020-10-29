package com.collectionInterface;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class SetAndMapInterface {
 
public static void hashSetInterface() {
	 
 Set<Integer> se = new HashSet<Integer>();
    se.add(200); 
	se.add(700);
	se.add(800);
	se.add(500);
	se.add(400);
	se.add(200);
	se.add(300);
	se.add(null);
	System.out.println(se);//Insertion Order not preserved
	
	System.out.println(se.contains(800));
	System.out.println(se.contains(600));
	//se.remove(200);
    //System.out.println(se);
	System.out.println(se.isEmpty());
	
	Iterator it = se.iterator();
	while(it.hasNext()) {
	System.out.println(it.next());	
	}
	
	for(Integer e:se) {
	System.out.println(e);	
	}
		
}
	
public static void getDuplicateValu() {
	
    int [] al = {50,60,80,100,10,10};	
	
	Set <Integer> hs =new HashSet<Integer>();
	
	for(int value:al) {
	if(hs.add(value)==false) { 
	System.out.println("Duplicate valu: "+value);	
	}
	}
	
}	
	
public static void hashMap() {

	Map <Integer,String> mp = new HashMap <Integer,String>();
	
	mp.put(101, "Bangla");
	mp.put(102, "English");
	mp.put(103, "Math");
	mp.put(104, "Science");
	mp.put(105, "Geography");
	mp.put(106, "Biology");
	mp.put(107, null);
	mp.put(108, null);
	mp.put(109, null);
	mp.put(null, null);
	//Here Entry is a interface.This is Entry interface method
 for(Entry value:mp.entrySet()) {
	System.out.println(value.getKey() +" "+ value.getValue()); 
 }
 System.out.println(mp);   
 System.out.println(mp.get(105));
 //System.out.println(mp.remove(109));
 mp.remove(109);
 System.out.println(mp);
 
 System.out.println(mp.containsKey(101));
 
 System.out.println(mp.containsValue("Math"));
 
 System.out.println(mp.isEmpty());
 
 System.out.println(mp.size());
 
 System.out.println(mp.keySet());
 
 System.out.println(mp.values());
 
 System.out.println(mp.entrySet());
 
for(Object i:mp.keySet()) {
System.out.println(i);	
}

for(Object j:mp.values()) {
System.out.println(j);	
}

for(Object k:mp.keySet()) {
System.out.println(k+" "+mp.get(k));	
}

}
	
	
public static void main(String[] args) {

	hashSetInterface();	
  //setCollection();	
  //getDuplicateValu();	
    //hashMap();
	}
	

}
