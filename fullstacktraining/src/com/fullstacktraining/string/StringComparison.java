package com.fullstacktraining.string;

public class StringComparison {

	public static void main(String[] args) {

		String org = "Test";
		
//		System.out.println(org + "Leaf");// new reference TestLeaf created but no pointing in string constant pool
//		System.out.println(org); // immutable original value is unchanged until and unless we re-assign the org value eg below
//		
//		org = org + "Leaf";
//		
//		System.out.println(org);
		
		String org1 = new String("Test"); // this creates a reference directly in heap memory - wasting memory space when using this syntax
		
		System.out.println(org == org1); // This compares both the value and memory
		
		System.out.println(org.equals(org1)); // This compares the value alone which is recommended to compare string values
		
		String org3 = "Test";
		
		System.out.println(org == org3); // This compares both the value and memory
		
		System.out.println(org.equals(org3)); // This compares the value alone which is recommended to compare string values1
		
		// String methods
		
		System.out.println(org.length());
		
		System.out.println(org.charAt(1));
		
		System.out.println(org.toUpperCase());
		
		System.out.println(org.toLowerCase());
		
		System.out.println(org.indexOf('t'));
		
		System.out.println(org.indexOf('g'));
		
		System.out.println(org.concat(" organization"));
		
		System.out.println(org.replace('T', 'W'));
		
		// converting string to integer and vice versa
		
		String age = "23";
		
		int parseAge = Integer.parseInt(age);
				
		System.out.println(parseAge);
		
		int number = 100;
		
		String convertedNumber = String.valueOf(number);
		
		System.out.println(convertedNumber);
	}

}
