package com.qa.constructor;

public class Runner {

	public static void main(String[] args) {
		Person james = new Person("James", 42, 79);
		// TODO Auto-generated method stub
		james.name = "James";
		james.age = 42;
		james.height = 78.5;
			
			
		System.out.println(james.name);
		System.out.println(james.age);
		System.out.println(james.height);
	}

}
