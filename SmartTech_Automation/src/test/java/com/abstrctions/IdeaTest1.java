package com.abstrctions;

public class IdeaTest1 extends CompanyIdea2 {

	@Override
	void resthriction() {
	System.out.println("Hello");	
		
	}

public static void main(String[] args) {
	IdeaTest1 obj = new IdeaTest1();
	obj.studentName();
	obj.studentAge();
	obj.studentId();
	obj.studentAddress();
}
}
