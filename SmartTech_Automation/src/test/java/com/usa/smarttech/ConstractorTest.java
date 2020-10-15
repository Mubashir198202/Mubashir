package com.usa.smarttech;

public class ConstractorTest {

	public static void main(String[] args) {
		
	Constractor obj = new Constractor("Mubashir Ahmed","Male",3472855);	
	obj.displayInformation();	    
		    
     Constractor obj1 = new Constractor("Zaviyar Ahmed Ayyash","Male",3470000);
		obj1.displayInformation();    
		    
		    
    Constractor obj3 = new Constractor();
     obj3.displayInformation();
	}

}
