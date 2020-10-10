package com.encapsulation;

public class PersonTest {

	public static void main(String[] args) {
		Person obj = new Person();
        obj.setName("Mubashir");
        System.out.println(obj.getName());
        
        obj.setAge(36);
        System.out.println(obj.getAge());
	}

}
