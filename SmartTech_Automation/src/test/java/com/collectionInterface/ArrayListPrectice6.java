package com.collectionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListPrectice6 {

	public static void arrayList() {
			
			List<Integer> number=new ArrayList<Integer>();
			number.add(50);
			number.add(40);
			number.add(20);
			number.add(10);
			number.add(5);
			number.add(1);
			number.add(3);
			number.add(3);
			number.add(3);
			number.add(3);
			//index size and specific valu
			System.out.println(number.size());
			System.out.println(number.get(3));
			//how to get index number
			for(int i=0;i<number.size();i++)
			System.out.println(i);
			//How to get valu
			for(int i=0;i<number.size();i++)
				System.out.println(number.get(i));
			
			//How to remove specific valu
			number.remove(3);
			System.out.println(number);
			number.add(100);
			System.out.println(number);
			
			//remove duplicate
			number = number.stream().distinct().collect(Collectors.toList());
			System.out.println(number);
			
			System.out.println(number.indexOf(50));
			
			if(number.contains(50)) 
				System.out.println("50 is existed");
			else
			    System.out.println("50 is not existed");
			
			//number.clear();
			//System.out.println(number);
			
			for(int i=0;i<number.size();i++) 
				System.out.println(number.get(i));
			
			Collections.reverse(number);
			System.out.println("Just Reverse the valu: "+number);
			
			Collections.sort(number);
			System.out.println("Assending order of number: "+number);
			
			Collections.sort(number,Collections.reverseOrder());
			System.out.println("Descending order of number: "+number);
			
			int max=Collections.max(number);
			System.out.println(max);
			

			int min=Collections.min(number);
			System.out.println(min);
			
		}
		public static void linkList() {
			
		LinkedList <String> list = new LinkedList<String>();	
			list.add(0, "Apple");
			list.add(1, "Mango");
			list.add(2, "Grape");
			list.add(3, "Banana");
			list.add(4, "Orange");
			list.add(5, "Watermelon");
			
		  list.addFirst("Milk");	
			System.out.println(list);
			list.addLast("Oil");
			System.out.println(list);

		System.out.println(list.size());

		}


		public static void main(String[] args) {
			//arrayList();
			linkList();
			
			
					

	}

}
