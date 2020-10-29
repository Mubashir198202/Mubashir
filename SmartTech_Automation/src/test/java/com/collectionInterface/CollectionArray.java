package com.collectionInterface;

import java.util.Arrays;
import java.util.List;

public class CollectionArray {

	public static void arrayDimention() {
		
    int [] num = new int [7];
    
    num[0]=6;
    num[1]=5;
    num[2]=25;
    num[3]=8;
    num[4]=20;
    num[5]=10;
    num[6]=15;
    
   System.out.println(num.length);
   
   System.out.println(Arrays.toString(num));
   for(int i=0; i<num.length;i++) 
   System.out.println(i);
   
   System.out.println(num[4]);
   
   for(int k:num)
	System.out.println(k);
   
	String[][] names = {{ "Mr. ", "Mrs. ", "Ms. " }, 
            { "Alam", "Juma", "Tasvir" } 
            };
   System.out.println(names[0][0] + names[1][0]);
   System.out.println(names[0][1] + names[1][1]);
   System.out.println(names[0][2] + names[1][2]); 
}
	public static void loopIncreaseValue() {
		for (int i = 0; i <= 1000; i++) {
			System.out.println(i);
		}
	}
	public static void loopDecreaseValue() {
		for (int i =1000; i>10; i--) {
			System.out.println(i);
		}
	}
	 public static void javanewfeatureLoop() {
		 
	List<Integer> li =Arrays.asList(30,40,50,80,70,20);	 
	li.forEach(n ->System.out.println(n));	 
 }
	 public static void sorting() {
 int []	num = {30,50,10,60,20,70};	 
	Arrays.sort(num);	 
System.out.println(Arrays.toString(num));

for(int i=0; i<num.length;i++)
System.out.println(num[i]);
}
	 
 public static void wLoop()	{
  int j=1;	 
while(j<100){ //if i put "true" then comes infinitive number.
System.out.println(j);
j++;
}
	 
	 
 }
	
	public static void main(String[] args) {
		//loopIncreaseValue() ;
		//arrayDimention();	
		//loopDecreaseValue();
		//javanewfeatureLoop(); 
		//sorting();
		wLoop();
	}
}
