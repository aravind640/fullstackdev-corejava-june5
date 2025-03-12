package com.fullstacktraining.string;

public class StringDemo {

	public static void main(String[] args) {

		String name = "Name";
		int baseSalary = 10000;
		int bonus = 2000;
		
		// "name"+ 10000+2000
		// "name" 12000
		
		System.out.println(baseSalary + bonus); // when just int present it sums the total when plus symbol is given
		
		System.out.println(name + baseSalary + bonus); // when String is available with plus symbol then it concatinates the whole values (string+int+int)
		
		int a = 10;
		
		int b = 20;
		
		System.out.println(a + b + ("This is a String")); // first the operation inside the brackets is performed and then goes for others BODMAS rule
	}

}
